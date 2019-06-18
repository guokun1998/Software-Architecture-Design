package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.SectionMapper;
import cn.edu.hrbeu.group15.po.Section;
import cn.edu.hrbeu.group15.po.Stuff;
import cn.edu.hrbeu.group15.vo.SectionEasyView;
import cn.edu.hrbeu.group15.vo.SectionSelectCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-06-17:50
 */
@Service
public interface SectionService {

    List<Section> getSectionListByOrgId(Integer orgId);

    Section getSectionById(Integer id);

    int updateSectionName(Section section);

    int deleteSectionById(Integer id);

    List<Section> getSectionListByOrgIdAndDivName(Integer orgId, String  divName);

    List<String> getSectionDivNameByOrgId(Integer orgId);

    Section getIdAndDivCodeByOrgIdAndDivName(Integer orgId, String divName);

    List<SectionEasyView> getSectionConditional(SectionSelectCondition sectionSelectCondition);

    int insertOneSection(Section section);

    int updateSection(Section section);
}
