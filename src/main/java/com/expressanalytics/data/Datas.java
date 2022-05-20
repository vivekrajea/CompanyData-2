package com.expressanalytics.data;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String activeDate;
	private String isActive;
	private String createdOn;
	private String createdBy;
	private String lastModifiedOn;
	private String lastModifiedBy;
	private String deactivatedBy;
	private String deactivatedOn;
	private String reactivatedBy;
	private String reactivatedOn;
	
	public Datas() {
		
	}
	
	public Datas(String code, String codeHRIS, String name, String abbrName, String regNo, String logo,
			String activeDate, String isActive, String createdOn, String createdBy, String lastModifiedOn,
			String lastModifiedBy, String deactivatedBy, String deactivatedOn, String reactivatedBy,
			String reactivatedOn) {
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

	public String getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(String activeDate) {
		this.activeDate = activeDate;
	}

	public String isActive() {
		return isActive;
	}

	public void setActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(String lastModifiedOn) {
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

	public String getDeactivatedOn() {
		return deactivatedOn;
	}

	public void setDeactivatedOn(String deactivatedOn) {
		this.deactivatedOn = deactivatedOn;
	}

	public String getReactivatedBy() {
		return reactivatedBy;
	}

	public void setReactivatedBy(String reactivatedBy) {
		this.reactivatedBy = reactivatedBy;
	}

	public String getReactivatedOn() {
		return reactivatedOn;
	}

	public void setReactivatedOn(String reactivatedOn) {
		this.reactivatedOn = reactivatedOn;
	}
}
