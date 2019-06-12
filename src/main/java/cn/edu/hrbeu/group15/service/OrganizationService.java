package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Section;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-03-16:55
 */
@Service
public interface OrganizationService {
    List<Organization> getAll();

    Organization getById(Integer id);



    int insertOneOrgnization(Organization organization);

    int updateOrgNo(Organization organization);

    String getOrgNameById(Integer id);

    List<String> getAllOrgName();

    Integer getIdByOrgName(String orgName);

    Organization getOrgNoAndOrgCodeByOrgName(String orgName);
}
