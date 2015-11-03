<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    <script src="<c:url value="/resources/js/myController.js" />"></script>
	<title>Home</title>
</head>
<body style="background-color:#E6E6FA">

<div data-ng-app="myApp">
		<div data-ng-controller="MyController2">
			{{person}}
		</div>
	</div>
</body>
</html>
