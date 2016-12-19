var coffeeApp = angular.module('coffeeApp', ['ngResource']);

coffeeApp.controller('OrderController', function($scope, $resource) {
    $scope.types = [
        { name: 'Americano', family: 'Coffee' },
        { name: 'Latte', family: 'Coffee' },
        { name: 'Yorkshire Tea', family: 'Tea' },
        { name: 'Cappuccino', family: 'Coffee' }
    ];

    $scope.sizes = ['Small', 'Medium', 'Large'];

    $scope.giveMeCoffee = function () {
        $scope.drink.coffeeShopId = 1;
        var CoffeeOrder = $resource('/service/coffeeshop/order/');
        CoffeeOrder.save($scope.drink);
    }
});