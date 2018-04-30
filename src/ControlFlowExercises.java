public class ControlFlowExercises {

    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        int x = 0;
        do {
            x = x + 2;
            System.out.println(x);
        } while (x < 100);


        int y = 100;
        do {
            y = y - 5;
            System.out.println(y);
        }
        while (y > 0);

        int fizz;
        int buzz;
        int count;

        for (count = 1; count < 100; count++) {
            if (count % 3 == 0) {
                System.out.println("fizz");

            } if( count == 5){
                System.out.println("buzz");
            } if((count%3==0)&&(count%5==0)){
                System.out.println("FizzBuzz");}
            else{
                System.out.println(count);
            }
        }
    }
}
