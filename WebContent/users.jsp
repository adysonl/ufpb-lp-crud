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
<title> Usuários </title>
</head><center>
<body><div class="corpo">
<div class="titulo"> Usuários </div>


<div class="links">
<a href="index.jsp"> Início </a>
<a href="cadastrar.jsp"> Cadastrar </a>
<a href="Listar.bee"> Listar </a>
<a href="login.jsp"> Login </a>
</div>
<br><B>${msg}</B><br>
<br><br>

	<table border="4" cellspacing="1" align="center">
	<tr>
	<td>Nome</td>
	<td>Login</td><td> </td><td> </td>
	<c:forEach items="${usuarios}" var="usuario">
	<tr>
	 <td> ${usuario.nome}</td>
	 <td>${usuario.login } </td>
	 <td><a  href="Deletar.bee?login=${usuario.login}"><img src="https://cdn4.iconfinder.com/data/icons/ionicons/512/icon-trash-a-128.png" width="25px"/></a></td>
	 <td><a  href="editar.jsp?login=${usuario.login}"><img src="http://download.seaicons.com/icons/icons8/windows-8/512/Editing-Edit-icon.png" width="22px"/></a></td>
	</c:forEach></tr>
	
	</table>
<br><br>
</body>
</html>