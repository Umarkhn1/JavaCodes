package OOP.amaliyinterfaceB;

public class kelvin implements Converter{
        private double Farengeyt;
        private double Celsiy;
        double a = 273.15;

        public kelvin(double Farengeyt,double Celsiy){
            this.Farengeyt=Farengeyt;
            this.Celsiy=Celsiy;

        }

        @Override
        public String convert() {
            return "F to K : "+((32*Farengeyt-32)*5/9+273.15)+"\nC to K : "+(a-Celsiy);
        }

    }
