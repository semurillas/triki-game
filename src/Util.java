public class Util {

    public static int[] positionToIndex(int position) {
        int[] response = new int[2];
        switch (position) {
            case 1:
                response[0] = 0;
                response[1] = 0;
                break;

            case 2:
                response[0] = 0;
                response[1] = 1;
                break;

            case 3:
                response[0] = 0;
                response[1] = 2;
                break;

            case 4:
                response[0] = 1;
                response[1] = 0;
                break;

            case 5:
                response[0] = 1;
                response[1] = 1;
                break;

            case 6:
                response[0] = 1;
                response[1] = 2;
                break;

            case 7:
                response[0] = 2;
                response[1] = 0;
                break;

            case 8:
                response[0] = 2;
                response[1] = 1;
                break;

            case 9:
                response[0] = 2;
                response[1] = 2;
                break;
        }

        return response;
    }

    public static boolean isWinner(String[][] game) {
        return isWinnerOnLine1(game) || isWinnerOnLine2(game);
    }

    public static boolean isWinnerOnLine1(String[][] game) {
        //validar en linea horizontal 1
        if (game[0][0] != "-" && game[0][0] == game[0][1] && game[0][1] == game[0][2])
            return true;
        return false;
    }

    public static boolean isWinnerOnLine2(String[][] game) {
        //validar en linea horizontal 2
        if (game[1][0] != "-" && game[1][0] == game[1][1] && game[1][1] == game[1][2])
            return true;
        return false;
    }
}
