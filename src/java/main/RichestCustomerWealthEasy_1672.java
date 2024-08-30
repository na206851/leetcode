import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWealthEasy_1672 {
    public int maximumWealth(int[][] accounts) { //решить задачу
        List<Integer> list=new ArrayList<>();
        int tmp=0;
        for (int i=0; i<accounts.length; i++    ){
            tmp=0;
            for (int j=0; j<accounts[0].length;j++){
                tmp+=accounts[i][j];
            }
            list.add(tmp);
        }

        int max=Integer.MIN_VALUE;
        for (int i: list){
            if (max<i){
                max=i   ;
            }
        }
        return max;
    }
}
