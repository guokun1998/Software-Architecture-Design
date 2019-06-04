package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Orgattached;
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
}
