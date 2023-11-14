package PersonalAssessments.W3Exercises;

public class MiddleCharacter {
    public String middleCharacter(String string){
        int position;
        int length;
        if (string.length() % 2 == 0)
        {
            position = string.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = string.length() / 2;
            length = 1;
        }
        return string.substring(position, position + length);
    }

    public static void main(String[] args) {
        MiddleCharacter middle = new MiddleCharacter();
        String name = "agboola";
        String name2 = "tobiloba";
         String result = middle.middleCharacter(name);
         String result2 = middle.middleCharacter(name2);
        System.out.println(result);
        System.out.println(result2);
    }
}
