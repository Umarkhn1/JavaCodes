package OOP.amaliyconstructor;

public class Car1 {
    private String color;
    private String model;
    private double price;
    private boolean isAutomatic;

    public Car1(String color, String model, double price, boolean isAutomatic){
        this.color=color;
        this.model=model;
        this.price=price;
        this.isAutomatic=isAutomatic;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String model) {
this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(Integer price) {
         this.price=price;
    }
    public double getPrice(){
        return price;
    }


    public void setIsAutomatic(boolean isAutomatic) {
      this.isAutomatic=isAutomatic;
    }

    public String carinfo(){
        return "Car Info: " +
                "\nColor: " + color +
                "\nModel: " + model +
                "\nPrice: $" + price +
                "\nTransmission: " + (isAutomatic ? "Automatic" : "Manual");
    }

    public static void main(String[] args) {
       Car1 car= new Car1("Red","M5",23.000,true);
        System.out.println(car.carinfo());
    }
}
