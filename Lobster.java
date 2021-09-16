import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        moveRand();
        turnAtEdge();
        turnFrog();
    }
    // Moves the Loobstah

    // Turns the Loobstah at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }

    public void turnFrog()

    {
        if(Greenfoot.getRandomNumber(100) <10)
        {
            Actor frog = (Actor)getWorld().getObjects(Crab.class).get(0);

            turnTowards(frog.getX(), frog.getY());
        }
    }
    
    public void moveRand()
    
    {
        move(1);
        if(Greenfoot.getRandomNumber(100) == 10)
        {
            Actor frog = (Actor)getWorld().getObjects(Crab.class).get(0);

            turnTowards(frog.getX(), frog.getY());
            
            move(25);
        }
    }
}
