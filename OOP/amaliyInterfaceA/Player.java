package OOP.amaliyInterfaceA;

public class Player implements Information {
    private String NameOfPlayer;
    private String TypeOfSport;
    private String teamName;
private int numberofposition;

    public Player(String NameOfplayer,String TypeOfSport,String teamName,int numberofposition){
        this.NameOfPlayer=NameOfplayer;
        this.teamName=teamName;
        this.TypeOfSport=TypeOfSport;
        this.numberofposition=numberofposition;
    }

    @Override
    public String getInfo() {
return "Name of player : "+NameOfPlayer+"\nType of sport : "+TypeOfSport+"\nnumber of position : "+numberofposition;
    }

    @Override
    public String getTeamName() {
        return "\nTeam name is :"+teamName;
    }
}
