import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(720, 360, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,356,256);
        Lobster lobster = new Lobster();
        addObject(lobster,135,126);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,594,268);
        worm worm = new worm();
        addObject(worm,384,99);
        worm worm2 = new worm();
        addObject(worm2,606,154);
        worm worm3 = new worm();
        addObject(worm3,67,305);
        worm worm4 = new worm();
        addObject(worm4,89,42);
        worm worm5 = new worm();
        addObject(worm5,638,18);
        worm worm6 = new worm();
        addObject(worm6,660,333);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,505,48);
        Lobster lobster4 = new Lobster();
        addObject(lobster4,208,332);
        worm worm7 = new worm();
        addObject(worm7,662,102);
        worm worm8 = new worm();
        addObject(worm8,274,71);
        worm worm9 = new worm();
        addObject(worm9,160,174);
        lobster2.setLocation(613,291);
        worm worm10 = new worm();
        addObject(worm10,613,291);
        worm worm11 = new worm();
        addObject(worm11,679,186);
        worm worm12 = new worm();
        addObject(worm12,200,249);
    }
    }