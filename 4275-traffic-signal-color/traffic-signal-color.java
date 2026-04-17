class Solution {
    public String trafficSignal(int timer) {

        return (timer==0)?"Green":(timer==30)?"Orange":(30<timer && timer<=90)?"Red":"Invalid";

        // if(timer==0){
        //     return "Green";
        // }else if(timer==30)
        // {
        //     return "Orange";
        // }else if(30 < timer && timer<=90){
        //     return "Red";
        // }//else  return "Invalid";
        

        // return "Invalid";    
    }
}