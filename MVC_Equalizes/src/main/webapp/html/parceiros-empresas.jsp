<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- BOOTSTRAP CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!-- ICON DO SITE (E) -->
    <link rel="shortcut icon" href="../img/icon.jpg" type="image/x-icon">

    <!-- ICON SITE REMIXICON -->
    <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">

    <!-- CSS EXTERNO -->
    <link rel="stylesheet" href="../css/all.css">

    <link rel="stylesheet" href="../css/parceiros.css">


    <title> Empresas parceiras | Equalizes </title>
</head>
<body>

  <div class="container-fluid">

        <!-- IN�CIO MENU -->

        <div class="row">

            <div class="col-12 mb-5">

                <nav class="navbar navbar-expand-lg navbar-light bg-dark">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="../index.html">

                            <img src="../img/logo_equalizes_white.png" alt="logo" class="logo">

                        </a>
                        <button class="navbar-toggler d-lg-none" type="button" data-bs-toggle="collapse"
                            data-bs-target="#collapsibleNavId" aria-controls="collapsibleNavId" aria-expanded="false"
                            aria-label="Toggle navigation" style="background-color: #164B66;">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse text-center" id="collapsibleNavId">
                            <ul class="navbar-nav me-auto mt-2 mt-lg-0">
                                <li class="nav-item active">
                                    <a class="nav-link text-light btn-hover" href="../index.html"> HOME <span
                                            class="visually-hidden">(current)</span></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-light btn-hover" href="../index.html"> MISS�O </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-light btn-hover" href="../index.html"> PROJETO </a>
                                </li>

                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle text-light btn-hover" href="#" id="dropdownId"
                                        data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">SEJA UM
                                        PARCEIRO</a>
                                    <div class="dropdown-menu" aria-labelledby="dropdownId">
                                        <a class="dropdown-item text-center btn-hover"
                                            href="parceiros-escolas.jsp">ESCOLAS</a>

                                        <hr class="dropdown-divider">

                                        <a class="dropdown-item text-center btn-hover" href="#">EMPRESAS</a>
                                    </div>
                                </li>

                                <li class="nav-item">
                                    <a class="nav-link text-light btn-hover" href="contato.html"> CONTATO </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link text-light btn-login float-right" href="login.jsp"> LOGIN </a>
                                </li>

                            </ul>

                        </div>
                    </div>
                </nav>

            </div>

        </div>

        <!-- FIM MENU -->


        <header>
            <div class="jumbotron">
                <div class="container-fluid">
                    <h1 class="display-5">SEJA UMA EMPRESA PARCEIRA DO PROJETO EQUALIZES</h1>
                    <p class="text-center">Venha conosco nessa jornada para assegurar educa��o inclusiva,
                        equitativa e de qualidade para todos!
                    </p>
                </div>
            </div>

            <!-- Inicio Checks -->
            <div class="row">

                <div class="col-sm-4 text-light  text-center"> &#10003 Assist�ncia </div>
                <div class="col-sm-4 text-light  text-center"> &#10003 Diferencial </div>
                <div class="col-sm-4 text-light text-center"> &#10003 Equidade </div>

            </div>


            <div class="row mt-2 mb-3">

                <div class="col-sm-4 text-light  text-center"> &#10003 Imagem </div>
                <div class="col-sm-4 text-light  text-center"> &#10003 Inclus�o </div>
                <div class="col-sm-4 text-light text-center"> &#10003 Oportunidade </div>

            </div>


            <!-- Fim Checks -->

        </header>


        <main class="main2">


            <!-- Inicio Formulario -->

            <form action="" method="">


                <div class="row m-0">

                    <div class="col-12 mt-4">
                        <p class="pFormulario">
                            Fa�a seu Cadastro Abaixo
                        </p>
                        <p class="p2Formulario">Entraremos em contato atrav�s do e-mail cadastrado
                        </p>
                    </div>

                </div>


                <!-- IN�CIO INPUTS -->
                <div class="row ms-2 me-2">

                    <div class="row m-0">

                        <div class="col-sm-6 mt-3">

                            <label>Raz�o Social:</label> <br>
                            <input type="text" name="razaoSocial" placeholder="Digite a Raz�o Social da Empresa" required />


                        </div>


                        <div class="col-sm-6 mt-3">

                            <label>CNPJ:</label> <br>
                            <input type="text" name="cnpj" maxlength="14" id="cnpj" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*?)\..*/g, '$1');"
                                placeholder="Digite o CNPJ (Apenas N�meros)" required />


                        </div>

                    </div>

                    <div class="row m-0">

                        <div class="col-md-6 mt-3">
                            <label for="rua">Rua:</label>
                            <input type="text" name="rua" disabled />
                        </div>

                        <div class="col-md-2 mt-3">
                            <label for="numero">N�:</label>
                            <input type="text" name="numero" maxlength="6" required />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="complemento">Complemento:</label>
                            <input type="text" name="complemento" maxlength="50" />
                        </div>

                        <div class="col-md-6 mt-3">
                            <label for="bairro">Bairro:</label>
                            <input type="text" name="bairro" disabled />
                        </div>

                        <div class="col-md-6 mt-3">

                            <label>Cidade:</label>
                            <input type="text" name="cidade" disabled />

                        </div>



                        <div class="col-md-6 mt-3">

                            <label>Estado:</label>

                            <input type="text" name="estado" disabled />

                        </div>


                        <div class="col-md-6 mt-3">


                            <label>CEP:</label>
                            <input type="text" maxlength="8" name="cep" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*?)\..*/g, '$1');" placeholder="Digite o Cep" />


                        </div>



                    </div>


                    <div class="row m-0">

                        <div class="col-sm-6 mt-3">

                            <label>Telefone:</label> <br>
                            <input type="text" name="telefone" id="telefone" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*?)\..*/g, '$1');" placeholder="(xx) xxxxx-xxxx" maxlength="11" required>

                        </div>


                        <div class="col-sm-6 mt-3">

                            <label>E-mail Institucional:</label> <br>
                            <input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Digite o E-mail">

                        </div>


                    </div>


                    <div class="row m-0">

                        <div class="col-sm-12 mt-3">
                            <label>Voc� confirma a autencidade dos dados informados acima?</label>
                        </div>



                        <div class="col-sm-12">

                            <input type="checkbox" id="sim" name="opc" value="sim">
                            <label for="sim">Sim</label>

                        </div>

                    </div>


                    <div class="col-12 mt-3 mb-4">
                        <button type="submit" id="botao">Enviar</button>
                    </div>

                </div>

                <!-- FIM INPUTS -->

            </form>

            <!-- Fim Formulario -->


        </main>


        <!-- ICON SCROLL TOP -->

        <i onclick="subirTela()" class="ri-arrow-up-s-line" id="icon-top"></i>

        <!-- ICON SCROLL TOP -->


        <!-- RODAP� -->

        <footer>


            <div class="row">

                <div class="col-12 text-center mt-4">

                    <img src="../img/logo_equalizes_white.png" alt="logo" class="logo">

                </div>

            </div>



            <div class="row">

                <div class="col-12 text-center mt-4">

                    <div class="icon-redeSociais">

                        <a href="https://github.com/SQUAD29T3" target="_blank"> <i class="ri-github-fill"></i></a>


                    </div>


                </div>

            </div>


            <div class="row">
                <div class="col-12">

                    <p class="text-light text-center pt-4"> &copy 2022 - Equalizes - Squad 29 </p>

                </div>
            </div>


        </footer>

        <!-- FIM RODAP� -->

    </div>


    <!-- JAVASCRIPT EXTERNO -->
    <script src="../js/all.js"></script>

    <script src="../js/parceiros.js"></script>


    <!-- BOOTSTRAP JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
        
</body>
</html>