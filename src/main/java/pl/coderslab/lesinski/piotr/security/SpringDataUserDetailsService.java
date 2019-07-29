package pl.coderslab.lesinski.piotr.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.coderslab.lesinski.piotr.model.User;
import pl.coderslab.lesinski.piotr.service.UserService;
import pl.coderslab.lesinski.piotr.service.UserServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class SpringDataUserDetailsService implements UserDetailsService {

    private UserService userService;

//    @Autowired //could not autowire. No beans of UserService type found
    public void setUserRepository(UserServiceImpl userService) {
        this.userService = userService;
    }
    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userService.findByName(username);
        if (user == null) {throw new UsernameNotFoundException(username); }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        user.getRoles().forEach(r ->
                grantedAuthorities.add(new SimpleGrantedAuthority(r.getName())));
        return new org.springframework.security.core.userdetails.User(
                user.getUser(), user.getPassword(), grantedAuthorities);
    }
}
