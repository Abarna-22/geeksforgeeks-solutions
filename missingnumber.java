class missingnumber{
 public static long  missingNum(long[] arr, long size) {
     long n=size+1; 
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

