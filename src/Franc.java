/**
 * Created by Skyro on 18/01/2015.
 */
public class Franc extends Money{


    public Franc(int amount, String currency){
        super (amount,currency);
    }

    public Money times(int multiplier){

        return new Money(amount*multiplier, currency);
    }

    String currency(){
        return currency;
    }


}
