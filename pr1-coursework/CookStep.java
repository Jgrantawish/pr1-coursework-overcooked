import greenfoot.*;

public class CookStep extends Step{
    private int cookTime;
    private int burnTime;
    // private SimpleTimer cook

       public CookStep(Location location, String name, int cookTime, int burnTime){
        super(location, name); 
        this.cookTime = cookTime;
        this.burnTime = burnTime;
        //this.icons.add(new GreenfootImage(name + "-cooked.png"));
        // this.icons.add(new GreenfootImage("burnt.png"));
        
    }
}
