public class KomisyonluPersonel extends Personel {

    private double satisAdet;
    private double komisyon;

    public double getSatisAdet() {
        return satisAdet;
    }

    public void setSatisAdet(double satisAdet) {
        this.satisAdet = satisAdet;
    }

    public double getKomisyon() {
        return komisyon;
    }

    public void setKomisyon(double komisyon) {
        this.komisyon = komisyon;
    }

    public KomisyonluPersonel(String ad, String soyad, String personelNo,double satis,double kom) {
        super(ad, soyad, personelNo);
        setSatisAdet(satis);
        komisyon=kom;
    }

    @Override
    public double kazanc() {
        return getKomisyon()*getSatisAdet();
    }

    public String toString(){
        return "KomisyonluPersonel\t:"+super.toString()+" "+getKomisyon()+" "+getSatisAdet();
    }
    public void doNothing(){
        System.out.println("KomisyonluPersonel doNothing");
    }


}
