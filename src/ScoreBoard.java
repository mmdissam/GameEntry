public class ScoreBoard {
    private int numEntries = 0;
    private GameEntry[] board;
    private int capacity;

    public ScoreBoard(int capacity) {
        this.board = new GameEntry[capacity];
        this.capacity = capacity;
    }

    public int getNumEntries() {
        return numEntries;
    }

    public GameEntry[] getBoard() {
        return board;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length)
                numEntries++;
            int j = numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1];
        }
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }
}
