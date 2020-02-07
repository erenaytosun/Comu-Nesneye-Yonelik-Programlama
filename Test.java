import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Ürün[] dizi = new Ürün[5];
        int ay,yıl;
        String ad,tur;

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < dizi.length; i++) {


            System.out.printf("%d. ürünün adını giriniz: ", (i + 1));
            ad = scan.nextLine();
            System.out.printf("%d. ürünün türünü giriniz: ", (i + 1));
            tur = scan.nextLine();
            System.out.printf("%d. ürünün yılını giriniz: ", (i + 1));
            yıl = scan.nextInt();
            System.out.printf("%d. ürünün ayını giriniz: ", (i + 1));
            ay = scan.nextInt();
            Zaman z=new Zaman(yıl,ay);
            Ürün a=new Ürün(ad,tur,z);
            dizi[i]=a;


        }
            ElemanlarıGoster(dizi);


            System.out.println("------------------------------------------------------------------------");

            Sırala(dizi);
            ElemanlarıGoster(dizi);


    }

    public static void ElemanlarıGoster(Ürün []dizi){

        for(int i=0;i<dizi.length;i++) {
            System.out.println("Ürünün adı : "+dizi[i].getÜrünadı()+"  Ürünün türü : "+dizi[i].getÜrüntürü()+" Ürünün yılı : "+dizi[i].getZmn().getYıl()+" Ürünün ayı : "+dizi[i].getZmn().getAy());
        }


    }

    public static Ürün[] Sırala(Ürün []dizi){

        Ürün gecici;

        for(int i=1;i<dizi.length;i++){
            for(int j=0;j<dizi.length-1;j++) {
                if (dizi[j].getZmn().getYıl() > dizi[j+1].getZmn().getYıl()) {

                    gecici = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = gecici;
                }
                else if (dizi[j].getZmn().getYıl() == dizi[j+1].getZmn().getYıl()) {

                        if (dizi[j].getZmn().getAy() > dizi[j+1].getZmn().getAy()) {


                            gecici= dizi[j];
                            dizi[j] = dizi[j+1];
                            dizi[j+1] = gecici;

                        }



                    }

            }

        }

        return dizi;
    }



}
