package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Orgattached;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}
