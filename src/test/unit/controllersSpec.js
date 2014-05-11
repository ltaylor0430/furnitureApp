

/* jasmine specs for controllers go here */
describe('Furniture controllers', function() {
	beforeEach(module('furnitureApp'));
 it ('should create the category model with 18 categories', inject(function($controller) {
 	var scope = {},
        ctrl = $controller('FurnitureCtrl',{$scope:scope});

    expect(scope.categories.length).toBe(3);
 }));
});