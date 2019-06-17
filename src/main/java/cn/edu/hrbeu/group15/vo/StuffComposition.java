package cn.edu.hrbeu.group15.vo;

/**
 * @author guokun
 * @create 2019-06-17-10:55
 */
public class StuffComposition {
    private String orgName;
    private Integer manNumber;
    private Integer womenNumber;
    private Integer doctorNumber;//博士
    private Integer masterNumber;//硕士
    private Integer undergraduateNumber;//本科;
    private Integer juniorNumber;//大专
    private Integer secondaryNumber;//中专
    private Integer lowerMiddleNumber;//低于高中
    private Integer numberLower25;
    private Integer number26To30;
    private Integer number31To35;
    private Integer number36To40;
    private Integer number41To45;
    private Integer number46To50;
    private Integer number51To55;
    private Integer numberMore56;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "StuffComposition{" +
                "orgName=" + orgName +
                ", manNumber=" + manNumber +
                ", womenNumber=" + womenNumber +
                ", doctorNumber=" + doctorNumber +
                ", masterNumber=" + masterNumber +
                ", undergraduateNumber=" + undergraduateNumber +
                ", juniorNumber=" + juniorNumber +
                ", secondaryNumber=" + secondaryNumber +
                ", lowerMiddleNumber=" + lowerMiddleNumber +
                ", numberLower25=" + numberLower25 +
                ", number26To30=" + number26To30 +
                ", number31To35=" + number31To35 +
                ", number36To40=" + number36To40 +
                ", number41To45=" + number41To45 +
                ", number46To50=" + number46To50 +
                ", number51To55=" + number51To55 +
                ", numberMore56=" + numberMore56 +
                '}';
    }

    public Integer getManNumber() {
        return manNumber;
    }

    public void setManNumber(Integer manNumber) {
        this.manNumber = manNumber;
    }

    public Integer getWomenNumber() {
        return womenNumber;
    }

    public void setWomenNumber(Integer womenNumber) {
        this.womenNumber = womenNumber;
    }

    public Integer getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(Integer doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public Integer getMasterNumber() {
        return masterNumber;
    }

    public void setMasterNumber(Integer masterNumber) {
        this.masterNumber = masterNumber;
    }

    public Integer getUndergraduateNumber() {
        return undergraduateNumber;
    }

    public void setUndergraduateNumber(Integer undergraduateNumber) {
        this.undergraduateNumber = undergraduateNumber;
    }

    public Integer getJuniorNumber() {
        return juniorNumber;
    }

    public void setJuniorNumber(Integer juniorNumber) {
        this.juniorNumber = juniorNumber;
    }

    public Integer getSecondaryNumber() {
        return secondaryNumber;
    }

    public void setSecondaryNumber(Integer secondaryNumber) {
        this.secondaryNumber = secondaryNumber;
    }

    public Integer getLowerMiddleNumber() {
        return lowerMiddleNumber;
    }

    public void setLowerMiddleNumber(Integer lowerMiddleNumber) {
        this.lowerMiddleNumber = lowerMiddleNumber;
    }

    public Integer getNumberLower25() {
        return numberLower25;
    }

    public void setNumberLower25(Integer numberLower25) {
        this.numberLower25 = numberLower25;
    }

    public Integer getNumber26To30() {
        return number26To30;
    }

    public void setNumber26To30(Integer number26To30) {
        this.number26To30 = number26To30;
    }

    public Integer getNumber31To35() {
        return number31To35;
    }

    public void setNumber31To35(Integer number31To35) {
        this.number31To35 = number31To35;
    }

    public Integer getNumber36To40() {
        return number36To40;
    }

    public void setNumber36To40(Integer number36To40) {
        this.number36To40 = number36To40;
    }

    public Integer getNumber41To45() {
        return number41To45;
    }

    public void setNumber41To45(Integer number41To45) {
        this.number41To45 = number41To45;
    }

    public Integer getNumber46To50() {
        return number46To50;
    }

    public void setNumber46To50(Integer number46To50) {
        this.number46To50 = number46To50;
    }

    public Integer getNumber51To55() {
        return number51To55;
    }

    public void setNumber51To55(Integer number51To55) {
        this.number51To55 = number51To55;
    }

    public Integer getNumberMore56() {
        return numberMore56;
    }

    public void setNumberMore56(Integer numberMore56) {
        this.numberMore56 = numberMore56;
    }
}
