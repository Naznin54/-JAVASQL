const input = prompt('Enter an array of numbers (comma-separated):');
const arr = input.split(',').map(Number);
const max = Math.max(...arr);
console.log(`The maximum element in the array is: ${max}`);
