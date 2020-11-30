package acecam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MainInventoryData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer autoId;
    private String type;
    private String stockNumber;
    private String masterLocation;
    private String costCenter;
    private String costCode;
    private String orderRule;
    private String issuePrice;
    private String totalOH;
    private String extendedDescription;
    private String description;
    private String assetGroup;
    private String stockGroup;
    private String oldLedgerNumber;
    private String serializeCounter;

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getMasterLocation() {
        return masterLocation;
    }

    public void setMasterLocation(String masterLocation) {
        this.masterLocation = masterLocation;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getCostCode() {
        return costCode;
    }

    public void setCostCode(String costCode) {
        this.costCode = costCode;
    }

    public String getOrderRule() {
        return orderRule;
    }

    public void setOrderRule(String orderRule) {
        this.orderRule = orderRule;
    }

    public String getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(String issuePrice) {
        this.issuePrice = issuePrice;
    }

    public String getTotalOH() {
        return totalOH;
    }

    public void setTotalOH(String totalOH) {
        this.totalOH = totalOH;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssetGroup() {
        return assetGroup;
    }

    public void setAssetGroup(String assetGroup) {
        this.assetGroup = assetGroup;
    }

    public String getStockGroup() {
        return stockGroup;
    }

    public void setStockGroup(String stockGroup) {
        this.stockGroup = stockGroup;
    }

    public String getOldLedgerNumber() {
        return oldLedgerNumber;
    }

    public void setOldLedgerNumber(String oldLedgerNumber) {
        this.oldLedgerNumber = oldLedgerNumber;
    }

    public String getSerializeCounter() {
        return serializeCounter;
    }

    public void setSerializeCounter(String serializeCounter) {
        this.serializeCounter = serializeCounter;
    }
}
