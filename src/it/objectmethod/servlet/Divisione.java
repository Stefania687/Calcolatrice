package it.objectmethod.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Divisione extends HttpServlet {
	String result = "";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int dividendo = Integer.parseInt(req.getParameter("num1"));
			int divisore = Integer.parseInt(req.getParameter("num2"));

			if (divisore == 0) {
				result = "Inserisci numero 2 diverso da 0!!!";
			} else {
				result = "" + (dividendo / divisore);

			}
		} catch (Exception e) {

			System.out.println("Errore!!!");
			result = "Errore nel server";
		}
		req.setAttribute("risultato", result);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
