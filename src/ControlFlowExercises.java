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
        do{y=y-5;
            System.out.println(y);}
        while(y>0);
    }
}
