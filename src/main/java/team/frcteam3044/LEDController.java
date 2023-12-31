package team.frcteam3044;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class LEDController {
    /**
     * Defines the blinkin module for the colors.
     */
    Spark blinkin;
    /**
     * Save of time from twoColorBlinkPattern.
     */
    double BlinkTime = 0.0;
    /**
     * Save of color1 from twoColorBlinkPattern.
     */
    Colors blinkColorOne = Colors.GOLD;
    /**
     * Save of color2 from twoColorBlinkPattern.
     */
    Colors blinkColorTwo = Colors.PURPLE;
    /**
     * Times the LEDs.
     */
    Timer timer = new Timer();
    /**
     * Sets it to one color.
     */
    Colors solidColor = Colors.RED; // red
    /*
     * This holds the values for the colors.
     */
    double[] colorList = {0.61, 0.91, 0.67};
    /**
     * True = blinking,
     * False = solid.
     */
    boolean solidOrBlink = false;
    /**
     * Holds all the colors.
     */
    public enum Colors {
        RED,
        PURPLE,
        GOLD
    }
    /**
     * Tells you amount of time passed since last color change
     */
    double timeSinceLastColorChange = timer.get();
    /**
     * Checks what step of the blink cycle it was on
     * 0 = color 1
     * 1 = color 2
     */
    int blinkStep = 0;
    /**
     * Turn on the LEDs.
     * 
     * @param id - Set this to your id of your blinkin module.
     */
    public LEDController(int id) {
        blinkin = new Spark(id);
    }

    /**
     * Make pattern for the LEDs!
     * 
     * @param color1 - The first color in the pattern.
     * @param color2 - The second color in the pattern.
     * @param time - The amount of time each color is active for.
     */
    public void twoColorBlinkPattern(Colors color1, Colors color2, double time) {
        solidOrBlink = true;
        BlinkTime = time;
        blinkColorOne = color1;
        blinkColorTwo = color2;
        timer.start();
    }

    /**
     * Checking how much time has passed to set the colors.
     */
    public void updatePeriodic() {
        if (solidOrBlink == true) {
            // Blinking pattern.
            if (timer.get() >= BlinkTime && blinkStep != 1) {
                timer.reset();
                blinkStep = 1;
                blinkin.set(colorList[blinkColorOne.ordinal()]);
            }
            if (timer.get() >= BlinkTime && blinkStep != 0) {
                timer.reset();
                blinkStep = 0;
                blinkin.set(colorList[blinkColorTwo.ordinal()]);
            }
        } else {
            // Solid Color
            blinkin.set(colorList[solidColor.ordinal()]);
        }
    }

    /**
     * Controls the color of the LEDs.
     * 
     * @param colorValue - 0-1 because it works like a motor.
     *                   Use specific number corresponding to the color you desire.
     */
    public void colorChange(Colors colorValue) {
        solidOrBlink = false;

        solidColor = colorValue;
    }

}