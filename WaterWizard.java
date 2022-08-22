public class WaterWizard extends Wizard
{
    //instance variables
    private boolean puddle;

    // filled constructor
    public WaterWizard(int speed, int power, boolean puddle)
    {
        super(speed, power);
        puddle = false;
    }

    // getters
    public boolean getPuddle()
    {
        return puddle;
    }

    // setters
    public void setPuddle(boolean puddle) {}

    // brain method #nobrainmethodtoday

    // toString

    @Override
    public String toString() {
        return "WaterWizard {" +
                "Speed:" + speed +
                ". power:" + power +
                ". puddle:" + puddle;

    }


}
