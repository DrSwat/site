<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-4 col-md-offset-4 text-center">
        <h>Meeting</h>
        <form:form modelAttribute="meeting" method="post" action="" role="form">
        <div class="form-group">
            <select path="property" class="form-control" name="property" id="property" items="${properties}"
                    itemValue="id" itemLabel="adress">
                <c:forEach items="${properties}" var="property">
                    <option value="${property.id}">${property}</option>
                </c:forEach>
            </select>

            <form:errors class="help-block" path="property"/>
        </div>
        <div class="form-group">
            <div class='input-group date' id='datetimepicker'>
                <input type='text' class="form-control" name="time" id="time"/>
                <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
            </div>
            <script type="text/javascript">
                $(function () {
                    $('#datetimepicker').datetimepicker({
                        daysOfWeekDisabled: [0, 6]
                    });
                });
            </script>
                <%--<input class="form-control" type="date" name="time" id="time" value="${meeting.time}"--%>
                <%--placeholder="time"/>--%>
            <form:errors class="help-block" path="time"/>
        </div>
        <button class="btn btn-primary width-full" id="send" type="submit">submit</button>
    </div>
    </form:form>
</div>
</div>