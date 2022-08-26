/**
 * Calculator.java
 *
 * A simple JUnit example program.
 *
 * @author Dr. Fenwick
 * @version Spring 2019
 *
 */

public class Calculator 
{
    /**
     * Evaluates the expression parameter
     *
     * LIMITATION: The expresion can only contain + operations 
     * and integer literal operands.
     *
     * @param expression contains mathematical expression to evaluate
     * @return integer result of desired mathematical expression 
     */    
    public int evaluate(String expression) 
    {
	int sum = 0;
	for (String summand: expression.split("\\+"))
	{
	    sum += Integer.valueOf(summand);
	}
	return sum;
    }
}
