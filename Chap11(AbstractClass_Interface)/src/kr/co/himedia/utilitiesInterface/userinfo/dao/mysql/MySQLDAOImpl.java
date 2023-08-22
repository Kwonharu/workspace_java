package kr.co.himedia.utilitiesInterface.userinfo.dao.mysql;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;

public class MySQLDAOImpl implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySQL BD userId : "+userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySQL BD userId : "+userInfoDTO.getUserName());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySQL BD userId : "+userInfoDTO.getPasswd());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySQL BD userId : "+userInfoDTO.getUserName());
		
	}
	
}
