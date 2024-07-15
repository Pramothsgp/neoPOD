import java.util.*;
class SortArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i,j;
        int arr[] = new int[n];
        for(i=0;i<n;i++) arr[i] = sc.nextInt();
        
        for(i=0;i<n;i+=2)
        {
            int index=i;
            for(j=i+2;j<n;j+=2)
            {
                if(arr[index] < arr[j])
                index = j;
            }
            if(index != i)
            {
                arr[index] = arr[index] + arr[i];
                arr[i] = arr[index] - arr[i];
                arr[index] = arr[index] - arr[i];
            }
        }
        for(i=1;i<n-1;i+=2)
        {
            int index=i;
            for(j=i+2;j<n-1;j+=2)
            {
                if(arr[index] > arr[j])
                index = j;
            }
            if(index != i)
            {
                arr[index] = arr[index] + arr[i];
                arr[i] = arr[index] - arr[i];
                arr[index] = arr[index] - arr[i];
            }
        }
        
        for(int x : arr)
        System.out.print(x + " ");
        
    }
}