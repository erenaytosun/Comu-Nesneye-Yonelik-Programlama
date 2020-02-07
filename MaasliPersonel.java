public class MaasliPersonel extends Personel {

    private double haftalikMaas;

    public MaasliPersonel(String ad, String soyad, String personelNo,double maas) {
        super(ad, soyad, personelNo);
        setHaftalikMaas(maas);
    }

    public double kazanc(){

        return getHaftalikMaas();
    }

    public double getHaftalikMaas() {
        return haftalikMaas;
    }

    public void setHaftalikMaas(double maas) {
        this.haftalikMaas = maas;
    }

    public String toString(){
        return super.toString()+" "+getHaftalikMaas();
    }





}
