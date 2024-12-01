import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min=1;
    int max=6;

    Dice(int diceCount){
        this.diceCount=diceCount;
    }

    int rollDice(){
        int totalSum=0;
        int diceUsed=0;
        while(diceUsed<diceCount){
            totalSum+= ThreadLocalRandom.current().nextInt(min,max+1);
            diceUsed+=1;
        }
        return totalSum;
    }
}
