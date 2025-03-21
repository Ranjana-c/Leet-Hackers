public class Solution {
    public int hIndex(int[] citations) {
        // Step 1: Sort the citations array
        Arrays.sort(citations);

        int n = citations.length;
        for (int i = 0; i < n; i++) {
            // Step 2: Calculate h-index
            if (citations[i] >= n - i) {
                return n - i; // The h-index is the number of papers from index i to the end
            }
        }

        return 0; // If no h-index is found
    }
}
