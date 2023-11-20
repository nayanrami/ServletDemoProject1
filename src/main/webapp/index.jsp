<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="assets/css/style.css" />
</head>
<body>

	<nav class="navbar navbar-expand-lg bg-body-tertiary "
		style="background-color: #ED7D31 !important;">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Features</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Pricing</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled"
						aria-disabled="true">Disabled</a></li>
				</ul>
			</div>
		</div>
	</nav>



	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<form action="HomeServlet" method="get">
				<div class="card">
					<div class="card-header bg-danger" style="color: #fff">Signup
						Here</div>
					<div class="card-body">
						<input type="text" class="form-control m-2"
							placeholder="Enter Your Firstname" name="firstname" /> <input type="text"
							class="form-control m-2" placeholder="Enter Your Lastname" name="lastname"/> <input
							type="text" class="form-control m-2"
							placeholder="Enter Your Email" name="email"/> <input type="text"
							class="form-control m-2" placeholder="Enter Your Mobile Number" name="mobileno"/>
						<input type="submit" class="btn btn-danger" />
					</div>
				</div>
			</form>
		</div>
		<div class="col-md-4"></div>
	</div>

	<footer>
		<p class="footertxt">Design & Developed By Nayan &copy</p>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>