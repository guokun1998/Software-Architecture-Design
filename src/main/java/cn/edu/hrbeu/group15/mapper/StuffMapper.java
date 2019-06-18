package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Stuff;
import cn.edu.hrbeu.group15.vo.StuffComposition;
import org.apache.ibatis.annotations.*;
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


    @Delete("delete from t_d0_stuff where id=#{id}")
    int deleteOneStuff(Integer id);


    @Select("<script>" +
            "SELECT orgName," +
            "COUNT(CASE WHEN gender='1' THEN 1 END) manNumber, " +
            "COUNT(CASE WHEN gender='2' THEN 1 END) womenNumber, " +
            "COUNT(CASE WHEN edu='1' THEN 1 END) doctorNumber ," +
            "COUNT(CASE WHEN edu='2' THEN 1 END) masterNumber ," +
            "COUNT(CASE WHEN edu='3' THEN 1 END) undergraduateNumber ," +
            "COUNT(CASE WHEN edu='4' THEN 1 END) juniorNumber ," +
            "COUNT(CASE WHEN edu='5' THEN 1 END) secondaryNumber ," +
            "COUNT(CASE WHEN edu='6' THEN 1 WHEN edu='7' THEN 1 WHEN edu='8' THEN 1 WHEN edu='9' THEN 1 END) lowerMiddleNumber ," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=0 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=25 THEN 1 END) numberLower25," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=26 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=30 THEN 1 END) number26To30," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=31 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=35 THEN 1 END) number31To35," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=36 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=40 THEN 1 END) number36To40," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=41 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=45 THEN 1 END) number41To45," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=46 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=50 THEN 1 END) number46To50," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=51 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=55 THEN 1 END) number51To55," +
            "COUNT(CASE WHEN ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&gt;=56 AND ROUND(DATEDIFF(CURDATE(),birthdate)/365.2422)&lt;=999 THEN 1 END) numberMore56, " +
            "COUNT(CASE WHEN jobLevel='1' THEN 1 END) jobLevel1 ," +
            "COUNT(CASE WHEN jobLevel='2' THEN 1 END) jobLevel2 ," +
            "COUNT(CASE WHEN jobLevel='3' THEN 1 END) jobLevel3 ," +
            "COUNT(CASE WHEN jobLevel='4' THEN 1 END) jobLevel4 ," +
            "COUNT(CASE WHEN jobLevel='5' THEN 1 END) jobLevel5 ," +
            "COUNT(CASE WHEN jobLevel='6' THEN 1 END) jobLevel6 ," +
            "COUNT(CASE WHEN jobLevel='7' THEN 1 END) jobLevel7 ," +
            "COUNT(CASE WHEN jobLevel='8' THEN 1 END) jobLevel8 ," +
            "COUNT(CASE WHEN jobLevel='9' THEN 1 END) jobLevel9 ," +
            "COUNT(CASE WHEN title='14' THEN 1 END) title1 ," +
            "COUNT(CASE WHEN title='11' THEN 1 WHEN title='12' THEN 1 WHEN title='13' THEN 1 END) title2 ," +
            "COUNT(CASE WHEN title='6' THEN 1 WHEN title='7' THEN 1 WHEN title='8' THEN 1 WHEN title='9' THEN 1 WHEN title='10' THEN 1 END) title3 ," +
            "COUNT(CASE WHEN title='1' THEN 1 WHEN title='2' THEN 1 WHEN title='3' THEN 1 WHEN title='4' THEN 1 WHEN title='5' THEN 1 END) title4 ," +
            "COUNT(CASE WHEN title='15' THEN 1 END) title5 " +
            "FROM ( " +
            "SELECT s.*,o.orgName " +
            "FROM t_d0_stuff s LEFT JOIN t_d0_organization o " +
            "ON s.orgId=o.id " +
            ") stuffPlus " +
            "where 1=1 " +
            "<if test='orgName!=null'> and orgName = #{orgName}</if>" +
            "GROUP BY orgId" +
            "</script>")
    List<StuffComposition> getStuffComposition(StuffComposition stuffComposition);
}
