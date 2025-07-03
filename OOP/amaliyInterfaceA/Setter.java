package OOP.amaliyInterfaceA;

public class Setter extends Volleyballer {
    private int numberofsets;

    public Setter(String NameOfplayer,String TypeOfSport,String teamName,int numberofposition,int numberofpoints,int numberofsets){
        super(NameOfplayer, TypeOfSport, teamName, numberofposition, numberofpoints);
        this.numberofsets=numberofsets;
    }

    @Override
    public String getTeamName() {
        return super.getTeamName();
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nNumber of sets : "+numberofsets+"\n";
    }
}
