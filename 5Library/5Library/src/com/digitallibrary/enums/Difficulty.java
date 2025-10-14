package com.digitallibrary.enums;

public enum Difficulty {
    BEGINNER("Beginner", 1),
    INTERMEDIATE("Intermediate", 2),
    ADVANCED("Advanced", 3);

    private final String displayName;
    private final int level;

    Difficulty(String displayName, int level) {
        this.displayName = displayName;
        this.level = level;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return displayName;
    }
}