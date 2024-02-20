import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yil = input.nextInt();

        boolean artikYil = false;

        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            artikYil = true;
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}