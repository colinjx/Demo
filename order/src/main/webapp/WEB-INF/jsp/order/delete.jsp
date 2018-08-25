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
<form action="${pageContext.request.contextPath}/order/delete" method="post">
    <input type="hidden" name="uuid" value="${customer.uuid}">
    <table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
        <tr>
            <td colspan=4 align=center class="tableLineBg">订单删除</td>
        </tr>
        <tr>
            <td>客户编号</td>
            <td><input type="text" name="customerUuid" class="input"></td>
            <td>订单时间</td>
            <td><input type="text" name="orderTime" class="input"></td>
        </tr>
        <tr>
            <td>总金额</td>
            <td><input type="text" name="totalMoney" class="input"></td>
            <td>优惠金额</td>
            <td><input type="text" name="saveMoney" class="input"></td>
        </tr>
        <tr>
            <td>状态</td>
            <td><input type="text" name="state" class="input"></td>

        </tr>
        <tr>
            <td colspan=4 align=center><input type="submit" value="删除" class="button"></td>
        </tr>
    </table>
</form>
</html>
