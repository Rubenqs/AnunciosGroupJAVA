<%-- 
    Document   : _menu_administrador
    Created on : 30-mar-2015, 18:45:20
    Author     : macbookair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../css/cabecera_anunciante.css">
<!DOCTYPE html>
<html lang="es">
    <head>

    </head>
    <body>
        <form action="${pageContext.request.contextPath}/CerrarSesion" method="POST" >
            <nav class="navbar navbar-default navbar-fixed-top" >
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="../inicio.jsp">

                            <img src="/AnunciosGroup0.3/img/Logo.png" height="35" width="250" style="margin-top: -10px;">

                            <span>

                            </span>
                        </a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                        <ul class="nav navbar-nav navbar-right">
                            <%= administrador.getNombre_u_administrador()%> 
                            <button style="margin: 5px 5px;" type="submit" class="btn btn-danger btn-sm">Cerrar Sessi&oacute;n</button>
                        </ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>  
        </form>
    </body>	
</html>