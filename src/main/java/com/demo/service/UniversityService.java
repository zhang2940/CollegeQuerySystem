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
     *
     * @param universityName
     * @param universityArea
     * @param universityType
     * @return
     * @throws Exception
     */
    public List<University> queryByPro( String universityName, String universityArea, String universityType) throws Exception;

    /**
     *
     * @param professionName
     * @param universityArea
     * @param
     * @return
     * @throws Exception
     */
    public List<University> queryByColleges(String professionName,String universityArea,String admitTp) throws Exception;

    /**
     *
     * @param universityName
     * @param professionName
     * @param admitArea
     * @return
     * @throws Exception
     */
    public List<University> queryByScore(String universityName, String professionName, String admitArea) throws Exception;
}
