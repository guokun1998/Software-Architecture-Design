package cn.edu.hrbeu.group15.vo;

import cn.edu.hrbeu.group15.po.Organization;
import cn.edu.hrbeu.group15.po.Orgattached;

import java.util.Date;

/**
 * @author guokun
 * @create 2019-06-14-14:01
 */
public class OrgInformation {
    private String orgName;
    private String exeType;
    private Date listingDate;
    private Date zbbdocDate;
    private Date standAloneDate;
    private String orgPro;
    private Short zbbNum;
    private String ifPublicManage;
    private Integer onworkerNum;
    private Integer retireNum;
    private Short officeBuildArea;
    private String buildingOwnerShip;
    private Short officeBuildingarea;
    private Short businessDivCount;
    private Short funDivCount;
    private Short orgCount;
    private Integer equ3Count;
    private Integer equ2Count;
    private Integer equ1Count;
    private Short busCount;
    private Short rapidTestVehicleCount;
    private Short motorCount;
    private Short cameraCount;
    private Short videoCount;
    private Short copycatNum;
    private Short computerNum;
    private Short notepadNum;
    private Short serverCount;
    private Short pbxCount;
    private Short faxCount;
    private Short ohpCount;
    private String yearLy;
    private Short vrCount;

    @Override
    public String toString() {
        return "OrgInformation{" +
                "orgName='" + orgName + '\'' +
                ", exeType='" + exeType + '\'' +
                ", listingDate=" + listingDate +
                ", zbbdocDate=" + zbbdocDate +
                ", standAloneDate=" + standAloneDate +
                ", orgPro='" + orgPro + '\'' +
                ", zbbNum=" + zbbNum +
                ", ifPublicManage='" + ifPublicManage + '\'' +
                ", onworkerNum=" + onworkerNum +
                ", retireNum=" + retireNum +
                ", officeBuildArea=" + officeBuildArea +
                ", buildingOwnerShip='" + buildingOwnerShip + '\'' +
                ", officeBuildingarea=" + officeBuildingarea +
                ", businessDivCount=" + businessDivCount +
                ", funDivCount=" + funDivCount +
                ", orgCount=" + orgCount +
                ", equ3Count=" + equ3Count +
                ", equ2Count=" + equ2Count +
                ", equ1Count=" + equ1Count +
                ", busCount=" + busCount +
                ", rapidTestVehicleCount=" + rapidTestVehicleCount +
                ", motorCount=" + motorCount +
                ", cameraCount=" + cameraCount +
                ", videoCount=" + videoCount +
                ", copycatNum=" + copycatNum +
                ", computerNum=" + computerNum +
                ", notepadNum=" + notepadNum +
                ", serverCount=" + serverCount +
                ", pbxCount=" + pbxCount +
                ", faxCount=" + faxCount +
                ", ohpCount=" + ohpCount +
                ", yearLy='" + yearLy + '\'' +
                ", vrCount=" + vrCount +
                '}';
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

    public Date getListingDate() {
        return listingDate;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    public Date getZbbdocDate() {
        return zbbdocDate;
    }

    public void setZbbdocDate(Date zbbdocDate) {
        this.zbbdocDate = zbbdocDate;
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

    public Short getZbbNum() {
        return zbbNum;
    }

    public void setZbbNum(Short zbbNum) {
        this.zbbNum = zbbNum;
    }

    public String getIfPublicManage() {
        return ifPublicManage;
    }

    public void setIfPublicManage(String ifPublicManage) {
        this.ifPublicManage = ifPublicManage;
    }

    public Integer getOnworkerNum() {
        return onworkerNum;
    }

    public void setOnworkerNum(Integer onworkerNum) {
        this.onworkerNum = onworkerNum;
    }

    public Integer getRetireNum() {
        return retireNum;
    }

    public void setRetireNum(Integer retireNum) {
        this.retireNum = retireNum;
    }

    public Short getOfficeBuildArea() {
        return officeBuildArea;
    }

    public void setOfficeBuildArea(Short officeBuildArea) {
        this.officeBuildArea = officeBuildArea;
    }

    public String getBuildingOwnerShip() {
        return buildingOwnerShip;
    }

    public void setBuildingOwnerShip(String buildingOwnerShip) {
        this.buildingOwnerShip = buildingOwnerShip;
    }

    public Short getOfficeBuildingarea() {
        return officeBuildingarea;
    }

    public void setOfficeBuildingarea(Short officeBuildingarea) {
        this.officeBuildingarea = officeBuildingarea;
    }

    public Short getBusinessDivCount() {
        return businessDivCount;
    }

    public void setBusinessDivCount(Short businessDivCount) {
        this.businessDivCount = businessDivCount;
    }

    public Short getFunDivCount() {
        return funDivCount;
    }

    public void setFunDivCount(Short funDivCount) {
        this.funDivCount = funDivCount;
    }

    public Short getOrgCount() {
        return orgCount;
    }

    public void setOrgCount(Short orgCount) {
        this.orgCount = orgCount;
    }

    public Integer getEqu3Count() {
        return equ3Count;
    }

    public void setEqu3Count(Integer equ3Count) {
        this.equ3Count = equ3Count;
    }

    public Integer getEqu2Count() {
        return equ2Count;
    }

    public void setEqu2Count(Integer equ2Count) {
        this.equ2Count = equ2Count;
    }

    public Integer getEqu1Count() {
        return equ1Count;
    }

    public void setEqu1Count(Integer equ1Count) {
        this.equ1Count = equ1Count;
    }

    public Short getBusCount() {
        return busCount;
    }

    public void setBusCount(Short busCount) {
        this.busCount = busCount;
    }

    public Short getRapidTestVehicleCount() {
        return rapidTestVehicleCount;
    }

    public void setRapidTestVehicleCount(Short rapidTestVehicleCount) {
        this.rapidTestVehicleCount = rapidTestVehicleCount;
    }

    public Short getMotorCount() {
        return motorCount;
    }

    public void setMotorCount(Short motorCount) {
        this.motorCount = motorCount;
    }

    public Short getCameraCount() {
        return cameraCount;
    }

    public void setCameraCount(Short cameraCount) {
        this.cameraCount = cameraCount;
    }

    public Short getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Short videoCount) {
        this.videoCount = videoCount;
    }

    public Short getCopycatNum() {
        return copycatNum;
    }

    public void setCopycatNum(Short copycatNum) {
        this.copycatNum = copycatNum;
    }

    public Short getComputerNum() {
        return computerNum;
    }

    public void setComputerNum(Short computerNum) {
        this.computerNum = computerNum;
    }

    public Short getNotepadNum() {
        return notepadNum;
    }

    public void setNotepadNum(Short notepadNum) {
        this.notepadNum = notepadNum;
    }

    public Short getServerCount() {
        return serverCount;
    }

    public void setServerCount(Short serverCount) {
        this.serverCount = serverCount;
    }

    public Short getPbxCount() {
        return pbxCount;
    }

    public void setPbxCount(Short pbxCount) {
        this.pbxCount = pbxCount;
    }

    public Short getFaxCount() {
        return faxCount;
    }

    public void setFaxCount(Short faxCount) {
        this.faxCount = faxCount;
    }

    public Short getOhpCount() {
        return ohpCount;
    }

    public void setOhpCount(Short ohpCount) {
        this.ohpCount = ohpCount;
    }

    public String getYearLy() {
        return yearLy;
    }

    public void setYearLy(String yearLy) {
        this.yearLy = yearLy;
    }

    public Short getVrCount() {
        return vrCount;
    }

    public void setVrCount(Short vrCount) {
        this.vrCount = vrCount;
    }
}
