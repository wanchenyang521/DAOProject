package com.wcy.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.wcy.vo.Emp;

/**
*
* @Title: IEmpService.java
* @Package com.wcy.service
* @author 晨阳 
* @date 2020年3月21日 下午3:03:43
* @Description:  定义emp表的业务层的执行标准
* 此类一定要负责数据库的打开与关闭操作
* 此类可通过DAOFactory类取得IEmpDAO接口对象
* @version V1.0
 */
public interface IEmpService {
	/**
	 * 实现雇员数据的怎增加操作，本次操作要调用IEmpDAO接口的如下方法
	 * 需要调用IEmpDAO,findById()方法，判断要增加的数据的id是否存在
	 * 如果现在要增加的数据编号不存在则调用IEmpDAO.doCreate()方法，返回操作的结果
	 * @param vo 包含了要增加数据VO对象
	 * @return 如果增加数据的ID重复或者保存失败返回false,否则返回true
	 * @throws Exception SQL执行异常
	 */
	public boolean insert(Emp vo) throws Exception;
	
	/**
	 * 实现雇员数据的修改操作，调用IEmpDAO.doUpdate()方法。本次修改属于全部内容修改
	 * @param vo 包含了要修改数据的VO对象
	 * @return 修改成功返回true,否则返回false
	 * @throws Exception SQL执行异常
	 */
	public boolean update(Emp vo) throws Exception;
	
	/**
	 * 执行雇员数据的删除操作，可以删除多个雇员信息，调用IEmpDAO.daoRemoveBatch()
	 * @param ids 包含了全部要删除数据的集合，没有重复数据
	 * @return 删除成功返回true,否则返回false
	 * @throws Exception SQL执行异常
	 */
	public boolean delete(Set<Integer> ids) throws Exception;
	
	/**
	 * 根据雇员编号查找雇员的完整信息，调用IEmpDAO.findById()方法
	 * @param ids 要查找的雇员编号
	 * @return 如果找到了则雇员信息以VO对象返回，否则返回null
	 * @throws Exception SQL执行异常
	 */
	public Emp get(int ids) throws Exception;
	
	/**
	 * 查询全部雇员信息，调用IEmpDAO.findAll()方法
	 * @return 查询结果以List集合的形式返回，如果没有数据则集合的长度为0
	 * @throws Exception SQL执行异常
	 */
	public List<Emp> list() throws Exception;
	
	/**
	 * 实现数据的模糊查询与数据统计，调用IEmpDAO的两个方法
	 * 调用IEmpDAO.findAllSplit()方法,查询出所有的表数据，返回的List<Emp>
	 * 调用IEmpDAO.getAllCount()方法，查询所有的数据量，返回的Integer
	 * @param currentPage 当前所在页
	 * @param lineSize 每页显示的记录数
	 * @param column 模糊查询的数据列
	 * @param keyWord 模糊查询关键字
	 * @return 本方法由于需要返回多种数据类型，所以Map集合返回，由于包含的类型不统一，所以所有value的类型设置为Object，返回内容如下：
	 * key = allEmps ,value = IEmpDAO.findAllSplit()返回结果，List<Emp>
	 * key = empCount.value = IEmpDAO.getAllCount()返回结果，Integer
	 * @throws Exception SQL执行异常
	 */
	public Map<String, Object> list(int currentPage, int lineSize, String column, String keyWord) throws Exception;
	
	public Map<String, Object> listDetails(int currentPage, int lineSize, String column, String keyWord) throws Exception;
	
}
