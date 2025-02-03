public class SevenPercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        //calculating the tax for Indiana
        return (value * 0.07);
    }
}
