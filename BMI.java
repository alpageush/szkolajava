import java.util.Scanner;

public class BMI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String al_imie = sc.nextLine();
        System.out.print("Podaj nazwisko: ");
        String al_nazwisko = sc.nextLine();
        System.out.print("Podaj wiek: ");
        int al_wiek = sc.nextInt();
        System.out.print("Wpisz swoją wage (kg): ");
        double al_waga = sc.nextDouble();
        System.out.print("Wpisz swoj wzrost (m): ");
        double al_wzrost = sc.nextDouble();

        double al_bmi = al_waga / (al_wzrost * al_wzrost);
        System.out.print("" + al_imie +" "+ al_nazwisko + al_wiek + "\nTwoje BMI: " + al_bmi + "\n");
        if (al_bmi<=16) System.out.println("wyglodzenie");
        else if (al_bmi<=17) System.out.println("wychudzenie");
        else if (al_bmi<=18) System.out.println("niedowaga");
        else if (al_bmi<=25) System.out.println("wagę prawidlowa");
        else if (al_bmi<=30) System.out.println("nadwaga");
        else if (al_bmi<=35) System.out.println("I stopien otylosci");
        else if (al_bmi<=40) System.out.println("II stopien otylosci");
        else System.out.println("otylosc skrajną");
    }
}