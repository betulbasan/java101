package diziler;


public class HarmonikSeriOrtalama {
    public static void main(String[] args) {
        //int [] list = new int[5];
        /* int [] list = {1,2,3,4,5};
        int sum =0;
        for (int i =0; i<list.length; ++i){
            sum+=list[i];
        }
        System.out.println(sum/list.length);
         */
        int [] list = {1,2,3,4,5};
        double harmonik = 0;
        for (int i =0; i<list.length; i++){

                harmonik += 1.0/list[i];
        }
        System.out.println(list.length/harmonik);
    }
}
