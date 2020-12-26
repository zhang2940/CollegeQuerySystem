package com.demo.controller;

import com.demo.pojo.University;
import com.demo.service.UniversityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

  @RequestMapping("/college")
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
      return "university/list";
  }


    /**
     *
     * @param model
     * @param professionName
     * @param
     * @param universityArea
     * @param pageNum
     * @return
     * @throws Exception
     */
    @RequestMapping("/profession")
    public String queryByColleges(Model model,String professionName,String universityArea,String admitTp,Integer pageNum) throws Exception {
       //判断是否获取到页码
        pageNum=pageNum==null?1:pageNum;
        //获取到页码启动分页
        PageHelper.startPage(pageNum,10);
        //查询出角色数据用集合接收
        List<University> list1 =universityService.queryByColleges(professionName,universityArea,admitTp);
        //将查询到的数据封装到分页中
        PageInfo<University> pageInfo1= new PageInfo<>(list1,10);
        //封装模型数据
        model.addAttribute("colleges",list1);
        model.addAttribute("pageInfo1",pageInfo1);
        //返回到页面进行展示
        return "university/profression";
    }

    /**
     *
     * @param model
     * @param universityName
     * @param professionName
     * @param admitArea
     * @return
     * @throws Exception
     */
    @RequestMapping("/score")
    public String queryByScore(Model model, String universityName, String professionName, String admitArea,Integer pageNum) throws Exception {
        //判断是否获取到页码
        pageNum=pageNum==null?1:pageNum;
        //获取到页码启动分页
        PageHelper.startPage(pageNum,10);
        //查询出角色数据用集合接收
        List<University> list1 =universityService.queryByScore(universityName,professionName,admitArea);
        //将查询到的数据封装到分页中
        PageInfo<University> pageInfo1= new PageInfo<>(list1,10);
        //封装模型数据
        model.addAttribute("list1",list1);
        model.addAttribute("pageInfo1",pageInfo1);
        //返回到页面进行展示
        return "university/mark";
    }

}
