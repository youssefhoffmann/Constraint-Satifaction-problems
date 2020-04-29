package fr.emse.ai.csp.fourQueens;
import fr.emse.ai.csp.core.CSP;
import fr.emse.ai.csp.core.Domain;
import fr.emse.ai.csp.core.Variable;

public class FourQueenscode extends CSP {
    public static final Variable R1 = new Variable("R1");
    public static final Variable R2 = new Variable("R2");
    public static final Variable R3 = new Variable("R3");
    public static final Variable R4 = new Variable("R4");

    public static final int C1 = 1;
    public static final int C2 = 2;
    public static final int C3 = 3;
    public static final int C4 = 4;

    public FourQueenscode() {
        collectVariables();

        Domain columns = new Domain(new Object[]{C1, C2, C3, C4});

        for (Variable var : getVariables())
            setDomain(var, columns);

        addConstraint(new queensConstraint(R1, R2));
        addConstraint(new queensConstraint(R1, R3));
        addConstraint(new queensConstraint(R1, R4));
        addConstraint(new queensConstraint(R2, R3));
        addConstraint(new queensConstraint(R2, R4));
        addConstraint(new queensConstraint(R3, R4));
    }

    public void collectVariables() {
        addVariable(R1);
        addVariable(R2);
        addVariable(R3);
        addVariable(R4);
    }
}
