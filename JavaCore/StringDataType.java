package JavaCore;

public class StringDataType {
    public static void main(String[] args) {

        String text = " I guess, I'm afraid";
        System.out.println(text);
        String str = null;

        String text1 = new String("you fools,you are stupid, you are a fish");
        System.out.println(text1);

        System.out.println(text1.length());

        String upperrcase = text.toUpperCase();
        String lowercase = text.toLowerCase();
        System.out.println(upperrcase);
        System.out.println(lowercase);

        String replace = text.replace("afraid","gay");
        System.out.println(replace);

        String replace1 = text1.replaceAll("you","They");
        System.out.println(replace1);

        String concat = text.concat(" ").concat(text1);
        System.out.println(concat);

       String concat1 = text + " " + text1;
        System.out.println(concat1);

        String concat3 = "My boaash"+ " " +20+" "+ true;
        System.out.println(concat3);

        System.out.println(concat.equals(concat1));

    }
}
