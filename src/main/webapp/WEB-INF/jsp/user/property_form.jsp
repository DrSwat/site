<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-4 col-md-offset-4 text-center">
        <h1>Property</h1>
        <form:form modelAttribute="property" method="post" action="" role="form">
            <div class="form-group">
            <form:select path="typeDwelling" class="form-control" items="${type}"/>
            <form:errors class="help-block" path="typeDwelling"/>
        </div>
            <div class="form-group">
                <input class="form-control " name="adress" id="adress" value="${property.adress}"
                       placeholder="adress"/>
                <form:errors class="help-block" path="adress"/>
            </div>
            <div class="form-group">
                <input class="form-control" name="country" id="country" value="${property.country}"
                       placeholder="country"/>
                <form:errors class="help-block" path="country"/>
            </div>
            <div class="form-group">
                <input class="form-control" name="town" id="town" value="${property.town}"
                       placeholder="town"/>
                <form:errors class="help-block" path="town"/>
            </div>
            <div class="form-group">
                <input class="form-control" name="price" id="price" value="${property.price}"
                       placeholder="price"/>
                <form:errors class="help-block" path="price"/>
            </div>


            <div class="form-group">
                <button class="btn btn-primary width-full" id="send" type="submit">submit</button>
            </div>

        </form:form>
    </div>
</div>