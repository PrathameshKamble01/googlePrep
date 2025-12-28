function kthminmax() {
  let k = 3;
  let arr = [5, 3, 7, 4, 54, 78];
  arr.sort(function (a, b) {
    return a - b;
  });
  console.log(arr);
  console.log(k + 'th smallest is: ' + arr[k - 1]);
  console.log(k + 'th largest is: ' + arr[arr.length - k]);
}
kthminmax();
