<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-4 col-md-offset-4 text-center">
        <h1>Client</h1>
        <form:form modelAttribute="client" method="post" action="" role="form">
            <div class="form-group">
                <input class="form-control" name="surname" id="surname" value="${client.surname}"
                       placeholder="surname"/>
                <form:errors class="help-block" path="surname"/>
            </div>
            <div class="form-group">
                <input class="form-control" name="name" id="name" value="${client.name}"
                       placeholder="name"/>
                <form:errors class="help-block" path="name"/>
            </div>
            <div class="form-group">
                <input class="form-control" name="lastname" id="lastname" value="${client.lastname}"
                       placeholder="lastname"/>
                <form:errors class="help-block" path="lastname"/>
            </div>
            <div class="form-group">
                <input class="form-control" name="phone" id="phone" value="${client.phone}"
                       placeholder="phone"/>
                <form:errors class="help-block" path="phone"/>
            </div>


            <div class="form-group">
                <button class="btn btn-primary width-full" id="send" type="submit">submit</button>
            </div>

        </form:form>
    </div>
</div>