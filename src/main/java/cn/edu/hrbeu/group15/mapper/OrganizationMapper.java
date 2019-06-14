package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.vo.OrgInformation;
import org.apache.ibatis.annotations.*;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-03-17:19
 */

@Mapper
public interface OrganizationMapper {

    @Select("select * from t_d0_organization")
    List<Organization>  getAll();

    @Select("select orgName from t_d0_organization where id=#{id}")
    String getOrgNameById(Integer id);

    @Select("select id from t_d0_organization where orgName=#{orgName}")
    Integer getIdByOrgName(String orgName);

    @Select("select orgNo,orgCode from t_d0_organization where orgName=#{orgName}")
    Organization getOrgNoAndOrgCodeByOrgName(String orgName);

    @Select("select orgName from t_d0_organization")
    List<String> getAllOrgName();

    @Select("select * from t_d0_organization where id=#{id}")
    Organization getById(Integer id);

    @Insert("insert into " +
            "t_d0_organization " +
            "(orgNo, orgCode, orgName, exeType, areaCode, linkAdd, listingDate, standAloneDate, areaType, zbbdocDate, orgLevel, orgPro, zipCode) " +
            "values" +
            "(#{orgNo},#{orgCode},#{orgName},#{exeType},#{areaCode},#{linkAdd},#{listingDate},#{standAloneDate},#{areaType},#{zbbdocDate},#{orgLevel},#{orgPro},#{zipCode})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insertOneOrganization(Organization organization);

    @Update("update t_d0_organization set orgNo=#{orgNo} where id=#{id}")
    int updateOrgNo(Organization organization);

    @Update("UPDATE  t_d0_organization SET " +
            "orgNo = #{orgNo}, orgCode = #{orgCode}, orgName = #{orgName}, exeType = #{exeType}, areaCode = #{areaCode}, linkAdd = #{linkAdd}, listingDate = #{listingDate}, standAloneDate = #{standAloneDate}, areaType = #{areaType}, zbbdocDate = #{zbbdocDate}, orgLevel = #{orgLevel}, orgPro = #{orgPro},  zipCode = #{zipCode} " +
            "WHERE id = #{id}")
    int updateOrganization(Organization organization);

    @Select("<script>" +
            "SELECT o.orgName orgName, o.zbbdocDate zbbdocDate, o.listingDate listingDate, o.standaloneDate standaloneDate, o.exeType exeType, o.orgPro orgPro, a.zbbNum zbbNum, a.ifPublicManage ifPublicManage, a.onworkerNum onworkerNum, a.retireNum retireNum, a.officeBuildArea officeBuildArea, a.buildingOwnerShip buildingOwnerShip, a.officeBuildingarea officeBuildingarea,  a.businessDivCount businessDivCount, a.funDivCount funDivCount, a.orgCount orgCount " +
            "FROM  t_d0_organization o " +
            "left join t_d0_orgattached a " +
            "on o.id=a.orgId " +
            "where   1=1 " +
            "<if test='orgName!=null'> and o.orgName = #{orgName}</if>   " +
            "<if test='yearLy!=null'>  and a.yearLy=#{yearLy} </if> " +
            "</script>")
    List<OrgInformation> getOversignt(String orgName, String yearLy);

}
