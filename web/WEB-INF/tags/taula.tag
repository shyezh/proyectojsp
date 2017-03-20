<%@tag language="java" description="component taula" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="numFiles" required="true"%>
<%@ attribute name="numColumnes" required="true"%>

<%@ attribute name="color" required="false"%>
<table bgcolor="${color}" border="1">
<c:forEach var="i" begin="1" end="${numFiles}" step="1">
        <c:forEach var="j" begin="1" end="${numColumnes}" step="1">
        <tr> ${i} </tr>
        </c:forEach>
        
 </c:forEach>
</table>