package com.traveler.denomination.utils;

public enum ErrorCode {
    PAYMENT_NOT_POSSIBLE(1),
    INVALID_INPUT(2),
    CUSTOM_INDEX_OUT_OF_BOUNDS(3),
    CUSTOM_DIVIDED_BY_ZERO(4),
    CUSTOM_INPUT_MISMATCH(5);

    private final int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}