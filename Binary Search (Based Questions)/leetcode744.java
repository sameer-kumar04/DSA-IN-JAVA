class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        // Binary search to find the smallest letter greater than the target
        while (s <= e) {
            int mid = s + (e - s) / 2;

            // If target is smaller than mid letter, we search in the left half
            if (target < letters[mid]) {
                e = mid - 1;
            } 
            // Otherwise, search in the right half
            else {
                s = mid + 1;
            }
        }

        // If s has gone out of bounds, return the first letter (wrap around)
        return letters[s % letters.length];
    }
}
