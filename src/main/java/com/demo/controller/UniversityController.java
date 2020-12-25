package com.demo.controller;

import com.demo.pojo.University;
import com.demo.service.UniversityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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
     *
     * @param professionName
     * @param universityArea
     * @return
     * @throws Exception
     */
    @RequestMapping("/profession")
    public String queryByPro(Model model, String professionName, String universityArea) throws Exception {

        //访问业务实现接口，获取到需要的信息
        List<University> list = universityService.queryByPro(professionName, universityArea);

        //模型封装获取到的数据
        model.addAttribute("list", list);

        //返回到展示视图界面
        return "/university/list";
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
