class maxsumsubarrayPrefix{

    
    public static void Maxsumsubarray(int arr[]){
           
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];


        }
        int max=Integer.MIN_VALUE;
        int currsum;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;

                currsum = start==0 ?prefix[end] : prefix[end]-prefix[start-1];

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