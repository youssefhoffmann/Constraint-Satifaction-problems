# Constraint-Satifaction-problems
The problem is solved when each variable has a value that satisfies all the constraints on the variable. Search algorithms include Backtracking and Min-conflicts

Course given by: Gauthier PICARD, Professor. PhD. HDR at the Ecole des Mines de Saint-étienne.

Here is his statement of the problem: https://www.emse.fr/~picard/cours/ai/csp/index.html

The source files were written by Pr. Gauthier PICARD (inspired from the algorithm provided by AIMA-Java Project), then completed by us following the exercices presented in the previous link. This project was accomplished by me and my colleague Younes Gueddari.

The files are to be found in the src folder of the Java Project.

Main files are in src/fr/emse/ai/csp/ :

australia: contains a simple constraint satisfaction problem which consists of colouring australia's map with the constraint that every adjacent regions should be assigned a different color. australia/TestAustralia.java is the file the test the Backtracking solver on this problem.

core: contains all the solvers and the necessary interfaces (Variable, Constraint, Domain, CSP).

queens: this is a simple 4-queens problem. The folder contains two files, queens.java which is an implementation of CSP (the problem's modelization) and Test.java the file to execute in order to test the backtracking solver on this problem.

queensN: this is a complex N-queens problem. The folder contains two files, queensN.java which is an implementation of CSP (the problem's modelization) and TestN.java the file to execute in order to test multiple solvers: A simple backtracking (values of N allowed are very limited), a Min-confilct solver (can go up to N=1000). To improve the backtracking solver, some heuristics were added improving whether the choice of the next variables or the values assigned, these heuristics include: the Minimum remaining values, the Degree and the least constraining value heuristics.
