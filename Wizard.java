
public class Wizard
{
    //instance variables used
    int power;
    int speed;

    //2 constructors
    public Wizard(int speed, int power)
    {
        this.speed = speed;
        this.power = power;

    }
    //4 getters
    public int getspeed()
    {
        return speed;
    }

    public int getpower()
    {
        return power;
    }

    //setters
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setPower(int power)
    {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Wizard {" +
                "Speed:" + speed +
                ". power:" + power;

    }
}


