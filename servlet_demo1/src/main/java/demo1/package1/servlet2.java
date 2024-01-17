package demo1.package1;

 import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class servlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		
		PrintWriter out=res.getWriter();
		out.println("name");
		out.println(age);
}
}     