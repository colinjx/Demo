<%--
  Created by IntelliJ IDEA.
  User: Colin
  Date: 2018/8/21
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/static/css/application.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/static/js/application.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.11.0.js"></script>
</head>
<body>
<script type="text/javascript">
    $().ready(function () {
        $("#btn_query").click(function () {
            var json = '{"name":"'+$("#name").val()+
                '","description":"'+$("#description").val() +
                '","imgPath":"'+$("#imgPath").val()+
                '"}';

            window.location.href="${pageContext.request.contentType}/goods/toList?queryJsonStr="+json;
        })
    })
</script>

    <table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
        <tr>
            <td colspan=4 align=center class="tableLineBg">客户查询</td>
        </tr>
        <tr>
            <td>商品名称</td>
            <td><input type="text" id="name" name="name" class="input"></td>
            <td>商品描述</td>
            <td><input type="text" id="description" name="description" class="input"></td>
        </tr>
        <tr>
            <td>图片位置</td>
            <td><input type="text" id="imgPath" name="imgPath" class="input"></td>

        </tr>
        <tr>
            <td colspan=4 align=center><input id="btn_query" type="button" value="查询" class="button"></td>
        </tr>
    </table>
 </body>
</html>
