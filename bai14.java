public class bai14 {
    public static void main(String[] args) {
        Integer num = 100;
        String str = "123";
        int parsed = Integer.parseInt(str);
        System.out.println( parsed);
        String numStr = num.toString();
        System.out.println( numStr);
        Integer newNum = Integer.valueOf("456");
        System.out.println( newNum);
        Integer anotherNum = 200;
        System.out.println( num.compareTo(anotherNum));
        int intVal = newNum.intValue();
        System.out.println( intVal);
    }
}
