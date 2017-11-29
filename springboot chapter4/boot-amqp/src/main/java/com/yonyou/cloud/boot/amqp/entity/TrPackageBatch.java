package com.yonyou.cloud.boot.amqp.entity;

import javax.persistence.*;

@Table(name = "TR_PACKAGE_BATCH")
public class TrPackageBatch {
    @Id
    @Column(name = "REL_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer relId;

    @Column(name = "PACKAGE_ID")
    private Integer packageId;

    @Column(name = "BATCH_ID")
    private Integer batchId;

    @Column(name = "GRANT_COUNT")
    private Integer grantCount;

    /**
     * @return REL_ID
     */
    public Integer getRelId() {
        return relId;
    }

    /**
     * @param relId
     */
    public void setRelId(Integer relId) {
        this.relId = relId;
    }

    /**
     * @return PACKAGE_ID
     */
    public Integer getPackageId() {
        return packageId;
    }

    /**
     * @param packageId
     */
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    /**
     * @return BATCH_ID
     */
    public Integer getBatchId() {
        return batchId;
    }

    /**
     * @param batchId
     */
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    /**
     * @return GRANT_COUNT
     */
    public Integer getGrantCount() {
        return grantCount;
    }

    /**
     * @param grantCount
     */
    public void setGrantCount(Integer grantCount) {
        this.grantCount = grantCount;
    }

	@Override
	public String toString() {
		return "TrPackageBatch [relId=" + relId + ", packageId=" + packageId + ", batchId=" + batchId + ", grantCount="
				+ grantCount + "]";
	}
    
    
}