import java.util.Scanner;

class kedi{
    private String tur;
    private int boy;
    private int kilo;


    public void setKilo(int k){
        kilo=k;
    }

    public kedi(String c){
        tur=c;
    }


    public int getBoy(){
      return boy;
    }

    public int getKilo(){
        return kilo;
    }


    public String getTur(){
        return tur;
    }

    public void setBoy(int b){
        boy=b;
    }

    public int getZiplamaKuvveti(){
        return (boy*boy)/kilo;
    }


}

public class kediziplamakuvveti {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Boyu girin : ");
    int girilenboy=input.nextInt();
        System.out.println("Kiloyu girin : ");
        int girilenkilo=input.nextInt();

        kedi k1 = new kedi("Kedinin türü");
        k1.setBoy(girilenboy);
        k1.setKilo(girilenkilo);

        System.out.println("Cins : " + k1.getTur() + "Boy : " + k1.getBoy() + "Kilo : " + k1.getKilo() + "Zıplama Kuvveti : " + k1.getZiplamaKuvveti());


}

}
