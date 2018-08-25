<%--
  Created by IntelliJ IDEA.
  User: Colin
  Date: 2018/8/20
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/static/css/application.css" rel="stylesheet">
</head>
<form action="${pageContext.request.contextPath}/goods/update" method="post">
    <input type="hidden" name="uuid" value="${goods.uuid}">
    <table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
        <tr>
            <td colspan=4 align=center class="tableLineBg">商品修改</td>
        </tr>
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="name" class="input"></td>
            <td>商品描述</td>
            <td><input type="text" name="description" class="input"></td>
        </tr>
        <tr>
            <td>图片位置</td>
            <td><input type="text" name="imgPath" class="input"></td>
        </tr>
        <tr>
            <td colspan=4 align=center><input type="submit" value="修改" class="button"></td>
        </tr>
    </table>
</form>
</html>
