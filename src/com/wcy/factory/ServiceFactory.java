package com.wcy.factory;

import com.wcy.service.IDeptService;
import com.wcy.service.IEmpService;
import com.wcy.service.impl.DeptServiceImpl;
import com.wcy.service.impl.EmpServiveImpl;

public class ServiceFactory {
	public static IEmpService getIEmpServiceInstance() {
		return new EmpServiveImpl();
	}
	public static IDeptService getIDeptServiceInstance() {
		return new DeptServiceImpl();
	}

}
