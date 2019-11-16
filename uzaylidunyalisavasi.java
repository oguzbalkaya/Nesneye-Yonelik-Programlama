import java.util.Random;
import java.util.Scanner;
class Dunyali{
   static String tip;
   static int savunma;
   static int silahGucu;
   static int urunSayisi;
   public static int gucHesapla(){
       if(tip=="Çiftçi"){
           return urunSayisi;
       }
       return silahGucu*savunma;
   }
   public Dunyali(String t, int sav, int sil, int urun){
       tip=t;
       savunma=sav;
       silahGucu=sil;
       urunSayisi=urun;
   }
}
class Uzayli{
    static String tip;
    static int savunma;
    static int lazerGucu;
    static int madenSayisi;
    public static int gucHesapla(){
        if(tip=="Madenci"){
            return madenSayisi;
        }
        return lazerGucu*savunma;
    }
    public Uzayli(String t, int sav, int laz, int maden){
        tip=t;
        savunma=sav;
        lazerGucu=laz;
        madenSayisi=maden;
    }
}
public class uzaylidunyalisavasi {
    static int toplamPuan=0;
    public static int oyun(){
        String uzaylilar[]={"Madenci","Cyborg"};
        String dunyalilar[]={"Çiftçi","Asker"};
        Random rand = new Random();
        Uzayli[] uzay = new Uzayli[500];
        Dunyali[] dunya = new Dunyali[500];
//Rastgele uzaylı oluşturalım.
        for(int i=0 ; i<500; i++){
            int rastgeletipu=rand.nextInt(2);
            uzay[i]=new Uzayli(uzaylilar[rastgeletipu],rand.nextInt(11),rand.nextInt(11),rand.nextInt(11));
        }
        //Rastgele dünyalı oluşturalım.
        for(int j=0 ; j<500; j++){
            int rastgeletipd=rand.nextInt(2);
            dunya[j]=new Dunyali(dunyalilar[rastgeletipd],rand.nextInt(11),rand.nextInt(11),rand.nextInt(11));
        }
//Toplam güçleri hesaplayalım.
        int dunyalilarinGucu=0;
        int uzaylilarinGucu=0;
        for(int k=0; k<dunyalilar.length; k++){
            dunyalilarinGucu+=dunya[k].gucHesapla();
            uzaylilarinGucu+=uzay[k].gucHesapla();
        }
toplamPuan+=(dunyalilarinGucu-uzaylilarinGucu);
        return dunyalilarinGucu-uzaylilarinGucu;

    }
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int oyunDurum=0;
while(oyunDurum!=-1){
    System.out.println("Oyunu sonlandırmak için -1 , devam ettirmek için herhangi bir sayı yaz.");
    oyunDurum=input.nextInt();
    if(oyunDurum==-1) break;
    System.out.println("Bu eldeki puan : " + oyun());
}

System.out.println("Oyun bitti. Toplam Puan : " + toplamPuan);
}}
