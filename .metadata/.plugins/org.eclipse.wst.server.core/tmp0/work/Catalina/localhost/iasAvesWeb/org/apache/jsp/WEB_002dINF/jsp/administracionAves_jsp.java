/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2017-10-27 11:23:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class administracionAves_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Administracion Aves</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar app = angular.module('iasAvesWeb', []);\r\n");
      out.write("\tapp.controller('administracionAves', [ '$scope', '$http', '$rootScope',\r\n");
      out.write("\t\t\tfunction($scope, $http, $rootScope) {\r\n");
      out.write("\t\t\t\tlistarAves($scope, $http, $rootScope);\r\n");
      out.write("\t\t\t\tingresarAve($scope, $http, $rootScope);\r\n");
      out.write("\t\t\t} ]);\r\n");
      out.write("\r\n");
      out.write("\tfunction listarAves($scope, $http, $rootScope) {\r\n");
      out.write("\t\t$http({\r\n");
      out.write("\t\t\turl : '/iasAvesWeb/AvesServicio/listarAves',\r\n");
      out.write("\t\t\tmethod : 'GET'\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\t\t.then(\r\n");
      out.write("\t\t\t\t\t\tfunction mySuccess(response) {\r\n");
      out.write("\t\t\t\t\t\t\t$scope.listaAves = response.data;\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tfunction myError(response) {\r\n");
      out.write("\t\t\t\t\t\t\talert(\"Error cargando el servicio : /iasAvesWeb/AvesServicio/listarAves, causa: \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ response.statusText);\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ingresarAve($scope, $http, $rootScope) {\r\n");
      out.write("\t\t$scope.ingresarAve = function(cdave, dsnombreComun, dsnombreCientifico) {\r\n");
      out.write("\t\t\tif (cdave === undefined || dsnombreComun === undefined\r\n");
      out.write("\t\t\t\t\t|| dsnombreCientifico === undefined) {\r\n");
      out.write("\t\t\t\talert(\"Ingrese ID, Nombre Comun o Nombre Cientifico para realizar el ingreso\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$http({\r\n");
      out.write("\t\t\t\turl : '/iasAvesWeb/AvesServicio/ingresarAve',\r\n");
      out.write("\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\tparams : {\r\n");
      out.write("\t\t\t\t\tcdave : cdave,\r\n");
      out.write("\t\t\t\t\tdsnombreComun : dsnombreComun,\r\n");
      out.write("\t\t\t\t\tdsnombreCientifico : dsnombreCientifico\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\t\t.then(\r\n");
      out.write("\t\t\t\t\t\t\tfunction mySuccess(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$scope.listaAvesNombre = response.data;\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tfunction myError(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"Error cargando el servicio : /iasAvesWeb/AvesServicio/ingresarAve, causa: \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t+ response.statusText);\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div ng-app=\"iasAvesWeb\" ng-controller=\"administracionAves\"\r\n");
      out.write("\t\tclass=\"container\">\r\n");
      out.write("\t\t<h2>Administracion Aves</h2>\r\n");
      out.write("\t\t<form class=\"form-horizontal\" action=\"/action_page.php\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label col-sm-2\" for=\"cdave\">ID :</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cdave\" ng-model=\"cdave\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Codigo Ave\" name=\"cdave\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label col-sm-2\" for=\"dsNombreComun\">Nombre\r\n");
      out.write("\t\t\t\t\tComun:</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"dsNombreComun\"\r\n");
      out.write("\t\t\t\t\t\tng-model=\"dsNombreComun\" placeholder=\"Nombre Comun\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dsNombreComun\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"control-label col-sm-2\" for=\"dsNombreCientifico\">Nombre\r\n");
      out.write("\t\t\t\t\tCientifico:</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"dsNombreCientifico\"\r\n");
      out.write("\t\t\t\t\t\tng-model=\"dsNombreCientifico\" placeholder=\"Nombre Cientifico\"\r\n");
      out.write("\t\t\t\t\t\tname=\"dsNombreCientifico\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\tng-click=\"ingresarAve(cdave,dsNombreComun,dsNombreCientifico)\">ingresar</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\tng-click=\"ingresarAve(cdave,dsNombreComun,dsNombreCientifico)\">Eliminar</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<table class=\"table table-striped table-bordered\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t<th>NOMBRE COMUN</th>\r\n");
      out.write("\t\t\t\t<th>NOMBRE CIENTIFICO</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr ng-repeat=\"ave in listaAves\">\r\n");
      out.write("\t\t\t\t<td>{{ave.cdave}}</td>\r\n");
      out.write("\t\t\t\t<td>{{ave.dsnombreComun}}</td>\r\n");
      out.write("\t\t\t\t<td>{{ave.dsnombreCientifico}}</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<p align=\"left\">Powered By: Andres Jurado</p>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
