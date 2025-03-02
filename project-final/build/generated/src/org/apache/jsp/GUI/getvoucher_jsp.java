package org.apache.jsp.GUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class getvoucher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/GUI/../GUI/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(url1);
      out.write("/GUI/css/voucher.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <!-- slider stylesheet -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- bootstrap core css -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( url1);
      out.write("/GUI/css/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"");
      out.print( url1);
      out.write("/GUI/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- responsive style -->\r\n");
      out.write("    <link href=\"");
      out.print( url1);
      out.write("/GUI/css/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
 String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath(); 
      out.write('\r');
      out.write('\n');
 String currentUrl = request.getRequestURI();
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- header section strats -->\r\n");
      out.write("<header class=\"header_section\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg custom_nav-container \">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">\r\n");
      out.write("            <span>\r\n");
      out.write("                THT Helmet Store\r\n");
      out.write("            </span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <!--<div class=\"collapse navbar-collapse d-flex align-items-center\" id=\"navbarSupportedContent\">-->\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav  \">\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("index.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("shop.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/san-pham?hanhdong=searchByConditions&types=&color=&size=&price=\">\r\n");
      out.write("                        Shops\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("contact.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/contact.jsp\">Contact Us</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"user_option\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if (obj != null) {
                        khachHang = (KhachHang) obj;
                    }
                
      out.write("\r\n");
      out.write("                ");

                    if (khachHang == null) {
                
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                <a href=\"");
      out.print( url);
      out.write("/khachhang/login.jsp\">\r\n");
      out.write("                    <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    <span ");
      out.print( currentUrl.contains("index.jsp") ? "active" : "");
      out.write(">\r\n");
      out.write("                        Login\r\n");
      out.write("                    </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-4 text-center\">\r\n");
      out.write("                    <ul class=\"navbar-nav me-auto bg-infor \">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a style=\"font-size: 20px;\"  class=\"nav-link dropdown-toggle text-center\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \r\n");
      out.write("\r\n");
      out.write("                                <img style=\"width: 30px; height: 30px; border-radius: 50%\" src=\"");
      out.print(url);
      out.write("/uploads/");
      out.print(khachHang.getHinhAvatar());
      out.write("?v=");
      out.print(System.currentTimeMillis());
      out.write("\"  alt=\"\"> \r\n");
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu \" >\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">My Order</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/update.jsp\">Update Information</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/resetpassword.jsp\">Change Password</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/GUI/getvoucher.jsp\">Get Voucher</a></li>\r\n");
      out.write("                                <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khach-hang?hanhdong=logout\">Log-out</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\t\r\n");
      out.write("                </div>\r\n");
      out.write("                            \r\n");
      out.write("                 <a href=\"");
      out.print( url);
      out.write("/khachhang/cart.jsp\">\r\n");
      out.write("                    <i class=\"fa fa-shopping-bag\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </a>           \r\n");
      out.write("                ");

                    }
                
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("                    <form class=\"d-flex ms-auto\" role=\"search\" action=\"");
      out.print( url );
      out.write("/san-pham\" method=\"GET\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"hanhdong\" value=\"search\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        ");
 String keyword = request.getAttribute("keyword")+"";
                            keyword = keyword.equals("null")?"": keyword;
                        
      out.write("    \r\n");
      out.write("                        <input name=\"keyword\" value=\"");
      out.print( keyword );
      out.write("\" type=\"text\" class=\"form-control text-dark border-0\" placeholder=\"Searching\" aria-label=\"Search\" style=\"outline: none;\">\r\n");
      out.write("                        <button class=\"btn btn-dark\" type=\"submit\">\r\n");
      out.write("                            <i class=\"fa fa-search\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- end header section -->");
      out.write("\r\n");
      out.write("            <h1 style=\"text-align: center\">Voucher for you</h1>\r\n");
      out.write("            <div card-container>\r\n");
      out.write("                <div class=\"card-item \">\r\n");
      out.write("                    <img class=\"card-img\" alt=\"anh voucher\" src=\"");
      out.print(url1);
      out.write("/GUI/imgvoucher/voucher.png\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p style=\"font-size: 24px;font-weight: 500 \" class=\"card-title\">Giảm 25% cho đơn hàng từ 100k</p>\r\n");
      out.write("                        <p class=\"card-text\"> <h5>EXP: <small class=\"text-muted\">15-02-2025</small></h5> </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form class=\"card-getvalue\" action=\"\">\r\n");
      out.write("                        <button class=\"btn btn-primary getValue\">Get</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("<!--            <div class=\"card-content\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"card-item\" style=\"\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row g-0\">\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <img src=\"../uploads/1.jpeg\" class=\"img-fluid rounded-start\" alt=\"...\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-7\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Discount xx%</h5>\r\n");
      out.write("\r\n");
      out.write("                                    <p class=\"card-text\"> <h5>EXP: <small class=\"text-muted\">15-02-2025</small></h5> </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-2\">\r\n");
      out.write("                                <form action=\"");
      out.print(url);
      out.write("/ma-giam-gia\" method=\"get\">\r\n");
      out.write("                                    <input class=\"form-control\" type=\"hidden\"  name=\"hanhdong\" value=\"get\">\r\n");
      out.write("                                    <input class=\"form-control\" type=\"hidden\"  name=\"idmagiamgia\" value=\"1\">\r\n");
      out.write("                                    <button class=\"form-control\" > Get </button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>-->\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
