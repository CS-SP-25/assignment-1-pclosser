public class Hawaii extends State{

    public void showTax(double value) {

        //4.5% tax for Hawaii
        double val = getBehavior().compute(value); //getting the tax behavior and
        //computing the tax (no tax) for the state
        System.out.printf("The sales tax on $" + String.format("%.2f", value) + " " +
                "in Hawaii is $" + String.format("%.2f", val) + ".");
        //printing out the results
    }
}
