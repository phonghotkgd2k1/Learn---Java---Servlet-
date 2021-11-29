package com.phonggd2k1.controller.admin.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.phonggd2k1.model.NewModel;
import com.phonggd2k1.service.INewService;
import com.phonggd2k1.utils.HttpUtil;

@WebServlet(urlPatterns = { "/api-admin-new" })

public class NewAPI extends HttpServlet {

	@Inject
	private INewService newService;

	private static final long serialVersionUID = 1699689218776832564L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();

		out.print("Hello world");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		System.out.println(request.getReader());
		NewModel newModel = HttpUtil.of(request.getReader()).toModel(NewModel.class);
		newModel = newService.save(newModel);
		System.out.println(newModel.toString().toString());
		mapper.writeValue(response.getOutputStream(), newModel);
	}
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
//	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//	}
}
