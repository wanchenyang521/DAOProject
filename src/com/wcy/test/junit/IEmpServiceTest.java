package com.wcy.test.junit;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

import com.wcy.factory.DAOFactory;
import com.wcy.factory.ServiceFactory;
import com.wcy.vo.Emp;

import junit.framework.TestCase;

public class IEmpServiceTest {
	private static int empno;
	static {
		empno = new Random().nextInt(10000);
	}
	
	@Test
	public void testInsert() {
		Emp vo = new Emp();
		vo.setEmpno(empno);
		vo.setEname(empno+"");
		vo.setJob(empno+"");
		vo.setHireDate(new Date());
		vo.setSal(10.0);
		vo.setComm(10.5);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().insert(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testUpdate() {
		Emp vo = new Emp();
		vo.setEmpno(888);
		vo.setEname("晨阳");
		vo.setJob("摄影");
		vo.setHireDate(new Date());
		vo.setSal(10.0);
		vo.setComm(10.5);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().update(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(888);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().delete(ids));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testGet() {
		try {
			TestCase.assertNotNull(ServiceFactory.getIEmpServiceInstance().get(7369));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testList() {
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().list().size()>0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testListIntIntStringString() {
		try {
			Map<String, Object> map  =ServiceFactory.getIEmpServiceInstance().list(4, 5, "ename", "");
			int count = (Integer)map.get("empCount");
			System.out.println("数据量：" + count);
			List<Emp> all = (List<Emp>) map.get("allEmps");
			TestCase.assertTrue(count > 0 && all.size() > 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
