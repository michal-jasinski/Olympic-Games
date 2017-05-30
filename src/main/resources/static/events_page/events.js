'use strict';

angular.module('myApp.events', ['ngRoute'])

    .controller('EventsCtrl', function ($scope, $http) {
        $scope.groupChoosen=false;
        $scope.group=0;
        $scope.data;
        $scope.event = {
            name: "",
            venueId: 0
        };
        $scope.venues;

        $scope.getAll = function () {
            $http.get('http://localhost:8080/events/getAll').then(function (dataResponse) {
                console.log(dataResponse);
                $scope.data = dataResponse.data;
            });
        };
        $scope.getAll();

        $scope.send = function () {
            $http({
                url: 'http://localhost:8080/events/',
                method: 'POST',
                headers: {'Content-Type': 'application/json'},
                data: $scope.event
            });
            $scope.getAll();

        };

        $scope.getAllVenues = function () {
            $http.get('http://localhost:8080/venues/getAll').then(function (dataResponse) {
                console.log(dataResponse);
                $scope.venues = dataResponse.data;
            });
        };
        $scope.getAllVenues();

        $scope.delete = function (id) {
            $http({
                url: 'http://localhost:8080/events/' + id,
                method: 'DELETE'
            });
            $scope.getAll();
        };
    });
