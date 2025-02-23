import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CookableIngredient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CookableIngredient extends Ingredient
{
    private int cookTime;
    private int burnTime;
    private CookType cookMethod;
    private GreenfootImage cookedIcon;
    private GreenfootImage burntIcon = new GreenfootImage("burnt.png");

    public enum CookType {
        BOIL,FRY,OVEN_BAKE
    }
    
    public CookableIngredient(int ingredientNumber, String name, String iconFileName, String choppedIconFileName, int chopsRequired, CookType cookMethod, int cookTime, int burnTime, String cookedIconFileName){
        super(ingredientNumber,name,iconFileName,choppedIconFileName,chopsRequired); 
        this.cookMethod = cookMethod;
        this.cookTime = cookTime;
        this.burnTime = burnTime;
        this.cookedIcon = new GreenfootImage(cookedIconFileName);
        
    }
    /**
     * Act - do whatever the CookableIngredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
