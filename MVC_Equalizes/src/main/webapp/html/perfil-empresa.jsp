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


    <title>Perfil</title>
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


        <!-- IN�CIO MENU -->
        <div class="row linha2">

            <!-- IN�CIO MENU -->
            <nav class="col-md-3 empresa">


                <p class="perfilEmpresa">
                    <span class="material-symbols-outlined">
                        apartment
                    </span>
                    PERFIL EMPRESA
                </p>



                <ul>
                    <li>
                        <a href="#">
                            <span class="material-symbols-outlined">
                                home
                            </span> IN�CIO
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="material-symbols-outlined">
                                edit
                            </span> FAZER PEDIDO
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="material-symbols-outlined">
                                select_check_box
                            </span> PEDIDOS CONCLU�DOS
                        </a>
                    </li>
                    <li>
                        <a href="info-cadastrais-empresa.jsp">
                            <span class="material-symbols-outlined">
                                info
                            </span> INFO. CADASTRAIS
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <span class="material-symbols-outlined">
                                settings
                            </span> CONFIGURA��ES
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- FIM MENU -->

            <main class="col-md-9">

                <h2>P�gina inicial</h2>

                <p class="text-center text-danger">Utilize os menus para navegar pelo perfil.</p>

            </main>

        </div>

    </div>


</body>
</html>