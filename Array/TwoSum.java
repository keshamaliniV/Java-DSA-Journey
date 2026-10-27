
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
import java.util.Scanner;
class TwoSum{
    public int[] twoSum(int a[],int t){
        int b[]=new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    b[0]=i;
                    b[1]=j;
                    return b;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        TwoSum obj=new TwoSum();
        int res[]=obj.twoSum(a, t);
        System.out.println("[" +res[0]+", "+res[1]+"]");
        sc.close();
    }
}