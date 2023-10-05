class Solution {
    public String[] solution(String[] players, String[] callings) {
       
        for(int i =0 ; i<callings.length ; i++)
        {
            String overtake = callings[i]; 
            for(int j=0; j<players.length ; j++ )
            {
                if(players[j].equals(overtake)){
                    String temp =players[j-1];
                    players[j-1]= overtake;
                    players[j] =temp;
                    break;
                }
            }
        }
        String[] answer = players;
        
        return answer;
    }
}