public class Diktörtgen extends GeometrikSekil {

    private double en;
    private double boy;

    public Diktörtgen(){
        en=0;
        boy=0;
    }
    public Diktörtgen(double a,double b){
       setEn(a);
       setBoy(b);
    }


    public double getEn() {
        return en;
    }

    public void setEn(double en) {

        if(en<0){
            this.en=0;
        }
        else{
            this.en=en;
        }

    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {

        if (boy < 0) {
            this.boy = 0;
        } else {
            this.boy = boy;
        }
    }

    public double alanHesapla(){

        return en*boy;
    }






}