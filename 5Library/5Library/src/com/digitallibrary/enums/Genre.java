package com.digitallibrary.enums;

public enum Genre {
    FICTION("Fiction"),
    NON_FICTION("Non-Fiction"),
    BIOGRAPHY("Biography"),
    SCIENCE("Science"),
    TECHNOLOGY("Technology");

    private final String displayName;

    Genre(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
