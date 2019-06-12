package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Organization;
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

}
