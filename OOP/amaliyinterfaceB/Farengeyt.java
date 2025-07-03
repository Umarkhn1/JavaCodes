package OOP.amaliyinterfaceB;

public class Farengeyt implements Converter{
    private double Kelvin;
    private double Celsiy;
    double a = 273.15;

    public Farengeyt(double Kelvin,double Celsiy){
        this.Kelvin=Kelvin;
        this.Celsiy=Celsiy;

    }

    @Override
    public String convert() {
        return "K to F : "+((Kelvin-273.15)*9/5+32)+"\nC to F : "+((Celsiy*9/5)+32);
    }
}
