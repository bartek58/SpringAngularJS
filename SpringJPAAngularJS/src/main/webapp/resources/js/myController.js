var app = angular.module("myApp", []);

app.controller("MyController", function($scope) {
	$scope.data = "INFO Z ANGULARA";
});

app.controller("MyController2", function($scope, $http) {
	$http({
		method : 'GET',
		url : 'springAngularJS'
	}).success(function(data) {
		$scope.person = data;
	})

});
