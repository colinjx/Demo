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
<form action="${pageContext.request.contextPath}/cart/update" method="post">
    <input type="hidden" name="uuid" value="${cart.uuid}">
    <table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
        <tr>
            <td colspan=4 align=center class="tableLineBg">客户修改</td>
        </tr>
        <tr>
            <td>客户编号</td>
            <td><input type="text" name="customerUuid" value="${cart.customerUuid}" class="input"></td>
            <td>商品编号</td>
            <td><input type="text" name="goodsUuid" value="${cart.goodsUuid}" class="input"></td>
        </tr>
        <tr>
            <td>显示名称</td>
            <td><input type="text" name="buyNum" value="${cart.buyNum}" class="input"></td>

        </tr>
        <tr>
            <td colspan=4 align=center><input type="submit" value="修改" class="button"></td>
        </tr>
    </table>
</form>
</html>
