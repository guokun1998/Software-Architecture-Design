package cn.edu.hrbeu.group15.po;

import java.math.BigDecimal;

public class Fund {
    
    private Integer id;

   
    private Integer orgId;

   
    private String orgName;

    
    private String orgNo;

    private String orgCode;

   
    private String yearly;

    
    private BigDecimal preFund;

    private BigDecimal dutyFund;

    private BigDecimal businessFund;

    
    private BigDecimal buildFund;

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }


    public BigDecimal getPreFund() {
        return preFund;
    }

    public void setPreFund(BigDecimal preFund) {
        this.preFund = preFund;
    }

    public BigDecimal getBusinessFund() {
        return businessFund;
    }

    public void setBusinessFund(BigDecimal businessFund) {
        this.businessFund = businessFund;
    }

    public BigDecimal getBuildFund() {
        return buildFund;
    }

    public void setBuildFund(BigDecimal buildFund) {
        this.buildFund = buildFund;
    }

    public String getYearly() {
        return yearly;
    }

    public void setYearly(String yearly) {
        this.yearly = yearly;
    }

    public BigDecimal getDutyFund() {
        return dutyFund;
    }

    public void setDutyFund(BigDecimal dutyFund) {
        this.dutyFund = dutyFund;
    }
}