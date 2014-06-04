package com.atermenji.android.iconicdroid.icon;

import com.atermenji.android.iconicdroid.util.TypefaceManager;

/**
 * Created by imaliy on 04.06.14.
 */
public enum Linecons implements Icon {

    HEART(0xE600),
    CLOUD(0xE601),
    STAR(0xE602),
    TV(0xE603),
    SOUND(0xE604),
    VIDEO(0xE605),
    TRASH(0xE606),
    USER(0xE607),
    KEY(0xE608),
    SEARCH(0xE609),
    SETTINGS(0xE60A),
    CAMERA(0xE60B),
    TAG(0xE60C),
    LOCK(0xE60D),
    BULB(0xE60E),
    PEN(0xE60F),
    DIAMOND(0xE610),
    DISPLAY(0xE611),
    LOCATION(0xE612),
    EYE(0xE613),
    BUBBLE(0xE614),
    STACK(0xE615),
    CUP(0xE616),
    PHONE(0xE617),
    NEWS(0xE618),
    MAIL(0xE619),
    LIKE(0xE61A),
    PHOTO(0xE61B),
    NOTE(0xE61C),
    CLOCK(0xE61D),
    PAPERPLAN(0xE61E),
    PARAMS(0xE61F),
    BANKNOTE(0xE620),
    DATA(0xE621),
    MUSIC(0xE622),
    MEGAPHONE(0xE623),
    STUDY(0xE624),
    LAB(0xE625),
    FOOD(0xE626),
    T_SHIRT(0xE627),
    FIRE(0xE628),
    CLIP(0xE629),
    SHOP(0xE62A),
    CALENDAR(0xE62B),
    WALLET(0xE62C),
    VYNIL(0xE62D),
    TRUCK(0xE62E),
    WORLD(0xE62F);

    private final int mIconUtfValue;

    private Linecons(int iconUtfValue) {
        mIconUtfValue = iconUtfValue;
    }

    @Override
    public TypefaceManager.IconicTypeface getIconicTypeface() {
        return TypefaceManager.IconicTypeface.ICOMOON;
    }

    @Override
    public int getIconUtfValue() {
        return mIconUtfValue;
    }
}
