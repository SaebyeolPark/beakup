<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, product.*" %>
<%
List<Product> list = ProductDAO.findByFabric("PRINT");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
<script src="/project1/res/common.js"></script>
<link rel="stylesheet" href="/project1/res/common.css"/>
<style>
div{color: #A57CC9;}
.logo { width: auto; height: auto; max-width: 170px; margin:5px; }
image.menu{ width: auto; height: auto; max-height: 25px;}
image.icon{width: 150PX; height: 150PX; border-radius: 30px;}
table.menu { width: 1300px; margin: auto; text-align: center; table-layout: fixed;
			 border-top: 4px solid #DDC5F2; border-collapse: collapse;}
tr.menu { border-bottom: 4px solid #DDC5F2;}
table.list{ width: 1300px;   text-align: center; table-layout: fixed;
			 border: 2px solid #DDC5F2;}
p.font-size{margin: -0.5px; font-size: 18px; font-weight: bolder;}
.clickable{ cursor: pointer;} 
</style>
</head>
<body>


<div>
<table class="list" cellpadding="10px">
<tr>
 <% for (Product product : list) { %>
        <td onClick="parent.location.href='product.jsp?id=<%= product.getId() %>'" style="cursor:pointer;">
        <image class="icon" src="/project1/image/<%=product.getName() %>.jpg" /> 
        <p class="font-size"><%= product.getName() %></p> <%= product.getPrice() %>원</td>
        <% if(product.getId() % 5 == 0) {%>
		      </tr><tr>
		  <% } %>
    <% } %>
</table>
</div>

</body>
</html>