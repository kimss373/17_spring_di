package com.spring.di.tobe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 해당 클래스가 service임을 spring bean에 등록한다.
public class ToBeServiceImpl implements ToBeService {

	@Autowired //@Inject
	private ToBeDAO toBeDAO;
	
}