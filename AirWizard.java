public class AirWizard extends Wizard
{
    //instance variables
    private boolean cloud;

    // filled constructor
    public AirWizard(int speed, int power, boolean cloud)
    {
        super(speed, power);
        cloud = false;
    }

    // getters
    public boolean getCloud()
    {
        return cloud;
    }

    // setters
    public void setCloud(boolean cloud) {}

    // brain method

    // toString

    @Override
    public String toString() {
        return "AirWizard {" +
                "Speed:" + speed +
                ". power:" + power +
                ". cloud:" + cloud;

    }


}
