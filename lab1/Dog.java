public class Dog {
   public int weight;
   public static String binomen = "canis familairs";

   public Dog(int w) {
      weight = w;
   }

   public static Dog Maxdog(Dog d1, Dog d2) {
      if (d1.weight > d2.weight) {
         return d1;
      }
      return d2;
   }

   public void makenoice() {
      if (weight < 10) {
         System.out.println("yip");
      } else if (weight < 30) {
         System.out.println("barks");
      } else {
         System.out.println("wowow");
      }
   }
}