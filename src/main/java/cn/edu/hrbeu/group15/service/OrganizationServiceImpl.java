package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.OrganizationMapper;
import cn.edu.hrbeu.group15.po.Organization;
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

}
