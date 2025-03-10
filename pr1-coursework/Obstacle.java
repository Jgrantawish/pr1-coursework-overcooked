import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Obstacle(int width, int height){
        GreenfootImage image = getImage();
        image.scale(width,height);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}