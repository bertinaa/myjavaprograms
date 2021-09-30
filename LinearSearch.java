// Linear search, array need not be sorted
import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        int n, i, key;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements in the array ");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element which is to be found : ");
        key = sc.nextInt();
        //check if key is present in array
        for(i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Key "+key+" is found at position "+(i+1));
                flag = true;
                break;
            }
        }
        if (flag == false){
             System.out.println("Key "+key+ " is not found in the array.");
        }
    }
}
