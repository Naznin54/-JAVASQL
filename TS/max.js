var input = prompt('Enter an array of numbers (comma-separated):');
var arr = input.split(',').map(Number);
var max = Math.max.apply(Math, arr);
console.log("The maximum element in the array is: ".concat(max));
