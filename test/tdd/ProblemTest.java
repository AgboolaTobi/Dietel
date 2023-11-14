package tdd;

import ObjectsPackage.Shopping.Person;
import ObjectsPackage.Shopping.Problem;
import ObjectsPackage.Shopping.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {
    @Test
    public void testProblems(){
        Problem problem = new Problem("broke", Type.FINANCIAL);
        assertEquals("FINANCIAL", String.valueOf(problem.getType()));
    }

    @Test
    public void testProblems2(){
        Person person = new Person();
        Problem problem = new Problem("broke", Type.FINANCIAL);
        person.add(problem);
        Problem problem2 = new Problem("Smart", Type.EDUCATIONAL);
        person.add(problem2);
        assertEquals(2, person.tellUnsolvedProblem().size());

        person.solveProblem(problem);
        assertEquals(1, person.tellUnsolvedProblem().size());
    }

}