<%-- 
    Document   : index
    Created on : 18/09/2015, 20:04:12
    Author     : luiz.caus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de veiculos</title>
    </head>
    <body>
        <h1>Cadastrar veículos</h1>
        <form action="CarroServlet" method="post">

            <p>Placa :<input type="text" name="placa" id="placa"/></p>
            <p>Tipo :<select name="tipo" id="tipo">
                <option value="Carro">Carro</option>
                <option value="Caminhão">Caminhão</option>
                <option value="Moto">Moto</option>
                </select></p>
            <p><input type="submit">Cadastrar</input></p>


        </form>
    </body>
</html>
