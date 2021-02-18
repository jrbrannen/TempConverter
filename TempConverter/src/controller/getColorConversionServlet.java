package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ColorConverter;

/**
 * Servlet implementation class getColorConversionServlet
 */
@WebServlet("/getColorConversionServlet")
public class getColorConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getColorConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstColor = request.getParameter("firstColor");
		String secondColor = request.getParameter("secondColor");
		
		ColorConverter colorChoices = new ColorConverter(firstColor, secondColor);
		
		request.setAttribute("newColor", colorChoices);
		getServletContext().getRequestDispatcher("/colorResults.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(firstColor.toString());
		writer.println(secondColor.toString());
		writer.close();
	}

}
