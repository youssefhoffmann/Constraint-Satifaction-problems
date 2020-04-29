package fr.emse.ai.csp.NQueens;
import java.util.ArrayList;
import java.util.List;
import fr.emse.ai.csp.core.*;


public class NQueenscode extends CSP {

    public final List<Variable> R = new ArrayList<Variable>();
    public final List<Integer> C = new ArrayList<Integer>();

    public NQueenscode (int n) {
        Object[] tableauCol = new Object[n];
        for (int i=1; i<=n ; i++) {
            C.add(i);
            R.add(new Variable("R"+ i));
            tableauCol[i-1] = i;
        }
        collectVariables(n);
        Domain columns = new Domain(tableauCol) ;



        for (Variable var : getVariables())
            setDomain(var, columns);

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                addConstraint(new queensConstraint(R.get(i), R.get(j)));
            }
        }
    }

    private void collectVariables(int n) {
        for (int i=0; i<n ; i++) {
            addVariable(R.get(i));
        }
    }

}
