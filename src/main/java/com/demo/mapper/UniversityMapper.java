package com.demo.mapper;

import com.demo.pojo.University;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author cc
 * @Date 2020/12/25 16:23
 * @Version 1.0
 */
@Mapper
public interface UniversityMapper {

    /**
     * 根据院校名称、地区查询
     *
     * @param professionName
     * @param universityArea
     * @return
     * @throws Exception
     */
    @Select("select university_name university_area university_type profession_name from university")
    public List<University> queryByPro(String professionName, String universityArea) throws Exception;

    /**
     * 根据地区、院校类型查询
     *
     * @param universityArea
     * @param universityType
     * @return
     * @throws Exception
     */
    @Select("select university_name university_type profession_name from university")
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
    @Select("select university_name profession_name admit_grade university_area time from university")
    public List<University> queryByScore(String classifier, String universityArea, String time) throws Exception;


}
