package cn.edu.hrbeu.group15.vo;

/**
 * @author guokun
 * @create 2019-06-12-16:41
 */
public class SectionSelectCondition {
    private Integer orgId;
    private String divName;

    @Override
    public String toString() {
        return "SectionSelectCondition{" +
                "orgId='" + orgId + '\'' +
                ", divName='" + divName + '\'' +
                '}';
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getDivName() {
        return divName;
    }

    public void setDivName(String divName) {
        this.divName = divName;
    }
}
