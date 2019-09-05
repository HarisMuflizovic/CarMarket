<!DOCTYPE html>
<html lang="en">

<head>
    <title>Welcome to Car Market</title>
    <!-- Bootstrap core CSS -->
    <link href="style/bootstrap/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="style/main.css" rel="stylesheet">
</head>

<body id="page-top">
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
        <div class="container">
            <a class="navbar-brand js-scroll-trigger" href="#page-top">Car Market</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="#about">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="#signUp">Sign Up</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <header class="bg-primary text-white">
        <div class="container text-center">
            <h1>Welcome to Car Market</h1>
            <p class="lead">Car Market</p>
        </div>
    </header>

    <section id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 mx-auto">
                    <h2>About Car Market</h2>
                    <p class="lead">Car Market is a newly created platform for selling new and used cars. It was founded in August 2019 in Sarajevo. The aim of the platform is to provide an easier and faster way to sell and buy a car. When visiting the platform, must respect certain rules:
</p>
                    <ul>
                        <li>Platform is available for everyone</li>
                        <li>Only registered users can sell or buy a car</li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <section id="signUp" class="bg-light">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card">
                        <header class="card-header">
                            <a href="" class="float-right btn btn-outline-primary mt-1">Log in</a>
                            <h4 class="card-title mt-2">Sign up</h4>
                        </header>
                        <article class="card-body">
                            <form>
                                <div class="form-row">
                                    <div class="col form-group">
                                        <label>First name </label>
                                        <input type="text" class="form-control" placeholder="">
                                    </div>
                                    <div class="col form-group">
                                        <label>Last name</label>
                                        <input type="text" class="form-control" placeholder=" ">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Username</label>
                                    <input type="text" class="form-control" placeholder="">
                                </div>
                                <div class="form-group">
                                    <label>Create password</label>
                                    <input class="form-control" type="password">
                                </div>
                                <div class="form-group">
                                    <label>Repeat password</label>
                                    <input class="form-control" type="password">
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="btn btn-primary btn-block"> Register </button>
                                </div>
                            </form>
                        </article>
                        <div class="border-top card-body text-center">Have an account? <a href="">Log In</a></div>
                    </div>
                </div>
            </div>
    </section>
    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 mx-auto">
                    <h2>Contact us</h2>
                    <p class="lead">You can contact us:</p>
                        <ul>
                            <li>Email: carmarket@gmail.com</li>
                            <li>Phone number: 033/000-000</li>
                        </ul>
                </div>
            </div>
        </div>
    </section>

    <jsp:include page="footer.jsp" />