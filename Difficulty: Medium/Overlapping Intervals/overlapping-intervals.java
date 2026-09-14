class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(arr == null || arr.length == 0)
            return ans;
        Arrays.sort(arr, (a,b)-> Integer.compare(a[0], b[0]));
        for(int[] interval: arr){
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1) < interval[0]){
                ArrayList<Integer> newInterval = new ArrayList<>();
                newInterval.add(interval[0]);
                newInterval.add(interval[1]);
                ans.add(newInterval);
            }
            
            else{
                int lastEnd = ans.get(ans.size()-1).get(1);
                int maxEnd = Math.max(lastEnd, interval[1]);
                ans.get(ans.size()-1).set(1, maxEnd);
            }
        }
        return ans;
    }
}