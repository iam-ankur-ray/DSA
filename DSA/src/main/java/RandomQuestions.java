public class RandomQuestions {
    public static void main(String[] args) {
        int reverse = 0;
        int x = 121;

        while(x > 0){
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }

        System.out.println(reverse);

        if(x == reverse){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
