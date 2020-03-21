package com.wcy.service.impl;

import java.util.List;
import java.util.Set;

import com.wcy.dbc.DatabaseConnection;
import com.wcy.factory.DAOFactory;
import com.wcy.service.IDeptService;
import com.wcy.vo.Dept;

public class DeptServiceImpl implements IDeptService {
	// 在这个类的对象内部就提供一个数据连接类的实例化对象
	private DatabaseConnection dbc = new DatabaseConnection();

	@Override
	public boolean insert(Dept vo) throws Exception {
		try {
			if(DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).findById(vo.getDeptno()) == null) {
				return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).doCreate(vo);
			}
			return false;
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	
	}

	@Override
	public boolean update(Dept vo) throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).doUpdate(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	}

	@Override
	public boolean delete(Set<Integer> ids) throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).doRemoveBatch(ids);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	}

	@Override
	public Dept get(int ids) throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).findById(ids);	
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	}

	@Override
	public List<Dept> list() throws Exception {
		try {
			return DAOFactory.getIDeptDAOInstance(this.dbc.getConnection()).findAll();
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbc.close();
		}
	}

}
