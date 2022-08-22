public class Dragon
{
    //instance variables
    String element;

    //constructors
    public Dragon(String element)
    {
        this.element = element;
    }

    //getters
    public String getElement()
    {
        return element;
    }

    //setters
    public void setElement(String element)
    {
        this.element = element;
    }

//toString

    @Override
    public String toString() {
        return "Dragon {" +
                "Element:" + element;

    }



}
