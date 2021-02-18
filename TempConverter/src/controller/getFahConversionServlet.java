package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ToFahrenheitConversion;

/**
 * Servlet implementation class getFahConversionServlet
 */
@WebServlet("/getFahConversionServlet")
public class getFahConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFahConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fahrenheitConvert = request.getParameter("fahrenheitConvert");
		
		ToFahrenheitConversion usersDegrees = new ToFahrenheitConversion(Double.parseDouble(fahrenheitConvert));
		
		request.setAttribute("usersFahrenheitConversion", usersDegrees);
		getServletContext().getRequestDispatcher("/fahrenheitResults.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(fahrenheitConvert.toString());
		writer.close();
	}

}
