public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size=size;
        this.board = new PlayingPiece[size][size];
    }
}
