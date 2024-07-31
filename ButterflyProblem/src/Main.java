public class Main {
    public static void main(String[] args) {
        int n = 9;
        for(int index= 1; index <= n; index += 1) {
            for(int innerIndex = 1; innerIndex <= n; innerIndex += 1) {
                if(index == innerIndex || index + innerIndex == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*

       1 2 3 4 5
    1  *       *
    2    *   *
    3      *
    4    *   *
    5  *       *


    */
}