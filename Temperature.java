public class Temperature {
 static double average(float[] temps) {
 double sum = 0;
 for (int t=0 ; t <temps.length ; t++) {
 sum += temps[t];
 }
 return sum / temps.length;
 }
 public static void main(String[] args) {
 float[] weekTemps = { 23.5, 25.0, 22.8, 24.4, 26.1, 23.9, 22.0 };
 System.out.println("Average = " + average(weekTemps));
 }
 }