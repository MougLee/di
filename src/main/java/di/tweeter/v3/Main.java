package di.tweeter.v3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CDIDemoServlet", urlPatterns = { "/cdidemo" })
public class Main extends HttpServlet
{
	private static final long serialVersionUID = -6295866572297481382L;

	@Inject
	Tweeter tweeter;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		tweeter.setUser("MaticBalantič");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + tweeter.tweet("Tweeting from great API :)") + "</h1>");
	}
}