var num = parseInt(prompt("Digite um número inteiro... "));

function parOuImpar(num) {
  return num % 2 === 0 ? "par inteiro..." : "ímpar, está faltando algo...";
}
console.log(parOuImpar(num));