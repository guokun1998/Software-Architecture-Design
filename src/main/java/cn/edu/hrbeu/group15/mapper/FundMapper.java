package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Fund;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-8:39
 */
@Mapper
public interface FundMapper {
    @Select("select * from t_d0_fund where orgId = #{orgId}")
    List<Fund> getFundByOrgId(Integer orgId);
}
