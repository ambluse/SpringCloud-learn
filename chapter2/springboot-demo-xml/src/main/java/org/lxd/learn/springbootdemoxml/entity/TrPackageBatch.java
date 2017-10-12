package org.lxd.learn.springbootdemoxml.entity;

public class TrPackageBatch {

	private Integer relId;
	
	private Integer packageId;
	
	private Integer batchId;
	
	private Integer grantCount;

	public Integer getRelId() {
		return relId;
	}

	public void setRelId(Integer relId) {
		this.relId = relId;
	}

	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public Integer getgrantCount() {
		return grantCount;
	}

	public void setgrantCount(Integer grantCount) {
		this.grantCount = grantCount;
	}

	public TrPackageBatch( Integer packageId, Integer batchId, Integer grantCount) {
		this.packageId = packageId;
		this.batchId = batchId;
		this.grantCount = grantCount;
	}

	public TrPackageBatch(Integer relId, Integer packageId, Integer batchId, Integer grantCount) {
		super();
		this.relId = relId;
		this.packageId = packageId;
		this.batchId = batchId;
		this.grantCount = grantCount;
	}
	
	
	
	
		
	
	
}
