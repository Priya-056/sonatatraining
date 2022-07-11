package com.database;
import java.sql.*;

class Student {
	
	public String addStudent() {
		
		String insert="insert into student values(111,'Raji',71)";
		
		return insert;
		
	}
	
	public String updateStudent() {
		
		String update="update student set stdmarks=64 where stdid=103";
		
		return update;
	}
	
	public String deleteStudent() {
		
		String delete="delete from student where stdid=110";
		
		return delete;
	}
	
	public String getAllStudent() {
		
		String view="select * from student";
		
		return view;
	}

	public static void main(String[] args) throws Exception {

		Student student=new Student();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sys", "priya", "Priya056*");
		Statement st=con.createStatement();
		
		st.addBatch(student.addStudent()); //addStudent method
		st.addBatch(student.updateStudent()); //updateStudent method
		st.addBatch(student.deleteStudent()); //deleteStudent method
		
		st.executeBatch();
		
		ResultSet rs=st.executeQuery(student.getAllStudent());
		
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int mark=rs.getInt(3);
			System.out.println(id + "\t\t" + name + "\t\t" + mark);
			
		}
		

	}

}
