/**
 * Created by Skyro on 18/01/2015.
 */
public interface Expression {
    Money reduce(Bank bank,String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
