
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="../css/clientes.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="divCenter">
            <form  method="post"  action="../clientes">
            <label>Nome</label><br>
            <input type="text" name="nome"/><br>
            <label>Cpf</label><br>
            <input type="text" name="cpf"/><br>
            <label>E-mail</label><br>
            <input type="text" name="email"/><br>
            <label>Endereco</label><br>
            <input type="text" name="id_endereco"/><br>
            <input type="submit" name="cadastro" value="Cadastro"/>     
        </form>
        </div>
    </body>
</html>
