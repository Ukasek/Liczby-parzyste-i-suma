public class EvenNumbers {
    public static void main(String[] args) {

        int summary = 0;
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
            summary += i;
        }
        System.out.println("Suma liczb to: " + summary);
    }
}
