var arrStr = prompt("Digite os números separados por vírgula... ");
var arr = arrStr.split(',').map(Number);

function contarPares(arr) {
  let cont = 0;
  for (let n of arr) if (n % 2 === 0) cont++;
  return cont;
}
console.log("Juntinhos e parzinhos:", contarPares(arr));