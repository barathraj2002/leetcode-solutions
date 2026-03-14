// Last updated: 3/14/2026, 11:50:47 AM
import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        int temp = 0 ;
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
            }
            System.out.println(n);
            while(n > 0){
                temp = temp + ( (n%10) * (n%10) );
                n = n/10;
                System.out.println("-> "+n +" "+temp);
            }
            n = temp;
            temp = 0;
        }
        return true;
    }
}