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
    <title>CustomerList</title>
    <link href="${pageContext.request.contextPath}/static/css/application.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/js/application.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.11.0.js"></script>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="myTag" tagdir="/WEB-INF/tags" %>


<table  width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine DoubleColorTable" >

    <tr>
        <td colspan="6">
            <a href="${pageContext.request.contextPath}/store/toQuery">转到查询</a>
            &nbsp;&nbsp;
            <a href="${pageContext.request.contextPath}/store/toAdd">转到新增</a>
        </td>
    </tr>
    <tr>
        <td colspan="4" align="center" class="tableLineBg">
            客户列表
        </td>
    </tr>
    <tr>
        <td>商品编号</td>
        <td>数量</td>
    </tr>
    <c:forEach var="m" items="${page.result}">
        <tr>
            <td>${m.goodsUuid}</td>
            <td>${m.storeNum}</td>
            <td>
                <a href="${pageContext.request.contextPath}/store/toUpdate/${m.uuid}">修改</a> |
                <a href="${pageContext.request.contextPath}/store/toDelete/${m.uuid}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4" align="center">
            <input type="hidden" id="queryJsonStr" value='${storeWeb.queryJsonStr}'/>
            <myTag:page page="${page}"></myTag:page>
        </td>
    </tr>
</table>

</body>
</html>
