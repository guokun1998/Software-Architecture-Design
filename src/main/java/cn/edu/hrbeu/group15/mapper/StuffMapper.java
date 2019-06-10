package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Stuff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-10-10:12
 */
@Mapper
public interface StuffMapper {


    @Select("select * from t_d0_stuff where orgId=#{orgId}")
    List<Stuff> getStuffListByOrgId(Integer orgId);

    @Select("select * from t_d0_stuff where id=#{id}")
    Stuff getStuffById(Integer id);

    @Update("update t_d0_stuff set repManName=#{repManName} where id=#{id}")
    int updateStuffRepManNameById(Integer id, String repManName);

    @Insert("insert into " +
            "t_d0_stuff " +
            "(sectionId, divCode, orgId, orgNo, repManName, gender, birthDate, folk, pol, mobile, workTel, email, edu, graCollege, choiceSpe, spe, beforeSpe, beginWorkDate, manageJob, jobLevel, title, getInDate, perPro, perType, enfCardNo, getCardDate, healthPerNo, getQuaDate, healthCardNo, cardDay, ifStaffPer, perCode) " +
            "values" +
            "(#{sectionId},#{divCode},#{orgId},#{orgNo},#{repManName},#{gender},#{birthDate},#{folk},#{pol},#{mobile},#{workTel},#{email},#{edu},#{graCollege},#{choiceSpe},#{spe},#{beforeSpe},#{beginWorkDate},#{manageJob},#{jobLevel},#{title},#{getInDate},#{perPro},#{perType},#{enfCardNo},#{getCardDate},#{healthPerNo},#{getQuaDate},#{healthCardNo},#{cardDay},#{ifStaffPer},#{perCode})")
    int insertOneStuff(Stuff stuff);

}
