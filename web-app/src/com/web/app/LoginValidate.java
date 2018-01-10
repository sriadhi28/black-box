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

@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginValidate() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		try {
			LoginDetails ld = (LoginDetails) session.load(LoginDetails.class, user);
			if (pass.equals(ld.getPassword())) {
				out.println("Full Name:" + ld.getFullName());
				out.println("Email Id:" + ld.getEmail());
			} else {
				out.println("password incorrect");
			}
		} catch (Exception e) {
			out.println("Error");
			out.println(e);
		}
	}
}
