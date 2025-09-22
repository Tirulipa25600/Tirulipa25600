const modal = document.querySelector(".modal-container");
const tbody = document.querySelector("tbody");
const sNome = document.querySelector("#m-nome");
const sFuncao = document.querySelector("#m-funcao");
const sRua = document.querySelector("#m-rua");
const sBairro = document.querySelector("#m-bairro");
const sNumero = document.querySelector("#m-numero");
const sUf = document.querySelector("#m-uf");
const sCep = document.querySelector("#m-cep");
const sCidade = document.querySelector("#m-cidade");
const sSalario = document.querySelector("#m-salario");
const btnSalvar = document.querySelector("#btnSalvar");

let itens = [];
let id;

function openModal(edit = false, index = 0) {
    modal.classList.add("active");

    modal.onclick = e => {
        if (e.target.classList.contains("modal-container")) {
            modal.classList.remove("active");
        }
    };

    if (edit) {
        sNome.value     = itens[index].nome;
        sFuncao.value   = itens[index].funcao;
        sSalario.value  = itens[index].salario;        
        sRua.value      = itens[index].rua;
        sNumero.value   = itens[index].numero;
        sBairro.value   = itens[index].bairro;
        sCep.value      = itens[index].cep;
        sCidade.value   = itens[index].cidade;
        sUf.value       = itens[index].uf;

        id = index;
    } else {
        sNome.value     = "";
        sFuncao.value   = "";
        sSalario.value  = "";        
        sRua.value      = "";
        sNumero.value   = "";
        sBairro.value   = "";
        sCep.value      = "";
        sCidade.value   = "";
        sUf.value       = "";

    }
}

function editItem(index) {
    openModal(true, index);
}

function deleteItem(index) {
    itens.splice(index, 1);
    setItensBD();
    loadItens();
}

function insertItem(item, index) {
    let tr = document.createElement("tr");

    tr.innerHTML = `
        <th>${item.nome}</th>
        <th>${item.funcao}</th>
        <th>R$ ${item.salario}</th>
        <th>${item.rua}</th>
        <th>${item.numero}</th>
        <th>${item.bairro}</th>        
        <th>${item.cidade}</th>
        <th>${item.uf}</th>
        <th>${item.cep}</th>

        <th class="acao">
            <button onclick="editItem(${index})"><i class="bx bx-edit"></i></button>
        </th>
        <th class="acao">
            <button onclick="deleteItem(${index})"><i class="bx bx-trash"></i></button>
        </th>
    `;

    tbody.appendChild(tr);
}

btnSalvar.onclick = e => {
    e.preventDefault();

if (sNome.value == "" || sFuncao.value == "" || sSalario.value == "" || sRua.value == "" || sNumero.value == "" || sBairro.value == "" || sCep.value == "" || sUf.value == "" || sCidade.value == "") {
        return;
    }

    if (id !== undefined) {
        itens[id].nome     = sNome.value;
        itens[id].funcao   = sFuncao.value;
        itens[id].salario  = sSalario.value;        
        itens[id].rua      = sRua.value;
        itens[id].numero   = sNumero.value;
        itens[id].bairro   = sBairro.value;
        itens[id].cep      = sCep.value;
        itens[id].uf       = sUf.value;
        itens[id].cidade   = sCidade.value;

    } else {
        itens.push({nome: sNome.value, funcao: sFuncao.value, salario: sSalario.value, rua: sRua.value, numero: sNumero.value, bairro: sBairro.value, cep: sCep.value, uf: sUf.value, cidade: sCidade.value});
    }

    setItensBD();
    modal.classList.remove("active");
    loadItens();
    id = undefined;
};

function loadItens() {
    itens = getItensBD();
    tbody.innerHTML = "";
    itens.forEach((item, index) => {
        insertItem(item, index);
    });
}

const getItensBD = () => JSON.parse(localStorage.getItem("dbfunc")) ?? [];
const setItensBD = () => localStorage.setItem("dbfunc", JSON.stringify(itens));

loadItens();
