import java.util.Random;
import java.util.Scanner;
class Dunyali{
    protected int savunma;
    public Dunyali(int savunma){
        this.savunma = savunma;
    }
}
class Uzayli{
    protected int savunma;
    public Uzayli(int savunma){
        this.savunma=savunma;
    }
}

class Asker extends Dunyali{
    private int silahGucu;
    public Asker(int sg,int sav){
        super(sav);
        silahGucu=sg;
    }
    public int gucHesapla(){
        return silahGucu*savunma;
    }
}
class Ciftci extends Dunyali{
    private int urunSayisi;
    public Ciftci(int us,int sav){
        super(sav);
        urunSayisi=us;
    }

    public int gucHesapla(){
        return urunSayisi;
    }
}
class Cyborg extends Uzayli{
    private int lazerGucu;
    public Cyborg(int lg,int sav){
        super(sav);
        lazerGucu=lg;
    }

    public int gucHesapla(){
        return lazerGucu*savunma;
    }
}
class Madenci extends Uzayli{
    private int madenSayisi;
    public Madenci(int ms,int sav){
        super(sav);
        madenSayisi=ms;
    }
    public int gucHesapla(){
        return savunma;
    }
}
class oyun {
    static int toplamPuan = 0;

    public int oyun() {
Dunyali [] Dunyalilar = new Dunyali[500];
Uzayli [] Uzaylilar = new Uzayli[500];
//Rastgele 500 Dunyali
for(int i=0; i<500; i++){
    Random rand = new Random();
    if(rand.nextInt(2) == 0){
        Dunyalilar[i] = new Asker(rand.nextInt(10),rand.nextInt(10));
    }else{
        Dunyalilar[i] = new Ciftci(rand.nextInt(10),rand.nextInt(10));
    }
}
        for(int j=0; j<500; j++){
            Random rand = new Random();
            if(rand.nextInt(2) == 0){
                Uzaylilar[j] = new Cyborg(rand.nextInt(10),rand.nextInt(10));
            }else{
                Uzaylilar[j] = new Madenci(rand.nextInt(10),rand.nextInt(10));
            }
        }
        int dunyalilarinGucu=0,uzaylilarinGucu=0;
        // Güçleri hesaplayalım.
for(int a=0;a<Dunyalilar.length;a++){
if(Dunyalilar[a] instanceof Asker){
    dunyalilarinGucu += ((Asker)Dunyalilar[a]).gucHesapla();
}else{
    dunyalilarinGucu += ((Ciftci)Dunyalilar[a]).gucHesapla();
}
}

        for(int b=0;b<Uzaylilar.length;b++){
            if(Uzaylilar[b] instanceof Cyborg){
                uzaylilarinGucu += ((Cyborg)Uzaylilar[b]).gucHesapla();
            }else{
                uzaylilarinGucu += ((Madenci)Uzaylilar[b]).gucHesapla();
            }
        }
toplamPuan += dunyalilarinGucu-uzaylilarinGucu;
return dunyalilarinGucu-uzaylilarinGucu;
    }
}
public class uzaylidunyalisavasi {

    public static void main(String[] args){
        oyun oyun = new oyun();
        int oyunDurum=0;
        Scanner input = new Scanner(System.in);
        while(oyunDurum!=-1){
            System.out.println("Puan : "+oyun.oyun());
            oyunDurum=input.nextInt();
            if(oyunDurum==-1) break;
        }
        System.out.println("Oyun bitti. Toplam puan : "+oyun.toplamPuan);
    }
}
