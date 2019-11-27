import java.util.ArrayList;
public class komsusil2017vize {
    public static void KomsuSil(ArrayList<Integer>liste){
        int kontrol = 0;
while(kontrol<liste.size()-1){
    if(liste.get(kontrol) > liste.get(kontrol+1)){
        liste.remove(kontrol);
        liste.remove(kontrol);
    }else{
        kontrol++;
    }
}

if(liste.size()%2!=0) liste.remove((liste.size()-1));

    }


    public static void main(String[] args){
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(1);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        KomsuSil(list);
        System.out.println("");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }



    }
}
