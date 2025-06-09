import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        final int ANSWER = 57; // プログラマが設定した2桁の正の整数
        final int MAX_TRY = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("2桁の正の整数を当ててください。チャンスは" + MAX_TRY + "回です。");

        for (int i = 1; i <= MAX_TRY; i++) {
            System.out.print(i + "回目の入力: ");
            int guess = scanner.nextInt();

            if (guess == ANSWER) {
                System.out.println("当たり！");
                return;
            } else if (guess < ANSWER) {
                if (ANSWER - guess >= 20) {
                    System.out.println("もっと大きいです（20以上差があります）");
                } else {
                    System.out.println("もっと大きいです");
                }
            } else {
                if (guess - ANSWER >= 20) {
                    System.out.println("もっと小さいです（20以上差があります）");
                } else {
                    System.out.println("もっと小さいです");
                }
            }
        }
        System.out.println("残念！正解は " + ANSWER + " でした。");
        scanner.close();
    }
}