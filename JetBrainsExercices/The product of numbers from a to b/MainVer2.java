import java.util.Scanner;
//CincoOcho, Hyperskiils_JetBrains.com

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int begin = scn.nextInt();
        int limit = scn.nextInt();
        int auxBegin = begin + 1;
        int auxLimit = limit - 1;
        int wall = limit - 1;

        long acum = 0;
        if (limit - 1 == begin) {
            System.out.println(begin);
        } else {

            for (int i = auxBegin; i < limit; i++) {
                acum = begin * auxLimit;
                if (acum == begin) {
                    break;
                } else {
                    auxLimit--;
                }
                for (int j = auxBegin; j < wall; j++, auxLimit--) {
                    acum *= auxLimit;
                }
                limit--;
                break;
            }
            System.out.println(acum);
        }
    }
}