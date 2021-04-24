import java.awt.*;

// Matt Lyman
// CPW 142 Winter 2021
// Programming Assignment 9
// This program will flip a picture vertically then horizontally a number of times.

/*
Write a method named flipVertical that inverts an image top to bottom 
using the following specific algorithm on a 2D array of pixels:
for each column c:
    for each row r in the top half:
        swap the pixel at (r,c) with the corresponding pixel in the bottom half
*/

public class ImageTransposer {
    public static void main(String[] args) {
        //////////// Choose any picture you like //////////////////////
        //DrawingPanel panel = new DrawingPanel( "textinjpeg.jpg" );
        DrawingPanel panel = new DrawingPanel( "dog_head.jpg" );
        
        // show picture, wait, flip. repeat.
        final int SLEEP_TIME = 250; // 1000 = one second
        final int NUM_FLIPS = 6; // should be even number to get back to original image
        
        for (int i = 0; i < NUM_FLIPS; i++) { 
            panel.sleep(SLEEP_TIME);
            flipVertical(panel );
            System.out.println("flipped vertical " + i);
        }
        
        // show picture, wait, flip. repeat.
        for (int i = 0; i < NUM_FLIPS; i++) { 
            panel.sleep(SLEEP_TIME); 
            flipHorizontal(panel );
            System.out.println("flipped horizontal " + i);
        }
        System.out.println("done.");
        
    }
    
    // given a DrawingPanel, get a 2D array of colors
    // flip the array
    // refresh the DrawingPanel with the updated image
    public static void flipVertical(DrawingPanel panel) {
        Color[][] pixels = panel.getPixels();
        for (int height = 0; height < (pixels.length - 1) / 2; height++) {
            for (int width = 0; width < pixels[height].length - 1; width++) {
                //I feel dumb
                int mirror = pixels[width].length - 1 - height;
                Color px = pixels[height][width];
                pixels[height][width] = pixels[height][mirror];
                pixels[height][mirror] = px;
                //System.out.println(height);
                //System.out.println(width);
                //System.out.println(mirror);
            }
        }
        panel.setPixels(pixels);      
    }
    
    // EXTRA CREDIT
    public static void flipHorizontal(DrawingPanel panel) {
        Color[][] pixels = panel.getPixels();
        for (int height = 0; height < pixels.length - 1; height++) {
            for (int width = 0; width < pixels[height].length/2; width++) {
                int mirror = pixels[height].length - 1 - width;
                Color px = pixels[height][width];
                pixels[height][width] = pixels[height][mirror];
                pixels[height][mirror] = px;
                //System.out.println(height);
                //System.out.println(width);
            }
        }
        panel.setPixels(pixels);
    }
}