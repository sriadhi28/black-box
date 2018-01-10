package com.web.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/SaveIt")
public class SaveIt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveIt() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String fullname = request.getParameter("fullname");
		LoginDetails ld = new LoginDetails(username, password, email, fullname);
		session.beginTransaction();
		session.save(ld);
		session.getTransaction().commit();
		session.close();
		sf.close();
		out.println("User Added");
	}
}
