<%@include file="header.jsp" %>
<%@include file="session_bf_login.jsp" %>
<br />
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
		<div class="card">
			<div class="card-header">Login</div>
			<div class="card-body">
				<form action="loginController" method="post">
					<table class="table table-borderless">
						<tr>
							<td>${ERROR}</td>
						</tr>
						<tr>
							<td><input type="text" name="username"
								placeholder="Username" class="form-control" /></td>
						</tr>
						<tr>
							<td><input type="password" name="password"
								placeholder="Password" class="form-control" /></td>
						</tr>
						<tr>
							<td><input type="submit" class="btn btn-warning"
								value="Login" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<div class="col-md-4"></div>
</div>
<%@include file="footer.jsp"%>