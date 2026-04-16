class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //if Anagram is asked, look for the frequency of the characters
        Map<String,List<String>> result= new HashMap<>();
        for(String anaString: strs){
            // convert String to Character array so that we could sort 
            // and convert back to String
            char[] charArray= anaString.toCharArray();
            Arrays.sort(charArray);
            String sortedString=new String(charArray);
// check to see if the string is already available or not
// add only when not available
           result.putIfAbsent(sortedString,new ArrayList<>());
           // add the String from arrayList against the key
           result.get(sortedString).add(anaString);
        }
        // returning the list of values from map
        return new ArrayList<>(result.values());
    }
}
