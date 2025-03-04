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
    private int chops;
    private boolean cDown;
    public Location location ;
    protected int progress;
    public boolean isPrepared;

    
    public Ingredient(int ingredientNumber, String name, int chopsRequired) {
        this.ingredientNumber = ingredientNumber;
        this.name = name;
        this.icons = new ArrayList<GreenfootImage>();
        this.icons.add(new GreenfootImage(name + ".png"));
        this.icons.add(new GreenfootImage(name + "-chopped.png"));
        this.chopsRequired = chopsRequired;
        this.chops = 0;
        this.cDown = false;
        this.location = Location.PREP_AREA;
        this.isPrepared = false;
        this.progress = 0; 
        
        setImage(icons.get(progress));

    }

    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){ 
    
       if (location == Location.PREP_AREA && progress < 1){
           checkForChop();
       }
       onAct();
       if (progress == icons.size()-1) {
           isPrepared = true;
       }
    }
    
    protected void onAct(){
    }

    private void checkForChop(){
        if (Greenfoot.isKeyDown("c") && cDown == false){
            chop();
            cDown = true;
        }
        else if (!Greenfoot.isKeyDown("c") && cDown == true){
            cDown = false;
        }
    }
    
    private void chop(){
        chops++;
        if (chops >= chopsRequired){
            incrementProgress();
        }
        
    }
    
    private void incrementProgress(){
        progress++;
        setImage(icons.get(progress));
    }
}