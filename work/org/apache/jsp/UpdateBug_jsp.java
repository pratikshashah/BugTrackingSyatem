package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class UpdateBug_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./DeveloperHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>Login.html</title>\r\n");
      out.write("\t\r\n");
      out.write("    <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("    <meta http-equiv=\"description\" content=\"this is my page\">\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("    \r\n");
      out.write("    <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"./styles.css\">-->\r\n");
      out.write("\t<script type=\"text/javascript\" language=\"javascrpt\">\r\n");
      out.write("    \tfunction check()\r\n");
      out.write("    \t{\r\n");
      out.write("    \t\tif(testerForm.bug_type.value=='')\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Bug Type is empty !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(testerForm.bug_level.value=='')\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Bug Level is empty !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(testerForm.priority.value=='')\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Bug Priority is empty !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(testerForm.pname.value=='')\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Project name is empty !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(testerForm.tester_code.value=='')\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Tester code is empty !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(testerForm.bug_date.value=='')\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Bug Date is empty !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(testerForm.e_code.value==\"select\")\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Employee Code is empty !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\tif(testerForm.status.value==\"select\")\r\n");
      out.write("    \t\t{\r\n");
      out.write("    \t\t\twindow.alert(\"Select Status !\");\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\t\r\n");
      out.write("       \t}\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body bgcolor=\"\">\r\n");
      out.write("  <form name=\"testerForm\" action=\"UpdateBugReport\" onsubmit=\"return check()\" method=\"post\">\r\n");
      out.write("  \t<center>\r\n");
      out.write("\r\n");
      out.write("<h3><font color=\"#FBB117\" face=\"arial narrow\">&nbsp;&nbsp;&nbsp;&nbsp;Update Bug</font></h3>\r\n");
      out.write("  \t<table border=\"0\" cellpadding=\"2\" >\r\n");


		ServletContext sc=getServletContext();
		String driver=sc.getInitParameter("drivername");
		String url=sc.getInitParameter("url");
		String uname=sc.getInitParameter("username");
		String pwd=sc.getInitParameter("password");
		int bugid;
		bugid=Integer.parseInt(request.getParameter("bugid"));
try{
			Class.forName(driver);
			Connection  con=DriverManager.getConnection(url,uname,pwd);
			System.out.println(".......11........");
			ResultSet rs;
			
			PreparedStatement pstmt1=con.prepareStatement("select * from bug_report where bugno=?");
			pstmt1.setInt(1,bugid);
			rs=pstmt1.executeQuery();	
			while(rs.next())
			{			

      out.write("\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Bug_type</font></td><td><input type=\"text\" name=\"bug_name\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td></tr>\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Bug_type</font></td><td><input type=\"text\" name=\"bug_type\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td></tr>\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Bug_level</font></td><td><input type=\"text\" name=\"bug_level\" value=\"");
      out.print(rs.getString(4));
      out.write("\"></td></tr>\r\n");
      out.write("\t\t<tr><td align=\"right\"><font>Priority</font></td><td><input type=\"text\" name=\"priority\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td></tr>\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Project Name</font></td><td><input type=\"text\" name=\"pname\" value=\"");
      out.print(rs.getString(6));
      out.write("\"></td></tr>\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Tester Code</font></td><td> <input type=\"text\" name=\"tester_code\" value=\"");
      out.print(rs.getString(7));
      out.write("\"></td></tr>  \t\t\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Bug Date</font></td><td> <input type=\"text\" name=\"bug_date\" value=\"");
      out.print(rs.getString(8));
      out.write("\"></td></tr>\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Employee code</font></td><td> <input type=\"text\" name=\"e_code\" value=\"");
      out.print(rs.getString(9));
      out.write("\"></td></tr>\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Tester Status</font></td><td> <input type=\"text\" name=\"e_code\" value=\"");
      out.print(rs.getString(10));
      out.write("\"></td></tr>\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Rectified Date</font></td><td> <input type=\"text\" name=\"bug_rectified\" ></input></td></tr>  \t\t\r\n");

}
}
catch(Exception e)
{
	e.printStackTrace();
}
 
      out.write("  \t\r\n");
      out.write("  \t\t<tr><td align=\"right\"><font>Status</font></td><td> \r\n");
      out.write("  \t\t<select name=\"status\">\r\n");
      out.write("  \t\t\t<option value=\"select\">---select---</option>\r\n");
      out.write("  \t\t\t<option>open</option>\r\n");
      out.write("  \t\t\t<option>close</option>\r\n");
      out.write("  \t\t\t<option>resolve</option>\r\n");
      out.write("  \t\t\t<option>completed</option>\r\n");
      out.write("  \t\t</select>\r\n");
      out.write("  \t\t</td></tr>  \t\t\r\n");
      out.write("  \t\t<tr><td align=\"center\" colspan=\"2\"><input type=\"hidden\" name=\"bugid\" value=\"");
      out.print(bugid);
      out.write("\"></td></tr>  \t\t  \t\t  \t\t\r\n");
      out.write("  \t\t<tr><td align=\"center\" colspan=\"2\"><input type=\"submit\" value=\"submit\"></td></tr>  \t\t  \t\t  \t\t\r\n");
      out.write("  \t</table>\r\n");
      out.write("  \t</center>\r\n");
      out.write("   </form>\r\n");
      out.write("   </body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "./footer.jsp", out, false);
      out.write("   \r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
