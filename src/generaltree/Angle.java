package generaltree;// Class generaltree.Angle is used to store an angle in degrees and minutes, as in "29
// degrees and 35 minutes."

//TODO: Modify this class so that we can determine the partial ordering of (that is compare) two Angle objects
public class Angle {
    private int degrees;
    private int minutes;

    // pre: minutes <= 59 and minutes >= 0 and degrees >= 0
    //    (throws IllegalArgumentException if not true)
    public Angle(int degrees, int minutes) {
        if (minutes < 0 || minutes > 59 || degrees < 0)
            throw new IllegalArgumentException("degrees: " + degrees
                    + " minutes: " + minutes);
        this.degrees = degrees;
        this.minutes = minutes;
    }

    // post: returns a String representation of this angle as in "29 d 35 m"
    public String toString() {
        return degrees + "d " + minutes + "m";
    }

    // post: returns the integer degrees for this angle
    public int getDegrees() {
        return degrees;
    }

    // post: returns the minutes portion of this angle (not counting degrees)
    public int getMinutes() {
        return minutes;
    }

    // post: returns a new angle that represents the sum of this angle and the
    //     given angle
    public Angle add(Angle other) {
        //implement your code here
        return null; //overwrite this code
    }
}