// https://leetcode.com/problems/count-sub-islands

class Solution {

   class DSU{

       HashMap<String,Node> map=new HashMap<>();
       class Node{
           String node;
           Node parent;
           int h;
           int child;

           Node(String s){
               this.node=s;
               this.parent=null;
               this.h=0;
               this.child=1;
           }
       }

       public void create(String el){
           Node n=new Node(el);
           n.parent=n;

           map.put(el,n);
       }

       public Node find(String el){
            Node n=map.get(el);

            if(n==n.parent) return n;

            Node rr=find(n.parent.node);

            n.parent=rr;
            return rr;           
       }

       public void union(String s1,String s2){

           Node d1=find(s1);
           Node d2=find(s2);

           if(d1.h<d2.h){
               d1.parent=d2;
               d2.child+=d1.child;
           }else if(d1.h>d2.h){
               d2.parent=d1;
               d2.child+=d1.child;
           }else{
               d1.parent=d2;
               d2.child+=d1.child;
               d2.h++;
           }
       }
   }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int r=grid1.length;
        int c=grid1[0].length;

        DSU d1=new DSU();
        DSU d2=new DSU();

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){

                if(grid1[i][j]==1){
                    String n1=""+i+"-"+j;
                    d1.create(n1);
                    int[][] x={{-1,0},{0,-1}};

                     for(int[] y:x){
                         int newi=i+y[0];
                         int newj=j+y[1];

                         if(safe(newi,newj,r,c,grid1)){
                             String n2=""+newi+"-"+newj;

                              d1.union(n1,n2);

                         }
                     }
                }

                if(grid2[i][j]==1){
                    String n1=""+i+"-"+j;
                    d2.create(n1);
                    int[][] x={{-1,0},{0,-1}};

                     for(int[] y:x){
                         int newi=i+y[0];
                         int newj=j+y[1];

                         if(safe(newi,newj,r,c,grid2)){
                             String n2=""+newi+"-"+newj;
                              d2.union(n1,n2);
                         }
                     }
                }
            }
        }

        int subisland=0;

        HashMap<String,Integer> map=new HashMap<>();

        for(String node :d2.map.keySet()){
            String par=d2.find(node).node;
            if(d1.map.containsKey(par) && d1.map.containsKey(node)){ 
                if(map.containsKey(par) && map.get(par)==-1) continue;
                    map.put(par, 1);
            }  
            else map.put(par,-1);

        }

        for(String s:map.keySet()){
            if(map.get(s)==1) subisland++;
        }

        return subisland;

    }

    public boolean safe(int cr,int cc, int r,int c,int[][] grid){

        if(cr<0 || cc <0 || cr>=r || cc>=c ) return false;

        if(grid[cr][cc]==1) return true;

        return false;

    }
}