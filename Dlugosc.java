import java.util.Scanner;

public class Dlugosc {
    public static void main(String[] args) {
        System.out.print("Wprowadz tekst: ");
        Scanner sc = new Scanner(System.in);
        String al_tekst = sc.nextLine();
        System.out.print("Dlugosc wprowadzonego tekstu: " + al_tekst.length());
    }
}