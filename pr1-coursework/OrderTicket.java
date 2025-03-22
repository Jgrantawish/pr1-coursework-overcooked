import greenfoot.*;

public class OrderTicket extends Actor {
    private GreenfootImage ticketBackground = new GreenfootImage("order-background.png");
    private final int TICKET_HEIGHT = MyWorld.WORLD_HEIGHT * 5/6;
    private final int TICKET_WIDTH = MyWorld.WORLD_WIDTH/3;
    private 

    public OrderTicket() {
        ticketBackground.scale(TICKET_WIDTH, TICKET_HEIGHT);
        setImage(ticketBackground);
        drawInstructions();
        
    }

    public void act() {

    }


    public void drawInstructions() {

    }

}
