package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.FundMapper;
import cn.edu.hrbeu.group15.po.Fund;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-8:41
 */
@Service
public class FundServiceImpl implements FundService{

    @Autowired
    FundMapper fundMapper;

    @Override
    public List<Fund> getFundByOrgId(Integer orgId) {
        return fundMapper.getFundByOrgId(orgId);
    }
}
