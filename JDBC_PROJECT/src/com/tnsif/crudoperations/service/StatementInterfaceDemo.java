package com.tnsif.crudoperations.service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tnsif.crudoperations.dao.DBUtil;

public class StatementInterfaceDemo {
	static Connection cn;
	static Statement st;
	static {
		cn = DBUtil.getConnetion();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void showEmp() {
		try {

			String query = "SELECT * FROM emp";
			ResultSet rs = st.executeQuery(query);
			
			if (rs.next()) {
				while (rs.next()) {

					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
				}
			} else
				System.out.println("No Employee Records.....");
			rs.close();

		} catch (SQLException e) {
			System.out.println("Error...." + e.getMessage());
		}
	}

	
}
