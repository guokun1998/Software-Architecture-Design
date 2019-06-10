package cn.edu.hrbeu.group15.po;

import java.util.Date;

public class Organization {

    private Integer id;

    private String orgNo;


    private String orgCode;


    private String orgName;


    private String exeType;

    private String areaType;

    private String areaCode;


    private String linkAdd;


    private Date listingDate;

    private Date zbbdocDate;
    private Date standAloneDate;


    private String orgPro;
    private  String orgLevel;

    private String zipCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getExeType() {
        return exeType;
    }

    public void setExeType(String exeType) {
        this.exeType = exeType;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getLinkAdd() {
        return linkAdd;
    }

    public void setLinkAdd(String linkAdd) {
        this.linkAdd = linkAdd;
    }

    public Date getListingDate() {
        return listingDate;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    public Date getStandAloneDate() {
        return standAloneDate;
    }

    public void setStandAloneDate(Date standAloneDate) {
        this.standAloneDate = standAloneDate;
    }

    public String getOrgPro() {
        return orgPro;
    }

    public void setOrgPro(String orgPro) {
        this.orgPro = orgPro;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }



    public Date getZbbdocDate() {
        return zbbdocDate;
    }

    public void setZbbdocDate(Date zbbdocDate) {
        this.zbbdocDate = zbbdocDate;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", orgNo='" + orgNo + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", orgName='" + orgName + '\'' +
                ", exeType='" + exeType + '\'' +
                ", areaType='" + areaType + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", linkAdd='" + linkAdd + '\'' +
                ", listingDate=" + listingDate +
                ", zbbdocDate=" + zbbdocDate +
                ", standAloneDate=" + standAloneDate +
                ", orgPro='" + orgPro + '\'' +
                ", orgLevel='" + orgLevel + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}