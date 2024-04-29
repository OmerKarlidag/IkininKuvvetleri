import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz : ");
        n = input.nextInt();

       for (int i = 1; i < n; i *= 2) {
            System.out.println(i);
        }
    }
}
