<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- BOOTSTRAP -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


    <!-- ICON DO SITE (E) -->
    <link rel="shortcut icon" href="../img/icon.jpg" type="image/x-icon">


    <!-- GOOGLE ICON -->

    <link rel="stylesheet"
        href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />

    <link rel="stylesheet" href="../css/perfil.css">


    <title>Informa��es Cadastrais</title>
</head>
<body>

<div class="container-fluid">

        <!-- HEADER -->
        <header>
            <div class="logo">
                <img src="../img/logo_equalizes_white.png" alt="logo">
            </div>
            <div class="logout">
                <a href="#">
                    <span class="material-symbols-outlined">
                        logout
                    </span>
                </a>
            </div>
        </header>
        <!-- FIM HEADER -->


        <div class="row linha2">

            <!-- IN�CIO MENU -->
            <nav class="col-md-3 escola">


                <p class="perfilEscola">
                    <span class="material-symbols-outlined ">
                        school
                    </span>
                    PERFIL INSTITUI��O DE ENSINO
                </p>

                <ul>
                    <li>
                        <a href="perfil-escola.jsp">
                            <span class="material-symbols-outlined">
                                home
                            </span> IN�CIO
                        </a>
                    </li>
                    <li>
                        <a href="fazer-pedido.jsp">
                            <span class="material-symbols-outlined">
                                edit
                            </span> FAZER PEDIDO
                        </a>
                    </li>
                    <li>
                        <a href="andamento-pedidos.jsp">
                            <span class="material-symbols-outlined">
                                query_stats
                            </span> ANDAMENTO DE PEDIDOS
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="material-symbols-outlined">
                                info
                            </span> INFO. CADASTRAIS
                        </a>
                    </li>
                    <li>
                        <a href="configuracoes-escola.jsp">
                            <span class="material-symbols-outlined">
                                settings
                            </span> CONFIGURA��ES
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- FIM MENU -->

<main class="col-md-9">

                <h2>INFORMA��ES CADASTRAIS</h2>

                <form action="" method="">

                    <input type="hidden" name="id" />
        
                    <div class="row mt-3">

                        <h3>Dados da escola:</h3>

                        <div class="col-md-4 mt-3">
                            <label for="nome">Nome da IE:</label> <br />
                            <input type="text" name="nome" maxlength="100" disabled />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="cnpj">Cnpj:</label> <br />
                            <input type="text" name="cnpj" maxlength="14" disabled />
                        </div>

                        <div class="col-md-2 mt-3">
                            <label for="turnos">Turnos:</label> <br />
                            <input type="text" name="turnos" maxlength="10" />
                        </div>

                        <div class="col-md-2 mt-3">
                            <label for="alunos">Qtd. alunos:</label> <br />
                            <input type="text" name="alunos" maxlength="10" />
                        </div>

                    </div>


                    <div class="row mt-3">

                        <div class="col-md-4 mt-3">
                            <label for="diretor">Diretor(a):</label>
                            <input type="text" name="diretor" maxlength="50" />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="vicediretor">Vice-diretor(a):</label>
                            <input type="text" name="vicediretor" maxlength="50" />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="coordenador">Coordenador(a):</label>
                            <input type="text" name="coordenador" maxlength="50" />
                        </div>

                    </div>

                    <div class="row mt-3">

                        <div class="col-md-4 mt-3">
                            <label for="secretaria">Secret�rio(a):</label>
                            <input type="text" name="secretaria" maxlength="50" />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="email">Email:</label>
                            <input type="text" name="email" disabled />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="telefone">Telefone:</label>
                            <input type="text" name="telefone" maxlength="15" />
                        </div>

                    </div>



                    <div class="row mt-5">

                        <h3>Endere�o:</h3>
                        <div class="col-md-4 mt-3">
                            <label for="rua">Rua:</label>
                            <input type="text" name="rua" disabled />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="numero">N�:</label>
                            <input type="text" name="numero" maxlength="6" />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="complemento">Complemento:</label>
                            <input type="text" name="complemento" maxlength="50" />
                        </div>

                    </div>

                    <div class="row mt-3">

                        <div class="col-md-4 mt-3">
                            <label for="bairro">Bairro:</label>
                            <input type="text" name="bairro" disabled />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="cidade">Cidade:</label>
                            <input type="text" name="cidade" disabled />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="uf">Uf:</label>
                            <input type="text" name="uf" disabled />
                        </div>

                        <div class="col-md-4 mt-3">
                            <label for="cep">Cep:</label>
                            <input type="text" name="cep" maxlength="8" />
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