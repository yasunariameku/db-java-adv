package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Product;
import service.ProductService;
/**
 * Servlet implementation class SearchAppServlet
 */
@WebServlet("/loginA")
public class SearchAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		// 文字化け対策
        request.setCharacterEncoding("UTF-8");

        // product_name、priceを取得
        String product_name = request.getParameter("name");
        String priceStr = request.getParameter("price");
        
        Integer price = null;
        
        if(!(priceStr.isEmpty())) {
        	price = Integer.parseInt(priceStr);
        }
        
        
       
        List<Product> result = new ProductService().findById(product_name, price);
        
        System.out.println(result);
        
        request.setAttribute("result", result);
        
        request.getRequestDispatcher("searchResult.jsp").forward(request, response);

        
       
    
        
	}

}
