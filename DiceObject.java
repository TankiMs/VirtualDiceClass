public class Dice
{
    private int sides;
    private int facingUp;
    
    public Dice(int s, int f)
    {
        sides = s;
        facingUp = f;
    }
    
    public void setFacingUp(int f)
    {
        facingUp = f;
    }
    
    public int getSides()
    {
        return sides;
    }
    
    public int getFacingUp()
    {
        return facingUp;
    }
    
    public void roll()  
    {
        facingUp = (int)(Math.random()*sides);
    }
}
