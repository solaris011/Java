

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);

    }

    public static void printFromNumberToOne(int num){
        int i = 1;
        while (num >= i){
            System.out.println(num);
            num--;
        }
    }
}
