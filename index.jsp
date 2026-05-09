<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Banking System</title>
</head>

<body>

<h1>Banking System</h1>

<form action="BankServlet" method="post">

    Account Number:
    <input type="text" name="accountNumber"><br><br>

    Customer Name:
    <input type="text" name="customerName"><br><br>

    Balance:
    <input type="text" name="balance"><br><br>

    <input type="submit" value="Calculate Interest">

</form>

</body>
</html>