import java.util.ArrayList;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public GreenfootImage background = new GreenfootImage("images/kitchen_floor.png");
    public ArrayList<IngredientInstruction> ingredientInfos;
    public static final int WORLD_HEIGHT = 500;
    public static final int WORLD_WIDTH = 1100;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 1100x500 cells with a cell size of 1x1 pixels.
        super(WORLD_WIDTH, WORLD_HEIGHT, 1);
        this.ingredientInfos = new ArrayList<IngredientInstruction>();
        background.scale(WORLD_WIDTH, WORLD_HEIGHT);
        setBackground(background);
        
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,500,250);
        
        addObject(new Counter(), 1075, 475);
        addObject(new Counter(), 1075, 425);
        addObject(new Counter(), 1075, 375);
        addObject(new Counter(), 1025, 475);
        addObject(new Counter(), 975, 475);
        addObject(new Counter(), 925, 475);
        
        addObject(new Counter(), 1075, 25);
        addObject(new Counter(), 1025, 25);
        addObject(new Counter(), 975, 25);
        addObject(new Counter(), 1075, 75);
        addObject(new Counter(), 1075, 125);
        
        addObject(new Counter(), 875, 225);
        addObject(new Counter(), 825, 225);
        addObject(new Counter(), 775, 225);
        addObject(new Counter(), 875, 275);
        addObject(new Counter(), 725, 225);
        addObject(new Counter(), 675, 225);
        addObject(new Counter(), 675, 275);
        
        addObject(new Counter(), 475, 25);
        addObject(new Counter(), 525, 25);
        addObject(new Counter(), 575, 25);
        addObject(new Counter(), 625, 25);
        
        //Wall between kitchen and restaurant - counters work for now, left a
        //gap for service hatch object
        addObject(new Counter(), 425, 25);
        addObject(new Counter(), 425, 75);
        addObject(new Counter(), 425, 125);
        addObject(new Counter(), 425, 175);
        addObject(new Counter(), 425, 325);
        addObject(new Counter(), 425, 375);
        addObject(new Counter(), 425, 425);
        addObject(new Counter(), 425, 475);

        createAllIngredientInstructions();


        VegetableIngredientInstruction carrotInfo = (VegetableIngredientInstruction) findIngredientInstruction("carrot");
        
        Ingredient carrot = IngredientFactory.createVegetableIngredient(carrotInfo.getIngredientName(),carrotInfo.getChopsRequired(),carrotInfo.getCookTime(),carrotInfo.getBurnTime());
        addObject(carrot,25,25);
        Ingredient bread = IngredientFactory.createStandardIngredient("bread",5);
        addObject(bread,12,15);

        
    }

    private void createAllIngredientInstructions(){
        VegetableIngredientInstruction carrotInfo = new VegetableIngredientInstruction("carrot", 10, 20, 25);
        this.ingredientInfos.add(carrotInfo);     
    }

    private IngredientInstruction findIngredientInstruction(String name){
        IngredientInstruction instruction = null;
        for (IngredientInstruction ingredientInstruction : ingredientInfos) {
            if (ingredientInstruction.getIngredientName() == name){
                instruction = ingredientInstruction;
                break;
            }
        }
        return instruction;
    }

}
