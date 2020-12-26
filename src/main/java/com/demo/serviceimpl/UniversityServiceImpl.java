package com.demo.serviceimpl;

import com.demo.mapper.UniversityMapper;
import com.demo.pojo.University;
import com.demo.service.UniversityService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
     * @param universityName
     * @param universityArea
     * @param universityType
     * @return
     * @throws Exception
     */
    @Override
    public List<University> queryByPro( String universityName, String universityArea, String universityType) throws Exception {

        return universityMapper.queryByPro(universityName,universityArea,universityType);
    }

    /**
     *
     * @param professionName
     * @param universityArea
     * @param
     * @return
     * @throws Exception
     */
    @Override
    public List<University> queryByColleges(String professionName,String universityArea,String admitTp) throws Exception {
        return universityMapper.queryByColleges(professionName,universityArea,admitTp);
    }

    /**
     *
     * @param universityName
     * @param professionName
     * @param admitArea
     * @return
     * @throws Exception
     */
    @Override
    public List<University> queryByScore(String universityName, String professionName, String admitArea) throws Exception {
        return universityMapper.queryByScore(universityName,professionName,admitArea);
    }
}
