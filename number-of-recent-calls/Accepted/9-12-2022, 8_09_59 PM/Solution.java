// https://leetcode.com/problems/number-of-recent-calls

class RecentCounter {
ArrayList< Integer> al;
public RecentCounter() {
al = new ArrayList<>();
}

public int ping(int t) {
    int l = t-3000,
    i=0;        
    al.add(t);
    
    for(;i<al.size();i++){
        if(al.get(i)>=l){
            break;
        }
    }
    return al.size()-i;
}
}