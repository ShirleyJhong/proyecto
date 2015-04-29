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
    <body style="background: #e8e8e8">
        <!-- <div class="container" style="background:#265a88 ">       
            <div id="row">   
            <div class="col-md-4">LOGUEARSE</div>
        </div>  -->    
        <div class="container" style="background:#265a88 ">                               
            <br><br>    
        <form method="post" name="frmLogueo" id="frmLogueo">
            <div class="col-md-4">
                <!--  <label class="btn btn-info">Usuario</label>  -->
                <label style="color: #ffffff">Usuario</label>
                <input type="text" name="txtUsuario" class="form-control" id="txtUsuario" placeholder="Ingrese Usuario"/>
            </div>
            <div class="col-md-4">
                <label style="color: #ffffff">Contraseña</label>
                <input type="password" name="txtPass"  class="form-control" id="txtPass" placeholder="Ingrese Contraseña"/>
            </div>
            <br>
            <input type="submit" name="btnLoguear" id="btnLoguear" value="Loguearse" class="btn btn-primary"/>            
        </form>  
          <br><br>
      </div>    
        <br>
    <center> <img src="img/gota_azul2.jpg" width="600" height="400" ></center>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/npm.js"></script>
    </body>
</html>