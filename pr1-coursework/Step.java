import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Step {
    private Location location;
    private GreenfootImage icon;
    private boolean stepComplete;
    protected String ingredientName;
    
    public Step(Location location, String name){
        this.location = location;
        this.ingredientName = name;
        this.stepComplete = false;
    }

    public Location getLocation(){
        return location;
    } 

    public GreenfootImage getImage(){
        return icon;
    } 

    protected void setImage(String iconName){
        this.icon = new GreenfootImage(iconName);
    } 

    public boolean getStepComplete(){
        return stepComplete;
    } 

    protected void setStepComplete(boolean stepComplete){
        this.stepComplete = stepComplete;
    } 


    
} 
