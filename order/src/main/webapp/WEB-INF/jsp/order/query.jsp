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
            var json = '{"customerUuid":"'+$("#customerUuid").val()+
                '","orderTime":"'+$("#orderTime").val() +
                '","totalMoney":"'+$("#totalMoney").val()+
                '","saveMoney":"'+$("#saveMoney").val()+
                '","state":"'+$("#state").val()+
                '"}';

            window.location.href="${pageContext.request.contentType}/order/toList?queryJsonStr="+json;
        })
    })
</script>

    <table width="100%" border="1" cellpadding="0" cellspacing="1" class="tableLine">
        <tr>
            <td colspan=4 align=center class="tableLineBg">客户查询</td>
        </tr>
        <tr>
            <td>客户编号</td>
            <td><input type="text" id="customerUuid" name="customerUuid" class="input"></td>
            <td>订单时间</td>
            <td><input type="text" id="orderTime" name="orderTime" class="input"></td>
        </tr>
        <tr>
            <td>总金额</td>
            <td><input type="text" id="totalMoney" name="totalMoney" class="input"></td>
            <td>优惠金额</td>
            <td><input type="text" id="saveMoney" name="saveMoney" class="input"></td>
        </tr>
        <tr>
            <td>状态</td>
            <td><input type="text" id="state" name="state" class="input"></td>

        </tr>
        <tr>
            <td colspan=4 align=center><input id="btn_query" type="button" value="查询" class="button"></td>
        </tr>
    </table>
 </body>
</html>
