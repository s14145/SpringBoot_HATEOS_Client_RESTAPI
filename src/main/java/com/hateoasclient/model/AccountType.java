package com.hateoasclient.model;

public enum AccountType {

    CHECKING("Checking"), SAVING("Saving"), COMBO("Checking&Saving");

    public final String label;

    private AccountType(String label) {
        this.label = label;
    }
}
