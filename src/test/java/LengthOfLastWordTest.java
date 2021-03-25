public class LengthOfLastWordTest {

    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0) return 0;
        int i=0, j=s.length()-1, len=0;
        while(i<s.length()){
            if(s.charAt(i)==' ') i++;
        }
        while(j>=0){
            if(s.charAt(j)==' ') j--;
        }

        while(i<j){
            if(s.charAt(i)!=' '){
                len++;
            } else {
                len=0;
            }
        }
        return len;
    }
}
