package com.example.dungeonescape.platformer.entities;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

class Portal extends PlatformerObject {

    private final Drawable portal;

    Portal(int x, int y, PlatformerManager manager, Drawable drawable) {
        super(x,y,200, manager);
        portal = drawable;
        setShape();
    }

    public void draw(Canvas canvas) {
        portal.setBounds(getX() - 100, getY() - 100, getX() + 100, getY() + 100);
        portal.draw(canvas);
    }
    void update(int down) {
        incY(down);
        this.setShape();
    }

}