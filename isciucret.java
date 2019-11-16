import java.util.Scanner;

class isci{
    private static String ad;
    private static String soyad;
    private static int calismaSaati;
    private static int saatlikUcret;


    public isci(String a,String s,int cs,int su){
        ad=a;
        soyad=s;
        calismaSaati=cs;
        saatlikUcret=su;
    }

    public static void setAd(String a){
        ad=a;
    }
    public static void setSoyad(String a){
        soyad=a;
    }
    public static void setCalismaSaati(int cs){
        calismaSaati=cs;
    }
    public static void setSaatlikUcret(int su){
        saatlikUcret=su;
    }

    public static String getAd(){
        return ad;
    }
    public static String getSoyad(){
        return soyad;
    }

    public static int getCalismaSaati(){
        return calismaSaati;
    }
    public static int getSaatlikUcret(){
        return saatlikUcret;
    }

    public isci(){

    }

    public int Hesapla(int cs,int su){
        if(cs>100)
            return (((cs-100)/2)*50)+cs*su;
        return cs*su;
    }


}

public class isciucret{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        isci i1 = new isci("Oğuz","Balkaya",101,1);

        System.out.println("Sırasıyla ad, soyad, çalışma saati ve saatlik ücret girin : ");
        String ad=input.nextLine();
        String soyad=input.nextLine();
        int cs=input.nextInt();
        int su=input.nextInt();
        isci i2 = new isci();
        i2.setAd(ad);
        i2.setSoyad(soyad);
        i2.setCalismaSaati(cs);
        i2.setSaatlikUcret(su);
        System.out.println("1. İşçinin Adı " +i1.getAd()+" "+i1.getSoyad()+" Saatlik ücreti : " + i1.Hesapla(i1.getCalismaSaati(),i1.getSaatlikUcret()));
        System.out.println("2. İşçinin Adı " +i2.getAd()+" "+i2.getSoyad()+" Saatlik ücreti : " + i2.Hesapla(i2.getCalismaSaati(),i2.getSaatlikUcret()));




    }
}
