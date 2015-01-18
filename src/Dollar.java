/**
 * Created by Jgrand on 18/01/2015.
 */
public class Dollar extends Money {


    public Dollar(int amount, String currency){
        super (amount,currency);
    }

    public Money times(int multiplier){

        return new Money(amount*multiplier,currency);
    }

    String currency(){
        return currency;
    }




}
