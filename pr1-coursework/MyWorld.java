import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1100x500 cells with a cell size of 1x1 pixels.
        super(1100, 500, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Chef(),1000,200);
        addObject(new Obstacle(25,600),400,300);
        addObject(new Obstacle(50,150),575,350);
        addObject(new Obstacle(100,50),600,400);
        addObject(new Obstacle(50,150),850,175);
        addObject(new Obstacle(100,50),825,125);
        addObject(new Obstacle(150,50),1025,475);
    }
}
