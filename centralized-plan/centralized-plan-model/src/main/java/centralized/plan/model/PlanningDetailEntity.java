package centralized.plan.model;

import java.math.BigDecimal;
import java.util.Date;

public class PlanningDetailEntity {
    private Integer id;

    private Integer workid;

    private Integer categoryid;

    private Integer status;

    private Date uploadtime;

    private String uploadusername;

    private String regionName;

    private String cityName;

    private String logicCell;

    private String physicsCell;

    private String tdlPlaincellNum;

    private String tdlPlaincellNumOld;

    private String enodebType;

    private String buildRequireNum;

    private String coveringTarget;

    private BigDecimal planningLongitude;

    private BigDecimal planningLatitude;

    private String lteBuildProperty;

    private String commonAddrProperty;

    private String commonAddrGsmCell;

    private String addrAreaType;

    private String benumber;

    private String celladdrstate;

    private String areatype;

    private String buildCellClassify;

    private String tdlnum;

    private String solutionBatch;

    private String vendorName;

    private String band;

    private String lteIsfiberfar;

    private String enodebConfiguration;

    private Integer cellCount;

    private Integer carrierCount;

    private String bbuRemouldType;

    private String bbuModel;

    private Integer bbuCount;

    private String bbuInstallType;

    private String rruRemouldType;

    private String rruModel;

    private Integer rruCount;

    private Integer rruChannelCount;

    private String rruCell;

    private String rruSupplyType;

    private String reconnoiterPhysicsCell;

    private BigDecimal prospectLongitude;

    private BigDecimal prospectLatitude;

    private String reconnoiterHanging;

    private String planningBearing;

    private String opticalHeight;

    private String reconnoiterIsfiberfar;

    private String masttype;

    private String newUsed1;

    private Integer height;

    private String machineroomType;

    private String newUsed2;

    private String dfCommonAntenna;

    private String antennaModel;

    private Integer antennaCount;

    private String planningChangeMsg;

    private String specialSolutionAdded;

    private String instituteDesign;

    private String remark;

    private String isbackout;

    private String backoutReasonType;

    private String backoutReasonMsg;

    private String planninGauditIspass;

    private String planninDismissReasonType;

    private String planninGauditMsg;

    private String plannindataGauditIspass;

    private String plannindataReasonType;

    private String plannindataGauditMsg;

    private String actualsurveyCoveredWay;

    private String actualsurveyLogicCell;

    private String actualsurveyPhysicsCell;

    private String actualsurveyLongitude;

    private String actualsurveyLatitude;

    private String actualsurveyHanging;

    private Integer recentStationSpacing;

    private String recentStationCellname;

    private String actualsurveyBand;

    private String actualsurveyBearing;

    private String actualsurveyDowntilt;

    private Integer actualsurveyCount;

    private String entrustTt;

    private String dockingIspassTt;

    private Date joinTimeTt;

    private String dockingDismissReasonType;

    private String dockingDismissMsg;

    private String celldistanceMigration;

    private String isexistChange;

    private String changedReasonType;

    private String changedReasonMsg;

    private Date changedTime;

    private String surveyGauditIspass;

    private String surveyDismissReasonType;

    private String surveyGauditMsg;

    private String canSubmitTriage;

    private String triageBatch;

    private Integer triageCount;

    private String triageLogicCell;

    private String triagePhysicsCell;

    private String triageLongitude;

    private String triageLatitude;

    private String triageBand;

    private String triageHanging;

    private String triageBearing;

    private String triageMachineDowntilt;

    private String triagePrefabelectronDowntilt;

    private String triageElectronDowntilt;

    private Integer triageCelldistanceMigration;

    private Integer triageRecentStationSpacing;

    private String triageStationCellname;

    private String triageCellResourceType;

    private String triageColocationType;

    private String triageFillIspass;

    private String triageDismissReasonType;

    private String triageFillMsg;

    private String provinceGauditIspass;

    private String provinceDismissReasonType;

    private String provinceGauditMsg;

    private String pmGauditIspass;

    private String pmFillMsg;

    private String canSubmitRegaudit;

    private String submitRegauditReasonType;

    private String submitRegauditMsg;

    private String regauditRequestIspass;

    private String auditOpinionType;

    private String auditOpinionMsg;

    private String demandSource;

    private String demandReference;

    private String demandPriority;

    private BigDecimal demandLongitude;

    private BigDecimal demandLatitude;

    private String workingLongitude;

    private String workingLatitude;

    private String workingHanging;

    private Integer workingCount;

    private String dockingIspassReasonType;

    private String dockingIspassMsg;

    private Date deliverycheckPassTime;

    private String delcheckDismissReasonType;

    private String delcheckDismissMsg;

    private Integer issitebuilder;

    private Date handoverTime;

    private Date planningUpdateDate;

    private Date auditygUpdateDate;

    private Date completeUpdateDate;

    private Date planningauditUpdateDate;

    private Date entrustUpdateDate;

    private Date seaffirmUpdateDate;

    private Date actualinfoUpdateDate;

    private Date auditsurveyUpdateDate;

    private Date triageUpdateDate;

    private Date sectriageUpdateDate;

    private String hangingMigration;

    private String isReform;

    private String reformMsg;

    private String reformFrom;

    private String reformType;

    private String reformCell;

    private String reformLongtitude;

    private String reformLatitude;

    private String reformBand;

    private String reformHanging;

    private String reformGauditIspass;

    private String reformGauditMsg;

    private String reformCompleteTime;

    private String isExpand;

    private String currentBand;

    private String addorminusBand;

    private String expandRequireFrom;

    private String expandRequireTime;

    private String expandGauditIspass;

    private String expandGauditMsg;

    private String expandTriageTime;

    private String expandForceTime;

    private String buildSchedule;

    private String isSubmitBuildReq;

    private Date buildreqUpdateDate;

    private String swyKyAuditIspass;

    private String swyKyAuditReasonType;

    private String swyKyAuditMsg;

    private Date kyauditUpdateDate;

    private String paramEnodebId;

    private String paramCellName;

    private String paramCellId;

    private String paramPci;

    private String paramTac;

    private Date paramconfigUpdateDate;

    private String cellStatus;

    private String resourceStatus;

    private Date resourceTime;

    private String haveChangeReport;

    private String isBeautifyAntenna;

    private String beautifyAntennaType;

    private String isEledownAntenna;

    private String eledownAntennaType;

    private Integer planningSectorCount;

    private Integer actualsurveySectorCount;

    private Integer actualsurveyCellCount;

    private String isConfigparam;

    private Integer paramIsAuto;

    private String systemStandard;

    private String opensiteType;

    private String isSupportNbiot;

    private Integer isRefreshRemoval;

    private Integer isInterfaceReturn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getUploadusername() {
        return uploadusername;
    }

    public void setUploadusername(String uploadusername) {
        this.uploadusername = uploadusername == null ? null : uploadusername.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getLogicCell() {
        return logicCell;
    }

    public void setLogicCell(String logicCell) {
        this.logicCell = logicCell == null ? null : logicCell.trim();
    }

    public String getPhysicsCell() {
        return physicsCell;
    }

    public void setPhysicsCell(String physicsCell) {
        this.physicsCell = physicsCell == null ? null : physicsCell.trim();
    }

    public String getTdlPlaincellNum() {
        return tdlPlaincellNum;
    }

    public void setTdlPlaincellNum(String tdlPlaincellNum) {
        this.tdlPlaincellNum = tdlPlaincellNum == null ? null : tdlPlaincellNum.trim();
    }

    public String getTdlPlaincellNumOld() {
        return tdlPlaincellNumOld;
    }

    public void setTdlPlaincellNumOld(String tdlPlaincellNumOld) {
        this.tdlPlaincellNumOld = tdlPlaincellNumOld == null ? null : tdlPlaincellNumOld.trim();
    }

    public String getEnodebType() {
        return enodebType;
    }

    public void setEnodebType(String enodebType) {
        this.enodebType = enodebType == null ? null : enodebType.trim();
    }

    public String getBuildRequireNum() {
        return buildRequireNum;
    }

    public void setBuildRequireNum(String buildRequireNum) {
        this.buildRequireNum = buildRequireNum == null ? null : buildRequireNum.trim();
    }

    public String getCoveringTarget() {
        return coveringTarget;
    }

    public void setCoveringTarget(String coveringTarget) {
        this.coveringTarget = coveringTarget == null ? null : coveringTarget.trim();
    }

    public BigDecimal getPlanningLongitude() {
        return planningLongitude;
    }

    public void setPlanningLongitude(BigDecimal planningLongitude) {
        this.planningLongitude = planningLongitude;
    }

    public BigDecimal getPlanningLatitude() {
        return planningLatitude;
    }

    public void setPlanningLatitude(BigDecimal planningLatitude) {
        this.planningLatitude = planningLatitude;
    }

    public String getLteBuildProperty() {
        return lteBuildProperty;
    }

    public void setLteBuildProperty(String lteBuildProperty) {
        this.lteBuildProperty = lteBuildProperty == null ? null : lteBuildProperty.trim();
    }

    public String getCommonAddrProperty() {
        return commonAddrProperty;
    }

    public void setCommonAddrProperty(String commonAddrProperty) {
        this.commonAddrProperty = commonAddrProperty == null ? null : commonAddrProperty.trim();
    }

    public String getCommonAddrGsmCell() {
        return commonAddrGsmCell;
    }

    public void setCommonAddrGsmCell(String commonAddrGsmCell) {
        this.commonAddrGsmCell = commonAddrGsmCell == null ? null : commonAddrGsmCell.trim();
    }

    public String getAddrAreaType() {
        return addrAreaType;
    }

    public void setAddrAreaType(String addrAreaType) {
        this.addrAreaType = addrAreaType == null ? null : addrAreaType.trim();
    }

    public String getBenumber() {
        return benumber;
    }

    public void setBenumber(String benumber) {
        this.benumber = benumber == null ? null : benumber.trim();
    }

    public String getCelladdrstate() {
        return celladdrstate;
    }

    public void setCelladdrstate(String celladdrstate) {
        this.celladdrstate = celladdrstate == null ? null : celladdrstate.trim();
    }

    public String getAreatype() {
        return areatype;
    }

    public void setAreatype(String areatype) {
        this.areatype = areatype == null ? null : areatype.trim();
    }

    public String getBuildCellClassify() {
        return buildCellClassify;
    }

    public void setBuildCellClassify(String buildCellClassify) {
        this.buildCellClassify = buildCellClassify == null ? null : buildCellClassify.trim();
    }

    public String getTdlnum() {
        return tdlnum;
    }

    public void setTdlnum(String tdlnum) {
        this.tdlnum = tdlnum == null ? null : tdlnum.trim();
    }

    public String getSolutionBatch() {
        return solutionBatch;
    }

    public void setSolutionBatch(String solutionBatch) {
        this.solutionBatch = solutionBatch == null ? null : solutionBatch.trim();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName == null ? null : vendorName.trim();
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band == null ? null : band.trim();
    }

    public String getLteIsfiberfar() {
        return lteIsfiberfar;
    }

    public void setLteIsfiberfar(String lteIsfiberfar) {
        this.lteIsfiberfar = lteIsfiberfar == null ? null : lteIsfiberfar.trim();
    }

    public String getEnodebConfiguration() {
        return enodebConfiguration;
    }

    public void setEnodebConfiguration(String enodebConfiguration) {
        this.enodebConfiguration = enodebConfiguration == null ? null : enodebConfiguration.trim();
    }

    public Integer getCellCount() {
        return cellCount;
    }

    public void setCellCount(Integer cellCount) {
        this.cellCount = cellCount;
    }

    public Integer getCarrierCount() {
        return carrierCount;
    }

    public void setCarrierCount(Integer carrierCount) {
        this.carrierCount = carrierCount;
    }

    public String getBbuRemouldType() {
        return bbuRemouldType;
    }

    public void setBbuRemouldType(String bbuRemouldType) {
        this.bbuRemouldType = bbuRemouldType == null ? null : bbuRemouldType.trim();
    }

    public String getBbuModel() {
        return bbuModel;
    }

    public void setBbuModel(String bbuModel) {
        this.bbuModel = bbuModel == null ? null : bbuModel.trim();
    }

    public Integer getBbuCount() {
        return bbuCount;
    }

    public void setBbuCount(Integer bbuCount) {
        this.bbuCount = bbuCount;
    }

    public String getBbuInstallType() {
        return bbuInstallType;
    }

    public void setBbuInstallType(String bbuInstallType) {
        this.bbuInstallType = bbuInstallType == null ? null : bbuInstallType.trim();
    }

    public String getRruRemouldType() {
        return rruRemouldType;
    }

    public void setRruRemouldType(String rruRemouldType) {
        this.rruRemouldType = rruRemouldType == null ? null : rruRemouldType.trim();
    }

    public String getRruModel() {
        return rruModel;
    }

    public void setRruModel(String rruModel) {
        this.rruModel = rruModel == null ? null : rruModel.trim();
    }

    public Integer getRruCount() {
        return rruCount;
    }

    public void setRruCount(Integer rruCount) {
        this.rruCount = rruCount;
    }

    public Integer getRruChannelCount() {
        return rruChannelCount;
    }

    public void setRruChannelCount(Integer rruChannelCount) {
        this.rruChannelCount = rruChannelCount;
    }

    public String getRruCell() {
        return rruCell;
    }

    public void setRruCell(String rruCell) {
        this.rruCell = rruCell == null ? null : rruCell.trim();
    }

    public String getRruSupplyType() {
        return rruSupplyType;
    }

    public void setRruSupplyType(String rruSupplyType) {
        this.rruSupplyType = rruSupplyType == null ? null : rruSupplyType.trim();
    }

    public String getReconnoiterPhysicsCell() {
        return reconnoiterPhysicsCell;
    }

    public void setReconnoiterPhysicsCell(String reconnoiterPhysicsCell) {
        this.reconnoiterPhysicsCell = reconnoiterPhysicsCell == null ? null : reconnoiterPhysicsCell.trim();
    }

    public BigDecimal getProspectLongitude() {
        return prospectLongitude;
    }

    public void setProspectLongitude(BigDecimal prospectLongitude) {
        this.prospectLongitude = prospectLongitude;
    }

    public BigDecimal getProspectLatitude() {
        return prospectLatitude;
    }

    public void setProspectLatitude(BigDecimal prospectLatitude) {
        this.prospectLatitude = prospectLatitude;
    }

    public String getReconnoiterHanging() {
        return reconnoiterHanging;
    }

    public void setReconnoiterHanging(String reconnoiterHanging) {
        this.reconnoiterHanging = reconnoiterHanging == null ? null : reconnoiterHanging.trim();
    }

    public String getPlanningBearing() {
        return planningBearing;
    }

    public void setPlanningBearing(String planningBearing) {
        this.planningBearing = planningBearing == null ? null : planningBearing.trim();
    }

    public String getOpticalHeight() {
        return opticalHeight;
    }

    public void setOpticalHeight(String opticalHeight) {
        this.opticalHeight = opticalHeight == null ? null : opticalHeight.trim();
    }

    public String getReconnoiterIsfiberfar() {
        return reconnoiterIsfiberfar;
    }

    public void setReconnoiterIsfiberfar(String reconnoiterIsfiberfar) {
        this.reconnoiterIsfiberfar = reconnoiterIsfiberfar == null ? null : reconnoiterIsfiberfar.trim();
    }

    public String getMasttype() {
        return masttype;
    }

    public void setMasttype(String masttype) {
        this.masttype = masttype == null ? null : masttype.trim();
    }

    public String getNewUsed1() {
        return newUsed1;
    }

    public void setNewUsed1(String newUsed1) {
        this.newUsed1 = newUsed1 == null ? null : newUsed1.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getMachineroomType() {
        return machineroomType;
    }

    public void setMachineroomType(String machineroomType) {
        this.machineroomType = machineroomType == null ? null : machineroomType.trim();
    }

    public String getNewUsed2() {
        return newUsed2;
    }

    public void setNewUsed2(String newUsed2) {
        this.newUsed2 = newUsed2 == null ? null : newUsed2.trim();
    }

    public String getDfCommonAntenna() {
        return dfCommonAntenna;
    }

    public void setDfCommonAntenna(String dfCommonAntenna) {
        this.dfCommonAntenna = dfCommonAntenna == null ? null : dfCommonAntenna.trim();
    }

    public String getAntennaModel() {
        return antennaModel;
    }

    public void setAntennaModel(String antennaModel) {
        this.antennaModel = antennaModel == null ? null : antennaModel.trim();
    }

    public Integer getAntennaCount() {
        return antennaCount;
    }

    public void setAntennaCount(Integer antennaCount) {
        this.antennaCount = antennaCount;
    }

    public String getPlanningChangeMsg() {
        return planningChangeMsg;
    }

    public void setPlanningChangeMsg(String planningChangeMsg) {
        this.planningChangeMsg = planningChangeMsg == null ? null : planningChangeMsg.trim();
    }

    public String getSpecialSolutionAdded() {
        return specialSolutionAdded;
    }

    public void setSpecialSolutionAdded(String specialSolutionAdded) {
        this.specialSolutionAdded = specialSolutionAdded == null ? null : specialSolutionAdded.trim();
    }

    public String getInstituteDesign() {
        return instituteDesign;
    }

    public void setInstituteDesign(String instituteDesign) {
        this.instituteDesign = instituteDesign == null ? null : instituteDesign.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIsbackout() {
        return isbackout;
    }

    public void setIsbackout(String isbackout) {
        this.isbackout = isbackout == null ? null : isbackout.trim();
    }

    public String getBackoutReasonType() {
        return backoutReasonType;
    }

    public void setBackoutReasonType(String backoutReasonType) {
        this.backoutReasonType = backoutReasonType == null ? null : backoutReasonType.trim();
    }

    public String getBackoutReasonMsg() {
        return backoutReasonMsg;
    }

    public void setBackoutReasonMsg(String backoutReasonMsg) {
        this.backoutReasonMsg = backoutReasonMsg == null ? null : backoutReasonMsg.trim();
    }

    public String getPlanninGauditIspass() {
        return planninGauditIspass;
    }

    public void setPlanninGauditIspass(String planninGauditIspass) {
        this.planninGauditIspass = planninGauditIspass == null ? null : planninGauditIspass.trim();
    }

    public String getPlanninDismissReasonType() {
        return planninDismissReasonType;
    }

    public void setPlanninDismissReasonType(String planninDismissReasonType) {
        this.planninDismissReasonType = planninDismissReasonType == null ? null : planninDismissReasonType.trim();
    }

    public String getPlanninGauditMsg() {
        return planninGauditMsg;
    }

    public void setPlanninGauditMsg(String planninGauditMsg) {
        this.planninGauditMsg = planninGauditMsg == null ? null : planninGauditMsg.trim();
    }

    public String getPlannindataGauditIspass() {
        return plannindataGauditIspass;
    }

    public void setPlannindataGauditIspass(String plannindataGauditIspass) {
        this.plannindataGauditIspass = plannindataGauditIspass == null ? null : plannindataGauditIspass.trim();
    }

    public String getPlannindataReasonType() {
        return plannindataReasonType;
    }

    public void setPlannindataReasonType(String plannindataReasonType) {
        this.plannindataReasonType = plannindataReasonType == null ? null : plannindataReasonType.trim();
    }

    public String getPlannindataGauditMsg() {
        return plannindataGauditMsg;
    }

    public void setPlannindataGauditMsg(String plannindataGauditMsg) {
        this.plannindataGauditMsg = plannindataGauditMsg == null ? null : plannindataGauditMsg.trim();
    }

    public String getActualsurveyCoveredWay() {
        return actualsurveyCoveredWay;
    }

    public void setActualsurveyCoveredWay(String actualsurveyCoveredWay) {
        this.actualsurveyCoveredWay = actualsurveyCoveredWay == null ? null : actualsurveyCoveredWay.trim();
    }

    public String getActualsurveyLogicCell() {
        return actualsurveyLogicCell;
    }

    public void setActualsurveyLogicCell(String actualsurveyLogicCell) {
        this.actualsurveyLogicCell = actualsurveyLogicCell == null ? null : actualsurveyLogicCell.trim();
    }

    public String getActualsurveyPhysicsCell() {
        return actualsurveyPhysicsCell;
    }

    public void setActualsurveyPhysicsCell(String actualsurveyPhysicsCell) {
        this.actualsurveyPhysicsCell = actualsurveyPhysicsCell == null ? null : actualsurveyPhysicsCell.trim();
    }

    public String getActualsurveyLongitude() {
        return actualsurveyLongitude;
    }

    public void setActualsurveyLongitude(String actualsurveyLongitude) {
        this.actualsurveyLongitude = actualsurveyLongitude == null ? null : actualsurveyLongitude.trim();
    }

    public String getActualsurveyLatitude() {
        return actualsurveyLatitude;
    }

    public void setActualsurveyLatitude(String actualsurveyLatitude) {
        this.actualsurveyLatitude = actualsurveyLatitude == null ? null : actualsurveyLatitude.trim();
    }

    public String getActualsurveyHanging() {
        return actualsurveyHanging;
    }

    public void setActualsurveyHanging(String actualsurveyHanging) {
        this.actualsurveyHanging = actualsurveyHanging == null ? null : actualsurveyHanging.trim();
    }

    public Integer getRecentStationSpacing() {
        return recentStationSpacing;
    }

    public void setRecentStationSpacing(Integer recentStationSpacing) {
        this.recentStationSpacing = recentStationSpacing;
    }

    public String getRecentStationCellname() {
        return recentStationCellname;
    }

    public void setRecentStationCellname(String recentStationCellname) {
        this.recentStationCellname = recentStationCellname == null ? null : recentStationCellname.trim();
    }

    public String getActualsurveyBand() {
        return actualsurveyBand;
    }

    public void setActualsurveyBand(String actualsurveyBand) {
        this.actualsurveyBand = actualsurveyBand == null ? null : actualsurveyBand.trim();
    }

    public String getActualsurveyBearing() {
        return actualsurveyBearing;
    }

    public void setActualsurveyBearing(String actualsurveyBearing) {
        this.actualsurveyBearing = actualsurveyBearing == null ? null : actualsurveyBearing.trim();
    }

    public String getActualsurveyDowntilt() {
        return actualsurveyDowntilt;
    }

    public void setActualsurveyDowntilt(String actualsurveyDowntilt) {
        this.actualsurveyDowntilt = actualsurveyDowntilt == null ? null : actualsurveyDowntilt.trim();
    }

    public Integer getActualsurveyCount() {
        return actualsurveyCount;
    }

    public void setActualsurveyCount(Integer actualsurveyCount) {
        this.actualsurveyCount = actualsurveyCount;
    }

    public String getEntrustTt() {
        return entrustTt;
    }

    public void setEntrustTt(String entrustTt) {
        this.entrustTt = entrustTt == null ? null : entrustTt.trim();
    }

    public String getDockingIspassTt() {
        return dockingIspassTt;
    }

    public void setDockingIspassTt(String dockingIspassTt) {
        this.dockingIspassTt = dockingIspassTt == null ? null : dockingIspassTt.trim();
    }

    public Date getJoinTimeTt() {
        return joinTimeTt;
    }

    public void setJoinTimeTt(Date joinTimeTt) {
        this.joinTimeTt = joinTimeTt;
    }

    public String getDockingDismissReasonType() {
        return dockingDismissReasonType;
    }

    public void setDockingDismissReasonType(String dockingDismissReasonType) {
        this.dockingDismissReasonType = dockingDismissReasonType == null ? null : dockingDismissReasonType.trim();
    }

    public String getDockingDismissMsg() {
        return dockingDismissMsg;
    }

    public void setDockingDismissMsg(String dockingDismissMsg) {
        this.dockingDismissMsg = dockingDismissMsg == null ? null : dockingDismissMsg.trim();
    }

    public String getCelldistanceMigration() {
        return celldistanceMigration;
    }

    public void setCelldistanceMigration(String celldistanceMigration) {
        this.celldistanceMigration = celldistanceMigration == null ? null : celldistanceMigration.trim();
    }

    public String getIsexistChange() {
        return isexistChange;
    }

    public void setIsexistChange(String isexistChange) {
        this.isexistChange = isexistChange == null ? null : isexistChange.trim();
    }

    public String getChangedReasonType() {
        return changedReasonType;
    }

    public void setChangedReasonType(String changedReasonType) {
        this.changedReasonType = changedReasonType == null ? null : changedReasonType.trim();
    }

    public String getChangedReasonMsg() {
        return changedReasonMsg;
    }

    public void setChangedReasonMsg(String changedReasonMsg) {
        this.changedReasonMsg = changedReasonMsg == null ? null : changedReasonMsg.trim();
    }

    public Date getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(Date changedTime) {
        this.changedTime = changedTime;
    }

    public String getSurveyGauditIspass() {
        return surveyGauditIspass;
    }

    public void setSurveyGauditIspass(String surveyGauditIspass) {
        this.surveyGauditIspass = surveyGauditIspass == null ? null : surveyGauditIspass.trim();
    }

    public String getSurveyDismissReasonType() {
        return surveyDismissReasonType;
    }

    public void setSurveyDismissReasonType(String surveyDismissReasonType) {
        this.surveyDismissReasonType = surveyDismissReasonType == null ? null : surveyDismissReasonType.trim();
    }

    public String getSurveyGauditMsg() {
        return surveyGauditMsg;
    }

    public void setSurveyGauditMsg(String surveyGauditMsg) {
        this.surveyGauditMsg = surveyGauditMsg == null ? null : surveyGauditMsg.trim();
    }

    public String getCanSubmitTriage() {
        return canSubmitTriage;
    }

    public void setCanSubmitTriage(String canSubmitTriage) {
        this.canSubmitTriage = canSubmitTriage == null ? null : canSubmitTriage.trim();
    }

    public String getTriageBatch() {
        return triageBatch;
    }

    public void setTriageBatch(String triageBatch) {
        this.triageBatch = triageBatch == null ? null : triageBatch.trim();
    }

    public Integer getTriageCount() {
        return triageCount;
    }

    public void setTriageCount(Integer triageCount) {
        this.triageCount = triageCount;
    }

    public String getTriageLogicCell() {
        return triageLogicCell;
    }

    public void setTriageLogicCell(String triageLogicCell) {
        this.triageLogicCell = triageLogicCell == null ? null : triageLogicCell.trim();
    }

    public String getTriagePhysicsCell() {
        return triagePhysicsCell;
    }

    public void setTriagePhysicsCell(String triagePhysicsCell) {
        this.triagePhysicsCell = triagePhysicsCell == null ? null : triagePhysicsCell.trim();
    }

    public String getTriageLongitude() {
        return triageLongitude;
    }

    public void setTriageLongitude(String triageLongitude) {
        this.triageLongitude = triageLongitude == null ? null : triageLongitude.trim();
    }

    public String getTriageLatitude() {
        return triageLatitude;
    }

    public void setTriageLatitude(String triageLatitude) {
        this.triageLatitude = triageLatitude == null ? null : triageLatitude.trim();
    }

    public String getTriageBand() {
        return triageBand;
    }

    public void setTriageBand(String triageBand) {
        this.triageBand = triageBand == null ? null : triageBand.trim();
    }

    public String getTriageHanging() {
        return triageHanging;
    }

    public void setTriageHanging(String triageHanging) {
        this.triageHanging = triageHanging == null ? null : triageHanging.trim();
    }

    public String getTriageBearing() {
        return triageBearing;
    }

    public void setTriageBearing(String triageBearing) {
        this.triageBearing = triageBearing == null ? null : triageBearing.trim();
    }

    public String getTriageMachineDowntilt() {
        return triageMachineDowntilt;
    }

    public void setTriageMachineDowntilt(String triageMachineDowntilt) {
        this.triageMachineDowntilt = triageMachineDowntilt == null ? null : triageMachineDowntilt.trim();
    }

    public String getTriagePrefabelectronDowntilt() {
        return triagePrefabelectronDowntilt;
    }

    public void setTriagePrefabelectronDowntilt(String triagePrefabelectronDowntilt) {
        this.triagePrefabelectronDowntilt = triagePrefabelectronDowntilt == null ? null : triagePrefabelectronDowntilt.trim();
    }

    public String getTriageElectronDowntilt() {
        return triageElectronDowntilt;
    }

    public void setTriageElectronDowntilt(String triageElectronDowntilt) {
        this.triageElectronDowntilt = triageElectronDowntilt == null ? null : triageElectronDowntilt.trim();
    }

    public Integer getTriageCelldistanceMigration() {
        return triageCelldistanceMigration;
    }

    public void setTriageCelldistanceMigration(Integer triageCelldistanceMigration) {
        this.triageCelldistanceMigration = triageCelldistanceMigration;
    }

    public Integer getTriageRecentStationSpacing() {
        return triageRecentStationSpacing;
    }

    public void setTriageRecentStationSpacing(Integer triageRecentStationSpacing) {
        this.triageRecentStationSpacing = triageRecentStationSpacing;
    }

    public String getTriageStationCellname() {
        return triageStationCellname;
    }

    public void setTriageStationCellname(String triageStationCellname) {
        this.triageStationCellname = triageStationCellname == null ? null : triageStationCellname.trim();
    }

    public String getTriageCellResourceType() {
        return triageCellResourceType;
    }

    public void setTriageCellResourceType(String triageCellResourceType) {
        this.triageCellResourceType = triageCellResourceType == null ? null : triageCellResourceType.trim();
    }

    public String getTriageColocationType() {
        return triageColocationType;
    }

    public void setTriageColocationType(String triageColocationType) {
        this.triageColocationType = triageColocationType == null ? null : triageColocationType.trim();
    }

    public String getTriageFillIspass() {
        return triageFillIspass;
    }

    public void setTriageFillIspass(String triageFillIspass) {
        this.triageFillIspass = triageFillIspass == null ? null : triageFillIspass.trim();
    }

    public String getTriageDismissReasonType() {
        return triageDismissReasonType;
    }

    public void setTriageDismissReasonType(String triageDismissReasonType) {
        this.triageDismissReasonType = triageDismissReasonType == null ? null : triageDismissReasonType.trim();
    }

    public String getTriageFillMsg() {
        return triageFillMsg;
    }

    public void setTriageFillMsg(String triageFillMsg) {
        this.triageFillMsg = triageFillMsg == null ? null : triageFillMsg.trim();
    }

    public String getProvinceGauditIspass() {
        return provinceGauditIspass;
    }

    public void setProvinceGauditIspass(String provinceGauditIspass) {
        this.provinceGauditIspass = provinceGauditIspass == null ? null : provinceGauditIspass.trim();
    }

    public String getProvinceDismissReasonType() {
        return provinceDismissReasonType;
    }

    public void setProvinceDismissReasonType(String provinceDismissReasonType) {
        this.provinceDismissReasonType = provinceDismissReasonType == null ? null : provinceDismissReasonType.trim();
    }

    public String getProvinceGauditMsg() {
        return provinceGauditMsg;
    }

    public void setProvinceGauditMsg(String provinceGauditMsg) {
        this.provinceGauditMsg = provinceGauditMsg == null ? null : provinceGauditMsg.trim();
    }

    public String getPmGauditIspass() {
        return pmGauditIspass;
    }

    public void setPmGauditIspass(String pmGauditIspass) {
        this.pmGauditIspass = pmGauditIspass == null ? null : pmGauditIspass.trim();
    }

    public String getPmFillMsg() {
        return pmFillMsg;
    }

    public void setPmFillMsg(String pmFillMsg) {
        this.pmFillMsg = pmFillMsg == null ? null : pmFillMsg.trim();
    }

    public String getCanSubmitRegaudit() {
        return canSubmitRegaudit;
    }

    public void setCanSubmitRegaudit(String canSubmitRegaudit) {
        this.canSubmitRegaudit = canSubmitRegaudit == null ? null : canSubmitRegaudit.trim();
    }

    public String getSubmitRegauditReasonType() {
        return submitRegauditReasonType;
    }

    public void setSubmitRegauditReasonType(String submitRegauditReasonType) {
        this.submitRegauditReasonType = submitRegauditReasonType == null ? null : submitRegauditReasonType.trim();
    }

    public String getSubmitRegauditMsg() {
        return submitRegauditMsg;
    }

    public void setSubmitRegauditMsg(String submitRegauditMsg) {
        this.submitRegauditMsg = submitRegauditMsg == null ? null : submitRegauditMsg.trim();
    }

    public String getRegauditRequestIspass() {
        return regauditRequestIspass;
    }

    public void setRegauditRequestIspass(String regauditRequestIspass) {
        this.regauditRequestIspass = regauditRequestIspass == null ? null : regauditRequestIspass.trim();
    }

    public String getAuditOpinionType() {
        return auditOpinionType;
    }

    public void setAuditOpinionType(String auditOpinionType) {
        this.auditOpinionType = auditOpinionType == null ? null : auditOpinionType.trim();
    }

    public String getAuditOpinionMsg() {
        return auditOpinionMsg;
    }

    public void setAuditOpinionMsg(String auditOpinionMsg) {
        this.auditOpinionMsg = auditOpinionMsg == null ? null : auditOpinionMsg.trim();
    }

    public String getDemandSource() {
        return demandSource;
    }

    public void setDemandSource(String demandSource) {
        this.demandSource = demandSource == null ? null : demandSource.trim();
    }

    public String getDemandReference() {
        return demandReference;
    }

    public void setDemandReference(String demandReference) {
        this.demandReference = demandReference == null ? null : demandReference.trim();
    }

    public String getDemandPriority() {
        return demandPriority;
    }

    public void setDemandPriority(String demandPriority) {
        this.demandPriority = demandPriority == null ? null : demandPriority.trim();
    }

    public BigDecimal getDemandLongitude() {
        return demandLongitude;
    }

    public void setDemandLongitude(BigDecimal demandLongitude) {
        this.demandLongitude = demandLongitude;
    }

    public BigDecimal getDemandLatitude() {
        return demandLatitude;
    }

    public void setDemandLatitude(BigDecimal demandLatitude) {
        this.demandLatitude = demandLatitude;
    }

    public String getWorkingLongitude() {
        return workingLongitude;
    }

    public void setWorkingLongitude(String workingLongitude) {
        this.workingLongitude = workingLongitude == null ? null : workingLongitude.trim();
    }

    public String getWorkingLatitude() {
        return workingLatitude;
    }

    public void setWorkingLatitude(String workingLatitude) {
        this.workingLatitude = workingLatitude == null ? null : workingLatitude.trim();
    }

    public String getWorkingHanging() {
        return workingHanging;
    }

    public void setWorkingHanging(String workingHanging) {
        this.workingHanging = workingHanging == null ? null : workingHanging.trim();
    }

    public Integer getWorkingCount() {
        return workingCount;
    }

    public void setWorkingCount(Integer workingCount) {
        this.workingCount = workingCount;
    }

    public String getDockingIspassReasonType() {
        return dockingIspassReasonType;
    }

    public void setDockingIspassReasonType(String dockingIspassReasonType) {
        this.dockingIspassReasonType = dockingIspassReasonType == null ? null : dockingIspassReasonType.trim();
    }

    public String getDockingIspassMsg() {
        return dockingIspassMsg;
    }

    public void setDockingIspassMsg(String dockingIspassMsg) {
        this.dockingIspassMsg = dockingIspassMsg == null ? null : dockingIspassMsg.trim();
    }

    public Date getDeliverycheckPassTime() {
        return deliverycheckPassTime;
    }

    public void setDeliverycheckPassTime(Date deliverycheckPassTime) {
        this.deliverycheckPassTime = deliverycheckPassTime;
    }

    public String getDelcheckDismissReasonType() {
        return delcheckDismissReasonType;
    }

    public void setDelcheckDismissReasonType(String delcheckDismissReasonType) {
        this.delcheckDismissReasonType = delcheckDismissReasonType == null ? null : delcheckDismissReasonType.trim();
    }

    public String getDelcheckDismissMsg() {
        return delcheckDismissMsg;
    }

    public void setDelcheckDismissMsg(String delcheckDismissMsg) {
        this.delcheckDismissMsg = delcheckDismissMsg == null ? null : delcheckDismissMsg.trim();
    }

    public Integer getIssitebuilder() {
        return issitebuilder;
    }

    public void setIssitebuilder(Integer issitebuilder) {
        this.issitebuilder = issitebuilder;
    }

    public Date getHandoverTime() {
        return handoverTime;
    }

    public void setHandoverTime(Date handoverTime) {
        this.handoverTime = handoverTime;
    }

    public Date getPlanningUpdateDate() {
        return planningUpdateDate;
    }

    public void setPlanningUpdateDate(Date planningUpdateDate) {
        this.planningUpdateDate = planningUpdateDate;
    }

    public Date getAuditygUpdateDate() {
        return auditygUpdateDate;
    }

    public void setAuditygUpdateDate(Date auditygUpdateDate) {
        this.auditygUpdateDate = auditygUpdateDate;
    }

    public Date getCompleteUpdateDate() {
        return completeUpdateDate;
    }

    public void setCompleteUpdateDate(Date completeUpdateDate) {
        this.completeUpdateDate = completeUpdateDate;
    }

    public Date getPlanningauditUpdateDate() {
        return planningauditUpdateDate;
    }

    public void setPlanningauditUpdateDate(Date planningauditUpdateDate) {
        this.planningauditUpdateDate = planningauditUpdateDate;
    }

    public Date getEntrustUpdateDate() {
        return entrustUpdateDate;
    }

    public void setEntrustUpdateDate(Date entrustUpdateDate) {
        this.entrustUpdateDate = entrustUpdateDate;
    }

    public Date getSeaffirmUpdateDate() {
        return seaffirmUpdateDate;
    }

    public void setSeaffirmUpdateDate(Date seaffirmUpdateDate) {
        this.seaffirmUpdateDate = seaffirmUpdateDate;
    }

    public Date getActualinfoUpdateDate() {
        return actualinfoUpdateDate;
    }

    public void setActualinfoUpdateDate(Date actualinfoUpdateDate) {
        this.actualinfoUpdateDate = actualinfoUpdateDate;
    }

    public Date getAuditsurveyUpdateDate() {
        return auditsurveyUpdateDate;
    }

    public void setAuditsurveyUpdateDate(Date auditsurveyUpdateDate) {
        this.auditsurveyUpdateDate = auditsurveyUpdateDate;
    }

    public Date getTriageUpdateDate() {
        return triageUpdateDate;
    }

    public void setTriageUpdateDate(Date triageUpdateDate) {
        this.triageUpdateDate = triageUpdateDate;
    }

    public Date getSectriageUpdateDate() {
        return sectriageUpdateDate;
    }

    public void setSectriageUpdateDate(Date sectriageUpdateDate) {
        this.sectriageUpdateDate = sectriageUpdateDate;
    }

    public String getHangingMigration() {
        return hangingMigration;
    }

    public void setHangingMigration(String hangingMigration) {
        this.hangingMigration = hangingMigration == null ? null : hangingMigration.trim();
    }

    public String getIsReform() {
        return isReform;
    }

    public void setIsReform(String isReform) {
        this.isReform = isReform == null ? null : isReform.trim();
    }

    public String getReformMsg() {
        return reformMsg;
    }

    public void setReformMsg(String reformMsg) {
        this.reformMsg = reformMsg == null ? null : reformMsg.trim();
    }

    public String getReformFrom() {
        return reformFrom;
    }

    public void setReformFrom(String reformFrom) {
        this.reformFrom = reformFrom == null ? null : reformFrom.trim();
    }

    public String getReformType() {
        return reformType;
    }

    public void setReformType(String reformType) {
        this.reformType = reformType == null ? null : reformType.trim();
    }

    public String getReformCell() {
        return reformCell;
    }

    public void setReformCell(String reformCell) {
        this.reformCell = reformCell == null ? null : reformCell.trim();
    }

    public String getReformLongtitude() {
        return reformLongtitude;
    }

    public void setReformLongtitude(String reformLongtitude) {
        this.reformLongtitude = reformLongtitude == null ? null : reformLongtitude.trim();
    }

    public String getReformLatitude() {
        return reformLatitude;
    }

    public void setReformLatitude(String reformLatitude) {
        this.reformLatitude = reformLatitude == null ? null : reformLatitude.trim();
    }

    public String getReformBand() {
        return reformBand;
    }

    public void setReformBand(String reformBand) {
        this.reformBand = reformBand == null ? null : reformBand.trim();
    }

    public String getReformHanging() {
        return reformHanging;
    }

    public void setReformHanging(String reformHanging) {
        this.reformHanging = reformHanging == null ? null : reformHanging.trim();
    }

    public String getReformGauditIspass() {
        return reformGauditIspass;
    }

    public void setReformGauditIspass(String reformGauditIspass) {
        this.reformGauditIspass = reformGauditIspass == null ? null : reformGauditIspass.trim();
    }

    public String getReformGauditMsg() {
        return reformGauditMsg;
    }

    public void setReformGauditMsg(String reformGauditMsg) {
        this.reformGauditMsg = reformGauditMsg == null ? null : reformGauditMsg.trim();
    }

    public String getReformCompleteTime() {
        return reformCompleteTime;
    }

    public void setReformCompleteTime(String reformCompleteTime) {
        this.reformCompleteTime = reformCompleteTime == null ? null : reformCompleteTime.trim();
    }

    public String getIsExpand() {
        return isExpand;
    }

    public void setIsExpand(String isExpand) {
        this.isExpand = isExpand == null ? null : isExpand.trim();
    }

    public String getCurrentBand() {
        return currentBand;
    }

    public void setCurrentBand(String currentBand) {
        this.currentBand = currentBand == null ? null : currentBand.trim();
    }

    public String getAddorminusBand() {
        return addorminusBand;
    }

    public void setAddorminusBand(String addorminusBand) {
        this.addorminusBand = addorminusBand == null ? null : addorminusBand.trim();
    }

    public String getExpandRequireFrom() {
        return expandRequireFrom;
    }

    public void setExpandRequireFrom(String expandRequireFrom) {
        this.expandRequireFrom = expandRequireFrom == null ? null : expandRequireFrom.trim();
    }

    public String getExpandRequireTime() {
        return expandRequireTime;
    }

    public void setExpandRequireTime(String expandRequireTime) {
        this.expandRequireTime = expandRequireTime == null ? null : expandRequireTime.trim();
    }

    public String getExpandGauditIspass() {
        return expandGauditIspass;
    }

    public void setExpandGauditIspass(String expandGauditIspass) {
        this.expandGauditIspass = expandGauditIspass == null ? null : expandGauditIspass.trim();
    }

    public String getExpandGauditMsg() {
        return expandGauditMsg;
    }

    public void setExpandGauditMsg(String expandGauditMsg) {
        this.expandGauditMsg = expandGauditMsg == null ? null : expandGauditMsg.trim();
    }

    public String getExpandTriageTime() {
        return expandTriageTime;
    }

    public void setExpandTriageTime(String expandTriageTime) {
        this.expandTriageTime = expandTriageTime == null ? null : expandTriageTime.trim();
    }

    public String getExpandForceTime() {
        return expandForceTime;
    }

    public void setExpandForceTime(String expandForceTime) {
        this.expandForceTime = expandForceTime == null ? null : expandForceTime.trim();
    }

    public String getBuildSchedule() {
        return buildSchedule;
    }

    public void setBuildSchedule(String buildSchedule) {
        this.buildSchedule = buildSchedule == null ? null : buildSchedule.trim();
    }

    public String getIsSubmitBuildReq() {
        return isSubmitBuildReq;
    }

    public void setIsSubmitBuildReq(String isSubmitBuildReq) {
        this.isSubmitBuildReq = isSubmitBuildReq == null ? null : isSubmitBuildReq.trim();
    }

    public Date getBuildreqUpdateDate() {
        return buildreqUpdateDate;
    }

    public void setBuildreqUpdateDate(Date buildreqUpdateDate) {
        this.buildreqUpdateDate = buildreqUpdateDate;
    }

    public String getSwyKyAuditIspass() {
        return swyKyAuditIspass;
    }

    public void setSwyKyAuditIspass(String swyKyAuditIspass) {
        this.swyKyAuditIspass = swyKyAuditIspass == null ? null : swyKyAuditIspass.trim();
    }

    public String getSwyKyAuditReasonType() {
        return swyKyAuditReasonType;
    }

    public void setSwyKyAuditReasonType(String swyKyAuditReasonType) {
        this.swyKyAuditReasonType = swyKyAuditReasonType == null ? null : swyKyAuditReasonType.trim();
    }

    public String getSwyKyAuditMsg() {
        return swyKyAuditMsg;
    }

    public void setSwyKyAuditMsg(String swyKyAuditMsg) {
        this.swyKyAuditMsg = swyKyAuditMsg == null ? null : swyKyAuditMsg.trim();
    }

    public Date getKyauditUpdateDate() {
        return kyauditUpdateDate;
    }

    public void setKyauditUpdateDate(Date kyauditUpdateDate) {
        this.kyauditUpdateDate = kyauditUpdateDate;
    }

    public String getParamEnodebId() {
        return paramEnodebId;
    }

    public void setParamEnodebId(String paramEnodebId) {
        this.paramEnodebId = paramEnodebId == null ? null : paramEnodebId.trim();
    }

    public String getParamCellName() {
        return paramCellName;
    }

    public void setParamCellName(String paramCellName) {
        this.paramCellName = paramCellName == null ? null : paramCellName.trim();
    }

    public String getParamCellId() {
        return paramCellId;
    }

    public void setParamCellId(String paramCellId) {
        this.paramCellId = paramCellId == null ? null : paramCellId.trim();
    }

    public String getParamPci() {
        return paramPci;
    }

    public void setParamPci(String paramPci) {
        this.paramPci = paramPci == null ? null : paramPci.trim();
    }

    public String getParamTac() {
        return paramTac;
    }

    public void setParamTac(String paramTac) {
        this.paramTac = paramTac == null ? null : paramTac.trim();
    }

    public Date getParamconfigUpdateDate() {
        return paramconfigUpdateDate;
    }

    public void setParamconfigUpdateDate(Date paramconfigUpdateDate) {
        this.paramconfigUpdateDate = paramconfigUpdateDate;
    }

    public String getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(String cellStatus) {
        this.cellStatus = cellStatus == null ? null : cellStatus.trim();
    }

    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus == null ? null : resourceStatus.trim();
    }

    public Date getResourceTime() {
        return resourceTime;
    }

    public void setResourceTime(Date resourceTime) {
        this.resourceTime = resourceTime;
    }

    public String getHaveChangeReport() {
        return haveChangeReport;
    }

    public void setHaveChangeReport(String haveChangeReport) {
        this.haveChangeReport = haveChangeReport == null ? null : haveChangeReport.trim();
    }

    public String getIsBeautifyAntenna() {
        return isBeautifyAntenna;
    }

    public void setIsBeautifyAntenna(String isBeautifyAntenna) {
        this.isBeautifyAntenna = isBeautifyAntenna == null ? null : isBeautifyAntenna.trim();
    }

    public String getBeautifyAntennaType() {
        return beautifyAntennaType;
    }

    public void setBeautifyAntennaType(String beautifyAntennaType) {
        this.beautifyAntennaType = beautifyAntennaType == null ? null : beautifyAntennaType.trim();
    }

    public String getIsEledownAntenna() {
        return isEledownAntenna;
    }

    public void setIsEledownAntenna(String isEledownAntenna) {
        this.isEledownAntenna = isEledownAntenna == null ? null : isEledownAntenna.trim();
    }

    public String getEledownAntennaType() {
        return eledownAntennaType;
    }

    public void setEledownAntennaType(String eledownAntennaType) {
        this.eledownAntennaType = eledownAntennaType == null ? null : eledownAntennaType.trim();
    }

    public Integer getPlanningSectorCount() {
        return planningSectorCount;
    }

    public void setPlanningSectorCount(Integer planningSectorCount) {
        this.planningSectorCount = planningSectorCount;
    }

    public Integer getActualsurveySectorCount() {
        return actualsurveySectorCount;
    }

    public void setActualsurveySectorCount(Integer actualsurveySectorCount) {
        this.actualsurveySectorCount = actualsurveySectorCount;
    }

    public Integer getActualsurveyCellCount() {
        return actualsurveyCellCount;
    }

    public void setActualsurveyCellCount(Integer actualsurveyCellCount) {
        this.actualsurveyCellCount = actualsurveyCellCount;
    }

    public String getIsConfigparam() {
        return isConfigparam;
    }

    public void setIsConfigparam(String isConfigparam) {
        this.isConfigparam = isConfigparam == null ? null : isConfigparam.trim();
    }

    public Integer getParamIsAuto() {
        return paramIsAuto;
    }

    public void setParamIsAuto(Integer paramIsAuto) {
        this.paramIsAuto = paramIsAuto;
    }

    public String getSystemStandard() {
        return systemStandard;
    }

    public void setSystemStandard(String systemStandard) {
        this.systemStandard = systemStandard == null ? null : systemStandard.trim();
    }

    public String getOpensiteType() {
        return opensiteType;
    }

    public void setOpensiteType(String opensiteType) {
        this.opensiteType = opensiteType == null ? null : opensiteType.trim();
    }

    public String getIsSupportNbiot() {
        return isSupportNbiot;
    }

    public void setIsSupportNbiot(String isSupportNbiot) {
        this.isSupportNbiot = isSupportNbiot == null ? null : isSupportNbiot.trim();
    }

    public Integer getIsRefreshRemoval() {
        return isRefreshRemoval;
    }

    public void setIsRefreshRemoval(Integer isRefreshRemoval) {
        this.isRefreshRemoval = isRefreshRemoval;
    }

    public Integer getIsInterfaceReturn() {
        return isInterfaceReturn;
    }

    public void setIsInterfaceReturn(Integer isInterfaceReturn) {
        this.isInterfaceReturn = isInterfaceReturn;
    }
}