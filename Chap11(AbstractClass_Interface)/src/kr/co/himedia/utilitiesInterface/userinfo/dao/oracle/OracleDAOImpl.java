package kr.co.himedia.utilitiesInterface.userinfo.dao.oracle;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;

//UserInfoDAO 인터페이스를 구현한 Oracle 버전 DAO
public class OracleDAOImpl implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into Oracle BD userId : "+userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into Oracle BD userId : "+userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into Oracle BD userId : "+userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into Oracle BD userId : "+userInfoDTO.getUserId());
		
	}
	
}
