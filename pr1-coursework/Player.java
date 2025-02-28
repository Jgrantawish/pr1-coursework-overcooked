import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Chef extends Actor {
    
    public Chef(){
        setImage("images.png");
    }

    private int movementDistance = 3;

    public void act() {
        movementControl();
    }

    public void movementControl(){
        int x = getX();
        int y = getY();

        if (Greenfoot.isKeyDown("w")){
            setLocation(x, y-movementDistance);
            handleCollision(x,y);
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(x-movementDistance, y);
            handleCollision(x,y);
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(x, y+movementDistance);
            handleCollision(x,y);
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(x+movementDistance, y);
            handleCollision(x,y);
        }
        
    }
    
    public void handleCollision(int x, int y){
        if (isTouching(Obstacle.class)|| isAtEdge()) {
                setLocation(x, y);
            }
    }
}









        
