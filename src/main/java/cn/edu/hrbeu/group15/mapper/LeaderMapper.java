package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Leader;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-11:08
 */
@Mapper
public interface LeaderMapper {

    @Select("<script> " +
            "SELECT  orgName, formFillingMan, linkTel, leaderName, gender, folk, birthDate, pol, degree, manageJob, title, yearLy " +
            "from t_d0_leader " +
            "where " +
            "1=1 " +
            "<if test='orgName!=null'> and orgName = #{orgName}</if>" +
            "<if test='yearLy!=null'>  and yearLy=#{yearLy} </if> " +
            "</script>")
    List<Leader> findLeaderByYear(String orgName,String yearLy);


    @Select("<script> " +
            "SELECT  orgName, leaderName, gender, folk, birthDate, pol, degree,manageJob, degree, title,memo, yearLy " +
            "from t_d0_leader " +
            "where " +
            "1=1 " +
            "<if test='orgName!=null'> and orgName = #{orgName}</if>" +
            "<if test='yearLy!=null'>  and yearLy=#{yearLy} </if> " +
            "</script>")
    List<Leader> findTatistics(String orgName,String yearLy);
}
