// Last updated: 5/27/2026, 12:19:44 PM
1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        if (n == 1) return 1;
13        int low = 1, high = n;
14        while (low <= high){
15            int mid = low + (high - low) / 2;
16            int check = guess(mid);
17            if (check == 0) return mid;
18            else if (check == 1) low = mid + 1;
19            else high = mid - 1;
20        }
21        return -1;
22    }
23}