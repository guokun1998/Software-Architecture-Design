package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.po.Orgattached;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-04-8:35
 */
@Service
public interface OrgattachedService {
    Orgattached getOrgattachedByOrgId(Integer orgId);

    int insertOneOrgattached(Orgattached orgattached);

    int updateOrgattached(Orgattached orgattached);

    List<Orgattached> getEquipment(Orgattached orgattached);
}
