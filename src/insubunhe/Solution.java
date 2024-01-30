package insubunhe;

public class Solution {
    public static void main(String[] args){

        int[] arr = {7, 11, 12};
        int[] arr2 = {20, 22, 21};
        int result = 0;

        for(int i=0; i<3; i++){
            if(arr2[i]%arr[i]==0){
                result += 1;
            }
        }

        System.out.println(result);
    }
}
