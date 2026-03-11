// Last updated: 3/11/2026, 10:31:45 AM
1import java.util.*;
2class ParkingSystem{
3    private int big;
4    private int medium;
5    private int small;
6    ParkingSystem(int big,int medium,int small){
7        this.big=big;
8        this.medium=medium;
9        this.small=small;
10    }
11    public boolean addCar(int carType){
12        if(carType==1 && big>0){
13            big--;
14            return true;
15        }
16        if(carType==2 && medium>0){
17            medium--;
18            return true;
19        }
20        if(carType==3 && small>0){
21            small--;
22            return true;
23        }
24        return false;
25    }
26}
27public class Main{
28    public static void main(String[]args){
29        ParkingSystem ps=new ParkingSystem(1,1,0);
30        System.out.print(ps.addCar(1));
31        System.out.print(ps.addCar(2));
32        System.out.print(ps.addCar(3));
33        System.out.print(ps.addCar(1));
34    }
35}