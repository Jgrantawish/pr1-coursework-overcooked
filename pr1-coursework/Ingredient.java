import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the base class for an Ingredient. It takes different images on construction, depenting on what kind of ingredient it is.
 * All ingredients will have a number, name, image, and the number of chops that are required to prepare them. 
 * The isPrepared attribute will determine whether the ingredient is ready to be used to make the meal yet or not.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ingredient extends Actor
{
    private int ingredientNumber;
    public String name;
    public GreenfootImage icon;
    public int chopsRequired;
    public boolean isPrepared;
    
    public Ingredient(int ingredientNumber, String name, String iconFileName, int chopsRequired){
        this.ingredientNumber = ingredientNumber;
        this.name = name;
        this.icon = new GreenfootImage(iconFileName);
        this.chopsRequired = chopsRequired;
        this.isPrepared = false;
        
    }
    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
