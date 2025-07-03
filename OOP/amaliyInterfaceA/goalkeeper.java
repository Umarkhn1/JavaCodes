package OOP.amaliyInterfaceA;

public class goalkeeper extends Footballer {
    private int countofsaves;

    public goalkeeper(String NameOfplayer, String TypeOfSport, String teamName, int numberofposition, int CountofGoals, int CountofYellows, int CountofReds,int countofsaves) {
        super(NameOfplayer, TypeOfSport, teamName, numberofposition,CountofGoals,CountofYellows,CountofReds);
        this.countofsaves = countofsaves;
    }


    @Override
    public String getTeamName() {
        return super.getTeamName();
    }
    @Override
    public String getInfo() {
        return super.getInfo()+"\nCount of Saves : "+ countofsaves+"\n";
    }

}
