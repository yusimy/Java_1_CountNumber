public class CountNumber {
    public static void main(String[] args) {
        int n = 20030;
        int count = 0;
        while (n > 0){
            int rem = n%10;
            if (rem == 0){
                count++;
            }
            n=n/10;
        }
        System.out.print(count);
    }
}
