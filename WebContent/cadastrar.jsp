<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css" href="codigo.css">
 <link href="https://fonts.googleapis.com/css?family=Allerta+Stencil|Oswald|Amiko" rel="stylesheet">
<style type="text/css">

</style>

<title>Cadastrar</title>
</head>
<body><center>
<div class="corpo">
<div class="titulo"> Cadastro </div>


<div class="links">
<a href="index.jsp"> Início </a>
<a href="cadastrar.jsp"> Cadastrar </a>
<a href="Listar.bee"> Listar </a>
<a href="login.jsp"> Login </a>
</div>
<br><B>${msg}</B><br>
<form action="CadastrarUsuario.bee" method="POST">
			<br><br><br><table align="center">
<tr>
		<td>Nome: </td>
			 <td><input type="text" name="nome"/><br></td> </tr><tr>
		<td>Login: </td>
			 <td><input type="text" name="login"/><br></td> </tr>
	<tr>
		<td>Senha:</td> 
			<td><input type="password" name="senha"   /><br></td>
	<tr>
		<td></td>
		<td><input type="submit" value="Cadastrar" width="30px"></td>
	</tr>
	</table> <br><br>
</div>
</body>
</html>