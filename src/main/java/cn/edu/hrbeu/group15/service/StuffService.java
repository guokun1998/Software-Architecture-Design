package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.po.Stuff;
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
}
