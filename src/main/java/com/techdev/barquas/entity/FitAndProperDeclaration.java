package com.techdev.barquas.entity;

import java.util.Date;

public class FitAndProperDeclaration extends Declaration {
	
	private String individualFitAndProperUid;
	private Date individualFitAndProperDate;
	private String managerApprovalUid;
	private String managerApprovalDate;
	private String complianceApprovalUid;
	
	
	
	
	
	public String getIndividualFitAndProperUid() {
		return individualFitAndProperUid;
	}
	public void setIndividualFitAndProperUid(String individualFitAndProperUid) {
		this.individualFitAndProperUid = individualFitAndProperUid;
	}
	public Date getIndividualFitAndProperDate() {
		return individualFitAndProperDate;
	}
	public void setIndividualFitAndProperDate(Date individualFitAndProperDate) {
		this.individualFitAndProperDate = individualFitAndProperDate;
	}
	public String getManagerApprovalUid() {
		return managerApprovalUid;
	}
	public void setManagerApprovalUid(String managerApprovalUid) {
		this.managerApprovalUid = managerApprovalUid;
	}
	public String getManagerApprovalDate() {
		return managerApprovalDate;
	}
	public void setManagerApprovalDate(String managerApprovalDate) {
		this.managerApprovalDate = managerApprovalDate;
	}
	public String getComplianceApprovalUid() {
		return complianceApprovalUid;
	}
	public void setComplianceApprovalUid(String complianceApprovalUid) {
		this.complianceApprovalUid = complianceApprovalUid;
	}
	public String getComplianceApprovalDate() {
		return complianceApprovalDate;
	}
	public void setComplianceApprovalDate(String complianceApprovalDate) {
		this.complianceApprovalDate = complianceApprovalDate;
	}
	private String complianceApprovalDate;
	
	
}
