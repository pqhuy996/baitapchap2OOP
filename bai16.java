import java.util.Scanner;
public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        congty company = new congty("TNHH MTV HUY", "16/209 Phan Đình Phùng");
    System.out.print("Nhập doanh thu: ");
    a= sc.nextDouble();
    System.out.print("Nhập tiền vốn: ");
    b= sc.nextDouble();
    c = a-b;
    System.out.print("Tiền lãi là: " + c );
    }
}
