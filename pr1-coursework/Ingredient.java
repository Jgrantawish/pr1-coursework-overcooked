import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    protected ArrayList<GreenfootImage> icons;
    private int chopsRequired;
    public Location location ;
    protected int progress;
    public boolean isPrepared;
    
    public enum Location {
        STORAGE,HAND,PREP_AREA,FRYING_PAN,HOB,OVEN,PLATE
    }
    
    public Ingredient(int ingredientNumber, String name, String iconFileName,String choppedIconFileName, int chopsRequired) {
        this.ingredientNumber = ingredientNumber;
        this.name = name;
        this.icons = new ArrayList<GreenfootImage>();
        this.icons.add(new GreenfootImage(iconFileName));
        this.icons.add(new GreenfootImage(choppedIconFileName));
        this.chopsRequired = chopsRequired;
        this.location = Location.PREP_AREA;
        this.isPrepared = false;
        this.progress = 0; 

    }

    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){ 
       setImage(icons.get(progress));
       if (location == Location.PREP_AREA && progress < 1){
           chop();
       }
       if (progress == icons.size()) {
           isPrepared = true;
       }
    }

    public void chop(){
         boolean cDown = false; 
         int currentChops = 0;
         while (currentChops < chopsRequired && progress != 1){ 
            if (Greenfoot.isKeyDown("c") && cDown == false){
             currentChops++;
             cDown = true;
            }
            else if (!Greenfoot.isKeyDown("c") && cDown == true){
             cDown = false;
            }
        }
        progress++; 
    }
}