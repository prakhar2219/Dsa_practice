package BinarySearch;

public class MinDaysBouquet {
    static int maxElement(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int minElement(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<max){
                max=arr[i];
            }
        }
        return max;
    }
    static int checkBloomed(int [] array,int daysPassed,int reqFlowers){
        int count=0;
        int bouquets=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=daysPassed){
                count++;
            }else{
                bouquets=bouquets+(int) Math.floor(count/reqFlowers);
                count=0;
            }
        }
        bouquets=bouquets+(int) Math.floor(count/reqFlowers);
       return bouquets;
    }
    static int answer(int[] arr,int reqFlowers,int reqBouquets){
        if (reqBouquets*reqFlowers> arr.length){
            return -1;
        }
        int start=minElement(arr);
        int end=maxElement(arr);
        int ans=0;
        while (start<=end){
            int mid= start+(end-start)/2;
            int bouquetsPossible=checkBloomed(arr,mid,reqFlowers);
            if (bouquetsPossible>=reqBouquets){
                ans=mid;
                end=mid-1;
            }
            if (bouquetsPossible<reqBouquets){
                start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={7, 7, 7, 7, 13, 11, 12, 7};
        int bouquetsRequired=2;
        int reqFlowers=3;
        System.out.println(answer(arr,reqFlowers,bouquetsRequired));
    }
}
