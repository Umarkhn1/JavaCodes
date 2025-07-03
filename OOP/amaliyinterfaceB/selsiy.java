package OOP.amaliyinterfaceB;

public class selsiy implements Converter {
    private double Farengeyt;
    private double Kelvin;
 double a = 273.15;
    public selsiy(double Farengeyt,double Kelvin){
        this.Farengeyt=Farengeyt;
        this.Kelvin=Kelvin;

    }

    @Override
    public String convert() {
        return "F to C : "+(Farengeyt-32)*5/9+"\nK to C : "+(a-Kelvin);
    }


}
