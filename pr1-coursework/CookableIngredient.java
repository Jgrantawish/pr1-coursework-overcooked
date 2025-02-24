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
    
    public CookableIngredient(int ingredientNumber, String name, String iconFileName, String choppedIconFileName, String cookedIconFileName, int chopsRequired, CookType cookMethod, int cookTime, int burnTime){
        super(ingredientNumber,name,iconFileName,choppedIconFileName,chopsRequired); 
        this.cookMethod = cookMethod;
        this.cookTime = cookTime;
        this.burnTime = burnTime;
        this.icons.add(new GreenfootImage(cookedIconFileName));
        this.icons.add(new GreenfootImage("burnt.png"));
        
    }
    /**
     * Act - do whatever the CookableIngredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public void act(){
    //Ovewrites the act of the superclass 
    //}
    
    //Will be called by the superclass 
    protected void onAct(){
        
    }
    
    public void cook(){
    
    }
}
