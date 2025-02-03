public class NoTax implements SalesTaxBehavior{

    @Override
    public double compute(double value) {
        //returning zero for no taxes
        return 0.00;
    }
}
