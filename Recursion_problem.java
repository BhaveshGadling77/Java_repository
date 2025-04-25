public class Recursion_problem {
    // public static void towerOfHanoi(int n, String src,String help, String dest){
    // if(n==1){
    // System.out.println("Transfer disk "+n+ " from "+src+" to "+dest );
    // return;
    // }
    // towerOfHanoi(n-1,src,dest,help);
    // System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
    // towerOfHanoi(n-1,help,src,dest);
    // }
    // public static void reverseStr(int indx,String str){
    // if(indx==-1)
    // return;
    //
    // System.out.print(str.charAt(indx));
    // reverseStr(indx - 1,str);
    // }
    // public static int first = -1;
    // public static int last = -1;

    // public static void findOcc(String str, int indx , char element){
    // if(indx ==str.length()){
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char curr = str.charAt(indx);
    // if( curr== element){
    // if(first==-1)
    // first = indx;
    //
    // else
    // last =indx;
    // } findOcc( str,indx+1,element);
    // }
    public static boolean arrayCheck(int indx, int arr[]) {
        if (indx == arr.length - 1)
            return true;

        if (arr[indx] < arr[indx + 1]) {
            arrayCheck(arr, indx + 1);
        } else
            return false;
    }

    public static void main(String[] args) {
        // int n = 3;
        // towerOfHanoi(n,"Source","Helper","Destination");
        // String str = "Pop";
        // int indx = str.length() -1 ;
        // reverseStr(indx,str);
        // String str = "abaacdaefaah";
        // findOcc(str,0,'a');
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int indx = 1;
        arrayCheck(arr, 0);
    }
}