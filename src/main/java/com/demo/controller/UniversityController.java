package com.demo.controller;

import com.demo.pojo.University;
import com.demo.service.UniversityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.rmi.MarshalledObject;
import java.util.List;

/**
 * 控制处理器
 *
 * @Author cc
 * @Date 2020/12/25 16:24
 * @Version 1.0
 */
@Controller
public class UniversityController {

    //注入业务实现接口bean对象
    @Resource
    private UniversityService universityService;

    /**
     * 根据院校名称、地区查询
     * @param model
     * @param universityName
     * @param universityArea
     * @param universityType
     * @param pageNum
     * @return
     * @throws Exception
     */

  @RequestMapping("/profession")
    public String queryByPro(Model model, String universityName,String universityArea,String universityType,Integer pageNum) throws Exception {
      //判断是否获得页码
      pageNum = pageNum == null ? 1 : pageNum;
      //启用分页
      PageHelper.startPage(pageNum, 10);
      //查询角色数据
      List<University> list = universityService.queryByPro(universityName, universityArea, universityType);
      //获得分页相关信息
      PageInfo<University> pageInfo = new PageInfo(list, 10);
      //封装模型数据
      model.addAttribute("list", list);
      model.addAttribute("pageInfo", pageInfo);
      return "pages/role/rolelist";
  }


    /**
     * 根据地区、院校类型查询
     *
     * @param universityArea
     * @param universityType
     * @return
     * @throws Exception
     */
    @RequestMapping("/colleges")
    public String queryByColleges(Model model, String universityArea, String universityType) throws Exception {
        return null;
    }

    /**
     * 根据专业类别、地区、年份查询
     *
     * @param classifier
     * @param universityArea
     * @param time
     * @return
     * @throws Exception
     */
    @RequestMapping("/score")
    public String queryByScore(Model model, String classifier, String universityArea, String time) throws Exception {
        return null;
    }

}
