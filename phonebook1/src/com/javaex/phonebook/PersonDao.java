package com.javaex.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {
	
	// 0. import java.sql.*;
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "webdb";
	private String pw = "webdb";
	
	private void getConnect() {
		// 1. JDBC 드라이버 (Oracle) 로딩
		try {
			Class.forName(driver);
			
		    // 2. Connection 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
			
		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}

	}
	
	private void close() {
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
	
	
	//personSelect()
	public List<PersonVo> personSelect() {
		
		List<PersonVo> personList = new ArrayList<PersonVo>();

		getConnect();
		
		try {
		    // 3. SQL문 준비 / 바인딩 / 실행
		    String query = "";
		    query += " select  person_id, ";
		    query += "         name, ";
		    query += "         hp, ";
		    query += "         company ";
		    query += " from person ";
			
		    pstmt = conn.prepareStatement(query);
		    
		    //실행
		    rs = pstmt.executeQuery();
		    
		    // 4.결과처리
		    while(rs.next()) {
				int person_id = rs.getInt(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				String company = rs.getString(4);

				PersonVo personVo = new PersonVo();
				personVo.setPerson_id(person_id);
				personVo.setName(name);
				personVo.setHp(hp);
				personVo.setCompany(company);
				
				personList.add(personVo);
		    }
			   
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
		
		close();
		
		return personList;
	}
	
	
	//personInsert()
	public int personInsert(String name, String hp, String company) {
		getConnect();
		
		int count = -1;
		
		try {
			// 3. SQL문 준비 / 바인딩 / 실행
		    String query = "";
		    query += " insert into person ";
		    query += " values(seq_person_id.nextVal, ?, ?, ? ) ";
			
		    pstmt = conn.prepareStatement(query);
		    
		    //바인딩
		    pstmt.setString(1, name);
		    pstmt.setString(2, hp);
		    pstmt.setString(3, company);
		    
		    //실행
		    count = pstmt.executeUpdate();
		    
		    // 4.결과처리

	
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
		
		close();
		
		return count;
	
	}
	
	//personDelete()
	public int personDelete(int personId) {
		getConnect();
		
		int count = -1;
		
		try {
			// 3. SQL문 준비 / 바인딩 / 실행
		    String query = "";
		    query += " delete from person ";
		    query += " where person_id = ? ";
			
		    pstmt = conn.prepareStatement(query);
		    
		    //바인딩
		    pstmt.setInt(1, personId);
		    
		    //실행
		    count = pstmt.executeUpdate();
		    
		    // 4.결과처리

	
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
		
		close();
		
		return count;
	
	}
	
	//personUpdate()
	public int personUpdate(String name, String hp, String company, int personId) {
		getConnect();
		
		int count = -1;
		
		try {
			// 3. SQL문 준비 / 바인딩 / 실행
		    String query = "";
		    query += " update person ";
		    query += " set  name = ?, ";
		    query += " 		hp = ?, ";
		    query += " 		company = ? ";
		    query += " where person_id = ? "; 
			
		    pstmt = conn.prepareStatement(query);
		    
		    //바인딩
		    pstmt.setString(1, name);
		    pstmt.setString(2, hp);
		    pstmt.setString(3, company);
		    pstmt.setInt(4, personId);
		    
		    //실행
		    count = pstmt.executeUpdate();
		    
		    // 4.결과처리

	
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
		
		close();
		
		return count;
	
	}
	
	public List<PersonVo> personSearch(String word) {
		
		List<PersonVo> personList = new ArrayList<PersonVo>();
		
		getConnect();
		
		try {
			// 3. SQL문 준비 / 바인딩 / 실행
		    String query = "";
		    query += " select  person_id, ";
		    query += "         name, ";
		    query += "         hp, ";
		    query += "         company ";
		    query += " from person ";
		    query += " where name like '%' || ? || '%' ";
			
		    pstmt = conn.prepareStatement(query);
		    
		    //바인딩
			pstmt.setString(1, word);
		    
		    //실행
		    rs = pstmt.executeQuery();
		    
		    // 4.결과처리
		    while(rs.next()) {
				int person_id = rs.getInt(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				String company = rs.getString(4);

				PersonVo personVo = new PersonVo();
				personVo.setPerson_id(person_id);
				personVo.setName(name);
				personVo.setHp(hp);
				personVo.setCompany(company);
				
				personList.add(personVo);
		    }
	
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
		
		close();
		
		return personList;
	}
	
}





