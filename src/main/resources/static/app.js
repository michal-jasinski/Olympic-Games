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
            templateUrl: 'events_page/events.html',
            controller: 'EventsCtrl'
        })
        .when('/competitors', {
            templateUrl: 'competitors_page/competitors.html',
            controller: 'CompetitorsCtrl'
        });
}]);
