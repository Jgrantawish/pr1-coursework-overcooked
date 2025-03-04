import greenfoot.GreenfootImage;

public class ChopStep extends Step{
    private int chopsRequired;
    private int chopCount;
    private boolean cDown;
    

    public ChopStep(Location location, String name, int chopsRequired){
        super(location); 
        this.chopsRequired = chopsRequired;
        this.chopCount = 0;
        this.cDown = false;
        setImage(name + ".png");
    }

    public boolean chop(){
        
    }
}
