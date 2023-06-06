public class Main {

    public static void main(String[] args) {
        int timer = 0;
        int word = 0;
        //for
        for (int i = 0; i < 3; i++) {
            System.out.println("attempt - "+i);
        }
        //While
        while (timer < 3){
            System.out.println(timer);
            timer++;
        }
        //while do
        do {
            System.out.println("first homework");
            word++;
        }
        while (word < 3);

    }
}