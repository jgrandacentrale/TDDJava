/**
 * Created by Skyro on 18/01/2015.
 */
public class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount==money.amount && getClass().equals(money.getClass());
    }
}
