package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.OrganizationMapper;
import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.vo.OrgInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-03-16:56
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public List<Organization> getAll() {
        return organizationMapper.getAll();
    }

    @Override
    public Organization getById(Integer id) {
        return organizationMapper.getById(id);
    }

    @Override
    public int insertOneOrgnization(Organization organization) {
        return organizationMapper.insertOneOrganization(organization);
    }

    @Override
    public int updateOrgNo(Organization organization) {
        return organizationMapper.updateOrgNo(organization);
    }

    @Override
    public String getOrgNameById(Integer id) {
        return organizationMapper.getOrgNameById(id);
    }

    @Override
    public List<String> getAllOrgName() {
        return organizationMapper.getAllOrgName();
    }

    @Override
    public Integer getIdByOrgName(String orgName) {
        return organizationMapper.getIdByOrgName(orgName);
    }

    @Override
    public Organization getOrgNoAndOrgCodeByOrgName(String orgName) {
        return organizationMapper.getOrgNoAndOrgCodeByOrgName(orgName);
    }

    @Override
    public int updateOrganization(Organization organization) {
        return organizationMapper.updateOrganization(organization);
    }

    @Override
    public List<OrgInformation> getOversignt(String orgName, String yearLy) {
        return organizationMapper.getOversignt(orgName, yearLy);
    }

    @Override
    public Organization getForSectionCreate(String orgName) {
        return organizationMapper.getForSectionCreate(orgName);
    }


}
