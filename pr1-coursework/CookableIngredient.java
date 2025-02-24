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

    public enum CookType {
        BOIL,FRY,OVEN_BAKE
    }
    
    public CookableIngredient(int ingredientNumber, String name, String iconFileName, String choppedIconFileName, int chopsRequired, CookType cookMethod, int cookTime, int burnTime, String cookedIconFileName){
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
    public void act()
    {
        setImage(icons.get(progress));
       if (location == Location.PREP_AREA && progress < 1){
           chop();
       }
       if (progress == icons.size()) {
           isPrepared = true;
       }
    }
    
    public void cook(){
        
    }
}
