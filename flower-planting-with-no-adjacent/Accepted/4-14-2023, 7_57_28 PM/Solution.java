// https://leetcode.com/problems/flower-planting-with-no-adjacent

class Solution {
        public int[] gardenNoAdj(int N, int[][] paths) {
        
        // First lets create our N + 1 gardens, gardens[0] is a dummy value since gardens are 1 indexed
        Garden[] gardens = new Garden[N + 1];
        for (int i = 1; i < gardens.length; i++) gardens[i] = new Garden();
        
        // Lets populate the neighboring gardens for each of our garden.
        for (int[] path : paths) {
            Garden garden1 = gardens[path[0]], garden2 = gardens[path[1]];
            garden1.neighboringGardens.add(garden2);
            garden2.neighboringGardens.add(garden1);
        }
        
        // At this point we have turned the visualized garden on our whiteboard into code!!
        // If you got this far it shows you knows how translate ideas into code!
        // Many people, myself included, did not make it here without help
                
        // This is the part where for each garden we attempt to select a flower type
        for (int i = 1; i < gardens.length; i++) gardens[i].prioritizeFlowerType();
        
        // Put it together
        int[] result = new int[N];
        for (int i = 0; i < result.length; i++) result[i] = gardens[i+1].flower;
        return result;
        
    }
    
    private static class Garden {
        private int[] flowerTypes = new int[]{1,2,3,4};
        private int flower;
        private List<Garden> neighboringGardens;
        
        public Garden() {
            this.flower = -1;
            this.neighboringGardens = new ArrayList<>();
        }
        
        public void prioritizeFlowerType() {
            Set<Integer> flowerTypesNeighborsHave = new HashSet<>();
            // See which flowers my neighbors have so I can select mine
            for (Garden neighbor : neighboringGardens)
                if (neighbor.flower != -1) flowerTypesNeighborsHave.add(neighbor.flower);
            
            // At this point we know what flowers are in our neighbors gardens. We can select a flower accordingly
            // There is garunteed to be an answer, remember.
            for (int i : flowerTypes) {
                if (!flowerTypesNeighborsHave.contains(i)) {
                    flower = i;
                    break;
                }
            }
        }
    }
}