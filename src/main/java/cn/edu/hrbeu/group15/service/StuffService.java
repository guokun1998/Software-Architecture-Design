package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.po.Stuff;
import cn.edu.hrbeu.group15.vo.StuffComposition;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-10-10:15
 */
@Service
public interface StuffService {
    int updateStuff(Stuff stuff);
    List<Stuff> getNotAssignStuffListByOrgId();
    int updateStuffRelation(Integer sectionId, String divCode,Integer orgId, String orgNo, Integer id);

    int deleteOneStuff(Integer id);

    List<StuffComposition> getStuffComposition(StuffComposition stuffComposition);
}
