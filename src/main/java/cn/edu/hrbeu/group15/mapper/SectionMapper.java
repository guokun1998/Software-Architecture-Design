package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Section;
import cn.edu.hrbeu.group15.po.Stuff;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    @Select("select divName from t_d0_section where orgId=#{orgId}")
    List<String> getSectionDivNameByOrgId(Integer orgId);

    @Select("select * from t_d0_section where id=#{id}")
    Section getSectionById(Integer id);

    @Select("select id, divCode from t_d0_section where orgId=#{orgId} and divName=#{divName}")
    Section getIdAndDivCodeByOrgIdAndDivName(Integer orgId, String divName);

    @Update("update t_d0_section set divName=#{divName} where id=#{id}")
    int updateSectionName(Section section);

    @Delete("delete from t_d0_section where id=#{id}")
    int deleteSectionById(Integer id);
}
