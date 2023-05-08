// https://leetcode.com/problems/most-frequent-even-element

class Solution {
    public int mostFrequentEven(int[] nums) {
        
        var counts = Arrays.stream(nums).filter(n -> n % 2 == 0).boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        var max = counts.entrySet().stream().min( (a,b) -> {
            int comp = b.getValue().intValue() - a.getValue().intValue();
            return comp == 0 ? a.getKey() - b.getKey() : comp;
        });
        
        return max.isEmpty() ? -1 : max.get().getKey();
    }
}