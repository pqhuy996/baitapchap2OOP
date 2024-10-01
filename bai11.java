import java.lang.Character;
public class bai11 {
    public static void main(String[] args) {
        Character ch = 'H';
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.toLowerCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.isWhitespace(ch));
    }
}