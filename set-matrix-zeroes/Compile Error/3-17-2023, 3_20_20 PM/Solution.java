// https://leetcode.com/problems/set-matrix-zeroes

		ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    l1.add(i);
                    l2.add(j);
                }
            }
        }
        
        for(int i:l1){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=0;
            }
        }
        
        for(int i:l2){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i]=0;
            }
        }