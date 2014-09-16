package org.seandeng.web.struct2;

import org.seandeng.persist.jdbc.SeandengDAO;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SeandengController implements Controller {

	private SeandengDAO seandengDAO;

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        seandengDAO.load();
		return null;
	}



	public SeandengDAO getSeandengDAO() {
		return seandengDAO;
	}

	public void setSeandengDAO(SeandengDAO seandengDAO) {
		this.seandengDAO = seandengDAO;
	}
}