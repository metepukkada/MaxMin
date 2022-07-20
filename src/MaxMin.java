import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int numberCount = 1 ;
        Scanner scanner = new Scanner(System.in);
        do {if (numberCount < 0){
            System.out.println("Negatif Değer Girmeyiniz!");
        }
            System.out.print("Gireceğiniz Rakam Sayısını Yazınız: ");
            numberCount = scanner.nextInt();
        } while (numberCount < 0);

        int i = 1;
        int max= 0, min = 0;
        while (numberCount != 0) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            int tempNumber = scanner.nextInt();
            if (i == 1){
                max = tempNumber;
                min = tempNumber;
            }
            if (tempNumber > max){
                max = tempNumber;
            }
            if (tempNumber < min){
                min = tempNumber;
            }
            i++;
            numberCount--;
        }
        System.out.println("Maksimum Sayı: " + max + " ," + "Minimum Sayı: " + min + ".");
    }
}
