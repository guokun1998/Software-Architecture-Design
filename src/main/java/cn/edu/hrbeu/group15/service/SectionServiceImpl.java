package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.SectionMapper;
import cn.edu.hrbeu.group15.po.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-06-17:51
 */
@Service
public class SectionServiceImpl implements SectionService{
    @Autowired
    protected SectionMapper sectionMapper;


    @Override
    public List<Section> getSectionListByOrgId(Integer orgId) {
        return sectionMapper.getSectionListByOrgId(orgId);
    }

    @Override
    public Section getSectionById(Integer id) {
        return sectionMapper.getSectionById(id);
    }

    @Override
    public int updateSectionName(Section section) {
        return sectionMapper.updateSectionName(section);
    }

    @Override
    public int deleteSectionById(Integer id) {
        return sectionMapper.deleteSectionById(id);
    }

    @Override
    public List<Section> getSectionListByOrgIdAndDivName(Integer orgId, String divName) {
        return sectionMapper.getSectionListByOrgIdAndDivName(orgId,divName);
    }
}
