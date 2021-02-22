<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calcolatrice</title>

<style type="text/css">
form {
	width: 400px;
	margin: 50px auto;
}

fieldset {
	padding: 20px;
	text-align: center;
}

.number {
	width: 70px;
	height: 30px;
}

.containerOperator {
	margin: auto;
	padding: 20px;
}

.operator {
	width: 30px;
	height: 30px;
}

.result {
	text-align: center;
}
</style>

</head>
<body>
	<div>
		<form method="get" action="index.jsp">
			<fieldset>

				<input type="number" name="num1" class="number" placeholder="num1" />
				<input type="number" name="num2" class="number" placeholder="num2" />

				<div class="containerOperator">
					<input type="submit" name="add" formaction="addizione" value="+" class="operator" />
					<input type="submit" name="sott" formaction="sottrazione" value="-" class="operator" />
					<input type="submit" name="molt" formaction="moltiplicazione" value="*" class="operator" />
					<input type="submit" name="div" formaction="divisione" value="/" class="operator" />
				</div>

			</fieldset>
		</form>
		<p class="result">Risultato: ${risultato}</p>
	</div>
</body>
</html>