var notasStr = prompt("Digite as notas separadas por vírgula... ");
var notas = notasStr.split(',').map(Number);

function mediaNotas(notas) {
  var soma = 0;
  for (var n of notas) soma += n;
  return soma / notas.length;
}
console.log("A média que você quer calcular é essa: ", mediaNotas(notas));