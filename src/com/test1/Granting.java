package com.test1;

public class Granting {
	private long grantingId;
	private String code;
	private String grantingName;
	private String grantingDef;
	private String issueDate;
	private String benefits;
	private String maturityDate;
	private String veerifications;
	private String creationDate;
	private String modifiedDate;

	public Granting() {

	}

	public Granting(long grantingId, String code, String grantingName, String grantingDef, String issueDate,
			String benefits, String maturityDate, String veerifications, String creationDate, String modifiedDate) {
		super();
		this.grantingId = grantingId;
		this.code = code;
		this.grantingName = grantingName;
		this.grantingDef = grantingDef;
		this.issueDate = issueDate;
		this.benefits = benefits;
		this.maturityDate = maturityDate;
		this.veerifications = veerifications;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public long getGrantingId() {
		return grantingId;
	}

	public void setGrantingId(long grantingId) {
		this.grantingId = grantingId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGrantingName() {
		return grantingName;
	}

	public void setGrantingName(String grantingName) {
		this.grantingName = grantingName;
	}

	public String getGrantingDef() {
		return grantingDef;
	}

	public void setGrantingDef(String grantingDef) {
		this.grantingDef = grantingDef;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getVeerifications() {
		return veerifications;
	}

	public void setVeerifications(String veerifications) {
		this.veerifications = veerifications;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
