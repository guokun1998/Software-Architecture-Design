package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.LeaderMapper;
import cn.edu.hrbeu.group15.po.Leader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-11:47
 */
@Service
public class LeaderServiceImpl implements LeaderService{

    @Autowired
    private LeaderMapper leaderMapper;


    @Override
    public List<Leader> findLeaderByYear(String year) {
        return leaderMapper.findLeaderByYear(year);
    }
}
