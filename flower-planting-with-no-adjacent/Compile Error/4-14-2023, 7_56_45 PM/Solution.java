// https://leetcode.com/problems/flower-planting-with-no-adjacent

class Garden {
    public static final int[] FLOWER_TYPES = {1,2,3,4};
    int flowerType;
    List<Garden> connectedGardens;
    
    public Garden() {
        flowerType = -1;
        connectedGardens = new ArrayList<Garden>();
    }
}