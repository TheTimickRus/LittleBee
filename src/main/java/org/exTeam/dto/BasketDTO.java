package org.exTeam.dto;

import org.exTeam.Core.Products.Product;

import java.util.UUID;

public class BasketDTO {

    private UUID basketUUID;
    private int vendorCode;

    public UUID getBasketUUID() {
        return basketUUID;
    }

    public void setBasketUUID(UUID basketUUID) {
        this.basketUUID = basketUUID;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
