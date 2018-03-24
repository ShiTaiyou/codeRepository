package com.hy.sty.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.hy.sty.entity.Students;
import com.hy.sty.service.StudentsService;

@Controller
public class StudentsController {

	@Autowired
	private StudentsService service;

	/**
	 * 查询所有的数据
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/all")
	public String all(Model model) {
		List<Students> list = service.findAll();
		model.addAttribute("list", list);
		return "show";
	}

	/**
	 * 分页查询，条件为空则查询所有的
	 * 
	 * @param model
	 * @param pageIndex
	 * @param student
	 * @return
	 */
	@RequestMapping("/findPage")
	public String findPage(Model model, String pageIndex, Students student) {
		// 获得当前页
		int pageNum = (pageIndex == null) ? 1 : (Integer.parseInt(pageIndex));
		// 设置每页个数
		int pageSize = 8;
		// 调用业务方法实现分页数据
		PageInfo<Students> list = service.findPageInfo(pageNum, pageSize,
				student);
		// 保存分页数据
		model.addAttribute("list", list);
		// 保存查询条件
		model.addAttribute("my", student);
		return "show";
	}

	/**
	 * 添加学生信息
	 * 
	 * @param student
	 * @return
	 */
	@RequestMapping("/add")
	public String add(Students student) {
		int count = service.save(student);
		if (count > 0) {
			return "redirect:findPage.action";
		} else {
			return "add";
		}
	}

	/**
	 * 根据id查询学生信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/find")
	public String find(Integer id, Model model) {
		// 调用方法查询学生信息
		Students student = service.findStudentById(id);
		// 保存学生信息
		model.addAttribute("student", student);
		return "update";
	}

	/**
	 * 修改学生信息
	 */
	@RequestMapping("/mod")
	public String mod(Students student) {
		int count = service.update(student);
		if (count > 0) {
			return "redirect:findPage.action";
		} else {
			return "update";
		}
	}

	/**
	 * 根据id删除学生信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/del")
	public String del(Integer id) {
		// 调用业务方法
		int count = service.del(id);
		if (count > 0) {
			return "redirect:findPage.action";
		} else {
			return "redirect:findPage.action";
		}
	}
}
