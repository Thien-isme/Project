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
        <link href="<%= url%>/admin/css/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
        <link href="<%= url%>/admin/css/style.css" rel="stylesheet" type="text/css"/>
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
                    <div class="container">
                        <div class="form-container">
                            <h3 class="text-center mb-4">Update Product Details</h3>
                            <form action="<%=url%>/admin" method="POST">
                                <%
                                    SanPham sp = (SanPham) request.getAttribute("sp");
                                    if (sp != null) {
                                %>
                                <input type="hidden" name="hanhdong" value="update">
                                <!-- ID (readonly) -->
                                <div class="mb-3">
                                    <label for="masanpham" class="form-label">Product ID</label>
                                    <input type="text" class="form-control" id="productId" name="masanpham" value="<%= sp.getMasanpham()%>" readonly>
                                </div>

                                <!-- Name -->
                                <div class="mb-3">
                                    <label for="tensanpham" class="form-label">Product Name</label>
                                    <input type="text" class="form-control" id="productName" name="tensanpham" value="<%= sp.getTensanpham()%>" required>
                                </div>

                                <!-- Color -->
                                <div class="mb-3">
                                    <label for="color" class="form-label">Color</label>
                                    <input type="text" class="form-control" id="color" name="mausac" value="<%= sp.getMausac()%>" required>
                                </div>

                                <!-- Type -->
                                <div class="mb-3">
                                    <label for="type" class="form-label">Type</label>
                                    <input type="text" class="form-control" id="type" name="kieumau" value="<%= sp.getKieumau()%>" required>
                                </div>

                                <!-- Size -->
                                <div class="mb-3">
                                    <label for="size" class="form-label">Size</label>
                                    <select class="form-select" id="size" name="size" required>
                                        <option value="<%= sp.getKichco()%>"></option>
                                        <option value="S" selected>S</option>
                                        <option value="M">M</option>
                                        <option value="L">L</option>
                                        <option value="XL">XL</option>
                                    </select>
                                </div>

                                <!-- Quantity -->
                                <div class="mb-3">
                                    <label for="quantity" class="form-label">Quantity</label>
                                    <input type="number" class="form-control" id="quantity" name="soluong" value="<%= sp.getSoluong()%>" required>
                                </div>

                                <!-- Input Price -->
                                <div class="mb-3">
                                    <label for="inputPrice" class="form-label">Input Price</label>
                                    <input type="number" class="form-control" id="inputPrice" name="gianhap" value="<%= sp.getGianhap()%>" min="0" step="1000" required>
                                </div>

                                <!-- Selling Price -->
                                <div class="mb-3">
                                    <label for="sellingPrice" class="form-label">Selling Price</label>
                                    <input type="number" class="form-control" id="sellingPrice" name="giaban" value="<%= sp.getGiaban()%>" min="0" step="1000" required>
                                </div>

                                <!-- Discount -->
                                <div class="mb-3">
                                    <label for="discount" class="form-label">Discount (%)</label>
                                    <input type="number" class="form-control" id="discount" name="giamgia" value="<%= sp.getGiamgia()%>" min="0" max="100" required>
                                </div>

                                <!-- Description -->
                                <div class="mb-3">
                                    <label for="description" class="form-label">Description</label>
                                    <textarea class="form-control" id="description" name="mota" rows="3" required><%= sp.getMota()%></textarea>
                                </div>

                                <!-- Buttons -->
                                <div class="d-flex justify-content-end gap-2">
                                    <button type="submit" class="btn btn-primary btn-custom">
                                        <i class="fas fa-save"></i> Save
                                    </button>
                                </div>
                                <%
                                    }
                                %>
                            </form>
                        </div>
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