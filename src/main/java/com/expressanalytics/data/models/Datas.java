package com.expressanalytics.data.models;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table
public class Datas {
	
	@Id
	private String code;
	private String codeHRIS;
	private String name;
	private String abbrName;
	private String regNo;
	private String logo;
	@Temporal(TemporalType.DATE)
    private Date activeDate;
	private boolean isActive;
	@Temporal(TemporalType.DATE)
    private Date createdOn;
	private String createdBy;
	@Temporal(TemporalType.DATE)
    private Date lastModifiedOn;
	private String lastModifiedBy;
	private String deactivatedBy;
	@Temporal(TemporalType.DATE)
    private Date deactivatedOn;
	private String reactivatedBy;
	@Temporal(TemporalType.DATE)
    private Date reactivatedOn;
	
	public Datas() {
		
	}
	
	public Datas(String code, String codeHRIS, String name, String abbrName, String regNo, String logo,
			Date activeDate, boolean isActive, Date createdOn, String createdBy, Date lastModifiedOn,
			String lastModifiedBy, String deactivatedBy, Date deactivatedOn, String reactivatedBy,
			Date reactivatedOn) {
		super();
		this.code = code;
		this.codeHRIS = codeHRIS;
		this.name = name;
		this.abbrName = abbrName;
		this.regNo = regNo;
		this.logo = logo;
		this.activeDate = activeDate;
		this.isActive = isActive;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.lastModifiedOn = lastModifiedOn;
		this.lastModifiedBy = lastModifiedBy;
		this.deactivatedBy = deactivatedBy;
		this.deactivatedOn = deactivatedOn;
		this.reactivatedBy = reactivatedBy;
		this.reactivatedOn = reactivatedOn;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeHRIS() {
		return codeHRIS;
	}

	public void setCodeHRIS(String codeHRIS) {
		this.codeHRIS = codeHRIS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(String abbrName) {
		this.abbrName = abbrName;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Date getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getDeactivatedBy() {
		return deactivatedBy;
	}

	public void setDeactivatedBy(String deactivatedBy) {
		this.deactivatedBy = deactivatedBy;
	}

	public Date getDeactivatedOn() {
		return deactivatedOn;
	}

	public void setDeactivatedOn(Date deactivatedOn) {
		this.deactivatedOn = deactivatedOn;
	}

	public String getReactivatedBy() {
		return reactivatedBy;
	}

	public void setReactivatedBy(String reactivatedBy) {
		this.reactivatedBy = reactivatedBy;
	}

	public Date getReactivatedOn() {
		return reactivatedOn;
	}

	public void setReactivatedOn(Date reactivatedOn) {
		this.reactivatedOn = reactivatedOn;
	}
}
