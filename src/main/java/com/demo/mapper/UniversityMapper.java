package com.demo.mapper;

import com.demo.pojo.University;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
     * 根据院校名称、地区查询,院校类别
     *
     * @param
     * @param universityArea
     * @return
     * @throws Exception
     */

    @Select("select * from university " +
            "where university_Name=#{universityName} and university_area=#{universityArea} and university_type=#{universityType} order by admit_time desc")
    public List<University> queryByPro(@Param("universityName") String universityName,@Param("universityArea") String universityArea,@Param("universityType") String universityType) throws Exception;

    /**
     *
     * @param professionName
     * @param universityArea
     * @param admitTp
     * @return
     * @throws Exception
     */
    @Select("select university_name,university_type,admit_grade,admit_area,admit_time from university " +
            "where profession_name=#{professionName} and university_area=#{universityArea} and admit_tp=#{admitTp} order by admit_time desc")
    public List<University> queryByColleges(@Param("professionName")String professionName,@Param("universityArea") String universityArea,@Param("admitTp") String admitTp) throws Exception;

    /**
     *
     * @param universityName
     * @param professionName
     * @param admitArea
     * @return
     * @throws Exception
     */
    @Select("select university_type,university_area,admit_tp,admit_time from university " +
            "where university_name=#{universityName} and profession_name=#{professionName} and admit_area=#{admitArea} order by admit_time desc")
    public List<University> queryByScore(@Param("universityName") String universityName,@Param("professionName") String professionName,@Param("admitArea") String admitArea) throws Exception;


}
