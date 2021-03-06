<%-- 
    Document   : comprar_sharecoins_paso3
    Created on : 04-06-2015, 09:02:54 PM
    Author     : zamorator <zamorator@gmail.com>
--%>

<%@page import="cl.inacap.model.Giro"%>
<%@page import="cl.inacap.model.Anunciante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../js/jquery-min.js"></script>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="../css/bootstrap-theme.min.css">
        <!-- Latest compiled and minified JavaScript -->
        <script src="../js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="../css/Estilos_ag.css">
        <link rel="stylesheet" href="../css/anunciante.css">
        <link rel="stylesheet" href="../css/bootstrap-nav-wizard.css">
        <title>Anunciante</title>
        <% Anunciante anunciante = (Anunciante) session.getAttribute("anunciante");
            Giro giro = (Giro) session.getAttribute("giro");
        %>
    </head>
    <body>
        <%@include file="../base_ag/_menu_anunciante.jsp" %> 

        <ul class="nav nav-pills nav-justified menu_anunciante" role="group"style="padding-top: 10%;">
            <li role="presentation" class="active"><a href="mis_anuncios.jsp">Anuncios</a></li>
            <li role="presentation"><a href="perfil.jsp">Perfil</a></li>
            <li role="presentation"><a href="#">Ayuda</a></li>
        </ul>

        <div id="panel"> 
            <div id="submenu" class="links_submenu">
                <ul class="nav nav-tabs">
                    <li role="submenu" class="active"><a href="mis_anuncios.jsp">Mis Anuncios</a></li>
                    <li role="submenu"><a href="#">Agregar Anuncio</a></li>
                <li role="submenu"><a href="#">Editar Anuncio</a></li>
                </ul>
            </div>
            <div id="agregar_anuncio" class="contenido">
                <ul class="nav nav-wizard">

                    <li>Paso 1</li>

                    <li>Paso 2</li>

                    <li class='active'>Paso 3</li>

                </ul>
                <h4>Gracias por comprar ShareCoins</h4>
                <h6>Tus ShareCoin ya fueron solicitados, debes esperar a que un administrador los autorice.</h6>
                
                <a href="mis_anuncios.jsp" class="btn btn-primary">Terminar</a>
            </div>
        </div>

        <%@include file="../base_ag/_pie_pagina.jsp" %>
    </body>
</html>
