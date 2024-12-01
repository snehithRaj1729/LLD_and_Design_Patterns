import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game(){
        initialiseGame();
    }

    private void initialiseGame() {
        board = new Board(10,5,4); // Board size,number of snakes,number of ladders
        dice = new Dice(1);
        winner=null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1",0);// player id , current position
        Player player2 = new Player("p2",0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame() {
        while(winner==null){
            Player playerTurn = findPlayerTurn();
            System.out.println("Player turn is: "+playerTurn.id+" current position is: "+playerTurn.currentPosition);
            int diceNumber = dice.rollDice();// roll the dice

            int currentPlayersNewPosition = playerTurn.currentPosition+diceNumber;//get the new position
            currentPlayersNewPosition = jumpCheck(currentPlayersNewPosition);
            playerTurn.currentPosition = currentPlayersNewPosition;

            System.out.println("Player turn is: "+playerTurn.id+" new position is: "+currentPlayersNewPosition);
            if(currentPlayersNewPosition>=(board.cells.length*board.cells.length)-1){
                winner=playerTurn;
            }
        }
        System.out.println("WINNER IS: "+winner.id);
    }

    private int jumpCheck(int currentPlayersNewPosition) {
        if(currentPlayersNewPosition>board.cells.length*board.cells.length-1){
            return currentPlayersNewPosition;
        }

        Cell cell = board.getCell(currentPlayersNewPosition);
        if(cell.jump!=null && cell.jump.start==currentPlayersNewPosition ){
            String jumpBy = (cell.jump.start<cell.jump.end)? "ladder":"snake";
            System.out.println("Jump done by: "+jumpBy);
            return cell.jump.end;
        }
        return currentPlayersNewPosition;
    }

    private Player findPlayerTurn() {
        Player playerTurn = playersList.removeFirst();
        playersList.addLast(playerTurn);
        return playerTurn;
    }
}
