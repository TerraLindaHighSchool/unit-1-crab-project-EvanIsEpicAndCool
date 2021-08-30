import greenfoot.*;

/**
    * The class controls the Crab object
    * @author Evan Egan
    * @version 8/26/2021
    */
public class Crab extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    // Moves the Crab
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    // Checks for user key presses so user can turn the Crab
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4,getY());
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4,getY());
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-4);
        }
        
        if(Greenfoot.isKeyDown("down"))
        
    }
    // Checks for collisions with other objects
    private void onCollision()
    {
        if(isTouching(worm.class))
        {
            removeTouching(worm.class);
            Greenfoot.playSound("slurp.wav");
            
            //winning the game
            if(getWorld().getObjects(worm.class).size() == 0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(Lobster.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }


}
