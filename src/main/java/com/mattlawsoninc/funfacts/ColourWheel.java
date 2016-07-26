package com.mattlawsoninc.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Matt on 25/07/2016.
 */
public class ColourWheel {
    // Fields (Member Variables) - Properties about the object
    private String[] mColours = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Methods - Actions the object can take
    public int getColour(){
        String colour;
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColours.length);
        colour = mColours[randomNumber];
        int colourAsInt = Color.parseColor(colour);

        return colourAsInt;
    }
}
