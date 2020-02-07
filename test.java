
public class test {

    public static void main(String[] args){


        // m1 m2 uret goster
        //matris topla goster
        //matristranspoz al goster
        int m1[][]=matrisuret(3,3);

        dizigoster(m1);
        int m2[][]=matrisuret(3,3);
        dizigoster(m2);
        int toplamdizi[][]=matristopla(m1,m2);
        dizigoster(toplamdizi);
        int trans[][]=matristranspoz(m1);
        dizigoster(trans);



    }
    public static int[][]matrisuret(int satır,int sutun){
        int dizi[][]=new int[satır][sutun];
        for(int a=0;a<satır;a++){
            for(int b=0;b<sutun;b++){
               int randomSayi=(int)(Math.random()*10);
                dizi[a][b]=randomSayi;
            }
        }
        return dizi;
    }
    public static void dizigoster(int[][] dizi){
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[i].length;j++){

                System.out.print(dizi[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-------------");


    }
    public static int[][] matristopla(int[][]z,int[][]k){

        int dizi[][]=new int[z.length][z[0].length];
        for(int i=0;i<z.length;i++){
            for(int j=0;j<z[i].length;j++){
                dizi[i][j]=z[i][j]+k[i][j];
            }
        }
    return dizi;
    }
    public static int[][] matristranspoz(int x[][]){


        int dizi[][]=new int[x.length][x[0].length];
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
               dizi[i][j]=x[j][i];
            }
        }
        return dizi;




    }
}
