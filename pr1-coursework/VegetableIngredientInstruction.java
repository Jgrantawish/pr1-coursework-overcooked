public class VegetableIngredientInstruction extends IngredientInstruction {
    private int cookTime;
    private int burnTime;

    public VegetableIngredientInstruction(String name, int chops, int cookTime, int burnTime){
        super(name,chops);
        this.cookTime = cookTime;
        this.burnTime = burnTime;
        this.instructions = "Chop " + chops + "times at the chopping board.\n Then cook at the hob for " + cookTime + " seconds.";
    }

    public int getCookTime(){
        return cookTime;
    } 

    public int getBurnTime(){
        return burnTime;
    } 
    
}
