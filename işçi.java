public class işçi {

        private String ad;
        private String soyad;
        private int çalışma_saati;
        private int saat_ücreti;

        public işçi(){

        }
        public işçi(String a,String b,int c,int d){

            ad=a;
            soyad=b;
            çalışma_saati=c;
            saat_ücreti=d;
        }

        public void setAd(String a){
            ad=a;
        }
        public String getAd(){
            return ad;
        }
        public void setSoyad(String b){
            soyad=b;
        }
        public String getSoyad(){
            return soyad;
        }
        public void setÇalışma_saati(int c)
        {
            çalışma_saati = c;
        }

        public int getÇalışma_saati(){
            return çalışma_saati;
        }
        public void setSaat_ücreti(int x)
        {
            saat_ücreti=x;
        }
        public int getSaat_ücreti(){
            return saat_ücreti;
        }
        public static int Hesapla(int z,int y){
            int maas;
            if(z>100){
                int fazlalık=z-100;
                if(fazlalık%2==0){
                    maas=(z*y)+((fazlalık/2)*50);
                }
                else{
                    fazlalık=fazlalık-1;
                    maas=(z*y)+((fazlalık/2)*50);
                }

            }
            else{
                maas=z*y;
            }


            return maas;
        }


}
