package com.endava.grocy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TransactionType {
    @JsonProperty("purchase")
    PURCHASE,
    @JsonProperty("consume")
    CONSUME,
    @JsonProperty("inventory_correction")
    INVENTORY_CORRECTION,
    @JsonProperty("product_opened")
    PRODUCT_OPENED;

}
