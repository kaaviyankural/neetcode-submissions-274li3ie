class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()== t.length()){
    int[] charArr = new int[26];
    for(int i=0;i<s.length();i++){
        //s.charAt(i) is 'a', its internally stored java as 97
        //similarly 'b' as 98 and 'z' as 122
        charArr[s.charAt(i)-'a']++;
        charArr[t.charAt(i)-'a']--;
    }
    for(int count: charArr){
        if(count != 0){
            return false;
        }
    }
    return true;
}
return  false;
    }
}
