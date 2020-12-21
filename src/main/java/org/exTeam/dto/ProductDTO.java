package org.exTeam.dto;

import java.util.UUID;

public class ProductDTO {
    private UUID productUUID;
    private int vendorCode;

    public UUID getProductUUID() {
        return productUUID;
    }
    public void setProductUUID(UUID productUUID) {
        this.productUUID = productUUID;
    }

    public int getVendorCode() {
        return vendorCode;
    }
    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
