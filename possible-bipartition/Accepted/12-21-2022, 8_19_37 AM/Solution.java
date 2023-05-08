// https://leetcode.com/problems/possible-bipartition

class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
    // 1. Create the graph
	List<Integer> dislikeArray[] = new List[N + 1];
    for(int i = 0; i < dislikeArray.length; i++) {
        dislikeArray[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < dislikes.length; i++) {
        dislikeArray[dislikes[i][0]].add(dislikes[i][1]);
        dislikeArray[dislikes[i][1]].add(dislikes[i][0]);
    }
	
	// 2. Color the graph
    int group[] = new int[N + 1];
    Arrays.fill(group, -1);
    for(int i = 1; i <= N; i++) {
        if( group[i] == -1 && !paint(group, i, dislikeArray, 0) )
            return false;
    }
    return true;
}

public boolean paint(int group[], int index, List<Integer> dislikeArray[], int color) {
    group[index] = color;
    for(int i = 0; i < dislikeArray[index].size(); i++) {
        int nextIndex = dislikeArray[index].get(i);
        if( group[nextIndex] == color )
            return false;
        if( group[nextIndex] == -1 && !paint(group, nextIndex, dislikeArray, 1 - color))
            return false;
    }
    return true;
}
}