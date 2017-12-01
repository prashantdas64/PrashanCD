package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sale_005fproducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Sale Products Page</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <script src=\"js/sweetalert.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/sweetalert.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquerys.js\"></script>\n");
      out.write("  <script src=\"js/myscript.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mystyle.css    \" />\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\" />\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("  -webkit-box-sizing: border-box;\n");
      out.write("  -moz-box-sizing: border-box;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".page-wrap {\n");
      out.write("  max-width: 75rem;\n");
      out.write("  margin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  color: #8e44ad;\n");
      out.write("  font-size: 1.5rem;\n");
      out.write("  letter-spacing: -1px;\n");
      out.write("  margin: 1.25rem 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:focus ~ label, textarea:focus ~ label, input:valid ~ label, textarea:valid ~ label {\n");
      out.write(" font-size: 0.75em;\n");
      out.write(" color: red;\n");
      out.write(" top: -2.50rem;\n");
      out.write(" -webkit-transition: all 0.125s ease;\n");
      out.write(" transition: all 0.125s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".styled-input {\n");
      out.write("  float: left;\n");
      out.write("  width: 33.3333%;\n");
      out.write("  margin: 2rem 0 1rem;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".styled-input label {\n");
      out.write("  color: #000;\n");
      out.write("  padding: 1rem;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  -webkit-transition: all 0.25s ease;\n");
      out.write("  transition: all 0.25s ease;\n");
      out.write("  pointer-events: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".styled-input.wide { width: 100%; }\n");
      out.write("\n");
      out.write("input,\n");
      out.write("textarea {\n");
      out.write("  padding: 1rem 1rem;\n");
      out.write("  border: 1;\n");
      out.write("  width: 100%;\n");
      out.write("  font-size: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input ~ span,\n");
      out.write("textarea ~ span {\n");
      out.write("  display: block;\n");
      out.write("  width: 0;\n");
      out.write("  height: 3px;\n");
      out.write("  background: #8e44ad;\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 0;\n");
      out.write("  left: 0;\n");
      out.write("  -webkit-transition: all 0.125s ease;\n");
      out.write("  transition: all 0.125s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:focus,\n");
      out.write("textarea:focus { outline: 0; }\n");
      out.write("\n");
      out.write("input:focus ~ span,\n");
      out.write("textarea:focus ~ span {\n");
      out.write("  width: 100%;\n");
      out.write("  -webkit-transition: all 0.075s ease;\n");
      out.write("  transition: all 0.075s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  min-height: 15em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel-default{\n");
      out.write("  background: rgba(255, 255, 255, 0.5);\n");
      out.write("}\n");
      out.write(".panel-default .panel-heading{\n");
      out.write("  background: rgba(255, 255, 255, 0.9);\n");
      out.write("}\n");
      out.write(".panel-default .panel-body{\n");
      out.write("  background: rgba(255, 255, 255, 0.0);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    $(function(){\n");
      out.write("\n");
      out.write("        $('#tabtn1').click(function(e){\n");
      out.write("                e.preventDefault();\n");
      out.write("\n");
      out.write("                $('#mytabs a[href=\"#tab2\"]').tab('show');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#tabtn2').click(function(e){\n");
      out.write("                e.preventDefault();\n");
      out.write("\n");
      out.write("                $('#mytabs a[href=\"#tab3\"]').tab('show');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        }); \n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url('images/S.jpg');\">\n");
      out.write("<div class=\"container-fluid top_bar\" id=\"homeID\">\n");
      out.write("<div class=\"container\"> \n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write(" <a href=\"https://www.facebook.com/Desire-Car-422417681493621/\"class= \"social_icon\"> <i class=\"fa fa-facebook\" style =\"color:blue; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.twitter.com\" class= \"social_icon\"> <i class=\"fa fa-twitter\" style =\"color:burlywood; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.youtube.com\" class= \"social_icon\"> <i class=\"fa fa-youtube-play\" style =\"color:red; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.gmail.com\" class= \"social_icon\"> <i class=\"fa fa-google-plus\" style =\"color:lightgreen; size:17px; font-size:17px\"></i></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-9 text-right contact_info\">\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"></span> automotive's.,    \n");
      out.write("<span class=\"glyphicon glyphicon-earphone\"></span>  +91-9810368242\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div> <!--end of header-->\n");
      out.write("\t\t\t\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"margin-bottom:0px;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("<a class=\"navbar-brand\" href=\"#\" style=\"color:#00FF7F\">automotive's</a>\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"buy_product.jsp\">Buy Products</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"sale_products.jsp\">Sale Products</a></li>\n");
      out.write("        <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("        <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <!-- User Nmae -->\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\"> ");
      out.print( request.getSession().getAttribute("userdb") );
      out.write("</b></a></li>\n");
      out.write("    \t\n");
      out.write("\n");
      out.write("<!-- User Registration Button -->\n");
      out.write("\t<li ><a href=\"loginform.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!--navigation section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"carupload\" method=\"post\" style=\"margin: auto; width: 80%; text-align: center;\" enctype=\"multipart/form-data\">\n");
      out.write("            <h1 style=\"font-size: 80px;color:black;   \">Car Information</h1>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print( request.getSession().getAttribute("userdb") );
      out.write("\"  name=\"username\">\n");
      out.write("            <input type=\"text\" name =\"name\" class=\"form-control\" placeholder=\"Your Car Name\" required>\n");
      out.write("              <br>\n");
      out.write("              <input type=\"text\" name =\"price\" class=\"form-control\" placeholder=\"Your Car Price\" required>\n");
      out.write("              <br>\n");
      out.write("              <center>\n");
      out.write("\n");
      out.write("                  <input type=\"file\" name=\"image\" class=\"form-control\" style=\"width: 550px;text-align: center\" required>\n");
      out.write("              </center>\n");
      out.write("               <br>\n");
      out.write("            <input type=\"submit\" value=\"Upload it \" class=\"btn btn-danger\" style=\"width: 80px\">\n");
      out.write("        </form> \n");
      out.write("    \n");
      out.write("     \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
