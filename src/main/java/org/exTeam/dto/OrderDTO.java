package org.exTeam.dto;

import java.util.UUID;

public class OrderDTO {
    private UUID orderUUID;
    private int vendorCode;

    public UUID getOrderUUID() {
        return orderUUID;
    }
    public void setOrderUUID(UUID orderUUID) {
        this.orderUUID = orderUUID;
    }

    public int getVendorCode() {
        return vendorCode;
    }
    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
