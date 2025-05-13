package JavaCore;

public class amaliy1 {
    public static void main(String[] args) {
     amaliy1 amaliy1 = new amaliy1();
        System.out.println(amaliy1.isPalindrome(120));   // agar soni ogirilsayam birxil bosa Palindrom diyiladi
        }

        public boolean isPalindrome(int x){
        int reverseNumber = 0;
        int temp=x;
        while (x>0){
            int d = x%10;
            x=x/10;
            reverseNumber=reverseNumber*10+d;
        }
        return reverseNumber==temp;

        }
    }

