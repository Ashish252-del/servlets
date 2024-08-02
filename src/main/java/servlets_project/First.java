package servlets_project;
import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import java.util.*;
import com.google.gson.Gson; // this is a external library which is added by downloading jar file , by configuring build path 


@WebServlet("/api/*")
public class First extends HttpServlet{
	
	@Override
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        // Handle GET requests   
	 
		// sending html response 
//	        response.setContentType("text/html");
//	        response.getWriter().println("<h1>This is a simple GET response!</h1>");
	   
		// semding json response 
		  Map<String, Object> data = new HashMap<>();
	        data.put("name", "John Doe");
	        data.put("age", 30);

	        // Convert data to JSON
	        Gson gson = new Gson();
	        String json = gson.toJson(data);

	        // Set content type to JSON
	        response.setContentType("application/json");

	        // Write JSON to response
	        response.getWriter().write(json);
	}
	

}
