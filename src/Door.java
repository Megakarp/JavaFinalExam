/*
 * Name: Zachary Doubikin
 * Date: 11/6/22
 * Assignment: CIS319 Week 5 Final Practical Exam
 */

public class Door {
    private int Width;
    private String Color;

    //contructor
    public Door(int width, String color) {
        Width = width;
        Color = color;
    }

    @Override
    public String toString() {
        return "The Door is " + Width + " inches wide and is " + Color + " in color.";
    }
}
