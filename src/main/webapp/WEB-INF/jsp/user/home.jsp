<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"/>

<h2>username ${user.username}</h2>
<h2>phone ${user.phone}</h2>
<h2>email ${user.email}</h2>

<c:forEach items="${user.properties}" var="property">
    <p>${property}</p>
</c:forEach>
<div><a href="${pageContext.request.contextPath}/user/${user.id}/property">Property</a></div>

<jsp:include page="../footer.jsp"/>