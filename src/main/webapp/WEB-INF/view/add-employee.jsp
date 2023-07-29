<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div>
    <div class="col-12">
        <h2 align="center">Add employee</h2>
        <div class="mx-auto col-10 col-md-8 col-lg-6">
            <form:form action="/saveEmployee" method="POST" modelAttribute="employee">
                <div class="form-group">
                    <label for="name">Employee name</label>
                    <form:input type="text" path="name" id="name" class="form-control"/>
                    <br/>

                    <label for="job">Employee jobTitle</label>
                    <form:input type="text" path="jobTitle" id="job" class="form-control"/>
                    <br/>

                    <label for="email">Employee email</label>
                    <form:input type="text" path="email" id="email" class="form-control"/>
                    <br/>

                    <label for="country">Employee country</label>
                    <form:input type="text" path="country" id="country" class="form-control"/>
                    <br/>

                    <br/>

                    <button type="submit" class="btn btn-primary">Submit</button>

                </div>
            </form:form>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>