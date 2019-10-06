import java.util.Random;

public class Test {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard(5);
        int i = 0;
        Random random = new Random();
        while (scoreBoard.getNumEntries() < scoreBoard.getCapacity()){
            scoreBoard.add(new GameEntry("mohamed"+random.nextInt(10), 150+ random.nextInt(10)));
            i++;
        }
        printBoard(scoreBoard);
        System.out.println("----------------------");
        scoreBoard.add(new GameEntry("mohamed"+6, 150+random.nextInt(10)));
        printBoard(scoreBoard);
        System.out.println("----------------------");
        System.out.println(scoreBoard.remove(3).toString());
        System.out.println("----------------------");
        printBoard(scoreBoard);

    }

    public static void printBoard(ScoreBoard scoreBoard){
        int i = 0;
        while (i < scoreBoard.getNumEntries()){
            System.out.println(scoreBoard.getBoard()[i].toString());
            i++;
        }
    }
}
