package JavaCore;

public class amaliy2 {
    public static void main(String[] args) {
    amaliy2 amaliy2= new amaliy2();
    int array[] = {1,2,3,4,5,6};
        System.out.println(amaliy2.search(array,6));

}
public int search(int[] nums,int target){
    for (int i = 0; i < nums.length; i++) {
       if (nums[i] == target){
        return i;
        }
    }
    return -1;
    }
}
