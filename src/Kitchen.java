/*
 * Name: Zachary Doubikin
 * Date: 11/6/22
 * Assignment: CIS319 Week 5 Final Practical Exam
 */

public class Kitchen {
    private String Style;
    private String ApplianceBrand;
    
    //constructor
    public Kitchen(String style, String applianceBrand) {
        Style = style;
        ApplianceBrand = applianceBrand;
    }

    @Override
    public String toString() {
        return "The kitchen is a " + Style + " styled kitchen with " + ApplianceBrand + " appliances.";
    }
}
