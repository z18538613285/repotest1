package leetcode;

import java.util.*;

class Solution187_1 {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map =new HashMap<>();

        List<String> result = new ArrayList<>();

        for (int i = 0; i+10 <= s.length(); i++) {
            String dna = s.substring(i, i + 10);

            if (map.get(dna)==null){
                map.put(dna,1);
            }else if (map.get(dna)==1){
                map.put(dna,2);
                result.add(dna);
            }else{
                map.put(dna,map.get(dna)+1);
            }
        }
        return result;
    }
}
class Solution187_2 {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set =new HashSet<>();
        HashSet<String> result =new HashSet<>();

        for (int i = 0; i+10 <= s.length(); i++) {
            String dna = s.substring(i, i + 10);

            if (set.contains(dna)){
                result.add(dna);
            }else{
                set.add(dna);
            }
        }
        return new ArrayList<String>(result);
    }
}
