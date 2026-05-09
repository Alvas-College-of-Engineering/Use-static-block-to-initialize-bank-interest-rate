<%@ page import="model.BankAccount" %>

<%
BankAccount acc =
    (BankAccount) request.getAttribute("account");

double interest =
    (Double) request.getAttribute("interest");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interest Details</title>
</head>

<body>

<h1>Bank Account Details</h1>

<p>Account Number:
<%= acc.getAccountNumber() %></p>

<p>Customer Name:
<%= acc.getCustomerName() %></p>

<p>Balance:
<%= acc.getBalance() %></p>

<p>Interest Rate:
<%= BankAccount.getInterestRate() %>%</p>

<p>Calculated Interest:
<%= interest %></p>

</body>
</html>