<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- BOOTSTRAP -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">


<!-- ICON DO SITE (E) -->
<link rel="shortcut icon" href="../img/icon.jpg" type="image/x-icon">


<!-- GOOGLE ICON -->

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />

<link rel="stylesheet" href="../css/perfil.css">


<title>Informa��es cadastrais</title>
</head>
<body>

	<div class="container-fluid">

		<!-- HEADER -->
		<header>
			<div class="logo">
				<img src="../img/logo_equalizes_white.png" alt="logo">
			</div>
			<div class="logout">
				<a href="#"> <span class="material-symbols-outlined">
						logout </span>
				</a>
			</div>
		</header>
		<!-- FIM HEADER -->



		<div class="row linha2">

			<!-- IN�CIO MENU -->
			<nav class="col-md-3 empresa">


				<p class="perfilEmpresa">
					<span class="material-symbols-outlined"> apartment </span> PERFIL
					EMPRESA
				</p>

				<ul>
					<li><a href="perfil-empresa.jsp"> <span
							class="material-symbols-outlined"> home </span> IN�CIO
					</a></li>
					<li><a href="pedidos.jsp"> <span
							class="material-symbols-outlined"> sync_alt </span> PEDIDOS
					</a></li>

					<li><a href="#"> <span class="material-symbols-outlined">
								info </span> INFO. CADASTRAIS
					</a></li>
					<li><a href="configuracoes-empresa.jsp"> <span
							class="material-symbols-outlined"> settings </span> CONFIGURA��ES
					</a></li>
				</ul>
			</nav>
			<!-- FIM MENU -->

			<main class="col-md-9">

				<h2>INFORMA��ES CADASTRAIS</h2>

				<form action="" method="">

					<input type="hidden" name="id" />

					<div class="row mt-3">

						<h3>Dados da empresa:</h3>

						<div class="col-md-4 mt-3">
							<label for="cnpj">cnpj:</label> <br /> <input type="text"
								name="cnpj" maxlength="14" disabled />
						</div>

						<div class="col-md-4 mt-3">
							<label for="nome">Nome Fantasia:</label> <br /> <input
								type="text" name="nome" maxlength="100" disabled />
						</div>

						<div class="col-md-4 mt-3">
							<label for="razao">Raz�o Social:</label> <br /> <input
								type="text" name="razao" maxlength="100" disabled />
						</div>

						<div class="col-md-4 mt-3">
							<label for="atividade">Atividade empresarial:</label> <br /> <input
								type="text" name="atividade" maxlength="10" />
						</div>


						<div class="col-md-4 mt-3">
							<label for="proprietario">Propriet�rio(a):</label> <input
								type="text" name="proprietario" maxlength="50" />
						</div>


						<div class="col-md-4 mt-3">
							<label for="socio">S�cio(a):</label> <input type="text"
								name="socio" maxlength="50" />
						</div>

						<div class="col-md-4 mt-3">
							<label for="adm">Administrador(a):</label> <input type="text"
								name="adm" maxlength="50" />
						</div>

						<div class="col-md-4 mt-3">
							<label for="email">E-mail:</label> <input type="text"
								name="email" maxlength="50" />
						</div>

						<div class="col-md-4 mt-3">
							<label for="telefone">Telefone:</label> <input type="text"
								name="telefone" maxlength="15" />
						</div>


					</div>


					<!-- INFORMA��ES DE ENDERE�O -->
					<div class="row mt-5">

						<h3>Endere�o:</h3>
						<div class="col-md-4 mt-3">
							<label for="rua">Rua:</label> <input type="text" name="rua"
								disabled />
						</div>

						<div class="col-md-4 mt-3">
							<label for="numero">N�:</label> <input type="text" name="numero"
								maxlength="6" />
						</div>

						<div class="col-md-4 mt-3">
							<label for="complemento">Complemento:</label> <input type="text"
								name="complemento" maxlength="50" />
						</div>

					</div>

					<div class="row mt-3">

						<div class="col-md-4 mt-3">
							<label for="bairro">Bairro:</label> <input type="text"
								name="bairro" disabled />
						</div>

						<div class="col-md-4 mt-3">
							<label for="cidade">Cidade:</label> <input type="text"
								name="cidade" disabled />
						</div>

						<div class="col-md-4 mt-3">
							<label for="uf">Uf:</label> <input type="text" name="uf" disabled />
						</div>

						<div class="col-md-4 mt-3">
							<label for="cep">Cep:</label> <input type="text" name="cep"
								maxlength="8" />
						</div>

					</div>


					<div class="row mt-3">

						<div class="col-12 mt-5 mb-5">
							<input type="submit" value="Atualizar dados">
						</div>

					</div>




				</form>

			</main>


		</div>


	</div>


</body>
</html>