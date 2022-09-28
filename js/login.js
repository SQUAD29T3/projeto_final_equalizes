const escolas = document.getElementById('escolas');
const empresas = document.getElementById('empresas');

escolas.addEventListener("change", escolha);
empresas.addEventListener("change", escolha);

function escolha() {
	if (escolas.checked == true) {
		
		document.querySelector('.escola').style.display = "block";
		document.querySelector('.empresa').style.display = "none";
		document.querySelector('.img-padrao').style.display = "none";
        
	} else if (empresas.checked == true) {
		document.querySelector('.escola').style.display = "none";
		document.querySelector('.img-padrao').style.display = "none";
		document.querySelector('.empresa').style.display = "block";

	}
}

