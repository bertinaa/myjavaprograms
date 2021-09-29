import java.util.*;
//java program to sort a given array and find largest and second largest number
class Main{
    public static void main(String[] args){
        //sorting
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i, j, temp;
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //last and second last
        System.out.print("The last element is "+ arr[n-1] +"\n");
        System.out.print("The second last element is "+ arr[n-2]);
    }
}
