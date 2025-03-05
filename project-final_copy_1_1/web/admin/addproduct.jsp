<%@page import="database.AdminDAO"%>
<%
    String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;
%>
<%@page import="model.SanPham_Size"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Tables</title>

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
        <link href="<%= url%>/css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <%@include file="sidebar.jsp" %>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <%@include file="topbar.jsp" %>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container mt-5 form-container">
                        <div class="mb-3 d-flex justify-content-between align-items-center">
                            <h2>Add product</h2>
                            <button type="button" class="btn btn-outline-primary">
                                <a href="/project-final/admin?hanhdong=load" class="text-decoration-none">Back</a>
                            </button>
                        </div>

                        <form action="<%= url%>/admin" method="POST">
                            <input type="hidden" name="hanhdong" value="addProduct">
                            <div class="mb-3">
                                <label for="masanpham" class="form-label">Id</label>
                                <input type="text" name="masanpham" class="form-control" id="masanpham" required>
                            </div>
                            <div class="mb-3">
                                <label for="tensanpham" class="form-label">Name</label>
                                <input type="text" name="tensanpham" class="form-control" id="tensanpham" required>
                            </div>
                            <div class="mb-3">
                                <label for="hinhanhsanpham" class="form-label">Image</label>
                                <input type="text" name="hinhanhsanpham" class="form-control" id="hinhanhsanpham" placeholder="URL hình ảnh" required>
                            </div>
                            <div class="mb-3">
                                <label for="mausac" class="form-label">Color</label>
                                <input type="text" class="form-control" name="mausac" id="mausac" required>
                            </div>
                            <div class="mb-3">
                                <label for="kichco" class="form-label">Size</label>
                                <input type="text" class="form-control" id="kichco" name="kichco" required>
                            </div>
                            <div class="mb-3">
                                <label for="soluong" class="form-label">Quantity</label>
                                <input type="number" name="soluong" class="form-control" id="soluong" required>
                            </div>
                            <div class="mb-3">
                                <label for="kieumau" class="form-label">Type</label>
                                <input type="text" name="kieumau" class="form-control" id="kieumau" required>
                            </div>
                            <div class="mb-3">
                                <label for="gianhap" class="form-label">Input price</label>
                                <input type="number" name="gianhap" class="form-control" id="gianhap" step="0.01" required>
                            </div>
                            <div class="mb-3">
                                <label for="giaban" class="form-label">Selling price</label>
                                <input type="number" name="giaban" class="form-control" id="giaban" step="0.01" required>
                            </div>
                            <div class="mb-3">
                                <label for="giamgia" class="form-label">Discount</label>
                                <input type="number" name="giamgia" class="form-control" id="giamgia" min="0" max="100" required>
                            </div>
                            <div class="mb-3">
                                <label for="mota" class="form-label">Description</label>
                                <textarea name="mota" class="form-control" id="mota" rows="3"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary">Add product</button>
                        </form>
                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; Your Website 2020</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="js/demo/datatables-demo.js"></script>

    </body>

</html>