import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

public class ChopStep extends Step{
    private int chopsRequired;
    private int chopCount;
    private boolean cDown;
    

    public ChopStep(Location location, String name, int chopsRequired){
        super(location, name); 
        this.chopsRequired = chopsRequired;
        this.chopCount = 0;
        this.cDown = false;
        setImage(name + ".png");
    }
        

    private void checkForChop(){
        if (Greenfoot.isKeyDown("c") && !cDown){
            chop();
            cDown = true;
        }
        if (!Greenfoot.isKeyDown("c") && cDown){
            cDown = false;
        }
    }
    
    private void chop(){
        chopCount++;
        if (chopCount >= chopsRequired){
            setImage(ingredientName + "-chopped.png");
            setStepComplete(true);
        }
        
    }
}
