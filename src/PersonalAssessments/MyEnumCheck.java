package PersonalAssessments;

public enum MyEnumCheck {
    NAME,
    CLASS,
    AGE,
    VALUE;

    public static void main(String[] args) {
        System.out.println(MyEnumCheck.CLASS);
        System.out.println(MyEnumCheck.NAME);
        System.out.println(MyEnumCheck.AGE);
        for (MyEnumCheck enumCheck: MyEnumCheck.values()){
            System.out.println(enumCheck);
        }
    }

}
