// LINK API VIA CEP - https://viacep.com.br/

const campoCep = document.querySelector('[name="cep"]');
const estado = document.querySelector('[name="estado"]');
const cidade = document.querySelector('[name="cidade"]');

campoCep.addEventListener("blur", infoEvento => {
    const cep = infoEvento.target.value;
    fetch(`https://viacep.com.br/ws/${cep}/json`)
    .then(respostaServer => {
        return respostaServer.json();
    })
    .then(dadosCep => {
        console.log(dadosCep);
        estado.value = dadosCep.uf;
        cidade.value = dadosCep.localidade;
    })

})
