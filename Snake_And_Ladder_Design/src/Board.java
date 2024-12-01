import java.io.OptionalDataException;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;



    public Board(int boardSize, int numberOfSnakes, int numberOfLaddders) {
        initialiseCells(boardSize);
        addSnakesLadders(numberOfSnakes,numberOfLaddders);
    }

    private void addSnakesLadders(int numberOfSnakes, int numberOfLaddders) {
        while(numberOfSnakes>0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, (cells.length* cells.length)-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, (cells.length* cells.length)-1);
            if(snakeTail>=snakeHead){
                continue;
            }
            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;
            numberOfSnakes--;
        }

        while(numberOfLaddders>0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1, (cells.length* cells.length)-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, (cells.length* cells.length)-1);

            if(ladderStart >= ladderEnd){
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;
            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;
            numberOfLaddders--;
        }
    }

    private void initialiseCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++)
        {
            for(int j=0;j<boardSize;j++){
                Cell cellobj = new Cell();
                cells[i][j]=cellobj;
            }
        }
    }

    public Cell getCell(int currentPlayersNewPosition) {
        int boardRow = currentPlayersNewPosition/ cells.length;
        int boardColumn = currentPlayersNewPosition% cells.length;
        return cells[boardRow][boardColumn];
    }
}
