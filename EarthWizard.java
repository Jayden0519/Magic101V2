public class EarthWizard extends Wizard
{
    //instance variables
    private boolean rock;

    // filled constructor
    public EarthWizard(int speed, int power, boolean rock)
    {
        super(speed, power);
        rock = false;
    }

    // getters
    public boolean getRock()
    {
        return rock;
    }

    // setters
    public void setRock(boolean rock) {}

    // brain method

    // toString

    @Override
    public String toString() {
        return "EarthWizard {" +
                "Speed:" + speed +
                ". power:" + power +
                ". rock:" + rock;

    }


}
