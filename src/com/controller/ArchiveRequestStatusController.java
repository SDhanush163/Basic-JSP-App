package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBCon.ServerConnection;
import com.dao.ArchiveReuqestStatusDao;
import com.entity.ArchiveRequestStatus;


@WebServlet("/ArchiveRequestStatusController")
public class ArchiveRequestStatusController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArchiveReuqestStatusDao dao = new ArchiveReuqestStatusDao();
		List<ArchiveRequestStatus> bills = dao.getAllArchiveRequestStatus();
		
		HttpSession session = request.getSession();
		session.setAttribute("statusFromController", bills);
		
		System.out.println("Forwarding to JSP for Data view");
		RequestDispatcher dispatcher = request.getRequestDispatcher("request_table.jsp");
		dispatcher.forward(request, response);
	}

}
