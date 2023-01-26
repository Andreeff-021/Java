package seminar_02;

public class Task_01 {
    public static void main(String[] args) {
        String str = "А роза упала на лапу Азора";
        String str2 = "бла бла";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        String strOld = str.replace("\s", ""); // почему-то не работает регулярное выражение "\W"
        return strOld.equalsIgnoreCase(new StringBuilder(strOld).reverse().toString());
    }
}
