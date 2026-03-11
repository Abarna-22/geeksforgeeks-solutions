class missingnumber{
 public static long  missingNum(long[] arr, long size) {
<<<<<<< HEAD:Day-1/missingno.java
    
     long n=size+1; 
=======
     long n=size+1; //+1 for expected size is 1,2,3,4,5 but the array is 1,2,3,4
>>>>>>> 7fd8506 (Updated project files):missingnumber.java
     long sum=n*(n+1)/2;
     long arraysum=0;
    for(int i=0;i<size;i++)
    {
        
        arraysum+=arr[i];
    }
    return sum-arraysum;
    
}
public static void main(String[] args)
{
    long arr[]={1,2,4,5};
    long size=arr.length;
    System.out.println(missingNum(arr,size));
}
}
