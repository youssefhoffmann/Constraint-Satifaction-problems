package fr.emse.ai.csp.NQueens;
import fr.emse.ai.csp.core.Assignment;
import fr.emse.ai.csp.core.CSP;
import fr.emse.ai.csp.core.CSPStateListener;
import fr.emse.ai.csp.core.MinConflictsStrategy;


public class NQueenstestMinconflict {

    public static void main(String[] args) {
        NQueenscode map = new NQueenscode(10);
        MinConflictsStrategy solver = new MinConflictsStrategy(15);
        solver.addCSPStateListener(new CSPStateListener() {
            @Override
            public void stateChanged(Assignment assignment, CSP csp) {
                System.out.println("Assignment evolved : " + assignment);
            }

            @Override
            public void stateChanged(CSP csp) {
                System.out.println("CSP evolved : " + csp);
            }
        });
        double start = System.currentTimeMillis();
        Assignment sol = solver.solve(map);
        double end = System.currentTimeMillis();
        System.out.println(sol);
        System.out.println("Time to solve = " + (end - start));

    }}



