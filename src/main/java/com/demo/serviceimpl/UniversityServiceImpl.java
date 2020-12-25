package com.demo.serviceimpl;

import com.demo.mapper.UniversityMapper;
import com.demo.pojo.University;
import com.demo.service.UniversityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务接口实现类
 * @Author cc
 * @Date 2020/12/25 16:25
 * @Version 1.0
 */
@Service
public class UniversityServiceImpl implements UniversityService {

    //注入数据访问bean对象
    @Resource
    private UniversityMapper universityMapper;

    /**
     * 根据院校名称、地区查询
     *
     * @param professionName
     * @param universityArea
     * @return
     * @throws Exception
     */
    @Override
    public List<University> queryByPro(String professionName, String universityArea) throws Exception {
        return universityMapper.queryByPro(professionName, universityArea);
    }

    /**
     * 根据地区、院校类型查询
     *
     * @param universityArea
     * @param universityType
     * @return
     * @throws Exception
     */
    @Override
    public List<University> queryByColleges(String universityArea, String universityType) throws Exception {
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
    @Override
    public List<University> queryByScore(String classifier, String universityArea, String time) throws Exception {
        return null;
    }
}
