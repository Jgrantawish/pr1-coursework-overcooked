public class MeatIngredientInstruction extends IngredientInstruction {
    private int cookTime;
    private int burnTime;

    public MeatIngredientInstruction(String name, int chops, int cookTime, int burnTime){
        super(name,chops);
        this.cookTime = cookTime;
        this.burnTime = burnTime;
        this.instructions = "Cook in the oven for " + cookTime + " seconds.\n Then chop " + chops + "times at the chopping board.";
    }

    public int getCookTime(){
        return cookTime;
    } 

    public int getBurnTime(){
        return burnTime;
    } 
    
}