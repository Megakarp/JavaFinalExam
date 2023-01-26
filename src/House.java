/*
 * Name: Zachary Doubikin
 * Date: 11/6/22
 * Assignment: CIS319 Week 5 Final Practical Exam
 */

public class House extends Building { //inheritance
    private int NumRooms;
    private Door FrontDoor; //composition
    private Kitchen MainKitchen; //composition
    
    //constructors
    public House( int numRooms, Door frontDoor, Kitchen mainKitchen) {
        super("House");
        NumRooms = numRooms;
        FrontDoor = frontDoor;
        MainKitchen = mainKitchen;
    }
    
    @Override
    public int getRooms() {
        return NumRooms;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + FrontDoor + "\n" + MainKitchen + "\n";
    } 
}
