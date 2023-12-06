package team.frcteam3044;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class LEDController {
    /**
     * Defines the blinkin module for the colors.
     */
    Spark blinkin;
    /**
     * Save of time1 from twoColorBlinkPattern.
     */
    double colorOneBlinkTime = 0.0;
    /**
     * Save of color1 from twoColorBlinkPattern.
     */
    double blinkColorOne = 0.0;
    /**
     * Save of time2 from twoColorBlinkPattern.
     */
    double colorTwoBlinkTime = 0.0;
    /**
     * Save of color2 from twoColorBlinkPattern.
     */
    double blinkColorTwo = 0.0;
    /**
     * Times the LEDs.
     */
    Timer timer = new Timer();
    /**
     * Sets it to one color.
     */
    double solidColor = 0.0;
    /**
     * True = blinking,
     * False = solid.
     */
    boolean solidOrBlink = false;

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
     * @param time1  - The amount of time the color1 stays up.
     * @param color1 - The first color in the pattern.
     * @param time2  - The amount of time color2 stays up.
     * @param color2 - The second color in the pattern.
     */
    public void twoColorBlinkPattern(double time1, double color1, double time2, double color2) {
        solidOrBlink = true;
        colorOneBlinkTime = time1;
        colorTwoBlinkTime = time2;
        blinkColorOne = color1;
        blinkColorTwo = color2;
    }

    /**
     * Checking how much time has passed to set the colors.
     */
    public void updatePeriodic() {
        if (solidOrBlink == true) {
            // Blinking pattern.
            // blinkin.set()
        } else {
            // Solid Colour

        }
    }

    /**
     * Controls the color of the LEDs.
     * 
     * @param colorValue - 0-1 because it works like a motor.
     *                   Use specific number corresponding to the color you desire.
     */
    public void colorChange(double colorValue) {
        solidOrBlink = false;

        solidColor = colorValue;
    }

}