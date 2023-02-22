package com.spring.di.xmlInjection;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

/*
 * # xml Injection
 * 
 * - xml 파일에서 생성된 객체를 다른 클래스에 주입시킨다.
 * 
 */

@Controller
public class XmlInjectionEx {

	// servlet-context.xml파일의 객체를 주입
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	// root-contxt.xml파일의 객체를 주입
	//@Autowired
	//private SqlSession sqlSession;
	
}
