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
    private ArrayList<Step> steps;
    private Step currentStep;
    public Location myLocation ;
    private boolean isPrepared;

    
    public Ingredient(ArrayList<Step> steps) {
        this.steps = steps;
        this.currentStep = steps.get(0);
        this.myLocation = Location.STORAGE;
        this.isPrepared = false;
    }

    /**
     * Act - do whatever the Ingredient wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){ 
    
    //    if (mylocation == currentStep.getLocation()){
    //        currentStep.prepareIngredient();
    //    }
    //    onAct();
    //    if (progress == icons.size()-1) {
    //        isPrepared = true;
    //    }
    }

    public boolean getIsIngredientPrepared(){
        return isPrepared;
    } 

}