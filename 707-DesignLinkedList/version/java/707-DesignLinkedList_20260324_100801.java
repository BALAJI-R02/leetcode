// Last updated: 3/24/2026, 10:08:01 AM
1class MyLinkedList {
2
3    class Node {
4        int val;
5        Node next;
6        Node(int val) {
7            this.val  = val;
8            next = null;
9        }
10    }
11    Node head, tail;
12    int cnt;
13    public MyLinkedList() {
14        head = tail = null;
15        cnt= 0;
16    }
17    public int get(int index) {
18        if(index < 0 || index >= cnt)
19            return -1;
20        Node temp = head;
21        for(int i = 0; i < index; i++)
22            temp = temp.next;    
23        return temp.val;
24    }
25
26    public void addAtHead(int val) {
27        Node nn = new Node(val);
28        if(head == null) {
29            head = tail = nn;
30        } else {
31            nn.next = head;
32            head= nn;
33        }
34        cnt++;
35    }
36    public void addAtTail(int val) {
37        Node nn = new Node(val);
38        if(head == null)
39            head = tail = nn;
40        else {
41            tail.next = nn;
42            tail= nn;
43        }
44        cnt++;               
45    }
46
47   
48    public void addAtIndex(int index, int val) {
49        if(index < 0 || index > cnt) return;
50        if(index == 0) {
51            addAtHead(val);
52            return;
53        }
54        if(index == cnt) {
55            addAtTail(val);
56            return;
57        }
58        Node nn   = new Node(val);
59        Node temp = head;
60        for(int i = 0; i < index - 1; i++)
61            temp = temp.next;
62        nn.next   = temp.next;   
63        temp.next = nn;
64        cnt++;
65    }
66    public void deleteAtIndex(int index) {
67        if(index < 0 || index >= cnt) 
68        return;
69        if(index == 0) {      
70            head = head.next;
71            if(head == null)
72                tail = null;
73            cnt--;
74            return;
75        }
76
77        Node temp = head;
78        for(int i = 0; i < index - 1; i++)
79            temp = temp.next;  
80
81        temp.next = temp.next.next;
82        if(temp.next == null)       
83            tail = temp;
84
85        cnt--;
86    }
87}