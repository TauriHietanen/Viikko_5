/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2022-05-04 15:46:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class listaaasiakkaat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\r\n");
      out.write("<title>Asiakastietojen listaus</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<table id=\"listaus\">\r\n");
      out.write("		<thead>	\r\n");
      out.write("		<tr>\r\n");
      out.write("		<th colspan=\"5\" class=\"oikealle\"><span id=\"uusiAsiakas\">Lisää uusi asiakas</span></th>\r\n");
      out.write("		</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"3\" class=\"oikealle\">Hakusana:</th>\r\n");
      out.write("				<th><input type=\"text\" id=\"hakusana\"></th>\r\n");
      out.write("				<th><input type=\"button\" id=\"hae\" value=\"Hae\"></th>\r\n");
      out.write("			</tr>		\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>Etunimi</th>\r\n");
      out.write("				<th>Sukunimi</th>\r\n");
      out.write("				<th>Puhelin</th>\r\n");
      out.write("				<th>Sähköposti</th>	\r\n");
      out.write("				<th></th>			\r\n");
      out.write("			</tr>\r\n");
      out.write("		</thead>\r\n");
      out.write("		<tbody>\r\n");
      out.write("		</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){	\r\n");
      out.write("	\r\n");
      out.write("	$(\"#uusiAsiakas\").click(function(){\r\n");
      out.write("		document.location=\"lisaaasiakas.jsp\";\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	haeTiedot();\r\n");
      out.write("	$(\"#hae\").click(function(){	\r\n");
      out.write("		haeTiedot();\r\n");
      out.write("	\r\n");
      out.write("	});\r\n");
      out.write("	$(document.body).on(\"keydown\", function(event){\r\n");
      out.write("		  if(event.which==13){ //Enteriä painettu, ajetaan haku\r\n");
      out.write("			  haeTiedot();\r\n");
      out.write("		  }	\r\n");
      out.write("	\r\n");
      out.write("	});\r\n");
      out.write("	$(\"#hakusana\").focus();//viedään kursori hakusana-kenttään sivun latauksen yhteydessä\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
      out.write("function haeTiedot(){	\r\n");
      out.write("	$(\"#listaus tbody\").empty();\r\n");
      out.write("	//$.getJSON on $.ajax:n alifunktio, joka on erikoistunut jsonin hakemiseen. Kumpaakin voi tässä käyttää.\r\n");
      out.write("	//$.getJSON({url:\"asiakkaat/\"+$(\"#hakusana\").val(), type:\"GET\", success:function(result){\r\n");
      out.write("	$.ajax({url:\"asiakkaat/\"+$(\"#hakusana\").val(), type:\"GET\", dataType:\"json\", success:function(result){\r\n");
      out.write("		$.each(result.asiakkaat, function(i, field){  \r\n");
      out.write("        	var htmlStr;\r\n");
      out.write("        	htmlStr+=\"<tr>\"; \r\n");
      out.write("        	htmlStr+=\"<td>\"+field.etunimi+\"</td>\";\r\n");
      out.write("        	htmlStr+=\"<td>\"+field.sukunimi+\"</td>\";\r\n");
      out.write("        	htmlStr+=\"<td>\"+field.puhelin+\"</td>\";\r\n");
      out.write("        	htmlStr+=\"<td>\"+field.sposti+\"</td>\"; \r\n");
      out.write("        	htmlStr+=\"<td><span class='poista' onclick=poista('\"+asiakas_id+\"')>Poista</span></td>\";\r\n");
      out.write("        	htmlStr+=\"</tr>\";\r\n");
      out.write("        	$(\"#listaus tbody\").append(htmlStr);\r\n");
      out.write("        });\r\n");
      out.write("    }});	\r\n");
      out.write("}\r\n");
      out.write("function poista(asiakas_id) {\r\n");
      out.write("	console.log()\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
