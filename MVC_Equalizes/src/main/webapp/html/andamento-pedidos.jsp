<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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


<title>Andamento de Pedidos</title>

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
			<nav class="col-md-3 escola">


				<p class="perfilEscola">
					<span class="material-symbols-outlined "> school </span> PERFIL
					INSTITUI��O DE ENSINO
				</p>

				<ul>
					<li><a href="perfil-escola.jsp"> <span
							class="material-symbols-outlined"> home </span> IN�CIO
					</a></li>
					<li><a href="fazer-pedido.jsp"> <span
							class="material-symbols-outlined"> edit </span> FAZER PEDIDO
					</a></li>
					<li><a href="#"> <span class="material-symbols-outlined">
								query_stats </span> ANDAMENTO DE PEDIDOS
					</a></li>
					<li><a href="info-cadastrais-escola.jsp"> <span
							class="material-symbols-outlined"> info </span> INFO. CADASTRAIS
					</a></li>
					<li><a href="configuracoes-escola.jsp"> <span
							class="material-symbols-outlined"> settings </span> CONFIGURA��ES
					</a></li>
				</ul>
			</nav>
			<!-- FIM MENU -->

			<main class="col-md-9">

				<h2>ANDAMENTO DE PEDIDOS</h2>

				<div class="row text-center mt-5">
					<h3>SELECIONE O STATUS DO PEDIDO PARA VERIFICAR:</h3>

					<form class="mt-2" action="" method="">

						<select name="status" id="status" class="p-2" onchange="listar()">
							<option value="escolha" disabled selected>Escolha:</option>
							<option value="aberto">Em aberto</option>
							<option value="andamento">Em andamento</option>
							<option value="concluidos">Conclu�dos</option>
							<option value="todos">Listar todos</option>
						</select>

					</form>

					<div class="col-md-12 mt-5 aberto">

						<h4 class="bg-dark text-light p-2">Em aberto</h4>

						<table>
							<tr>
								<th>ID</th>
								<th>DESCRI��O</th>
								<th>DATA DO PEDIDO</th>
								<th>STATUS</th>
							</tr>

							<tr>
								<td>000</td>
								<td>5 Tablets</td>
								<td>00/00/0000</td>
								<td>Em aberto</td>
								<td><button class="p-2 btn bg-success text-light">Editar</button></td>
							</tr>
						</table>

					</div>

					<div class="col-md-12 mt-5 andamento">

						<h4 class="bg-warning p-2">Em andamento</h4>

						<table>
							<tr>
								<th>ID</th>
								<th>EMPRESA PROVEDORA</th>
								<th>DESCRI��O</th>
								<th>DATA DO PEDIDO</th>
								<th>DATA DE ATENDIMENTO</th>
								<th>STATUS</th>
							</tr>

							<tr>
								<td>000</td>
								<th>X</th>
								<td>5 Tablets</td>
								<td>00/00/0000</td>
								<td>00/00/0000</td>
								<td>Em andamento</td>
							</tr>
						</table>

					</div>



					<div class="col-md-12 mt-5 mb-5 concluidos">

						<h4 class="bg-success text-light p-2">Conclu�dos</h4>

						<table>
							<tr>
								<th>ID</th>
								<th>EMPRESA PROVEDORA</th>
								<th>DESCRI��O</th>
								<th>DATA DO PEDIDO</th>
								<th>DATA DE CONCLUS�O</th>
								<th>STATUS</th>
							</tr>

							<tr>
								<td>000</td>
								<th>X</th>
								<td>5 Tablets</td>
								<td>00/00/0000</td>
								<td>00/00/0000</td>
								<td>conclu�do</td>
							</tr>
						</table>

					</div>


				</div>

			</main>

		</div>


	</div>

	<script src="../js/pedidos.js"></script>
</body>
</html>