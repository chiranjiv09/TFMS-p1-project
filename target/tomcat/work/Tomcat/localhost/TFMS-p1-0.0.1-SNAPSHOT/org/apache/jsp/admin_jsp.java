/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-06 08:51:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("\r\n");
      out.write("    <title>Tech Wallah - Admin Home</title>\r\n");
      out.write("    <meta content=\"\" name=\"description\" />\r\n");
      out.write("    <meta content=\"\" name=\"keywords\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicons -->\r\n");
      out.write("    <link href=\"assets/img/favicon1.png\" rel=\"icon\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS Files -->\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"assets/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Main CSS File -->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <!-- ======= Header ======= -->\r\n");
      out.write("    <header id=\"header\" class=\"fixed-top\">\r\n");
      out.write("      <div class=\"container d-flex align-items-center\">\r\n");
      out.write("        <h1 class=\"logo me-auto\"><a href=\"admin.jsp\">Tech Wallah</a></h1>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Start navbar -->\r\n");
      out.write("        <nav id=\"navbar\" class=\"navbar order-last order-lg-0\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a class=\"active\" href=\"admin.jsp\">Home</a></li>\r\n");
      out.write("            <li class=\"dropdown\">\r\n");
      out.write("              <a href=\"#\"\r\n");
      out.write("                ><span>Operations</span> <i class=\"bi bi-chevron-down\"></i\r\n");
      out.write("              ></a>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"show.jsp\">Show All Associate Details</a></li>\r\n");
      out.write("                <li><a href=\"add.jsp\">Add Associate</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <i class=\"bi bi-list mobile-nav-toggle\"></i>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- end navbar -->\r\n");
      out.write("\r\n");
      out.write("        <a href=\"login.jsp\" class=\"get-started-btn\">Logout</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ======= Hero Section ======= -->\r\n");
      out.write("    <section id=\"hero\" class=\"d-flex justify-content-center align-items-center\">\r\n");
      out.write("      <div\r\n");
      out.write("        class=\"container position-relative\"\r\n");
      out.write("        data-aos=\"zoom-in\"\r\n");
      out.write("        data-aos-delay=\"100\"\r\n");
      out.write("      >\r\n");
      out.write("        <h1>Welcome, Admin</h1>\r\n");
      out.write("        <h2>We are team of talented designers <br>developing freshers job ready</br></h2>\r\n");
      out.write("       <!--  <a href=\"\" class=\"login.jsp\">Logout</a> -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- End Hero -->\r\n");
      out.write("\r\n");
      out.write("    <main id=\"main\">\r\n");
      out.write("\r\n");
      out.write("      <!-- ======= Counts Section ======= -->\r\n");
      out.write("      <section id=\"counts\" class=\"counts section-bg\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row counters\">\r\n");
      out.write("            <div class=\"col-lg-3 col-6 text-center\">\r\n");
      out.write("              <span\r\n");
      out.write("                data-purecounter-start=\"0\"\r\n");
      out.write("                data-purecounter-end=\"521\"\r\n");
      out.write("                data-purecounter-duration=\"1\"\r\n");
      out.write("                class=\"purecounter\"\r\n");
      out.write("              ></span>\r\n");
      out.write("              <p>Associate</p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3 col-6 text-center\">\r\n");
      out.write("              <span\r\n");
      out.write("                data-purecounter-start=\"0\"\r\n");
      out.write("                data-purecounter-end=\"4\"\r\n");
      out.write("                data-purecounter-duration=\"1\"\r\n");
      out.write("                class=\"purecounter\"\r\n");
      out.write("              ></span>\r\n");
      out.write("              <p>Courses</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <!-- End Counts Section -->\r\n");
      out.write("    </main>\r\n");
      out.write("    <!-- End #main -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ======= Footer ======= -->\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("      <div class=\"footer-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\" style=\"justify-content: space-around;\">\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6 footer-contact\">\r\n");
      out.write("             <!--  <h3>Admin</h3>\r\n");
      out.write("              <p>\r\n");
      out.write("                A108 Krunal Zodape <br />\r\n");
      out.write("                New York, NY 535022<br />\r\n");
      out.write("                United States <br /><br />\r\n");
      out.write("                <strong>Phone:</strong> +1 5589 55488 55<br />\r\n");
      out.write("                <strong>Email:</strong> info@example.com<br />\r\n");
      out.write("              </p> -->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-2 col-md-6 footer-links\">\r\n");
      out.write("              <h4>Useful Links</h4>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <i class=\"bx bx-chevron-right\"></i> <a href=\"admin.jsp\">Home</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6 footer-links\">\r\n");
      out.write("              <h4>Operations</h4>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <i class=\"bx bx-chevron-right\"></i> <a href=\"show.jsp\">Show All Associate Details</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <i class=\"bx bx-chevron-right\"></i>\r\n");
      out.write("                  <a href=\"add.jsp\">Add Associates</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container d-md-flex py-4\">\r\n");
      out.write("        <div class=\"me-md-auto text-center text-md-start\">\r\n");
      out.write("          <div class=\"copyright\">\r\n");
      out.write("            &copy; Copyright <strong><span>Tech Wallah</span></strong\r\n");
      out.write("            >. All Rights Reserved\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"credits\">\r\n");
      out.write("            Designed by <a>Tech Wallah</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"social-links text-center text-md-right pt-3 pt-md-0\">\r\n");
      out.write("          <a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>\r\n");
      out.write("          <a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>\r\n");
      out.write("          <a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>\r\n");
      out.write("          <a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>\r\n");
      out.write("          <a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\r\n");
      out.write("        </div> \r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("<!--     End Footer -->\r\n");
      out.write("\r\n");
      out.write("    <div id=\"preloader\"></div>\r\n");
      out.write("    <a\r\n");
      out.write("      href=\"#\"\r\n");
      out.write("      class=\"back-to-top d-flex align-items-center justify-content-center\"\r\n");
      out.write("      ><i class=\"bi bi-arrow-up-short\"></i\r\n");
      out.write("    ></a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor JS Files -->\r\n");
      out.write("    <script src=\"assets/vendor/purecounter/purecounter_vanilla.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Main JS File -->\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
