package org.exTeam.dto;

import java.util.UUID;

public class BuyerDTO {
    private UUID buyerUUID;
    private int vendorCode;

    public UUID getBuyerUUID() {
        return buyerUUID;
    }
    public void setBuyerUUID(UUID buyerUUID) {
        this.buyerUUID = buyerUUID;
    }

    public int getVendorCode() {
        return vendorCode;
    }
    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
