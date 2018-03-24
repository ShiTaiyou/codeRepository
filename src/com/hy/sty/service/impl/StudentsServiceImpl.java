package com.hy.sty.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.sty.entity.Students;
import com.hy.sty.mapper.StudentsMapper;
import com.hy.sty.service.StudentsService;
@Service
public class StudentsServiceImpl implements StudentsService {

	@Resource
	private StudentsMapper mapper;
	@Override
	public int save(Students student) {
		// TODO Auto-generated method stub
		return mapper.insert(student);
	}

	@Override
	public int del(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int update(Students student) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(student);
	}

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Override
	public List<Students> findByCondition(Students student) {
		// TODO Auto-generated method stub
		return mapper.findByCondition(student);
	}

	@Override
	public PageInfo<Students> findPageInfo(int pageNum, int pageSize,
			Students students) {
		// TODO Auto-generated method stub
		//开始分页
		PageHelper.startPage(pageNum, pageSize);
		//调用底层数据方法
		List<Students> list=mapper.findByCondition(students);
		//实现分页
		PageInfo<Students> info=new PageInfo<Students>(list);
		return info;
	}

	@Override
	public Students findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

}
