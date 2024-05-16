/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.100
 * Generated at: 2024-05-10 17:19:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class legalDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Legal Dashboard</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("    .approved {\r\n");
      out.write("        color: #007bff !important;\r\n");
      out.write("    }\r\n");
      out.write("    .declined {\r\n");
      out.write("        color: #dc3545 !important;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 String username = (String) session.getAttribute("username");
if(username == null)
{
	response.sendRedirect("login.jsp");
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2>Legal Dashboard</h2>\r\n");
      out.write("    <table class=\"table table-bordered\">\r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Request ID</th>\r\n");
      out.write("                <th>Request Title</th>\r\n");
      out.write("                <th>Description</th>\r\n");
      out.write("                <th>Request Date</th>\r\n");
      out.write("                <th>Request By</th>\r\n");
      out.write("                <th>Approval Person</th>\r\n");
      out.write("                <th>Approval Date</th>\r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("            ");
 
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "Pragyajain@21");
                String query = "SELECT * FROM approval where request_dept='legal'";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String requestId = rs.getString("request_id");
                    String requestTitle = rs.getString("title");
                    String description = rs.getString("description");
                    String requestDate = rs.getString("request_date");
                    String requestBy = rs.getString("request_by");
                    String approvalPerson = rs.getString("approval_person");
                    String approvalDate = rs.getString("approval_date");
                    String status = rs.getString("status");
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(requestId);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(requestTitle);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(description);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(requestDate);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(requestBy);
      out.write("</td>\r\n");
      out.write("                <td id=\"approvalPerson_");
      out.print(requestId);
      out.write('"');
      out.write('>');
      out.print(approvalPerson);
      out.write("</td> \r\n");
      out.write("                <td id=\"approvalDate_");
      out.print(requestId);
      out.write('"');
      out.write('>');
      out.print(approvalDate);
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <div class=\"btn-group\" role=\"group\"id=\"status_");
      out.print(requestId);
      out.write("\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info approve-btn\" onclick=\"updateStatus('");
      out.print(requestId);
      out.write("', 'Approved', '");
      out.print(username);
      out.write("')\">Approve</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger decline-btn\" onclick=\"updateStatus('");
      out.print(requestId);
      out.write("', 'Declined', '");
      out.print(username);
      out.write("')\">Decline</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function updateStatus(requestId, newStatus, username) {\r\n");
      out.write("        var confirmation = confirm(\"Are you sure you want to \" + newStatus.toLowerCase() + \" this request?\");\r\n");
      out.write("        if (confirmation) {\r\n");
      out.write("            var xhr = new XMLHttpRequest();\r\n");
      out.write("            xhr.onreadystatechange = function() {\r\n");
      out.write("                if (xhr.readyState === XMLHttpRequest.DONE) {\r\n");
      out.write("                    if (xhr.status === 200) {\r\n");
      out.write("                        document.getElementById(\"status_\" + requestId).innerHTML = newStatus;\r\n");
      out.write("                        if (newStatus === \"Approved\") {\r\n");
      out.write("                            document.getElementById(\"status_\" + requestId).classList.add(\"approved\");\r\n");
      out.write("                        } else if (newStatus === \"Declined\") {\r\n");
      out.write("                            document.getElementById(\"status_\" + requestId).classList.add(\"declined\");\r\n");
      out.write("                        }\r\n");
      out.write("                        alert(\"Request status updated successfully.\");\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"Failed to update request status.\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            xhr.open(\"POST\", \"updateStatus.jsp\", true);\r\n");
      out.write("            xhr.setRequestHeader(\"Content-type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("            xhr.send(\"requestId=\" + requestId + \"&newStatus=\" + newStatus+ \"&approvalPerson=\" + username);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
