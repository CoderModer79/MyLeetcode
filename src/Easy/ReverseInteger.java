package Easy;//Given a 32-bit signed integer, reverse digits of an integer.

public class ReverseInteger {

    public int reverse(int x){
        int prevRev = 0 , rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            //System.out.println(rev);
            if((rev - x % 10) / 10 != prevRev){
                return 0;
            }
            prevRev = rev;
            x= x/10;
        }
        return rev;
    }
}
