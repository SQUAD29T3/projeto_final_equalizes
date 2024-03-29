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


<title>Configura��es</title>
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
					<li><a href="perfil-empresa.jsp"> <span class="material-symbols-outlined">
								home </span> IN�CIO
					</a></li>
					<li><a href="pedidos.jsp"> <span
							class="material-symbols-outlined"> sync_alt </span> PEDIDOS
					</a></li>

					<li><a href="info-cadastrais-empresa.jsp"> <span
							class="material-symbols-outlined"> info </span> INFO. CADASTRAIS
					</a></li>
					<li><a href="#"> <span
							class="material-symbols-outlined"> settings </span> CONFIGURA��ES
					</a></li>
				</ul>
			</nav>
			<!-- FIM MENU -->

         <main class="col-md-9">

                <h2>CONFIGURA��ES</h2>

                <div class="row text-center mt-5">

                    <form action="" method="">

                        <h3>ATUALIZA��O DE E-MAIL E/OU SENHA:</h3>
                        <div class="col-md-12 mt-3">
                            <label for="email">E-mail:</label>
                            <input type="text" name="email" maxlength="50" />
                        </div>

                        <div class="col-md-12 mt-3">
                            <label for="senha">Senha:</label>
                            <input type="password" name="senha" maxlength="50" />
                        </div>

                        <div class="col-md-12 mt-3">
                            <input type="submit" value="Atualizar" />
                        </div>

                    </form>


                    <form class="mt-5" action="exclui_empresa" method="POST">
                        
                        <h3 class="bg-dark">EXCLUIR CADASTRO</h3>

						<input type="hidden" name="id" class="mt-4 p-2"
							value="" />

						<div class="row mt-5">
							<p class="mb-5 text-danger">
								<strong>Tem certeza que deseja excluir a sua conta?</strong>
							</p>

							<div class="col-6">
								<label for="sim">Sim</label> <input type="radio" id="sim"
									name="opc" value="sim" />
							</div>

							<div class="col-6">
								<label for="nao">N�o</label> <input type="radio" id="nao"
									name="opc" value="nao" checked />
							</div>
						</div>

						<input type="submit" id="botao"
							class="mt-5 mb-4 bg-danger text-light p-3 btn" style="font-size: 1.6rem"
							value="Excluir conta">
                        
                    </form>


                </div>

            </main>


		</div>


	</div>

<script src="../js/excluirConta.js"></script>
</body>
</html>
