package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Organization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-03-17:19
 */

@Mapper
public interface OrganizationMapper {

    @Select("select * from t_d0_organization")
    List<Organization>  getAll();

    @Select("select * from t_d0_organization where id=#{id}")
    Organization getById(Integer id);

}
