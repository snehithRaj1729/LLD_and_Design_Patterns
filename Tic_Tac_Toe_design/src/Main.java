//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initialiseGame();
        System.out.println("Game winner is "+game.startGame());
    }
}