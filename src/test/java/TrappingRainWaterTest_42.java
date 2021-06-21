import org.testng.annotations.Test;

public class TrappingRainWaterTest_42 {

    @Test
    public void testWaterContainer(){
        int [] height = new int[]{0,1,2,0,0};
        int sum = trap(height);
        System.out.println(sum);
    }
    //height(i) contains water Min(leftMaxHeight,rightMaxHeight)- height(i)
    public int trap(int[] height) {
        if(height==null || height.length<=1) return 0;
        int left=0, right=height.length-1;
        int leftMax=0, rightMax=0;
        int sum=0;
        while(left<right){
            if(height[left]< height[right]) {
                if(height[left]>leftMax){
                    leftMax=height[left];
                } else {
                    sum=sum+(leftMax-height[left]);
                }
                left++;
            } else {
                if(height[right]>rightMax){
                    rightMax=height[right];
                } else {
                    sum=sum+(rightMax-height[right]);
                }
                right--;
            }

        }

        return sum;
    }


    public int trapOverTime(int[] height) {
        if(height==null || height.length<=1) return 0;
        int maxHeight=0;
        int floor=0;
        int sum=0;
        for(int i=0; i<height.length;i++){
            if(height[i]>maxHeight) {
                maxHeight=height[i];
            }
        }
        while(floor<maxHeight){
            for(int i=0; i<height.length;i++){
                if(height[i]<=floor){
                    int j=0;
                    boolean leftWall=false, rightWall=false;
                    while(j<i){
                        if(height[j]>floor){
                            leftWall=true;
                            break;
                        }
                        j++;
                    }
                    j=i+1;
                    if(leftWall) {
                        while (j<height.length){
                            if(height[j]>floor){
                                rightWall=true;
                                break;
                            }
                            j++;
                        }
                    }
                    if(leftWall && rightWall){
                        sum++;
                    }

                }
                if(i-1>=0 && height[i-1]>height[i]
                    && i+1<height.length
                    && height[i+1]>height[i]){

                }
            }
            floor++;
        }
        return sum;

    }

}
