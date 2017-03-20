<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags"%>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
    <ul>
        <c:forEach var="a" items="${llistatAlumnes}">
            <div style="margin-left: 0%; background-color: gold; margin-right: 40%;">
            <ct:taula numFiles="${a.temps}" numColumnes="1" /><%= new java.util.Date()%> 
            </div>
            <div style="margin-left: 0%; background-color: blue; margin-right: 80%;">
            <ct:taula numFiles="${a.dutasque1}" numColumnes="1" /><%= new java.util.Date()%> 
            </div>
            <div style="margin-left: 20%; background-color: green; margin-right: 60%;">
            <ct:taula numFiles="${a.dutasque2}" numColumnes="1" /><%= new java.util.Date()%> 
            </div>
            <div style="margin-left: 40%; background-color: red; margin-right: 40%;">            
            <ct:taula numFiles="${a.dutasque3}" numColumnes="1" /><%= new java.util.Date()%> 
            </div>
        </c:forEach>
    </ul>

</body>
</html>
