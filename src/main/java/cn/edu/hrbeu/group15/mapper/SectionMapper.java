package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Section;
import cn.edu.hrbeu.group15.po.Stuff;
import cn.edu.hrbeu.group15.vo.SectionEasyView;
import cn.edu.hrbeu.group15.vo.SectionSelectCondition;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-06-17:47
 */
@Mapper
public interface SectionMapper {
    @Select("select * from t_d0_section where orgId=#{orgId}")
    List<Section> getSectionListByOrgId(Integer orgId);

    @Select("select * from t_d0_section where orgId=#{orgId} and divName=#{divName}")
    List<Section> getSectionListByOrgIdAndDivName(Integer orgId, String  divName);



    @Select("<script> " +
            "select  s.id id,s.orgNo orgNo,o.orgName orgName,s.divCode divCode,s.divName divName,s.dutyTel dutyTel,s.fax fax,s.divRoomNo divRoomNo " +
            "from t_d0_section s left join t_d0_organization o " +
            "on s.orgId=o.id " +
            "where " +
            "1=1 " +
            "<if test='orgId!=null'> and s.orgId = #{orgId}</if>" +
            "<if test='divName!=null'>  and s.divName=#{divName} </if> " +
            "</script>")
    List<SectionEasyView> getSectionConditional(SectionSelectCondition sectionSelectCondition);

    @Select("select divName from t_d0_section where orgId=#{orgId}")
    List<String> getSectionDivNameByOrgId(Integer orgId);

    @Select("select * from t_d0_section where id=#{id}")
    Section getSectionById(Integer id);

    @Select("select id, divCode from t_d0_section where orgId=#{orgId} and divName=#{divName}")
    Section getIdAndDivCodeByOrgIdAndDivName(Integer orgId, String divName);

    @Update("update t_d0_section set divName=#{divName} where id=#{id}")
    int updateSectionName(Section section);

    @Update("update t_d0_section " +
            "set " +
            "divCode=#{divCode},divName=#{divName},divCode=#{divCode},ifSub=#{ifSub},dutyTel=#{dutyTel},fax=#{fax},divRoomNo=#{divRoomNo} " +
            "where id=#{id}")
    int updateSection(Section section);

    @Delete("delete from t_d0_section where id=#{id}")
    int deleteSectionById(Integer id);

    @Insert("insert into t_d0_section " +
            "(orgId,orgNo,divCode,divNameCode,divName,ifSub,dutyTel,fax,divRoomNo,exeType) " +
            "values" +
            "(#{orgId},#{orgNo},#{divCode},#{divNameCode},#{divName},#{ifSub},#{dutyTel},#{fax},#{divRoomNo},#{exeType})")
    int insertOneSection(Section section);
}
