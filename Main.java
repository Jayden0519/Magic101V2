

public class Main

{
    public static void main(String[] args)
    {
        System.out.println("\n welcome to magic 101 first project of the year!");

        //this will be where i will import my wizards, their names, elements, and skill levels
        Wizard Fab = new Wizard (3, 4);


        //System.out.println(Fab);

        AirWizard Jay = new AirWizard (4, 2, true);
        EarthWizard Lulu = new EarthWizard (4, 2, true);
        WaterWizard Sofia = new WaterWizard (4, 2, true);
        //System.out.println(Jay);

        Wizard[] wizList = {Fab, Jay, Lulu, Sofia};
        for (Wizard s: wizList)
        {
            System.out.println(s);
        }


    }
}
