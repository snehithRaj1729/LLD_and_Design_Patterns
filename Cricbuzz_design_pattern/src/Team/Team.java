package Team;

public class Team {
    public String teamName;
    public Queue<PlayerDetails> playing11;
    public List<PlayerDetails> bench;
    public PlayerBattingController battingController;
    public PlayerBowlingController bowlingController;
    public boolean isWinner;

    public Team(PlayerBowlingController bowlingController, PlayerBattingController battingController, List<PlayerDetails> bench, Queue<PlayerDetails> playing11, String teamName) {
        this.bowlingController = bowlingController;
        this.battingController = battingController;
        this.bench = bench;
        this.playing11 = playing11;
        this.teamName = teamName;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public void chooseNextBatsMan() throws Exception{
        battingController.getNextPlayer();
    }

    public void chooseNextBowler() throws Exception{
        bowlingController.getNextBowler();
    }

    public void getStriker(){
        battingController.getStriker();
    }

    public void getNonStriker(){
        battingController.getNonStriker();
    }

    public void setStriker(PlayerDetails player){
        battingController.setStriker(player);
    }

    public void setNonStriker(PlayerDetails player){
        battingController.setNonStriker(player);
    }

    public PlayerDetails getCurrentBowler(){
        bowlingController.getCurrentBowler();
    }

    public void printBattingScoreCard(){
        for(PlayerDetails playerDetails:playing11){
            playerDetails.printBattingScoreCard();
        }
    }

    public void printBowlingScoreCard(){
        for(PlayerDetails playerDetails:playing11){
            playerDetails.printBowlingScoreCard();
        }
    }

    public int getTotalRuns(){
        int totalRuns = 0;
        for(PlayerDetails playerDetails:playing11){
            totalRuns+=playerDetails.battingScoreCard.totalRuns;
        }
        return totalRuns;
    }
}
