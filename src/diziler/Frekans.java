package diziler;

import java.util.Arrays;

public class Frekans {
    static boolean isIgnore(int[] arr, int value, int c){
        for(int i = 0; i<c; i++){
            if(value==arr[i]){
                return false;
            }
        }
        return true;
    }
    static int count(int[] arr, int value){
        int count = 0;
        for(int i:arr){
            if(value==i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] list = {10,20,20,10,10,20,5,20};
        System.out.println(Arrays.toString(list));
        for (int i=0; i<list.length; i++){
            if(isIgnore(list,list[i],i)){
                System.out.println(list[i] + " sayısı "+ count(list,list[i])+" kez tekrar edildi");

            }
             }

    }
}
