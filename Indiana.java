public class Indiana extends State{

    @Override
    public void showTax(double value) {

        //using the seven percent
        double val = getBehavior().compute(value); //getting the tax behavior and
        //computing the tax (no tax) for the state
        System.out.printf("The sales tax on $" + String.format("%.2f", value) + " " +
                "in Indiana is $" + String.format("%.2f", val) + ".");
        //printing out the results
    }
}
