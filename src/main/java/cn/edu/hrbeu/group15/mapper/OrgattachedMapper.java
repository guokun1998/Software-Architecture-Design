package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Orgattached;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-8:30
 */
@Mapper
public interface OrgattachedMapper {


    @Select("select * from t_d0_orgattached where orgId=#{orgId}")
    Orgattached getOrgattachedByOrgId(Integer orgId);

    @Insert("insert into " +
            "t_d0_orgattached " +
            "(orgId, orgName, orgNo, orgCode, onworkerNum, supervisorNum, zbbNum, ifPublicManage, retireNum, officeBuildArea, buildingOwnerShip, officeBuildingarea, businessDivCount, funDivCount, orgCount, equ3Count, equ2Count, equ1Count,busCount, rapidTestVehicleCount, motorCount, cameraCount, videoCount, copycatNum, computerNum, notepadNum, serverCount, pbxCount,faxCount, ohpCount, yearLy, vrCount) " +
            "values" +
            "(#{orgId},#{orgName},#{orgNo},#{orgCode},#{onworkerNum},#{supervisorNum},#{zbbNum},#{ifPublicManage},#{retireNum},#{officeBuildArea},#{buildingOwnerShip},#{officeBuildingarea},#{businessDivCount},#{funDivCount},#{orgCount},#{equ3Count},#{equ2Count},#{equ1Count},#{busCount},#{rapidTestVehicleCount},#{motorCount},#{cameraCount},#{videoCount},#{copycatNum},#{computerNum},#{notepadNum},#{serverCount},#{pbxCount},#{faxCount},#{ohpCount},#{yearLy},#{vrCount})")
    int insertOneOrgattached(Orgattached orgattached);

    @Update("UPDATE t_d0_orgattached SET " +
            "orgName = #{orgName}, orgNo = #{orgNo}, orgCode = #{orgCode}, onworkerNum = #{onworkerNum}, supervisorNum = #{supervisorNum},  zbbNum = #{zbbNum}, ifPublicManage = #{ifPublicManage}, retireNum = #{retireNum}, officeBuildArea = #{officeBuildArea}, buildingOwnerShip = #{buildingOwnerShip}, officeBuildingarea = #{officeBuildingarea},  businessDivCount = #{businessDivCount}, funDivCount = #{funDivCount}, orgCount = #{orgCount}, equ3Count = #{equ3Count}, equ2Count = #{equ2Count}, equ1Count = #{equ1Count}, busCount = #{busCount}, rapidTestVehicleCount = #{rapidTestVehicleCount}, motorCount = #{motorCount},  cameraCount = #{cameraCount}, videoCount = #{videoCount},  copycatNum = #{copycatNum}, computerNum = #{computerNum},  notepadNum = #{notepadNum}, serverCount = #{serverCount},  pbxCount = #{pbxCount},  faxCount = #{faxCount}, ohpCount = #{ohpCount},  yearLy = #{yearLy}, vrCount = #{vrCount} " +
            "WHERE orgId = #{orgId}")
    int updateOrgattached(Orgattached orgattached);

    @Select("<script> " +
            "SELECT  orgName,equ3Count, equ2Count, equ1Count, busCount, rapidTestVehicleCount, motorCount, cameraCount, videoCount, copycatNum, computerNum, notepadNum, serverCount, pbxCount, faxCount, ohpCount, vrCount " +
            "FROM t_d0_orgattached " +
            "where 1=1 " +
            "<if test='orgName!=null'> and orgName = #{orgName}</if>" +
            "</script>")
    List<Orgattached> getEquipment(Orgattached orgattached);
}
