
const statusPedido = document.querySelector('#status');
const aberto = document.querySelector('.aberto')
const novos = document.querySelector('.novos');
const andamento = document.querySelector('.andamento');
const concluidos = document.querySelector('.concluidos');

statusPedido.addEventListener("change", listarPedido);

// PERFIL EMPRESA - PÁGINA PEDIDOS
function listarPedido() {

    if (statusPedido.value == "novos") {
        AdicionarClass();
        novos.classList.remove('novos');

    } else if (statusPedido.value == "andamento") {
        AdicionarClass();
        andamento.classList.remove('andamento')

    } else if (statusPedido.value == "concluidos") {
        AdicionarClass();
        concluidos.classList.remove('concluidos');


    } else if (statusPedido.value == "todos") {
        novos.classList.remove('novos');
        andamento.classList.remove('andamento');
        concluidos.classList.remove('concluidos');
    }
}

const AdicionarClass = () => {
    novos.classList.add('novos');
    andamento.classList.add('andamento');
    concluidos.classList.add('concluidos');
}


// PERFIL ESCOLA - PÁGINA ANDAMENTO DE PEDIDOS

function listar() {
    if (statusPedido.value == "aberto") {
        classAdd();
        aberto.classList.remove('aberto');

    } else if (statusPedido.value == "andamento") {
        classAdd();
        andamento.classList.remove('andamento')

    } else if (statusPedido.value == "concluidos") {
        classAdd();
        concluidos.classList.remove('concluidos');

    } else if (statusPedido.value == "todos") {
        aberto.classList.remove('aberto');
        andamento.classList.remove('andamento');
        concluidos.classList.remove('concluidos');
    }

}

const classAdd = () => {
    aberto.classList.add('aberto');
    andamento.classList.add('andamento');
    concluidos.classList.add('concluidos');
}


// aberto.classList.add('aberto');

// aberto.classList.remove('aberto');