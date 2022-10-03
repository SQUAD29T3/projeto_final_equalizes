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


    <title>Fazer pedido</title>
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
                        <a href="info-cadastrais-escola.jsp">
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

                <h2>FAZER PEDIDO</h2>

                <p class="text-center text-danger">Utilize o formul�rio abaixo para realizar pedidos.</p>

                <div class="row text-center mt-5">
                    <div class="col-md-12">

                        <form action="/cadastro_projeto" method="POST">

                       <input type="text" name="descricao" id="" placeholder="Descreva o pedido aqui" />


                            <input class="mt-3" type="submit" value="Solicitar">
                        </form>


                    </div>
                </div>

            </main>

        </div>


    </div>


</body>
</html>
