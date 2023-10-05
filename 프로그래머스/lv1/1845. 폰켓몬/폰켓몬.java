import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums)
        {    
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
            
        }
       
        //n개중 r개 뽑기 
        answer=map.size();
        if(map.size()>nums.length/2) answer=nums.length/2;
        
        return answer;
    }
}