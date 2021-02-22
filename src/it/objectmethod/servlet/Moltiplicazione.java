package it.objectmethod.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Moltiplicazione extends HttpServlet {
	String result = "";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			int primoFattore = Integer.parseInt(req.getParameter("num1"));
			int secondoFattore = Integer.parseInt(req.getParameter("num2"));

			result = "" + (primoFattore * secondoFattore);

		} catch (Exception e) {
			System.out.println("Errore!!!");
			result = "Errore nel server";
		}

		req.setAttribute("risultato", result);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
