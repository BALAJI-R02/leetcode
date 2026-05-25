// Last updated: 5/25/2026, 10:19:43 AM
1import java.util.*;
2class RecentCounter{
3Queue<Integer>q;
4public RecentCounter(){
5q=new LinkedList<>();
6}
7public int ping(int t){
8q.offer(t);
9while(!q.isEmpty() && q.peek()<t-3000){
10q.poll();
11}
12return q.size();
13}
14}
15public class Solutions{
16public static void main(String[]args){
17RecentCounter rc=new RecentCounter();
18System.out.println(rc.ping(1));
19System.out.println(rc.ping(100));
20System.out.println(rc.ping(3001));
21System.out.println(rc.ping(3002));
22}
23}