
public class Dice
{
    private String color;
    private String material;
    private int sides;
    private int faceUp;
    
    public Dice(String c, String m, int s, int f)
    {
        color = c;
        material = m;
        sides = s;
        faceUp = f;
    }
    
    
    public void setFaceUp(int f)
    {
        faceUp = f;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public int getSides()
    {
        return sides;
    }
    
    public int getFaceUp()
    {
        return faceUp;
    }
    
    public void roll()
    {
        double facingUp = (int)(Math.random()*6)+1;
    }
    
    public String toString()
    {
        return "this die is a " + color + " " + material + " " + sides + " sided die ," + " with the number " + faceUp + " facing up ";
    }
}
