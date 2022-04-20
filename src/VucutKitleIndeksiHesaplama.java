import java.util.Scanner;

/**
 * @author ANIL CAN ÖZDEMİR
 * Vücut Kitle İndeksi Hesaplama
 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 *
 * Formül
 * Kilo (kg) / Boy(m) * Boy(m)
 */
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        System.out.println("BOY VE KILO DEGERLERINI SIRASIYLA GIRINIZ.");
        Scanner input = new Scanner(System.in);
        double boy=input.nextDouble();
        double kilo=input.nextDouble();
        System.out.println("Vücut Kitle Indexiniz:"+(kilo/boy/boy));

    }
}
