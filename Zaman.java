import java.sql.SQLOutput;

public class Zaman {

    private int yıl;
    private int ay;

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {

        if (yıl < 11 && yıl > 0){

        this.yıl =yıl;
        }
        else{
            System.exit(0);
        }
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {

        if(ay<=12 && ay>0 ){
            this.ay=ay;

        }
        else{
            System.exit(0);
        }
    }

    public Zaman(int yıl, int ay) {
        setAy(ay);
        setYıl(yıl);
    }

    public Zaman() {
    }
}
