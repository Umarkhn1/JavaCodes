package OOP.amaliyInterfaceA;

public class Basketballer extends Player {
private int numberofgoals;
    public Basketballer(String NameOfplayer,String TypeOfSport,String teamName,int numberofposition,int numberofgoals){
        super(NameOfplayer, TypeOfSport, teamName, numberofposition);
        this.numberofgoals=numberofgoals;
    }

    @Override
    public String getTeamName() {
        return super.getTeamName();
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nNumber of Goals : "+numberofgoals;
    }
}
