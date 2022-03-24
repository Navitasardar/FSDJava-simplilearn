package com.university;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UniversityDetails
 */
@WebServlet("/UniversityDetails")
public class UniversityDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UniversityDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			DBConnection conn = new DBConnection("url", "uname", "password");
			Statement stmt = conn.getConnection().createStatement();
			String query = "select * from EngineeringStudents";
			ResultSet result = stmt.executeQuery(query);

			while (result.next()) {
				String universityData = "";
				for (int i = 1; i <= 6; i++) {
					universityData += result.getString(i) + ":";
				}
				System.out.println(universityData);
			}
			stmt.executeUpdate(
					"insert into EngineeringStudents(student_iD,department,first_name,last_name,passoutyear,university_rank) "
							+ "values(20211,'EXTC','Satyashil','Murtkar',2017,130,now())");
			out.println("Executed an insert operation<br>");
			stmt.executeUpdate("update EngineeringStudents set university_rank=150 where first_name = 'Navita'");
			out.println("Executed an update operation<br>");

			stmt.executeUpdate("delete from EngineeringStudents where first_name = 'Navita'");
			out.println("Executed a delete operation<br>");

			stmt.close();
			conn.closeConnection();
			out.println("</body></html>");
			conn.closeConnection();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}