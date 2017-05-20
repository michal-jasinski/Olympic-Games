'use strict';

angular.module('myApp.competitors', ['ngRoute'])

    .controller('CompetitorsCtrl', function ($scope, $http) {
        $scope.groupChoosen = false;
        $scope.group = 0;
        $scope.data;

        $scope.getAll = function () {
            $http.get('http://localhost:8080/competitors/getAll').then(function (dataResponse) {
                console.log(dataResponse);
                $scope.data = dataResponse.data;
            });
        };
        $scope.getAll();
    });