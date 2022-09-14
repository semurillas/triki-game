import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] game = new String[3][3];
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                game[y][x] = "-";
            }
        }

        System.out.println("Welcome to triki game");

        System.out.println("please enter name to player 1");
        String namePlayer1 = sc.next();
        Player player1 = new Player(namePlayer1, "X");

        System.out.println("please enter name to player 2");
        String namePlayer2 = sc.next();
        Player player2 = new Player(namePlayer2, "O");

        boolean isFinish = false;
        int turn = 1;
        do {
            String symbol;
            if (turn % 2 == 0) { //player2
                symbol = player2.getSymbol();
            } else { //player1
                symbol = player1.getSymbol();
            }
            System.out.println("Player " + symbol + " enter position 1-9: ");
            int positionInt = sc.nextInt();
            int[] index = Util.positionToIndex(positionInt);

            int y = index[0];
            int x = index[1];
            game[y][x] = symbol;

            turn++;

            isFinish = Util.isWinner(game);
            if (isFinish)
                System.out.println("Player " + symbol + " is winner!");


        } while (!isFinish);

    }
}