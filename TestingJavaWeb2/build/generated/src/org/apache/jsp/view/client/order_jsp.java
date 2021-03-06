package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Client - request item</title>        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function updatePrice() {\n");
      out.write("                var price = document.getElementById(\"form-order-item_price\").value;\n");
      out.write("                var quantity = document.getElementById(\"form-order-item_quantity\").value;\n");
      out.write("                var t_price = document.getElementById(\"form-order-item_total\");\n");
      out.write("                if ((price.length > 0) && (quantity.length > 0)) {\n");
      out.write("                    t_price.value = parseInt(price) * parseInt(quantity);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div id=\"form-placeholder\">\n");
      out.write("            <form name=\"order\" id=\"form-order\" method=\"post\" action=\"\">\n");
      out.write("                <table id=\"form-order-table\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Item name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"item_name\" id=\"form-order-item_name\" required=\"true\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Item price</td>\n");
      out.write("                        <td><input type=\"number\" name=\"item_price\" id=\"form-order-item_price\" required=\"true\" onkeyup=\"updatePrice()\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Item quantity</td>\n");
      out.write("                        <td><input type=\"number\" name=\"item_quantity\" id=\"form-order-item_quantity\" required=\"true\" onkeyup=\"updatePrice()\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Total price</td>\n");
      out.write("                        <td><input type=\"number\" name=\"item_total\" id=\"form-order-item_total\" value=\"0\" disabled=\"\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"button\" name=\"form-order-submit\" value=\"Submit\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
