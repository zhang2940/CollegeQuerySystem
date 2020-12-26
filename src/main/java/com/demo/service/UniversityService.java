package com.demo.service;

import com.demo.pojo.University;
import org.springframework.ui.Model;

import java.util.List;

/**
 * 业务实现类接口
 * @Author cc
 * @Date 2020/12/25 16:24
 * @Version 1.0
 */

public interface UniversityService {
    /**
     * 根据院校名称、地区查询
     * @param universityName
     * @param universityArea
     * @param universityType
     * @return
     * @throws Exception
     */
    public List<University> queryByPro( String universityName, String universityArea, String universityType) throws Exception;

    /**
     * 根据地区、院校类型查询
     *
     * @param universityArea
     * @param universityType
     * @return
     * @throws Exception
     */
    public List<University> queryByColleges(String universityArea, String universityType) throws Exception;

    /**
     * 根据专业类别、地区、年份查询
     *
     * @param classifier
     * @param universityArea
     * @param time
     * @return
     * @throws Exception
     */
    public List<University> queryByScore(String classifier, String universityArea, String time) throws Exception;
}
