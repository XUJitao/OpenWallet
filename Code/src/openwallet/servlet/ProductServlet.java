package openwallet.servlet;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import openwallet.bean.*;
import openwallet.util.*;
import openwallet.dao.*;

public class ProductServlet extends BaseBackServlet {

	
	public String add(HttpServletRequest request, HttpServletResponse response, Page page) {
		int id_category = Integer.parseInt(request.getParameter("id_category"));
		Category c = categoryDAO.get(id_category);
		int id_user = Integer.parseInt(request.getParameter("id_user"));
		User u = userDAO.get(id_user);
		String name_product = request.getParameter("name_product");
		String description = request.getParameter("description");
		double price = Double.parseDouble(request.getParameter("price"));
		int stock = Integer.parseInt(request.getParameter("stock"));
		String[] date = request.getParameter("create_date_product").split("-");	
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
		Date create_date_product = cal.getTime();
		String origin = request.getParameter("origin");
		int sold = 0;
		String brand = request.getParameter("brand");
		String color = request.getParameter("color");
		String material = request.getParameter("material");
		int comment_count = 0;

		Product p = new Product();

		p.setCategory(c);
		p.setUser(u);
		p.setName_product(name_product);
		p.setDescription(description);
		p.setPrice(price);
		p.setStock(stock);
		p.setCreate_date_product(create_date_product);
		p.setOrigin(origin);
		p.setSold(sold);
		p.setBrand(brand);
		p.setColor(color);
		p.setMaterial(material);
		p.setComment_count(comment_count);
		
		productDAO.add(p);
		return "@admin_product_list?id_category="+c.getId_category();
	}

	
	public String delete(HttpServletRequest request, HttpServletResponse response, Page page) {
		int id = Integer.parseInt(request.getParameter("id"));
		Product p = productDAO.get(id);
		productDAO.delete(id);
		return "@admin_product_list?id_category="+p.getCategory().getId_category();
	}

	
	public String edit(HttpServletRequest request, HttpServletResponse response, Page page) {
		int id = Integer.parseInt(request.getParameter("id"));
		Product p = productDAO.get(id);
		request.setAttribute("p", p);
		return "admin/editProduct.jsp";		
	}
	
	public String update(HttpServletRequest request, HttpServletResponse response, Page page) {
		int id_product = Integer.parseInt(request.getParameter("id_product"));		
		int id_category = Integer.parseInt(request.getParameter("id_category"));
		Category c = categoryDAO.get(id_category);
		int id_user = Integer.parseInt(request.getParameter("id_user"));
		User u = userDAO.get(id_user);
		String name_product = request.getParameter("name_product");
		String description = request.getParameter("description");
		double price = Double.parseDouble(request.getParameter("price"));
		int stock = Integer.parseInt(request.getParameter("stock"));
		String[] date = request.getParameter("create_date_product").split("-");	
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
		Date create_date_product = cal.getTime();
		String origin = request.getParameter("origin");
		int sold = Integer.parseInt(request.getParameter("sold"));
		String brand = request.getParameter("brand");
		String color = request.getParameter("color");
		String material = request.getParameter("material");
		int comment_count = Integer.parseInt(request.getParameter("comment_count"));

		Product p = new Product();

		p.setId_product(id_product);
		p.setCategory(c);
		p.setUser(u);
		p.setName_product(name_product);
		p.setDescription(description);
		p.setPrice(price);
		p.setStock(stock);
		p.setCreate_date_product(create_date_product);
		p.setOrigin(origin);
		p.setSold(sold);
		p.setBrand(brand);
		p.setColor(color);
		p.setMaterial(material);
		p.setComment_count(comment_count);		

		productDAO.update(p);
		return "@admin_product_list?id_category="+p.getCategory().getId_category();
	}

	
	public String list(HttpServletRequest request, HttpServletResponse response, Page page) {
		Category c = categoryDAO.get(Integer.parseInt(request.getParameter("id_category")));
		List<Product> ps = productDAO.list(c.getId_category(), page.getStart(), page.getCount());
		int total = productDAO.getTotal();
		page.setTotal(total);
		
		request.setAttribute("c",c);
		request.setAttribute("ps", ps);
		request.setAttribute("page", page);
		return "admin/listProduct.jsp";
	}
}
