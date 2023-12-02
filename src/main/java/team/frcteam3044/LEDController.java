package team.frcteam3044;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

/**
 * This is a test commit
 */
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
     * Save of color2 from twoColorBlinkPattern.
     */
    double blinkColorTwo = 0.0;
    /**
     * Save of time2 from twoColorBlinkPattern.
     */
    double colorTwoBlinkTime = 0.0;
    


    /**
     * Turn on the LEDs.
     * @param id - Set this to your id of your blinkin module.
     */
    public LEDController(int id) {
        
    }

    /**
     * Make pattern for the LEDs! :)
     * @param time1 - The amount of time the color1 stays up.
     * @param color1 - The first color in the pattern. :P
     * @param time2 - The amount of time color2 stays up.
     * @param color2 - The second color in the pattern. XD
     */
    public void twoColorBlinkPattern(double time1, double color1, double time2, double color2) {

    }
    
    /**
     * Checking how much time has passed to set the colors. <3
     */
    public void updatePeriodic() {
        
    }

    /**
     * Controls the color of the LEDs.
     * @param colorValue - 0-1 because it works like a motor.
     * Use specific number corresponding to the color you desire. Interesting lol
     */
    public void colorChange(double colorValue) {

    }

}