package ObjectsPackage.Shopping;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final ArrayList<Problem> problems = new ArrayList<>();


    public void add(Problem problem){
        problems.add(problem);
    }

    public void solveProblem(Problem isSolve){
        problems.remove(isSolve);
    }
    public  List<Problem> tellUnsolvedProblem(){
        return problems;
    }

}
