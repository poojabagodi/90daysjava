class maxsumsubarrayKadane{

    public static void kadane(int arr[]){
        int ms=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            ms=Math.max(currsum,ms);
        }
        System.out.println("maxsum subarray is "+ms);
    }
    public static void main(String args[]){
int arr[]={-1,-2,6,7,8,-2};
kadane(arr);
    }
}