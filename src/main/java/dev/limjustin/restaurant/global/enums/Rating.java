package dev.limjustin.restaurant.global.enums;

public enum Rating {
    ONE("⭐"), TWO("⭐⭐"), THREE("⭐⭐⭐"), FOUR("⭐⭐⭐⭐"), FIVE("⭐⭐⭐⭐⭐");

    public String displayValue;

    Rating(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
