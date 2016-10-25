<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-4 col-md-offset-4 text-center">
        <h1>User</h1>
        <form:form modelAttribute="user" method="post" action="" role="form">
            <div class="form-group">
                <input class="form-control" name="username" id="username" value="${user.username}"
                       placeholder="username"/>
                <form:errors class="help-block" path="username"/>
            </div>
            <div class="form-group">
                <input class="form-control" type="email" name="email" id="email" value="${user.email}"
                       placeholder="email"/>
                <form:errors class="help-block" path="email"/>
            </div>
            <div class="form-group">
                <input class="form-control" name="phone" id="phone" value="${user.phone}"
                       placeholder="phone"/>
                <form:errors class="help-block" path="phone"/>
            </div>

            <div class="form-group">
                <button class="btn btn-primary width-full" id="send" type="submit">submit</button>
            </div>

        </form:form>
    </div>
</div>