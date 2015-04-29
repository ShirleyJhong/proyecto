<%-- 
    Document   : login
    Created on : 28/04/2015, 08:40:00 PM
    Author     : sjhon_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"/>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
        <title>INICIO DE SESION</title>
    </head>
    <body>
        <div class="row">   
            <div class="col-md-4">LOGUEARSE</div>
        </div>    
                                  
        <form method="post" name="frmLogueo" id="frmLogueo">
            <label>Usuario</label>
            <input type="text" name="txtUsuario" class="form-control" id="txtUsuario"/>
            <label>Contraseña</label>
            <input type="password" name="txtPass" id="txtPass"/>
            <input type="submit" name="btnRegistrar" id="btnLoguear" value="Loguearse"/>            
        </form>
        
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/npm.js"></script>
    </body>
</html>