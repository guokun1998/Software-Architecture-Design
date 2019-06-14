package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.po.Leader;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-11:46
 */
@Service
public interface LeaderService {
    List<Leader> findLeaderByYear(String orgName,String yearLy);

    List<Leader> findTatistics(String orgName,String yearLy);
}
