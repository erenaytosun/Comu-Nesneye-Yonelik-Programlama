public abstract class Personel {

    private String ad;
    private String soyad;
    private String personelNo;

    public Personel(String ad,String soyad,String personelNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.personelNo = personelNo;

    }

    public String toString(){
        return getAd()+" "+getSoyad()+"numara : "+getPersonelNo();
    }
    public abstract double kazanc();   /// abstract medtodudur.Alt sınıflarda bu metodun içini doldurmak zorundasın

    public void doNothing(){

        System.out.println("personel doNothing");
    }




    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(String personelNo) {
        this.personelNo = personelNo;
    }



}
