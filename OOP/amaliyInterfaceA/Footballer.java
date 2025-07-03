package OOP.amaliyInterfaceA;

public class Footballer extends Player {
    private int CountofReds;
    private int CountofYellows;
    private int CountofGoals;

    public Footballer(String NameOfplayer, String TypeOfSport, String teamName, int numberofposition, int CountofGoals, int CountofYellows, int CountofReds) {
        super(NameOfplayer, TypeOfSport, teamName, numberofposition);
        this.CountofGoals = CountofGoals;
        this.CountofReds = CountofReds;
        this.CountofYellows = CountofYellows;

    }
    @Override
    public String getTeamName() {
        return super.getTeamName();
    }
    @Override
    public String getInfo() {
        return super.getInfo()+"\nCount of Goals : "+CountofGoals+"\nCount of Reds : "+CountofReds+"\nCount of Yellow : "+CountofYellows;
    }


}


