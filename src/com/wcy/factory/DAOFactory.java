package com.wcy.factory;

import java.sql.Connection;

import com.wcy.dao.IDeptDAO;
import com.wcy.dao.IEmpDAO;
import com.wcy.dao.impl.DeptDAOImpl;
import com.wcy.dao.impl.EmpDAOImpl;

public class DAOFactory {
	public static IEmpDAO getIEmpDAOInstance(Connection conn) {
		return new EmpDAOImpl(conn);
	}
	public static IDeptDAO getIDeptDAOInstance(Connection conn) {
		return new DeptDAOImpl(conn);
	}
}
