package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.StuffMapper;
import cn.edu.hrbeu.group15.po.Stuff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-10-10:15
 */
@Service
public class StuffServiceImpl  implements StuffService{

    @Autowired
    private StuffMapper stuffMapper;

    public List<Stuff> getStuffListByOrgId(Integer orgId) {
        return stuffMapper.getStuffListByOrgId(orgId);
    }

    public Stuff getStuffById(Integer id){
        return stuffMapper.getStuffById(id);
    }

    public int updateStuffRepManNameById(Integer id, String repManName){
        return stuffMapper.updateStuffRepManNameById(id, repManName);
    }

    public int insertOneStuff(Stuff stuff){
        return stuffMapper.insertOneStuff(stuff);
    }
}
