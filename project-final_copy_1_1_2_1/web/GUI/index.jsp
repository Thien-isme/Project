<%@page import="model.MaGiamGia"%>
<%@page import="database.MaGiamGiaDAO"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="model.SanPham"%>
<%@page import="java.util.List"%>
<%@page import="database.SanPhamDAO"%>
<%
    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;
%>
<!DOCTYPE html>
<html>

    <head>
        <!-- Basic -->
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <!-- Site Metas -->
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>
            THT Helmet Store

        </title>

        <link rel="shortcut icon" href="<%= url1%>/GUI/images/favicon.png" type="image/x-icon">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>


        <!-- slider stylesheet -->
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />

        <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="<%= url1%>/GUI/css/bootstrap.css" />

        <!-- Custom styles for this template -->
        <link href="<%= url1%>/GUI/css/style.css" rel="stylesheet" />
        <!-- responsive style -->
        <link href="<%= url1%>/GUI/css/responsive.css" rel="stylesheet" />

        <!-- Voucher style -->
        <link rel="stylesheet" href="<%=url1%>/GUI/css/voucher.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

    </head>

    <body>
        <%

        %>
        <div class="hero_area">
            <!-- header -->
            <%@include file="header.jsp" %>


            <!-- header -->

            <!-- slider section -->
            <section class="slider_section">
                <div class="slider_container">
                    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-md-7">
                                            <div class="detail-box">
                                                <h1>
                                                    <%=khachHang.getMaKhachHang()%>
                                                </h1>
                                                <p>
                                                    text
                                                </p>
                                            </div>
                                        </div>
                                        <div class="col-md-5 ">
                                            <div class="img-box">
                                                <img src="<%= url1%>/GUI/images/saving-img.png" alt="" />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- end slider section -->



            <!-- shop section -->

            <section class="shop_section layout_padding">
                <div class="container">
                    <div class="heading_container heading_center">
                        <h2>
                            News arrivals
                        </h2>
                    </div>
                    <div class="row">
                        <%  SanPhamDAO dao = new SanPhamDAO();

                            /* List<SanPham> list = dao.selectAll();*/
                            List<SanPham> list = (List<SanPham>) request.getAttribute("listsanpham");
                            if (list != null && !list.isEmpty()) {
                                int count = 0;
                                for (SanPham sanPham : list) {

                                    if (count == 8) {
                                        break;
                                    }
                                    count++;
                        %>
                        <div class="col-sm-6 col-md-4 col-lg-3">
                            <div class="box">
                                <a href="<%=url%>/san-pham?hanhdong=viewproductdetail&masanpham=<%=sanPham.getMasanpham()%>">
                                    <div class="img-box">
                                        <img src="<%= url1%>/GUI/imgsanpham/<%=sanPham.getHinhanhsanpham()%>" alt="Ảnh nón">
                                    </div>
                                    <div class="detail-box">
                                        <h6>
                                            Ring
                                        </h6>
                                        <h6>
                                            Price
                                            <span>
                                                $200
                                            </span>
                                        </h6>
                                    </div>
                                    <div class="new">
                                        <span>
                                            New
                                        </span>
                                    </div>
                                </a>
                            </div>

                        </div>
                        <%
                                }
                            }
                        %>


                    </div>
                    <div class="btn-box">
                        <a href="<%=url%>/GUI/shop.jsp">
                            View All Products
                        </a>
                    </div>
                </div>
            </section>
            <!-- end shop section -->

            <!-- gift section -->
            <%--<%@include file="../GUI/voucherLink.jsp" %>--%>

            <div class="row">

                <%

                    List<MaGiamGia> listMaGiamGia = (List<MaGiamGia>) request.getAttribute("listmagiamgia");

                    if (listMaGiamGia != null && !listMaGiamGia.isEmpty()) {
                        for (MaGiamGia maGiamGia : listMaGiamGia) {
                %>   
                <!-- <div  class="col-1"> </div> -->
                <div  class="col-3 row">
                    <div class="card-item">
                        <img class="card-img row " alt="anh voucher" src="<%=url1%>/GUI/imgvoucher/<%=maGiamGia.getHinhanhvoucher()%>">
                        <div class="card-body row">
                            <p style="font-size: 24px;font-weight: 500 " class="card-title"><%=maGiamGia.getTenMaGiamGia()%></p>
                            <p class="card-text"> <h5>EXP: <small class="text-muted"><%=maGiamGia.getNgayHetHan()%></small></h5> </p>
                        </div>

                    </div>
                    <form class="card-getvalue" action="khach-hang" method="get">
                                                <input type="hidden" name="hanhdong" value="getvoucher" >

                        <input type="hidden" name="idmagiamgia" value="<%=maGiamGia.getIdMaGiamGia()%>" >
                        <input type="submit" class="btn btn-primary" value="Get" >
                    </form>
                </div>

                <!--<div  class="col-2"></div>-->
                <%
                        }
                    }
                %>              



            </div>

            <!-- end gift section -->


            <%@include file="footer.jsp" %>
        </div>

        <!-- end hero area -->


        <script src="<%= url1%>/GUI/js/jquery-3.4.1.min.js"></script>
        <script src="<%= url1%>/GUI/js/bootstrap.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
        </script>
        <script src="<%= url1%>/GUI/js/custom.js"></script>
    </body>


</html>