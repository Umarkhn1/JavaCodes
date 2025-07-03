package OOP.amaliyInterfaceA;

public class pointofguard extends Basketballer {
    private int countofguards;
    public pointofguard(String NameOfplayer,String TypeOfSport,String teamName,int numberofposition,int numberofgoals,int countofguards){
        super(NameOfplayer, TypeOfSport, teamName, numberofposition, numberofgoals);
        this.countofguards=countofguards;

    }

    @Override
    public String getTeamName() {
        return super.getTeamName();
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nCount of guards : "+countofguards+"\n";
    }
}
