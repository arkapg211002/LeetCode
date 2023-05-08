// https://leetcode.com/problems/strange-printer-ii

class Solution {
    private static final int CUSTOM_COLOR = 0;
    public boolean isPrintable(int[][] targetGrid) {
        Set<Integer> colors = getColors(targetGrid);
        Map<Integer, int[]> minMaxXY = getMinMaxXY(colors, targetGrid);
        Queue<Integer> queue = new LinkedList<>();
        for (int color : colors) {
            if (isColorRectangular(color, targetGrid, minMaxXY.get(color))) {
                queue.offer(color);
            }
        }
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i < size; ++i) {
                int color = queue.poll();
                mark(color, targetGrid, minMaxXY.get(color));
                colors.remove(color);
            }
            for (int color : colors) {
                if (isColorRectangular(color, targetGrid, minMaxXY.get(color))) {
                    queue.offer(color);
                }
            }
        }
        
        return colors.isEmpty();
    }
    
    private void mark(int color, int[][] targetGrid, int[] minMaxXY) {
        int minX = minMaxXY[0], maxX = minMaxXY[1];
        int minY = minMaxXY[2], maxY = minMaxXY[3];
        for(int x=minX; x <= maxX; ++x) {
            for (int y = minY; y <= maxY; ++y) {
                targetGrid[x][y] = CUSTOM_COLOR;
            }
        }
    }
    
    private boolean isColorRectangular(int targetColor, int[][] targetGrid, int[] minMaxXY) {
        int minX = minMaxXY[0], maxX = minMaxXY[1];
        int minY = minMaxXY[2], maxY = minMaxXY[3];
        for(int x=minX; x <= maxX; ++x) {
            for (int y = minY; y <= maxY; ++y) {
                int color = targetGrid[x][y];
                if (color != targetColor && color != CUSTOM_COLOR) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private Map<Integer, int[]> getMinMaxXY(Set<Integer> colors, int[][] targetGrid) {
        // minX, maxX, minY, maxY
        Map<Integer, int[]> minMaxes = new HashMap<>();
        for(int color : colors) {
            minMaxes.put(color, new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE});
        }
        
        for (int x=0; x < targetGrid.length; ++x) {
            for (int y=0; y < targetGrid[0].length; ++y) {
                int color = targetGrid[x][y];
                int[] minMax = minMaxes.get(color);
                minMax[0] = Math.min(x, minMax[0]);
                minMax[1] = Math.max(x, minMax[1]);
                minMax[2] = Math.min(y, minMax[2]);
                minMax[3] = Math.max(y, minMax[3]);
            }
        }
        return minMaxes;
    }
    
    private Set<Integer> getColors(int[][] targetGrid) {
        Set<Integer> set = new HashSet<>();
        for(int[] row : targetGrid) {
            for (int val : row) {
                set.add(val);
            }
        }
        return set;
    }
}