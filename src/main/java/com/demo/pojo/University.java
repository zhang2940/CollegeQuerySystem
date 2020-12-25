package com.demo.pojo;

import java.io.Serializable;

/**
 * 学校持久化信息类
 * @Author cc
 * @Date 2020/12/24 10:55
 * @Version 1.0
 */
public class University implements Serializable {

    private Integer universityId;
    private String universityName;//大学名称
    private String universityType;//学校类型，如：重本，本科，专科
    private String universityArea;//大学所在地
    private String admitGrade;//录取分数线
    private String admitArea;//考生所在地，异地
    private String professionName;//专业名
    private String classifier;//文理科
    private String time;//年份，往年的录取分数线

}
