package PersonalAssessments;

import java.util.ArrayList;

public class Colours {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("yellow");
        colours.add("orange");
        colours.add("purple");
        colours.add("white");

//        System.out.println(colours);
        System.out.println(colours.size());
        for (String colour: colours) {
            System.out.println(colour);
        }
        colours.add(0, "pepper");
        System.out.println(colours);
        System.out.println(colours.get(3));
        colours.remove(2);
        System.out.println(colours);
        ArrayList<String> theColors = colours;
        System.out.println("TheColours = " + theColors);

    }
}
