import java.util.Random;
 public class bai13 {
     public static void main(String[] args) {
         Random h = new Random(123);
         int u = h.nextInt();
         int i = h.nextInt(200);
         double v = h.nextDouble();
         float w = h.nextFloat();
         long q = h.nextLong();
         boolean e = h.nextBoolean();
         double f = h.nextGaussian();
         h.setSeed(123);
         int k = h.nextInt(10, 20);
         int l = h.nextInt(40);
         System.out.println(u);
         System.out.println(i);
         System.out.println(v);
         System.out.println(w);
         System.out.println(q);
         System.out.println(e);
         System.out.println(f);
         System.out.println(h);
         System.out.println(k);
         System.out.println(l);
     }
 }
