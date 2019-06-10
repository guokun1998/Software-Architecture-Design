package cn.edu.hrbeu.group15.mapper;

import cn.edu.hrbeu.group15.po.Leader;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-11:08
 */
@Mapper
public interface LeaderMapper {

    @Select("select * from t_d0_leader where yearly=#{year}")
    List<Leader> findLeaderByYear(String year);
}
