import java.util.Objects;

public class State {

    private String name; //name
    private SalesTaxBehavior taxBehavior;

    public String getName(){ //getter
        return name;
    }

    public void setName(String n){ //setter
        name = n;
    }

    public SalesTaxBehavior getBehavior (){

        return taxBehavior;
    }

    public void setBehavior (SalesTaxBehavior behavior){

        taxBehavior = behavior;
    }

    public void showTax(double value){ //showTax for the children

        if (Objects.equals(name, "Alaska") || Objects.equals(name, "alaska")) {
            //checking the name
            State alaska = new Alaska(); //constructing an alaska state
            alaska.setBehavior(new NoTax()); //setting the behavior
            alaska.showTax(value); //alaska show tax

        } else if (Objects.equals(name, "Hawaii") || Objects.equals(name, "hawaii")) {

            //checking if name is hawaii while ignoring cases
            State hawaii = new Hawaii();
            hawaii.setBehavior(new FourFiveTax()); //setting the behavior
            hawaii.showTax(value); //hawaii show tax

        } else{
            State indiana = new Indiana(); //constructing an alaska state
            indiana.setBehavior(new SevenPercent()); //setting the behavior
            indiana.showTax(value); //indiana show tax
        }

    }
}
