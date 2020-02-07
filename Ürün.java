public class Ürün {

    private String ürünadı;
    private String ürüntürü;
    private Zaman zmn;

    public Ürün(String ad,String tur,Zaman zmn)
    {
        ürünadı=ad;
        ürüntürü=tur;
        this.zmn=zmn;
    }

    public Ürün() {
    }

    public String getÜrünadı() {
        return ürünadı;
    }

    public void setÜrünadı(String ürünadı) {
        this.ürünadı = ürünadı;
    }

    public String getÜrüntürü() {
        return ürüntürü;
    }

    public void setÜrüntürü(String ürüntürü) {
        this.ürüntürü = ürüntürü;
    }

    public Zaman getZmn() {
        return zmn;
    }

    public void setZmn(Zaman zmn) {
        this.zmn = zmn;
    }
}
