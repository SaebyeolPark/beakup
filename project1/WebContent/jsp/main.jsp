<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, product.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
<script src="/project1/res/common.js"></script>
<link rel="stylesheet" href="/project1/res/common.css"/>
<style>
div{color: #A57CC9; margin: 20px }
.logo { width: 170px; margin:5px; left:50%; margin-left: -85px; position: relative;}
image.menu{ width: auto; height: auto; max-height: 25px;}
image.icon{width: 150PX; height: 150PX; border-radius: 30px; }
table.menu { width: 1300px; left:50%; margin-left: -650px; position: relative; table-layout: fixed; 
			 text-align: center; border-top: 4px solid #DDC5F2; border-collapse: collapse;}
tr.menu { border-bottom: 4px solid #DDC5F2;}
p.font-size{margin: -0.5px; font-size: 18px; font-weight: bolder;}
.clickable{ cursor: pointer;} 
iframe{ left:50%; margin-left: -657px; position: relative; }

</style>
</head>
<body>
<div width= "0px" margin= "auto">
<a href="main.jsp"><img class="logo" src="/project1/image/athenaLogo.jpg" /></a>
</div>

<div width= "0px" margin= "auto">
<table class="menu" cellpadding="3px">
<tr class="menu">
<td><a href="solidList.jsp" target = "list" ><img class="menu" src="/project1/image/solid.png" /></a></td>
<td><a href="printList.jsp" target = "list"><img class="menu" src="/project1/image/print.png" /></a></td>
<td><a href="checkList.jsp" target = "list"><img class="menu" src="/project1/image/checkPattern.png" /></a></td>
</tr>
</table>
</div>

<div width= "0px" margin= "auto">
<iframe width="1308px" height="1000px" src="mainList.jsp" name="list" id="list" frameborder="0" scrolling="no"></iframe>
</div>

</body>
</html>