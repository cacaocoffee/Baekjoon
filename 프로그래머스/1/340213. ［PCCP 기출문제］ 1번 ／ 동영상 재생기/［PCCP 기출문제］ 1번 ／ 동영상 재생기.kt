class Solution {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        var answer: String = ""
        
        var(h,m)= video_len.split(":").map{ it.toInt()}
        var video = h*60+m
        
        var (op_h,op_m) = op_start.split(":").map{ it.toInt()}
        var start = op_h*60 +op_m
        
        var (op_end_h,op_end_m) = op_end.split(":").map{ it.toInt()}
        var end = op_end_h*60 +op_end_m
        
        var (c_h,c_m) = pos.split(":").map{it.toInt()}
        var current_Pos = c_h*60+ c_m
        
        commands.forEach{
            if(it =="next") {
                if(current_Pos in start..end) current_Pos=end+10
                else if(current_Pos+10 in start..end) current_Pos=end
                else if(current_Pos+10>= video) current_Pos=video //끝부분
                else current_Pos+=10
                
                if(end+10>video) current_Pos=video
            }
            if(it =="prev"){
                if(current_Pos-10 in start..end) current_Pos=end  //이동후가 오프닝안이라면
                else if(current_Pos in start..end) current_Pos=end-10 //지금이 오프닝 구간이면 end 
                else current_Pos-=10
                
                if(current_Pos<0) current_Pos=0
            }
        }
        var hh:String = (current_Pos/60).toString()
        var mm:String = (current_Pos%60).toString()
        
        if (current_Pos%60==0) mm="00"
        else if (current_Pos%60<10) mm="0"+mm
        
        if(current_Pos/60==0) hh="00"
        else if(current_Pos/60<10) hh="0"+hh
        
        
        return "${hh}:${mm}"
    }
}