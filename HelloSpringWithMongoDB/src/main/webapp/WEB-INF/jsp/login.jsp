<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login Page</title>

<!--  jquery -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>
	window.jQuery || document.write('<script src="../_nav/js/jquery.js"><\/script>')
</script>

<!-- demo scripts -->
<link rel="stylesheet" href="style.css">

<!-- nav script -->
<script src="../_nav/js/nav.js" type="text/javascript"></script>
</head>

<body>

	<!-- nav meta -->
	<div class="demo-meta">
		<h1 class="demo-title">Login Page</h1>
		<p class="demo-desc"></p>
	</div>

	<!-- demo content -->
	<div class="loginform cf">
		<form name="login" action="login_submit" method="get"
			accept-charset="utf-8">
			<ul>
				<li><label for="usermail">Email</label> <input type="email"
					name="usermail" placeholder="yourname@email.com" required>
				</li>
				<li><label for="password">Password</label> <input
					type="password" name="password" placeholder="password" required></li>
				<li><input type="submit" value="Login"></li>
			</ul>
		</form>
	</div>

</body>
</html>