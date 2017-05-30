'use strict';

angular.module('myApp.competitors', ['ngRoute'])

    .controller('CompetitorsCtrl', function ($scope, $http) {
        $scope.groupChoosen = false;
        $scope.group = 0;
        $scope.data;
        $scope.competitor = {
            name: "",
            age: 0,
            gender: "",
            country: ""
        }

        $scope.getAll = function () {
            $http.get('http://localhost:8080/competitors/getAll').then(function (dataResponse) {
                console.log(dataResponse);
                $scope.data = dataResponse.data;
            });
        };
        $scope.getAll();

        $scope.send = function () {
            $http({
                url: 'http://localhost:8080/competitors/',
                method: 'POST',
                headers: {'Content-Type': 'application/json'},
                data: $scope.competitor
            });
            $scope.getAll();

        };

        $scope.delete = function (id) {
            $http({
                url: 'http://localhost:8080/competitors/' + id,
                method: 'DELETE'
            });
            $scope.getAll();
        };

    });