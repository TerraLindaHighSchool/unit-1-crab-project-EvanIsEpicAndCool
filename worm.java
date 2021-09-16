import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.math.*;
/**
 * Write a description of class worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class worm extends Actor
{
    /**
     * Act - do whatever the worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        randMove();
    }
    
    public void randMove()
    {
        move(5);
        if (Greenfoot.getRandomNumber(100) <10)
        {
            turn(Greenfoot.getRandomNumber(100));
        }
    }
}
