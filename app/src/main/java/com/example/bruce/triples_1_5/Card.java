package com.example.bruce.triples_1_5;


import android.widget.TextView;

public class Card
{
    private Color mColor;
    private Shape mShape;
    private int mNum, mAlpha;
    private int mSelectedImage, mImageID;
    private boolean mSelected = false;
    protected enum Color {NO_COLOR, Red, Blue, Green};
    protected enum Shape {NO_SHAPE, Triangle, Circle, Square};

    public Card(Shape shape, Color color, int num, int alpha, int selectedImage, int imageID)
    {
        mShape = shape;
        mColor = color;
        mNum = num;
        mAlpha = alpha;
        mSelectedImage = selectedImage;
        mImageID = imageID;
        mSelected = false;
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

    public int getSelectedImage() {
        return mSelectedImage;
    }

    public int getImageID() {

        return mImageID;
    }

    public void setSelected(boolean selected) {
        mSelected = selected;
    }

    public boolean getSelected() {
        return mSelected;
    }

}

