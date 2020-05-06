package com.techdev.barquas.entity;

public class Declaration {

	private long declarationId;
	private String declarantId;
	private String createdBy;
	private String urn;
	private String status;
	private String title;
	private String candidateAsList;
	private String candidate;
	public long getDeclarationId() {
		return declarationId;
	}
	public void setDeclarationId(long declarationId) {
		this.declarationId = declarationId;
	}
	public String getDeclarantId() {
		return declarantId;
	}
	public void setDeclarantId(String declarantId) {
		this.declarantId = declarantId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUrn() {
		return urn;
	}
	public void setUrn(String urn) {
		this.urn = urn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCandidateAsList() {
		return candidateAsList;
	}
	public void setCandidateAsList(String candidateAsList) {
		this.candidateAsList = candidateAsList;
	}
	public String getCandidate() {
		return candidate;
	}
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}

}
