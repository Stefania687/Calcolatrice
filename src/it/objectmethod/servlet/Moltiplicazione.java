package it.objectmethod.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Moltiplicazione extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int numero1 = Integer.parseInt(req.getParameter("num1"));
			int numero2 = Integer.parseInt(req.getParameter("num2"));

			int result = numero1 * numero2;

			req.setAttribute("risultato", result);
			req.getRequestDispatcher("index.jsp").forward(req, resp);

		} catch (Exception e) {
			System.out.println("Errore!!!");

		}
	}
}
