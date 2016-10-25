<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>

<h2>name ${client.name}</h2>
<h2>surname ${client.surname}</h2>
<h2>lastname ${client.lastname}</h2>
<h2>phone ${client.phone}</h2>

<c:forEach items="${client.meetingDays}" var="meeting">
    <p>${meeting}</p>
</c:forEach>
<div><a href="${pageContext.request.contextPath}/client/${client.id}/meeting">Meeting</a></div>

<jsp:include page="../footer.jsp"/>