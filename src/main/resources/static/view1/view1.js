'use strict';

angular.module('myApp.view1', ['ngRoute'])

    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {
            templateUrl: 'view1/view1.html',
            controller: 'View1Ctrl'
        });
    }])

    .controller('View1Ctrl', function ($scope,$http) {
        $scope.groupChoosen=false;
        $scope.group=0;
        $scope.data;

        $scope.choose = function(group) {
            $scope.group = group;
            $scope.groupChoosen=true;
            $scope.get();
        };

        $scope.get = function() {
            $http.get('http://localhost:8080//get').then(function (dataResponse) {
                console.log(dataResponse);
                $scope.data = dataResponse.data;
            });
        };

        $scope.plus = function(questionNumber,answer) {
            console.log(answer);
            $http.get('http://87.206.243.32:8080//plus?group='+$scope.group+"&questionNumber="+questionNumber+
            "&answer="+answer).then(function(dataResponse) {
                console.log(dataResponse);
                $scope.get();
            });
        };
        //Integer group, Integer questionNumber, Integer answer

        $scope.minus = function(questionNumber,answer) {
            console.log(answer);
            $http.get('http://87.206.243.32:8080//minus?group='+$scope.group+"&questionNumber="+questionNumber+
                "&answer="+answer).then(function(dataResponse) {
                console.log(dataResponse);
                $scope.get();
            });
        };

        $scope.getLabel=function(n){
            switch (n) {
                case 0:
                    return "A";
                    break;
                case 1:
                    return "B";
                    break;
                case 2:
                    return "C";
                    break;
                case 3:
                    return "D";
                    break;
            }
        }
    });