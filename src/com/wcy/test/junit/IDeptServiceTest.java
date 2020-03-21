package com.wcy.test.junit;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import com.wcy.factory.ServiceFactory;
import com.wcy.vo.Dept;


import junit.framework.TestCase;

public class IDeptServiceTest {

	@Test
	public void testInsert() {
		Dept vo = new Dept();
		vo.setDeptno(11);
		vo.setDname("插入");
		vo.setLoc("Beijing");
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().insert(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		Dept vo = new Dept();
		vo.setDeptno(11);
		vo.setDname("更新");
		vo.setLoc("Beijing");
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().update(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(11);
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().delete(ids));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testGet() {
		try {
			TestCase.assertNotNull(ServiceFactory.getIDeptServiceInstance().get(10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testList() {
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().list().size()>0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
