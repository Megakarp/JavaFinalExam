/*
 * Name: Zachary Doubikin
 * Date: 11/6/22
 * Assignment: CIS319 Week 5 Final Practical Exam
 */

public abstract class Building {
    private String BuildingType;

    protected Building (String buildingType) {
        BuildingType = buildingType;
    }

    public abstract int getRooms();

    @Override
    public String toString() {
        return "This is a/an " + BuildingType + ". It has " + getRooms() + " rooms.";
    }
}