(function () {
    var app = angular.module('sketchApp', []);
    app.controller('sketchesCtrl', function ($scope, $http, $location) {
        $http.get($location.absUrl() + '/sketch/all').then(function (response) {
            $scope.sketches = response.data;
        });

        $scope.myFunction = function () {
            alert(this.sketch.name);
        }
    });
})();