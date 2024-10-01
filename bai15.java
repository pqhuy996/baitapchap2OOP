import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Student student = new Student("Phan Quốc Huy", 18, "24GITe");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số môn học: ");
        int somonhoc = input.nextInt();
        int tongdiem=0;
        for (int a = 1; a <= somonhoc; a++){
            System.out.print("Nhập điểm môn thứ " + a + ": ");
            double diem = input.nextDouble();
            tongdiem += diem;
        }
        double diemtrungbinh = tongdiem/somonhoc;
        System.out.println("Điểm trung bình là: " + diemtrungbinh);
    }
}
