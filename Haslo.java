import java.util.Scanner;

public class Haslo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj haslo: ");
        final String al_haslo = "123";
        String al_wpisanehaslo = sc.nextLine(); 
        if(al_haslo.equals(al_wpisanehaslo)){ 
            System.out.println("Wprowadziles haslo: " + al_wpisanehaslo);
            System.out.println("Haslo poprawne");
        } else System.out.println("Haslo niepoprawne");
    }
}