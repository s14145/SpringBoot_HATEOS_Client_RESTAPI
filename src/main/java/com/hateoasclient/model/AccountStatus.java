package com.hateoasclient.model;

public enum AccountStatus {

    ACTIVE("Active"), INACTIVE("Inactive"), DISABLED("Disabled"), DORMANT("Dormant");

    public final String label;

    private AccountStatus(String label) {
        this.label = label;
    }
}