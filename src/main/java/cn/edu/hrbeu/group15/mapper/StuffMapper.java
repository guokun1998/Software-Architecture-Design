package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Stuff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-10-10:12
 */
@Mapper
public interface StuffMapper {


    @Select("select * from t_d0_stuff where orgId=#{orgId}")
    List<Stuff> getStuffListByOrgId(Integer orgId);

    @Select("select * from t_d0_stuff where id=#{id}")
    Stuff getStuffById(Integer id);

}
