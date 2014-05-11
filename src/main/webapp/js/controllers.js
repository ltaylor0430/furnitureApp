'use strict';
  
  /* Controllers */

var furnitureControllers = angular.module('furnitureControllers', []);

furnitureControllers.controller('FurnitureCtrl', ['$scope','$http',function ($scope, $http) {
	//model
  $scope.phones = [
    {'name': 'Nexus S',
     'snippet': 'Fast just got faster with Nexus S.'},
    {'name': 'Motorola XOOM™ with Wi-Fi',
     'snippet': 'The Next, Next Generation tablet.'},
    {'name': 'MOTOROLA XOOM™',
     'snippet': 'The Next, Next Generation tablet.'}
  ];
  $scope.categories = [
    {'id': '1',
     'name': 'Action'},
    {'id': '2',
     'name': 'Animation'},
     {'id': '3',
     'name': 'Children'}
  ];
  $scope.name = "World";

  $scope.category = '1';
  //http request 
   $http.get('services/time').success(function(data) {
      $scope.theTime = data.hour + ':' + data.minute + ":" + data.second + " " + data.timezone;
    });


}]);