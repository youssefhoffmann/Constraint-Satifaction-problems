package fr.emse.ai.csp.fourQueens;
import fr.emse.ai.csp.core.BacktrackingStrategy;
import fr.emse.ai.csp.core.Assignment;
import fr.emse.ai.csp.core.CSPStateListener;
import fr.emse.ai.csp.core.CSP;
public class fourQueenstest {

    public static void main(String[] args) {
          FourQueenscode map = new FourQueenscode();
          BacktrackingStrategy solver = new BacktrackingStrategy();
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



