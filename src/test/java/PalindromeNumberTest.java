import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PalindromeNumberTest {


    @Test
    public void testPalindromeNumber(){
        boolean ret = isPalindrome(1001);
        assertEquals(ret,true);
    }

    public boolean isPalindrome(int input) {
        int x=input;
        if(x<10 && x>=0){
            return true;
        }
        if(x<0 || x%10==0){
            return false;
        }
        int revNumber=0;
        while(x>=10){
            int i = x%10;
            revNumber=revNumber*10 + i;
            x=x/10;
        }
        revNumber=revNumber*10 + x;
        return revNumber==input;
    }
}
