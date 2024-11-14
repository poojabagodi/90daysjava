class maxsumSubarrayBruteforce{
    public static void Maxsumsubarray(int arr[]){
        int max=Integer.MIN_VALUE;
        int currsum;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum=currsum+arr[k];
                }
                System.out.println(currsum);
                if(currsum>max){
                    max=currsum;
                }
            }
        }
        System.out.println("the maximum sum subarray is "+max);
    }
    public static void main(String args[]){
        int arr[]={3,4,5,6,7,8};
        Maxsumsubarray(arr);
    }
}