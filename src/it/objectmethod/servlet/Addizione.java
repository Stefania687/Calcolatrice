package it.objectmethod.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addizione extends HttpServlet {
	String result = "";

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int primoAddendo = Integer.parseInt(req.getParameter("num1"));
			int secondoAddendo = Integer.parseInt(req.getParameter("num2"));

			result = "" + (primoAddendo + secondoAddendo);

		} catch (Exception e) {
			System.out.println("Errore!!!");
			result = "Errore nel server";
		}
		req.setAttribute("risultato", result);
		req.getRequestDispatcher("index.jsp").forward(req, resp);

	}

}
