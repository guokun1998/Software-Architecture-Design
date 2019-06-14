package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.po.Fund;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-8:41
 */
@Service
public interface FundService {
    List<Fund> getFundByOrgId(Integer orgId);
    List<Fund> getFinacial(String orgName,String yearLy);
}
