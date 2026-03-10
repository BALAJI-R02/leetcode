// Last updated: 3/10/2026, 10:28:00 AM
1import java.util.*;
2public class Solution
3{
4    public static int findgcd(int a,int b){
5        if(b==0)
6        return a;
7        return findgcd(b,a%b);
8    }
9    public static int minOperations(int nums[],int nums2[]){
10        Arrays.sort(nums);
11        int gcd=nums2[0];
12        for(int i=1;i<nums2.length;i++){
13            gcd=findgcd(gcd,nums2[i]);
14        }
15        for(int i=0;i<nums.length;i++){
16            if(gcd%nums[i]==0)
17            return i;
18        }
19        return -1;
20    }
21	public static void main(String[] args) {
22		Scanner sc=new Scanner(System.in);
23		int s1=sc.nextInt();
24		int s2=sc.nextInt();
25		int nums[]=new int[s1];
26		for(int i=0;i<s1;i++)
27		nums[i]=sc.nextInt();
28		int nums2[]=new int[s2];
29		for(int i=0;i<s2;i++)
30		nums2[i]=sc.nextInt();
31		System.out.print(minOperations(nums,nums2));
32	}
33}