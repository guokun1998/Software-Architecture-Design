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

    @Select("select * from t_d0_stuff where sectionId is null")
    List<Stuff> getNotAssignStuffListByOrgId();

    @Select("select divName from t_d0_stuff where orgId=#{orgId}")
    List<Stuff> getStuffDivNameByOrgId(Integer orgId);

    @Select("select * from t_d0_stuff where id=#{id}")
    Stuff getStuffById(Integer id);

    @Update("update t_d0_stuff set repManName=#{repManName} where id=#{id}")
    int updateStuffRepManNameById(Integer id, String repManName);

    @Update("update t_d0_stuff set sectionId=#{sectionId},divCode=#{divCode},orgId=#{orgId},orgNo=#{orgNo} where id=#{id}")
    int updateStuffRelation(Integer sectionId, String divCode, Integer orgId, String orgNo, Integer id);

    @Update("update t_d0_stuff set " +
            "sectionId=#{sectionId},divCode=#{divCode},orgId=#{orgId},orgNo=#{orgNo},repManName=#{repManName},gender=#{gender},birthDate=#{birthDate},folk=#{folk},pol=#{pol},mobile=#{mobile},workTel=#{workTel},email=#{email},edu=#{edu},graCollege=#{graCollege},choiceSpe=#{choiceSpe},spe=#{spe},beforeSpe=#{beforeSpe},beginWorkDate=#{beginWorkDate},manageJob=#{manageJob},jobLevel=#{jobLevel},title=#{title},getInDate=#{getInDate},perPro=#{perPro},perType=#{perType},enfCardNo=#{enfCardNo},getCardDate=#{getCardDate},healthPerNo=#{healthPerNo},getQuaDate=#{getQuaDate},healthCardNo=#{healthCardNo},cardDay=#{cardDay},ifStaffPer=#{ifStaffPer},perCode=#{perCode} where id=#{id}")
    int updateStuff(Stuff stuff);

    @Insert("insert into " +
            "t_d0_stuff " +
            "(sectionId, divCode, orgId, orgNo, repManName, gender, birthDate, folk, pol, mobile, workTel, email, edu, graCollege, choiceSpe, spe, beforeSpe, beginWorkDate, manageJob, jobLevel, title, getInDate, perPro, perType, enfCardNo, getCardDate, healthPerNo, getQuaDate, healthCardNo, cardDay, ifStaffPer, perCode) " +
            "values" +
            "(#{sectionId},#{divCode},#{orgId},#{orgNo},#{repManName},#{gender},#{birthDate},#{folk},#{pol},#{mobile},#{workTel},#{email},#{edu},#{graCollege},#{choiceSpe},#{spe},#{beforeSpe},#{beginWorkDate},#{manageJob},#{jobLevel},#{title},#{getInDate},#{perPro},#{perType},#{enfCardNo},#{getCardDate},#{healthPerNo},#{getQuaDate},#{healthCardNo},#{cardDay},#{ifStaffPer},#{perCode})")
    int insertOneStuff(Stuff stuff);

}
