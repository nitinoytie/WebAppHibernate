package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modal.Product;

import java.io.IOException;

import dao.ProductDao;

/**
 * Servlet implementation class RegisterProduct
 */
public class RegisterProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname=request.getParameter("pname");
		String pdec=request.getParameter("pdec");
		String pimg=request.getParameter("pimg");
		String price=request.getParameter("price");
		Product product=new Product();
		product.setPname(pname);
		product.setPdec(pdec);
		product.setImgurls(pimg);
		product.setPrice(Integer.parseInt(price));
		ProductDao.saveProduct(product);
		request.getRequestDispatcher("ProductList.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
