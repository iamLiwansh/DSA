class Solution {
    public boolean isIsomorphic(String s, String t) {
           HashMap<Character,Character> map=new HashMap<Character,Character>();
            if( s.length() != t.length()) return false;
           for(int i = 0 ; i <s.length() ; i++){

            char original = s.charAt(i);
            char replace = t.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replace)){
                    map.put(original , replace);
                }else {
                return false;
            }
            }else{
                char mappedChar = map.get(original);
                if(mappedChar != replace){
                    return false;
                }
                
            }
           }
           return true;
    }
}