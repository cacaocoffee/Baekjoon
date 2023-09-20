class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int i=0, j=0,k=0;

        while(k<goal.length ){
            
            if(cards1[i<cards1.length? i:cards1.length-1].equals(goal[k])){
                k++;
                i++;
            }else if(cards2[j<cards2.length? j:cards2.length-1].equals(goal[k])){
                k++;
                j++;
            }else{
                return "No";
            }
        }
        return answer;
    }
}