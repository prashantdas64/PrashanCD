package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class BuyerDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Buyer Details</title>\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: lightgoldenrodyellow\">\n");
      out.write("        \n");
      out.write("                <!--nav bar for admin started -->\n");
      out.write("        \n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("<a class=\"navbar-brand\" href=\"#\" style=\"color:#00FF7F\">automotive's</a>\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li ><a href=\"ViewProfiles.jsp\">ViewProfiles</a></li>\n");
      out.write("        <li ><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("        <li><a href=\"A_product.jsp\">Products</a></li>\n");
      out.write("        <li class=\"active\" style=\"background-color: lightsteelblue\" ><a href=\"BuyerDetails.jsp\">Buy Details</a></li>\n");
      out.write("        <!--li><a href=\"sale_products.jsp\">Upload Details</a></li-->\n");
      out.write("        </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <!--Admin User Nmae -->\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\">prashant</b></a></li>\n");
      out.write("    \t\n");
      out.write("\n");
      out.write("<!-- User Logout Button -->\n");
      out.write("\t<li ><a href=\"loginform.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--nav bar stoped-->\n");
      out.write("        \n");
      out.write("        <h1 style=\"margin: auto; width: 80%; text-align: center;\">View Profiles </h1><br><br>\n");
      out.write("        \n");
      out.write("                            <div id=\"tab-8\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("\n");
      out.write("                                ");

                                    String bduid = request.getParameter("name");
                                    String bddriverName = "org.apache.derby.jdbc.ClientDriver";
                                    String bdconnectionUrl = "jdbc:derby://localhost:1527/";
                                    String bddbName = "NIIT";
                                    String bduserId = "NIIT";
                                    String bdpassword = "NIIT";
                                    try {
                                        Class.forName(bddriverName);
                                    } catch (ClassNotFoundException e) {
                                        e.printStackTrace();
                                    }

                                    Connection bdconnection = null;
                                    Statement bdstatement = null;
                                    ResultSet bdresultSet = null;
                                
      out.write("\n");
      out.write("                                <h2 align=\"center\"><font><strong>All Buyers Detail who want to Buy Car</strong></font></h2><br><br>\n");
      out.write("                                <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\"id=\"RegisU\" style=\"width: 80%\" >\n");
      out.write("            \n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white;\">\n");
      out.write("                                        <td><b>Buyer Name</b></td>\n");
      out.write("                                        <td><b>Buyer Email</b></td>\n");
      out.write("                                        <td><b>Buyer Contact</b></td>\n");
      out.write("                                        <td><b>Buyer Message</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        try {
                                            bdconnection = DriverManager.getConnection(bdconnectionUrl + bddbName, bduserId, bdpassword);
                                            bdstatement = bdconnection.createStatement();
                                            String bdsql = "SELECT * FROM finalbooking";

                                            bdresultSet = bdstatement.executeQuery(bdsql);
                                            while (bdresultSet.next()) {
                                    
      out.write("\n");
      out.write("                                    <tr bgcolor=\"white\" style=\"color:black\">\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bname"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bemail"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bnumber"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bcomment"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                           </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
