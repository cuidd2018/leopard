package io.leopard.myjetty.workbench;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.leopard.myjetty.web.freemarker.MyJettyView;

public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MyJettyView view = new MyJettyView("welcome");
		view.render(request, response);
	}

}
