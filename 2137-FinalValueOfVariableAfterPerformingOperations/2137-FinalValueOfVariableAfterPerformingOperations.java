// Last updated: 3/14/2026, 11:50:18 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val= 0;
        int ind= 0;
    for(int i = 0;i < operations.length; i++)
    {
		if(operations[i].charAt(1) == '+') val++;
		else val--;
	}
        return val;
    }
}