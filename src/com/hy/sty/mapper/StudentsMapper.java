package com.hy.sty.mapper;

import java.util.List;

import com.hy.sty.entity.Students;

public interface StudentsMapper {
	/**
	 * 根据id删除学生信息
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(Integer id);

    /**
     * 根据所有的字段添加学生信息
     * @param record
     * @return
     */
    int insert(Students record);

    /**
     * 添加部分字段学生信息
     * @param record
     * @return
     */
    int insertSelective(Students record);

    /**
     * 根据学生的id查询学生信息
     * @param id
     * @return
     */
    Students selectByPrimaryKey(Integer id);

    /**
     * 根据id修改部分字段的学生信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Students record);

    /**
     * 根据id修改全部字段的学生信息
     * @param record
     * @return
     */
    int updateByPrimaryKey(Students record);
    /**
     * 查询所有的学生信息
     * @return
     */
    List<Students> findAll();

    /**
     * 根据某个条件查询学生信息
     * @param student
     * @return
     */
    List<Students> findByCondition(Students student);
}