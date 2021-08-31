import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lobster lobster = new Lobster();
        addObject(lobster,335,193);
        Crab crab = new Crab();
        addObject(crab,253,302);
        worm worm = new worm();
        addObject(worm,455,107);
        worm worm2 = new worm();
        addObject(worm2,167,121);
        worm worm3 = new worm();
        addObject(worm3,465,282);
        worm worm4 = new worm();
        addObject(worm4,125,234);
        worm worm5 = new worm();
        addObject(worm5,281,345);
        worm worm6 = new worm();
        addObject(worm6,103,363);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,71,107);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,312,468);
        Lobster lobster4 = new Lobster();
        addObject(lobster4,415,289);
        Lobster lobster5 = new Lobster();
        addObject(lobster5,150,330);
        Lobster lobster6 = new Lobster();
        addObject(lobster6,104,198);
        Lobster lobster7 = new Lobster();
        addObject(lobster7,283,84);
        removeObject(lobster5);
    }
}