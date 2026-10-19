/*
Problem: Two Sum

Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]

Explanation:
nums[0] = 2
nums[1] = 7

2 + 7 = 9

So, indices 0 and 1 are returned.

Approach:
1. First loop selects one number.
2. Second loop selects the next number.
3. Check whether their sum equals target.
4. If equal, return both indices.

Time Complexity: O(n^2)
Space Complexity: O(1), excluding the returned array.
*/
class Solution{
    public int[] twoSum(int a[],int t){
        int b[]=new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }
}