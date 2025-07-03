package OOP.amaliyInterfaceA;

public class amaliy4 {
    public static void main(String[] args) {

        Footballer footballer = new Footballer("Ronaldo", "Football", "Al Nassr", 7, 950, 20, 5);
        System.out.println(footballer.getTeamName());
        System.out.println(footballer.getInfo());

        goalkeeper goalkeeper = new goalkeeper("Cassilas", "Football", "Real Madrid", 1, 2, 10, 0, 200);
        System.out.println(goalkeeper.getTeamName());
        System.out.println(goalkeeper.getInfo());

        Volleyballer volleyballer = new Volleyballer("Thomas", "Volleyball", "Kings", 69, 96);
        System.out.println(volleyballer.getTeamName());
        System.out.println(volleyballer.getInfo());

        Setter setter = new Setter("Jake", "Volleyball", "Kings", 77, 12, 44);
        System.out.println(setter.getTeamName());
        System.out.println(setter.getInfo());

        Basketballer basketballer = new Basketballer("Michael", "Basketball", "Real", 10, 200);
        System.out.println(basketballer.getTeamName());
        System.out.println(basketballer.getInfo());

        pointofguard pointofguard = new pointofguard("Shelby","Basketball","Barsa",32,30,150);
        System.out.println(pointofguard.getTeamName());
        System.out.println(pointofguard.getInfo());



    }
}
