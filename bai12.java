import java.lang.StringBuffer;
public class bai12 {
    public static void main(String[] args) {
        StringBuffer gite = new StringBuffer("Hello World");
        gite.append(" Huy345");
        System.out.println(gite);
        gite.insert(3,"huy");
        System.out.println(gite);
        System.out.println(gite.capacity());
        gite.appendCodePoint(0x1F602);
        System.out.println(gite);
        System.out.println(gite.codePointAt(2));
        System.out.println(gite.lastIndexOf("h"));
        System.out.println(gite.deleteCharAt(2));
        System.out.println(gite.length());
        System.out.println(gite.reverse());
        System.out.println(gite.codePointBefore(3));
    }
}
