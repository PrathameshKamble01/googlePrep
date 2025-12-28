function findMinMax() {
  let arr = [23, 45, 356, 56, 34, 2, 5, 7, 4];
  let minnum = Math.min(...arr);
  let maxnum = Math.max(...arr); 
  console.log('Minimum Number is: ' + minnum);
  console.log('Maximum Number is: ' + maxnum);
}

findMinMax();
