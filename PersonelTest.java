import java.util.ArrayList;

public class PersonelTest {

    public static void main(String[] args){

        System.out.println("hello");


        MaasliPersonel maasliP=new MaasliPersonel("aaa","kkk","654123",5000);
        KomisyonluPersonel komiP=new KomisyonluPersonel("ccc","zzzz","6576575",40,5);
        MaasliKomPersonel mkP=new MaasliKomPersonel("ddd","hhh","987654",30,10,200);

        System.out.println(maasliP.kazanc());
        System.out.println(komiP.kazanc());
        System.out.println(mkP.kazanc());
        System.out.println(maasliP.toString());
        System.out.println(komiP.toString());
        System.out.println(mkP.toString());



        Personel[] personeller=new Personel[3];
        personeller[0]=maasliP;
        personeller[1]=komiP;
        personeller[2]=mkP;


        ArrayList<Personel> calisanlar=new ArrayList<>();
        calisanlar.add(maasliP);
        calisanlar.add(komiP);
        calisanlar.add(mkP);

        System.out.println("---------------------");

        for(Personel mevcutPersonel:personeller){
            System.out.println(mevcutPersonel);
            if(mevcutPersonel instanceof MaasliPersonel){
                mevcutPersonel.setSoyad("xxxxxxxxxxx");}
        }



    }




}
