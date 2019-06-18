package cn.edu.hrbeu.group15.po;

public class Section {
   
    private Integer id;

    
    private Integer orgId;

    
    private String orgNo;

    
    private String divCode;

   
    private String divNameCode;

    
    private String divName;

    
    private String ifSub;

    
    private String dutyTel;

    
    private String fax;

   
    private String divRoomNo;

    
    private String exeType;

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", orgId=" + orgId +
                ", orgNo='" + orgNo + '\'' +
                ", divCode='" + divCode + '\'' +
                ", divNameCode='" + divNameCode + '\'' +
                ", divName='" + divName + '\'' +
                ", ifSub='" + ifSub + '\'' +
                ", dutyTel='" + dutyTel + '\'' +
                ", fax='" + fax + '\'' +
                ", divRoomNo='" + divRoomNo + '\'' +
                ", exeType='" + exeType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getDivCode() {
        return divCode;
    }

    public void setDivCode(String divCode) {
        this.divCode = divCode;
    }

    public String getDivNameCode() {
        return divNameCode;
    }

    public void setDivNameCode(String divNameCode) {
        this.divNameCode = divNameCode;
    }

    public String getDivName() {
        return divName;
    }

    public void setDivName(String divName) {
        this.divName = divName;
    }

    public String getIfSub() {
        return ifSub;
    }

    public void setIfSub(String ifSub) {
        this.ifSub = ifSub;
    }

    public String getDutyTel() {
        return dutyTel;
    }

    public void setDutyTel(String dutyTel) {
        this.dutyTel = dutyTel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDivRoomNo() {
        return divRoomNo;
    }

    public void setDivRoomNo(String divRoomNo) {
        this.divRoomNo = divRoomNo;
    }

    public String getExeType() {
        return exeType;
    }

    public void setExeType(String exeType) {
        this.exeType = exeType;
    }
}