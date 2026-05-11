import java.util.*;
public class arraylist {
    public static void mostWater(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int height = Math.min(arr[i],arr[j]);
                int width =  j-i;
                int water = height * width;
                max = Math.max(max, water);
            }
        }
        System.out.println(max);
    }
    public static void mostWater1(int arr[]){
        int max = 0;
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
             int height = Math.min(arr[i],arr[j]);
             int width =  j-i;
             int water = height * width;
             max = Math.max(max, water);
            if(arr[i] < arr[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(max);
    }
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) > target){
                rp = (list.size() + rp - 1) % list.size();
            }else{
                lp = (lp + 1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int arr[] = {1,8,6,2,5,4,8,3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6); 
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
    //     int max = Integer.MIN_VALUE;
    //     for(int i=0;i<list.size();i++){
    //         int curr = list.get(i);
    //         max = Math.max(max, curr);
    //     }
    //    System.out.println(max);
        // mostWater1(arr);
        System.out.println(pairSum2(list, target));
    } 
}
