public class MaasliKomPersonel extends KomisyonluPersonel {


    private double tabanMaas;


    public double getTabanMaas() {
        return tabanMaas;
    }

    public void setTabanMaas(double tabanMaas) {
        this.tabanMaas = tabanMaas;
    }

    public MaasliKomPersonel(String ad, String soyad, String personelNo, double satis, double kom, double tabanMaas) {
        super(ad, soyad, personelNo, satis, kom);
        this.tabanMaas = tabanMaas;
    }
    public String toString(){

        return "MaasliKomisyonluPersonel\t"+super.toString()+" "+getTabanMaas();
    }

    @Override
    public double kazanc() {
        return super.kazanc()+getTabanMaas();
    }
    public void doNothing(){
        super.doNothing();
    }

}
