
import java.util.*;
public class Bhavesh {
   public static void main(String args [])  {
      Scanner sc = new Scanner(System.in);
  int arr[] = {2,3,4,4,54,7};
int target = 4;
      System.out.print(countI(0,arr,new ArrayList<Integer>() ,target));
         }    
   /* static boolean linearSearch(int[] arr, int i, int target){
       if(i == arr.length){
          return false;
       }    
       return arr[i]== target || linearSearch(arr , i+1 , target);
   } */
   static ArrayList countI(int i, int[] arr ,ArrayList<Integer> list, int target){
      if(i == arr.length){
         return list;
      }   
      if(arr[i] == target){
         list.add(i);
         list.remove(i);
      }
      return countI(i+1,arr,list , target); 
   }
    
}