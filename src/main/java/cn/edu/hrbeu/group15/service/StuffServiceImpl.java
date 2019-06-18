package cn.edu.hrbeu.group15.service;

import cn.edu.hrbeu.group15.mapper.StuffMapper;
import cn.edu.hrbeu.group15.po.Stuff;
import cn.edu.hrbeu.group15.vo.StuffComposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guokun
 * @create 2019-06-10-10:15
 */
@Service
public class StuffServiceImpl  implements StuffService{

    @Autowired
    private StuffMapper stuffMapper;

    public List<Stuff> getStuffListByOrgId(Integer orgId) {
        return stuffMapper.getStuffListByOrgId(orgId);
    }

    public Stuff getStuffById(Integer id){
        return stuffMapper.getStuffById(id);
    }

    public int updateStuffRepManNameById(Integer id, String repManName){
        return stuffMapper.updateStuffRepManNameById(id, repManName);
    }

    public int insertOneStuff(Stuff stuff){
        return stuffMapper.insertOneStuff(stuff);
    }

    @Override
    public int updateStuff(Stuff stuff) {
        return stuffMapper.updateStuff(stuff);
    }

    @Override
    public List<Stuff> getNotAssignStuffListByOrgId() {
        return stuffMapper.getNotAssignStuffListByOrgId();
    }

    @Override
    public int updateStuffRelation(Integer sectionId, String divCode, Integer orgId, String orgNo, Integer id) {
        return stuffMapper.updateStuffRelation(sectionId, divCode, orgId, orgNo, id);
    }

    @Override
    public int deleteOneStuff(Integer id) {
        return stuffMapper.deleteOneStuff(id);
    }

    @Override
    public List<StuffComposition> getStuffComposition(StuffComposition stuffComposition) {
        List<StuffComposition> stuffCompositionList = stuffMapper.getStuffComposition(stuffComposition);
        for (StuffComposition composition : stuffCompositionList) {
            composition.setSumJobLevel(composition.getJobLevel1()+composition.getJobLevel2()+composition.getJobLevel3()+composition.getJobLevel4()+composition.getJobLevel5()+composition.getJobLevel6()+composition.getJobLevel7()+composition.getJobLevel8()+composition.getJobLevel9());
            composition.setSumTitle(composition.getTitle1()+composition.getTitle2()+composition.getTitle3()+composition.getTitle4()+composition.getTitle5());
        }
        return stuffCompositionList;
    }


}
