package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servletscrud.dto.StudentDto;

@WebServlet("/insert")
public class Student_controller extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid = req.getParameter("sid");
		String sname = req.getParameter("sname");
		
		int sid=Integer.parseInt(sid_id);
		
		StudentDto dto=new StudentDto();
		dto.setStd_id(sid);
		dto.setStd_name(sname);
		
		Student_Dao dao=new Student_Dao();
		dao.insert(dto);

	}

}
