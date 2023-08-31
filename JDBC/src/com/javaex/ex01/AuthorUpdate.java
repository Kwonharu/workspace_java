package com.javaex.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorUpdate {
	public static void main(String[] args) {
		
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		    // 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

		    // 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

		    // 3. SQL문 준비 / 바인딩 / 실행
			String authorNameUpdate = "Dennaton Games";
			String authorDescUpdate = "뜨거운선 우리엄마";
			String authorName = "Ubisoft";
			String authorDesc = "유니티로 먹고삼";
			
		    String query = "";
		    query += " update author ";
			query += " set author_name = ?, ";
			query += "     author_desc = ? ";
			query += " where author_name = ? ";
			query += " and author_desc = ? ";
			System.out.println(query);
			
			pstmt = conn.prepareStatement(query);
			
			//바인딩
			pstmt.setString(1, authorNameUpdate);
			pstmt.setString(2, authorDescUpdate);
			pstmt.setString(3, authorName);
			pstmt.setString(4, authorDesc);
			
			//실행
			int count = pstmt.executeUpdate();
			
		    // 4.결과처리
			System.out.println(count + "건 삭제되었습니다.");

		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		} finally {
		   
		    // 5. 자원정리
		    try {
		        if (rs != null) {
		            rs.close();
		        }                
		        if (pstmt != null) {
		            pstmt.close();
		        }
		        if (conn != null) {
		            conn.close();
		        }
		    } catch (SQLException e) {
		        System.out.println("error:" + e);
		    }

		}

		
	}
}
