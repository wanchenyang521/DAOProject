package com.wcy.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.wcy.factory.ServiceFactory;
import com.wcy.vo.Emp;

public class TestSplit {
	public static void main(String[] args) {
		try {
			//currentPage 当前所在页 lineSize 每页显示的记录数  column 模糊查询的数据列  keyWord 模糊查询关键字
			Map<String, Object> map  =ServiceFactory.getIEmpServiceInstance().list(4, 5, "ename", "");
			int count = (Integer)map.get("empCount");
			System.out.println("数据量：" + count);
			List<Emp> all = (List<Emp>) map.get("allEmps");
			Iterator<Emp> iter = all.iterator();
			while (iter.hasNext()) {
				Emp vo = iter.next();
				System.out.println(vo.getEname() + "," + vo.getJob());
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
