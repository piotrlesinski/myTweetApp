<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->

    <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<c:url value="/resources/vendor/metisMenu/metisMenu.min.css"/>" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="<c:url value="/resources/vendor/datatables/css/dataTables.bootstrap4.css"/>" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="/resources/dist/css/sb-admin-2.css"/>" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<c:url value="/resources/vendor/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div id="wrapper">

<!-- ===============    GÓRNE MENU ===================================== -->

    <!-- Navigation -->
    <header class="align-items-start app-header flex-column flex-md-row navbar navbar-expand-md navbar-light menu">
        <div class="align-items-baseline d-flex flex-row navbar-brand p-lg-3 pl-3 pr-3 pt-3">
            <jsp:include page="menu.jsp"/>
        </div>
    </header>

<!-- ===============    LEWE MENU ===================================== -->

    <div class="d-md-flex">
        <div class="sidebar" role="navigation">
            <div class="sidebar-nav collapse navbar-collapse show" id="side-menu-wrapper">
                <ul class="nav navbar-nav navbar-collapse flex-column side-nav list-group" id="side-menu">
                    <li class="sidebar-search">
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-white" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                        <!-- /input-group -->
                    </li>
                    <li class="list-group-item">
                        <a href="newtask.jsp"><i class="fa fa-dashboard fa-fw"></i> New task</a>
                    </li>
                    <li class="list-group-item">
                        <a href="newtask.jsp"><i class="fa fa-dashboard fa-fw"></i> My tasks</a>
                    </li>
                    <li class="list-group-item">
                        <a href="newtask.jsp"><i class="fa fa-dashboard fa-fw"></i> All tasks</a>
                    </li>
                    <li class="list-group-item">
                        <a href="newtask.jsp"><i class="fa fa-dashboard fa-fw"></i> Overdue</a>
                    </li>
                    <li class="list-group-item">
                        <a href="newtask.jsp"><i class="fa fa-dashboard fa-fw"></i> Done</a>
                    </li>
                    <li class="list-group-item">
                        <a href="/api/task"><i class="fa fa-bar-chart-o fa-fw"></i>All task<span class="fa arrow"></span></a>
                        <ul class="nav-second-level list-group nested">
                            <li class="list-group-item">
                                <a href="/api/task">TO DO dodać link</a>
                            </li>
                            <li class="list-group-item">
                                <a href="morris.html">IN PROGRESS dodać link</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li class="list-group-item">
                        <a href="tables.html"><i class="fa fa-table fa-fw"></i> Tables</a>
                    </li>
                    <li class="list-group-item">
                        <a href="forms.html"><i class="fa fa-edit fa-fw"></i> Forms</a>
                    </li>
                    <li class="list-group-item">
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> UI Elements<span class="fa arrow"></span></a>
                        <ul class="nav-second-level list-group nested">
                            <li class="list-group-item">
                                <a href="cards.html">Cards</a>
                            </li>
                            <li class="list-group-item">
                                <a href="buttons.html">Buttons</a>
                            </li>
                            <li class="list-group-item">
                                <a href="notifications.html">Notifications</a>
                            </li>
                            <li class="list-group-item">
                                <a href="typography.html">Typography</a>
                            </li>
                            <li class="list-group-item">
                                <a href="icons.html"> Icons</a>
                            </li>
                            <li class="list-group-item">
                                <a href="grid.html">Grid</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li class="list-group-item">
                        <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span
                                class="fa arrow"></span></a>
                        <ul class="nav-second-level list-group nested">
                            <li class="list-group-item">
                                <a href="#">Second Level Item</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Second Level Item</a>
                            </li>
                            <li class="list-group-item">
                                <a href="#">Third Level <span class="fa arrow"></span></a>
                                <ul class="nav-third-level list-group nested">
                                    <li class="list-group-item">
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li class="list-group-item">
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li class="list-group-item">
                                        <a href="#">Third Level Item</a>
                                    </li>
                                    <li class="list-group-item">
                                        <a href="#">Third Level Item</a>
                                    </li>
                                </ul>
                                <!-- /.nav-third-level -->
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                    <li class="list-group-item">
                        <a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages<span class="fa arrow"></span></a>
                        <ul class="nav-second-level list-group nested">
                            <li class="list-group-item">
                                <a href="blank.html">Blank Page</a>
                            </li>
                            <li class="list-group-item">
                                <a href="login.html">Login Page</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>
<!-- /.============    ŚRODEK STRONY    ======================= -->

        <div id="page-wrapper" class="p-4">
            <div class="row">
                <div class="col-xl-12">
                    <h1 class="page-header">Drinks</h1>
                </div>
                <!-- /.col-xl-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-xl-12">
                    <div class="card">
                        <div class="card-header">DataTables Advanced Tables</div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table width="100%" class="table table-striped table-bordered table-hover"
                                   id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Nazwa</th>

                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${task}" var="task">
                                    <tr >
                                        <td>${task.id}</td>
                                        <td>${task.title}</td>
                                        <td>${task.description}</td>
                                    </tr>

                                </c:forEach>
                                </tbody>
                            </table>
                            <!-- /.table-responsive -->

                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-xl-12 -->
            </div>
            <!-- /.row -->

            <!-- /.row -->
        </div>
    </div>
    <!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="../vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../vendor/popper/popper.min.js"></script>
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../vendor/metisMenu/metisMenu.min.js"></script>

<!-- DataTables JavaScript -->
<script src="../vendor/datatables/js/jquery.dataTables.min.js"></script>
<script src="../vendor/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="../vendor/datatables-responsive/dataTables.responsive.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../dist/js/sb-admin-2.js"></script>

<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<script>
    $(document).ready(function () {
        $('#dataTables-example').DataTable({
            responsive: true,
            drawCallback: function () {
                $('#dataTables-example_wrapper .row:last-child').addClass('mb-1 align-items-baseline');
            }
        });
    });
</script>
</body>

</html>

© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help

Contact GitHub
Pricing
API
Training
Blog
About

