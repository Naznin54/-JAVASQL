function findMax(numbers: number[]): number {
    let max = numbers[0]; 
  
    for (let i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i]; 
      }
    }
  
    return max;
  }
  const numbers = [3, 5, 2, 8, 1];
  const max = findMax(numbers);
  console.log(max); 
  