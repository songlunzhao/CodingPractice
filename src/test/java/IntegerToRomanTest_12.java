import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntegerToRomanTest_12 {

    @Test
    public void testIntToRoman(){
        String result=intToRoman(58);
        assertEquals(result,"LVIII");

        result=intToRoman(1994);
        assertEquals(result,"MCMXCIV");
    }

    public String intToRoman(int num) {
        int i=0,j=num,k=0;
        String result="";
        while(j>0){
            i=j%10;
            switch(k){
                case 0:
                  result=convertFirstDigit(i);
                  break;
                case 1:
                    result=convertSecondDigit(i)+result;
                    break;
                case 2:
                    result=convertThirdDigit(i)+result;
                    break;
                case 3:
                    result=convertForthDigit(i)+result;
                    break;
            }
            k++;
            j=j/10;
        }

        return result;
    }

    private String convertForthDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="M";
                break;
            case 2:
                result="MM";
                break;
            case 3:
                result="MMM";
                break;

        }
        return result;
    }

    private String convertThirdDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="C";
                break;
            case 2:
                result="CC";
                break;
            case 3:
                result="CCC";
                break;
            case 4:
                result="CD";
                break;
            case 5:
                result="D";
                break;
            case 6:
                result="DC";
                break;
            case 7:
                result="DCC";
                break;
            case 8:
                result="DCCC";
                break;
            case 9:
                result="CM";
                break;

        }
        return result;
    }

    private String convertSecondDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="X";
                break;
            case 2:
                result="XX";
                break;
            case 3:
                result="XXX";
                break;
            case 4:
                result="XL";
                break;
            case 5:
                result="L";
                break;
            case 6:
                result="LX";
                break;
            case 7:
                result="LXX";
                break;
            case 8:
                result="LXXX";
                break;
            case 9:
                result="XC";
                break;

        }
        return result;
    }
    private String convertFirstDigit(int i){
        String result="";
        switch(i){
            case 0:
                result="";
                break;
            case 1:
                result="I";
                break;
            case 2:
                result="II";
                break;
            case 3:
                result="III";
                break;
            case 4:
                result="IV";
                break;
            case 5:
                result="V";
                break;
            case 6:
                result="VI";
                break;
            case 7:
                result="VII";
                break;
            case 8:
                result="VIII";
                break;
            case 9:
                result="IX";
                break;

        }
        return result;

    }

}
