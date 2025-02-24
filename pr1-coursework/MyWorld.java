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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        prepare();
    }

    private void prepare(){
        Ingredient bread = new Ingredient(1,"Bread","breadIcon.png","sliced-bread.png",5);
        addObject(bread,12,15);
        CookableIngredient carrot = new CookableIngredient(2,"carrot","carrot.png","choppedCarrot.png","choppedCarrotCooked.png",10,CookType.BOIL,10,30);
        addObject(carrot,25,25);
    }

}
