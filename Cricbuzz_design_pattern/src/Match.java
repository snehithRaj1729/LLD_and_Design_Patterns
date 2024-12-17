import java.util.Date;

public class Match {
    Team teamA;
    Team teamB;
    Date matchDate;
    String venue;
    Team tossWinner;
    InningDetails[] innings;
    MatchType matchType;

    public Match(String venue, Team teamA, Team teamB, Date matchDate, MatchType matchType) {
        this.venue = venue;
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.matchType = matchType;
        innings = new InningDetails[2];
    }

    public void startMatch(){
        tossWinner = toss(teamA,teamB); // toss

        for(int inning=1;inning<=2;inning++){
            InningDetails inningDetails;
            Team bowlingTeam;
            Team battingTeam;

            boolean isChasing = false;
            if(inning ==1){
                battingTeam = tossWinner;
                bowlingTeam = tossWinner.getTeamName().equals(teamA.getTeamName())? teamB:teamA;
                inningDetails = new InningDetails(battingTeam,bowlingTeam,matchType);
                inningDetails.start(-1);
            }
            else{
                bowlingTeam = tossWinner;
                battingTeam = tossWinner.getTeamName().equals(teamA.getTeamName())? teamB:teamA;
                inningDetails = new InningDetails(battingTeam,bowlingTeam,matchType);
                inningDetails.start(innings[0].getTotalRuns());
                if(bowlingTeam.getTotalRuns()> battingTeam.getTotalRuns()){
                    bowlingTeam.isWinner = true;
                }
            }
            innings[inning-1] = inningDetails;
            System.out.println();
            System.out.println("INNING "+inning+" ---total Runs: "+battingTeam.getTotalRuns());
            System.out.println("----Batting scorecard: "+battingTeam.teamName + "-----");
            battingTeam.printBattingScoreCard();

            System.out.println();
            System.out.println("-----Bowling score card "+bowlingTeam.teamName+"-----");
            bowlingTeam.printBowlingScoreCard();
        }
        System.out.println();
        if(teamA.isWinner){
            System.out.println("----Winner----"+teamA.teamName);
        }
        else{
            System.out.println("-----Winner-----"+teamB.teamName);
        }
    }

    private Team toss(Team teamA, Team teamB) {
        if(Math.random()<0.5){
            return teamA;
        }
        return teamB;
    }
}
