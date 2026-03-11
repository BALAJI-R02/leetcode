// Last updated: 3/11/2026, 11:56:29 AM
1import java.util.*;
2class ATM{
3    private long[]notes=new long[5];
4    private int[]values={20,50,100,200,500};
5    public void deposit(int[]bankNotes){
6        for(int i=0;i<5;i++)
7        notes[i]=notes[i]+bankNotes[i];
8    }
9    public int[]withdraw(int amount){
10        int []result=new int[5];
11        for(int i=4;i>=0;i--){
12            int use=(int)Math.min(notes[i],amount/values[i]);
13            result[i]=use;
14            amount=amount-(use*values[i]);
15        }
16        if(amount!=0)
17        return new int[]{-1};
18        for(int i=0;i<5;i++)
19        notes[i]=notes[i]-result[i];
20        return result;
21    }
22}
23public class Main{
24    public static void main(String[]args){
25        ATM a=new ATM();
26        a.deposit(new int[]{0,0,1,2,1});
27        System.out.print(Arrays.toString(a.withdraw(600)));
28    }
29}