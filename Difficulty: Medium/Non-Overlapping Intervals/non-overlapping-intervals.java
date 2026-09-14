class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int lastEnd = intervals[0][1];
        int count = 0;
        for(int i=1; i<intervals.length; i++){
            if(lastEnd > intervals[i][0])
                count++;
            else
                lastEnd = intervals[i][1];
        }
        return count;
    }
}
