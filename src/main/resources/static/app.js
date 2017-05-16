'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
    'ngRoute',
    'myApp.events',
    'myApp.competitors',
    'myApp.version'
]).
config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/events', {
            templateUrl: 'events/events.html',
            controller: 'EventsCtrl'
        })
        .when('/competitors', {
            templateUrl: 'competitors/competitors.html',
            controller: 'CompetitorsCtrl'
        });
}]);
