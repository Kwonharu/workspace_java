package com.javaex.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookSelect {
	//필드	//생성자	//메소드 gs	//메소드 일반
	public static void main(String[] args) {
		
		List<BookVo> bookList = new ArrayList<BookVo>();
		
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
		    String query = "";
		    query += " select  b.book_id, ";
		    query += "         b.title, ";
		    query += "         b.pubs, ";
		    query += "         b.pub_date, ";
		    query += "         b.author_id, ";
		    query += "         a.author_name ";
		    query += " from book b, (select  author_id, ";
		    query += "                       author_name ";
		    query += "               from author) a ";
		    query += " where b.author_id = a.author_id ";
		    								// 세미 콜론 찍지마ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
			System.out.println(query);
		    
			pstmt = conn.prepareStatement(query);
			
			//바인딩 --> ?(물음표) X
			
			//실행
			rs = pstmt.executeQuery();
			
		    // 4.결과처리
			while(rs.next()) {
				int bookId = rs.getInt(1);
				String title = rs.getString(2);
				String pubs = rs.getString(3);
				String pubDate = rs.getString(4);
				int authorId = rs.getInt(5);
				String authorName = rs.getString(6);

				BookVo bookVo = new BookVo();
				bookVo.setBookId(bookId);
				bookVo.setTitle(title);
				bookVo.setPubs(pubs);
				bookVo.setPubDate(pubDate);
				bookVo.setAuthorId(authorId);
				bookVo.setAuthorName(authorName);
				
				bookList.add(bookVo);
			}

			
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

		for(int i = 0; i<bookList.size(); i++) {
			System.out.println("book_id: "+bookList.get(i).getBookId()
							  +", title: "+bookList.get(i).getTitle()
							  +", pubs: "+bookList.get(i).getPubs()
							  +", pub_date: "+bookList.get(i).getPubDate()
							  +", author_id: "+bookList.get(i).getAuthorId()
							  +", author_name: "+bookList.get(i).getAuthorName());
		}
		
		
	}
}
