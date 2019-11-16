import java.util.*;
class zar2{
    public static int zarAt(){
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }
}



public class zaroyunu {
    public static void main(String[] args){
int sayi1=1;
int sayi2=2;
int a[]={0,0,0,0,0,0};
        while(sayi1!=sayi2){
            sayi1=zar2.zarAt();
            sayi2=zar2.zarAt();
            if(sayi1==sayi2) break;

            a[sayi1-1]++;
            a[sayi2-1]++;
         }

        for(int i=0 ; i<a.length ; i++){
            System.out.println("Zar " + a[i] + " defa " + (i+1) + " geldi.");
        }


    }
}
