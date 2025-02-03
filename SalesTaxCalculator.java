import java.util.Objects;

public class SalesTaxCalculator {
    public static void main(String[] args) {

        State state = new State(); //creating a new state
        state.setName(args[0]); //setting the name of the state from the first command line argument

        double val = Double.valueOf(args[1]); //getting the number value of the
        String name = state.getName(); //setting the name of the state to 'name'

        state.showTax(val); //showTax
    }

}
