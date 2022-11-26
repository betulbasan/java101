package examples.arrays;
public class CopyArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5}; //initilaze original array
        int [] coppyArr = new int [arr.length]; // create coppy array with size of original array
        for(int i = 0; i<arr.length; i++){
            coppyArr[i]=arr[i]; //Copying all elements of one array into another
        }
        // list of original array
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        //list of coppied array
        System.out.println();
        for(int i =0; i<coppyArr.length; i++){
            System.out.print(coppyArr[i] + " ");
        }
    }
}
