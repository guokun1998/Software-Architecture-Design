package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.OrgattachedMapper;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-8:35
 */
@Service
public class OrgattachedServiceImpl implements OrgattachedService{

    @Autowired
    private OrgattachedMapper orgattachedMapper;


    @Override
    public Orgattached getOrgattachedByOrgId(Integer orgId) {
        return orgattachedMapper.getOrgattachedByOrgId(orgId);
    }

    @Override
    public int insertOneOrgattached(Orgattached orgattached) {
        return orgattachedMapper.insertOneOrgattached(orgattached);
    }

    @Override
    public int updateOrgattached(Orgattached orgattached) {
        return orgattachedMapper.updateOrgattached(orgattached);
    }

    @Override
    public List<Orgattached> getEquipment(Orgattached orgattached) {
        return orgattachedMapper.getEquipment(orgattached);
    }


}
