package com.hy.sty.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hy.sty.entity.Students;

/**
 * 业务接口
 * @author Administrator
 *
 */
public interface StudentsService {

	/**
	 * 添加
	 * @param student
	 * @return
	 */
	int save(Students student);
	/**
	 * 根据id删除学生信息
	 * @param id
	 * @return
	 */
	int del(Integer id);
	/**
	 * 根据id修改学生信息
	 * @param student
	 * @return
	 */
	int update(Students student);
	/**
	 * 查询所有学生信息
	 * @return
	 */
	List<Students> findAll();
	/**
	 * 根据某个条件查询所有学生信息 
	 * @param student
	 * @return
	 */
	List<Students> findByCondition(Students student); 
	/**
	 * 根据某写条件分页查询
	 * @param pageNum
	 * @param pageSize
	 * @param students
	 * @return
	 */
	PageInfo<Students> findPageInfo(int pageNum,int pageSize,Students students);
	
	/**
	 * 根据id查询学生信息
	 * @param id
	 * @return
	 */
	Students findStudentById(Integer id);
}
