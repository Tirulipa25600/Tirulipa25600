var a = parseFloat(prompt("Esse vai ser o número supremo... "));
var b = parseFloat(prompt("ah, então vai ser esse o número supremo... "));
var c = parseFloat(prompt("Po, então só pode ser esse o número supremo... "));

function maior(a, b, c) {
  return Math.max(a, b, c);
}
console.log("Número supremo...: ", maior(a, b, c));