
public class secondlargestnumber {
     public static int getSecondLargest(int[] arr, int n) {
    
    int largest=-1;
    int secondlargest=-1;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>largest)
        {
            secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest&& arr[i]<largest)
        {
            secondlargest=arr[i];
        }
    }
    return secondlargest;
    
}
public static void main(String[] args)
{
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    System.out.println(getSecondLargest(arr,n));

}

public static void main(String[] args)
{
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    System.out.println(getSecondLargest(arr,n));

}
>>>>>>> 7fd8506 (Updated project files):secondlargestnumber.java
}
