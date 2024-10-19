class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // Create a list to store the indices of words that contain the character x
        ArrayList<Integer> ans = new ArrayList<>();

        // Iterate over the words array and check if each word contains the character x
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {  // Check if character x exists in the word
                ans.add(i);  // Add the index of the word that contains x
            }
        }

        return ans;  // Return the list of indices
    }
}
