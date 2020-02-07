import java.util.Scanner;
public class test {

    public static void main(String[] args){

        Scanner yaz=new Scanner(System.in);
        işçi i1=new işçi("Erenay","TOSUN",151,1);
        System.out.println("işçinin adini giriniz : ");
        String adi=yaz.nextLine();
        System.out.println("işçinin soyadini giriniz : ");
        String soyadi=yaz.nextLine();
        System.out.println("işçinin çalışma saatini giriniz : ");
        int saat=yaz.nextInt();
        System.out.println("işçinin saatlik ücretini giriniz : ");
        int ücret=yaz.nextInt();
        işçi i2=new işçi();
        i2.setAd(adi);
        i2.setSoyad(soyadi);
        i2.setÇalışma_saati(saat);
        i2.setSaat_ücreti(ücret);
        System.out.println("Birinci işçinin adı: "+i1.getAd()+"  soyadı: "+i1.getSoyad()+"  MAAŞI :"+işçi.Hesapla(i1.getÇalışma_saati(),i1.getSaat_ücreti()));
        System.out.println("İkinci işçinin adı: "+i2.getAd()+"  soyadı: "+i2.getSoyad()+"  MAAŞI :"+işçi.Hesapla(i2.getÇalışma_saati(),i2.getSaat_ücreti()));




    }


}
