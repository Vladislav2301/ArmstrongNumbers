// Program to generate Armstrong numbers

public class ArmstrongGenerator {

    public static void main(String args []) {

        int max = 10000;
        for (int i = 0; i < max; i++)
            if (isArmstrong(i))
                System.out.println(i);
    }

        private static boolean isArmstrong(int x){

        int n = x;
        int d = digits(x);

        int y = 0, z = x;

        while (z>0){
            x = z % 10;
            y = y + pow(x, d);
            z /= 10;
        }
        if (y==n)
            return true;
        else return false;
    }

    private static int pow(int n, int power){
            if (power==1)
                return n;
            else
                return n*pow(n, power-1);
    }

    private static int digits(long n){
        if (n<10)
            return 1;
        else return 1+digits(n/10);
    }

}
