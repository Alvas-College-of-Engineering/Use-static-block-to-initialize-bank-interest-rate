package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BankAccount;

@WebServlet("/BankServlet")
public class BankServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int accNo = Integer.parseInt(
                request.getParameter("accountNumber"));

        String name =
                request.getParameter("customerName");

        double balance = Double.parseDouble(
                request.getParameter("balance"));

        BankAccount account =
                new BankAccount(accNo,
                                name,
                                balance);

        double interest =
                account.calculateInterest();

        request.setAttribute("account", account);
        request.setAttribute("interest", interest);

        request.getRequestDispatcher("result.jsp")
               .forward(request, response);
    }
}