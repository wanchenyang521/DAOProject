package com.wcy.test;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.wcy.factory.ServiceFactory;
import com.wcy.vo.Emp;

import junit.framework.TestCase;

public class TestEmpInsert {
	public static void main(String[] args) {
//		Emp vo = new Emp();
//		vo.setEmpno(888);
//		vo.setEname("晨阳");
//		vo.setJob("摄影师");
//		vo.setHireDate(new Date());
//		vo.setSal(10.0);
//		vo.setComm(10.5);
//		try {
//			System.out.println(ServiceFactory.getIEmpServiceInstance().insert(vo));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(888);
		try {
			System.out.println(ServiceFactory.getIEmpServiceInstance().delete(ids));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
