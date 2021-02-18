package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ToCelsiusConversion;


/**
 * Servlet implementation class getCelConversion
 */
@WebServlet("/getCelConversionServlet")
public class getCelConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String celsiusConvert = request.getParameter("celsiusConvert");
		
		ToCelsiusConversion usersDegrees = new ToCelsiusConversion(Double.parseDouble(celsiusConvert));
		
		request.setAttribute("usersCelsiusConversion", usersDegrees);
		getServletContext().getRequestDispatcher("/celsiusResults.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(celsiusConvert.toString());
		writer.close();
	}

}