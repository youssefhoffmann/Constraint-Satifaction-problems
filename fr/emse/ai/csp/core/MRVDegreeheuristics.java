package fr.emse.ai.csp.core;


    public class MRVDegreeheuristics extends BacktrackingStrategy {

        /**
         * Implements MRV and degree heuristics
         */
        protected Variable selectUnassignedVariable(Assignment assignment, CSP csp) {
            Variable mrvVariable = new Variable("mrvVariable");
            boolean firstNonAssigned = true;
            for (Variable var : csp.getVariables()) {
                if (!(assignment.hasAssignmentFor(var))) {
                    if (firstNonAssigned == true) {
                        mrvVariable = var;
                        firstNonAssigned = false;
                    }
                    int nbValues = csp.getDomain(var).size();
                    int minNbValues = csp.getDomain(mrvVariable).size();
                    if (nbValues <= minNbValues) {
                        if (nbValues == minNbValues) {
                            if (csp.getConstraints(mrvVariable).size() < csp.getConstraints(var).size())
                                mrvVariable = var;
                        }else {
                            mrvVariable = var;
                        }
                    }
                }
            }
            if (!(assignment.hasAssignmentFor(mrvVariable)) && (mrvVariable.getName()!="mrvVariable")) return mrvVariable;
            return null;
        }

    }
