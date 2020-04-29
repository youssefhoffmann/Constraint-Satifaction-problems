package fr.emse.ai.csp.NQueens;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;
import java.lang.Math;
import fr.emse.ai.csp.core.Assignment;
import fr.emse.ai.csp.core.Constraint;
import fr.emse.ai.csp.core.Variable;
import fr.emse.ai.csp.core.*;

public class queensConstraint implements Constraint {

    private Variable var1;
    private Variable var2;
    private List<Variable> scope;

    public queensConstraint(Variable var1, Variable var2) {
        this.var1 = var1;
        this.var2 = var2;
        scope = new ArrayList<Variable>(2);
        scope.add(var1);
        scope.add(var2);
    }

    @Override
    public List<Variable> getScope() {
        return scope;
    }

    @Override
    public boolean isSatisfiedWith(Assignment assignment) {
        Object value1o = assignment.getAssignment(var1);
        Object value2o = assignment.getAssignment(var2);
        if ((value1o==null)||(value2o==null)) return true;
        int diff = Integer.parseInt(var2.toString().split("R")[1])- Integer.parseInt(var1.toString().split("R")[1]);
        int value1 = (int)value1o;
        int value2 = (int)value2o;
        return !((value1 == value2 + diff) || (value1 == value2) || (value1 == value2 - diff));
    }
}

