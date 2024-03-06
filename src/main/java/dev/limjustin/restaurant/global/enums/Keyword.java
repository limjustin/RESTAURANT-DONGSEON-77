package dev.limjustin.restaurant.global.enums;

public enum Keyword {
    DELICIOUS("음식이 맛있어요 😋"),
    FRESH("재료가 신선해요 🥦"),
    KIND("친절해요 🥰"),
    COST_EFFECTIVENESS("가성비가 좋아요 💰"),
    EATING_ALONE("혼밥하기 좋아요 🎧"),
    CLEAN("매장이 청결해요 ✨"),
    BIG_QUANTITY("양이 많아요 🍚"),
    SPECIAL_MENU("특별한 메뉴가 있어요 🎁"),
    GOOD_INTERIOR("인테리어가 멋져요 🛋️"),
    SPECIAL_DAY("특별한 날 가기 좋아요 🎉"),
    LARGE_PLACE("매장이 넓어요 👀"),
    NICE_VIEW("뷰가 좋아요 🖼️"),
    COZY("아늑해요 😼"),
    FAST("음식이 빨리 나와요 ⏰"),
    HANDSOME("쉐프님이 잘생겼어요 😜");

    private String displayValue;

    Keyword(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
