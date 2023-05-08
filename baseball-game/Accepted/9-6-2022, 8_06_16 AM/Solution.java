// https://leetcode.com/problems/baseball-game

class Solution {
    public int calPoints(String[] ops) {
    List<Integer> al = new ArrayList<>();
    for(int i=0;i<ops.length;i++){
        if(ops[i].equals("C")){
            al.remove(al.size()-1);
        }else if(ops[i].equals("D")){
            al.add(al.get(al.size()-1)*2);
        }else if(ops[i].equals("+")){
            al.add(al.get(al.size()-1)+al.get(al.size()-2));
        }else{
            al.add(Integer.parseInt(ops[i]));
        }
    }
    int sum = 0;
    for(Integer i:al){
        sum+=i;
    }
    return sum;
}
}