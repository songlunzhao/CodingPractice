public class StringSwapTest_1790 {


    public boolean areAlmostEqual(String s1, String s2) {
        if(s1==null && s2==null) return true;
        if(s1==null && s2!=null || s1!=null && s2==null) return false;
        if(s1.length()!=s2.length()) return false;
        int i=0;
        int j=0;
        int[] idx= new int[2];
        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(j<2){
                    idx[j]=i;
                }
                j++;
                if(j==3) return false;
            }
            i++;
        }
        if(j<2) return true;
        else {
            if(s1.charAt(idx[0]) == s2.charAt(idx[1])
            && s1.charAt(idx[1])==s2.charAt(idx[0]))
                return true;

        }
        return false;
    }
}
