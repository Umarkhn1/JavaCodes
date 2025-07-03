package OOP.amaliyInterfaceA;

public class Volleyballer extends Player {
    private int numberofpoints;

    public Volleyballer(String NameOfplayer,String TypeOfSport,String teamName,int numberofposition,int numberofpoints){
        super(NameOfplayer, TypeOfSport, teamName, numberofposition);
        this.numberofpoints=numberofpoints;
    }

    @Override
    public String getTeamName() {
        return super.getTeamName();
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nNumber of Points : "+ numberofpoints;
    }
}
