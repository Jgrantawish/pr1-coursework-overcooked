
public class IngredientInstruction {
    private String ingredientName; 
    private int chopsRequired;
    protected String instructions; 

    public IngredientInstruction(String name, int chops){
        this.ingredientName = name;
        this.chopsRequired = chops;
        this.instructions = "Chop " + chopsRequired + "times at the chopping board.";
    }

    public String getIngredientName(){
        return ingredientName;
    } 

    public int getChopsRequired(){
        return chopsRequired;
    } 

    public String getInstructions(){
        return instructions;
    } 

}