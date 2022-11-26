package examples.arrays;

public class SearchElement {
    private static void check(int[] arr, int toCheckValue)
    {
        // check if the specified element
        // is present in the array or not
        // using Linear Search method
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        // Print the result
        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }
    public static void main(String[] args) {
        int searchNumber = 9;
        int [] list = {23,12,56,78,90,1,3,54};
        for (int i=0; i<list.length; i++){
            if(searchNumber == list[i]){
                System.out.println(searchNumber + " is in the list");
                break;
            }
        }

    }
}
