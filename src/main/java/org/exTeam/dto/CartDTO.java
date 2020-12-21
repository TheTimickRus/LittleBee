package org.exTeam.dto;

import java.util.UUID;

public class CartDTO {
    private UUID cartUUID;
    private int vendorCode;

    public UUID getCartUUID() {
        return cartUUID;
    }
    public void setCartUUID(UUID cartUUID) {
        this.cartUUID = cartUUID;
    }

    public int getVendorCode() {
        return vendorCode;
    }
    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }
}
