var palavra = prompt("Digite uma palavra... ");
var palavra = palavra.toLowerCase().replace(/[\W_]/g, '');

function ehPalindromo(palavra) {
  let invertida = palavra.split("").reverse().join("");
  return palavra === invertida;
}
console.log(ehPalindromo(palavra) ? "É palíndromo! Boa... :)" : "Não é... poxa :(");