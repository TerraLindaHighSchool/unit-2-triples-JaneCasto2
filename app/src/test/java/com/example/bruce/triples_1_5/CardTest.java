package com.example.bruce.triples_1_5;

import org.junit.Test;
import android.support.v7.app.AppCompatActivity;
import static org.junit.Assert.*;

public class CardTest {


    Card[] card = {
            new Card(Card.Shape.Square, Card.Color.Red, 1, 0, (R.drawable.square_red_1_0), (R.drawable.square_red_1_0_selected)),
            new Card(Card.Shape.Circle, Card.Color.Blue, 2, 1,  (R.drawable.circle_blue_1_0), (R.drawable.circle_blue_1_0_selected)),
            new Card(Card.Shape.Triangle, Card.Color.Green, 3, 2, (R.drawable.triangle_green_3_2), (R.drawable.triangle_green_3_2_selected))};

    @Test
    public void getColor() {
        Card.Color[] expected = {Card.Color.Red, Card.Color.Blue, Card.Color.Green};
        Card.Color actual = Card.Color.NO_COLOR;
        for (int i = 0; i < expected.length; i++) {
            actual = card[i].getColor();
            assertTrue(expected[i].equals(actual));
        }
        }


    @Test
    public void getShape() {
        Card.Shape[] expected = {Card.Shape.Square, Card.Shape.Circle, Card.Shape.Triangle};
        Card.Shape actual = Card.Shape.NO_SHAPE;
        for (int i = 0; i < expected.length; i++) {
            actual = card[i].getShape();
            assertTrue(expected[i].equals(actual));
        }

    }

    @Test
    public void getNum() {
        int[] expected = {1,2,3};
        int actual = -1;
        for (int i = 0; i < expected.length; i++) {
            actual = card[i].getNum();
            assertTrue(expected[i] == actual);
        }

    }

    @Test
    public void getAlpha() {
        int[] expected = {0,1,2};
        int actual = -1;
        for (int i = 0; i < expected.length; i++) {
            actual = card[i].getNum();
            assertTrue(expected[i] == actual);
        }
    }

    @Test
    public void getSelectedImage() {
        int[] expected = {R.drawable.square_red_1_0_selected, R.drawable.circle_blue_1_0_selected, R.drawable.triangle_green_3_2_selected};
        int actual = -1;
        for (int i = 0; i < expected.length; i++) {
            actual = card[i].getNum();
            assertTrue(expected[i] == actual);
        }
    }



    @Test
    public void getImageID() {
        int[] expected = {R.drawable.square_red_1_0, R.drawable.circle_blue_1_0, R.drawable.triangle_green_3_2};
        int actual = -1;
        for (int i = 0; i < expected.length; i++) {
            actual = card[i].getNum();
            assertTrue(expected[i] == actual);
        }
    }

    @Test
    public void Selected() {
        boolean expected = false;
        boolean actual = card[0].getSelected();
        assertTrue(!actual);
    }

    @Test
    public void setSelected() {
        boolean expected = true;
        card[0].setSelected(true);
        boolean actual = card[0].getSelected();
        assertTrue(actual);
    }

}