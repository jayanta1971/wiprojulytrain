<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
	<form action="testsubmit" method="post" modelAttribute="logindata">

		<div>
			Login : <input type="text" name="userName" />
		</div>
		<div>
		Password : <input type="text" name="userPass" />
		</div>
			<div>
		<button type="submit">Login</button>
</div>


	</form>


</body>
</html>
