import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the base class for an Ingredient. It takes different images on
 * construction, depenting on what kind of ingredient it is.
 * All ingredients will have a number, name, image, and the number of chops that
 * are required to prepare them.
 * The isPrepared attribute will determine whether the ingredient is ready to be
 * used to make the meal yet or not.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ingredient extends Actor {
    private int ingredientNumber;
    private String name;
    private GreenfootImage icon;
    private GreenfootImage choppedIcon;
    private int chopsRequired;
    public boolean inPrepArea;
    public boolean isPrepared;

    public Ingredient(int ingredientNumber, String name, String iconFileName,String choppedIconFileName, int chopsRequired) {
        this.ingredientNumber = ingredientNumber;
        this.name = name;
        this.icon = new GreenfootImage(iconFileName);
        this.choppedIcon = new GreenfootImage(choppedIconFileName);
        this.chopsRequired = chopsRequired;
        this.inPrepArea = true;
        this.isPrepared = false;
        setImage(icon);

    }

    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){ 
       if (inPrepArea == true){
           prep(chopsRequired, isPrepared, choppedIcon);
       }
    }

    public boolean prep(int chopsRequired,boolean isPrepared, GreenfootImage choppedIcon){
         boolean cDown = false; 
         int currentChops = 0;
         while (currentChops < chopsRequired && isPrepared == false){ 
            if (Greenfoot.isKeyDown("c") && cDown == false){
             currentChops++;
             cDown = true;
            }
            else if (!Greenfoot.isKeyDown("c") && cDown == true){
             cDown = false;
            }
        }
        setImage(choppedIcon);
        isPrepared = true;
        return isPrepared; 
    }
}