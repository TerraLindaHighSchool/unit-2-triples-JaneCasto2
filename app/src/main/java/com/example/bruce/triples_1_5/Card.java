package com.example.bruce.triples_1_5;


import android.widget.TextView;

public class Card
{
    private Color mColor;
    private Shape mShape;
    private int mNum, mAlpha;
    private int mSelectedImageID, mImageID;
    private boolean mIsSelected = false;
    protected enum Color {NO_COLOR, RED, BLUE, GREEN};
    protected enum Shape {NO_SHAPE, TRIANGLE, CIRCLE, SQUARE};

    public Card(Shape shape, Color color, int num, int alpha, int selectedImageID, int imageID)
    {
        mShape = shape;
        mColor = color;
        mNum = num;
        mAlpha = alpha;
        mSelectedImageID = selectedImageID;
        mImageID = imageID;
        mIsSelected = false;
    }

    public Color getColor() {
        return mColor;
    }

    public Shape getShape() {
        return mShape;
    }

    public int getNum() {
        return mNum;
    }

    public int getAlpha() {
        return mAlpha;
    }

    public int getSelectedImageID() {
        return mSelectedImageID;
    }

    public int getImageID() {

        return mImageID;
    }

    public void setIsSelected(boolean selected) {
        mIsSelected = selected;
    }

    public boolean getIsSelected() {
        return mIsSelected;
    }

}

