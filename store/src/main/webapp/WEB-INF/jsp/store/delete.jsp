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
<form action="${pageContext.request.contextPath}/store/delete" method="post">
    <input type="hidden" name="uuid" value="${store.uuid}">
    <table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
        <tr>
            <td colspan=4 align=center class="tableLineBg">库存删除</td>
        </tr>
        <tr>
            <td>商品编号</td>
            <td><input type="text" name="goodsUuid" class="input"></td>
            <td>数量</td>
            <td><input type="text" name="storeNum" class="input"></td>
        </tr>

        <tr>
            <td colspan=4 align=center><input type="submit" value="删除" class="button"></td>
        </tr>
    </table>
</form>
</html>
