package kr.co.himedia.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.mysql.MySQLDAOImpl;
import kr.co.himedia.utilitiesInterface.userinfo.dao.oracle.OracleDAOImpl;
import kr.co.himedia.utilitiesInterface.userinfo.dao.postgres.PostgreSQLDAOImpl;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String dbtype = prop.getProperty("DBTYPE");
		
		UserInfoDTO userDTO = new UserInfoDTO();
		userDTO.setUserId("talesshop");
		userDTO.setPasswd("0914");
		userDTO.setUserName("테시아");
		
		UserInfoDAO userDAO = null;
		if(dbtype.equals("PostgreSQL")) {
			userDAO = new PostgreSQLDAOImpl();
		}else if(dbtype.equals("Oracle")) {
			userDAO = new OracleDAOImpl();
		}else if(dbtype.equals("MySQL")) {
			userDAO = new MySQLDAOImpl();
		}else {
			System.out.println("db support errorrrrrrrrrrrrrrrrrrrrrrrrr");
			return;
		}
		
		userDAO.insertUserInfo(userDTO);
		userDAO.updateUserInfo(userDTO);
		userDAO.selectUserInfo(userDTO);
		userDAO.deleteUserInfo(userDTO);
		
	}
}
