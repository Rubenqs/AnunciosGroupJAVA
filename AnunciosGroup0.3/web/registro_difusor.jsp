<%-- 
    Document   : registro_difusor
    Created on : 24-04-2015, 10:06:20
    Author     : zamorator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/Estilos_ag.css">
        <title>Registro Difusor</title>
    </head>
    <body>
        <div class="contenido">
            <% if (request.getParameter("message") != null) {%>
            <div class="alert alert-danger" role="alert">${param.message}</div>
            <% }%>
            <form method="POST" action="${pageContext.request.contextPath}/RegistroDifusor_1">
                <div class="form-group">
                    <label for="InputNombreDifusor">Nombre Difusor</label>
                    <input type="text" class="form-control" name="InputNombreDifusor" id="NombreDifusor" placeholder="Ingrese Nombre Difusor" required="">
                </div>
                <div class="form-group">
                    <label for="InputNombres">Nombres</label>
                    <input type="text" class="form-control" name="InputNombres" id="Nombres" placeholder="Ingrese Nombres" required="">
                </div>
                <div class="form-group">
                    <label for="InputApellidoPaterno">Apellido Paterno</label>
                    <input type="text" class="form-control" name="InputApellidoPaterno" id="ApellidoPaterno" placeholder="Ingrese Apellido Paterno" required="">
                </div>
                <div class="form-group">
                    <label for="InputApellidoMaterno">Apellido Materno</label>
                    <input type="text" class="form-control" name="InputApellidoMaterno" id="ApellidoMaterno" placeholder="Ingrese Apellido Materno" required="">
                </div>
                <div class="form-group">
                    <label for="InputEmail">e-mail</label>
                    <input type="email" class="form-control" name="InputEmail" id="Email" placeholder="Ingrese Correo Electrónico" required="">
                </div>
                <div class="form-group">
                    <label for="InputEdad">Edad</label>
                    <input type="number" class="form-control" name="InputEdad" id="Edad" placeholder="Ingrese Edad" required="">
                </div>
                <div class="form-group">
                    <label for="optionsRadiosSexo">Sexo</label>
                    <div class="radio">
                        <label>
                            <input type="radio" name="optionsRadiosSexo" id="male" value="male" checked>
                            Masculino
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="optionsRadiosSexo" id="female" value="female">
                            Femenino
                        </label>
                    </div>  
                </div>
                <p>Por favor ingresa al menos una red social</p>
                <div class="form-group">
                    <label for="InputFacebook">Facebook</label>
                    <input type="text" class="form-control" name="InputFacebook" id="Facebook" placeholder="Ingresa tu usuario de Facebook">
                </div>
                <div class="form-group">
                    <label for="InputTwitter">Twitter</label>
                    <input type="text" class="form-control" name="InputTwitter" id="Twitter" placeholder="Ingresa tu usuario de Twitter">
                </div>
                <div class="form-group">
                    <label for="InputGoogleplus">Google +</label>
                    <input type="text" class="form-control" name="InputGoogleplus" id="Facebook" placeholder="Ingresa usuario de Google+">
                </div>
                
                <div class="form-group">
                    <label for="InputPassword">Contraseña</label>
                    <input type="password" class="form-control" name="InputPassword" id="password" placeholder="Ingrese Contraseña" required="">
                </div>
                <div class="form-group">
                    <label for="InputPassword">Repita Contraseña</label>
                    <input type="password" class="form-control" name="InputPassword2" id="password2" placeholder="Ingrese Contraseña" required="">
                </div>
                <button class="btn btn-default" type="submit" >Registro</button>
            </form>
        </div>
        <%@include file="base_ag/_pie_pagina.jsp" %>
    </body>
</html>