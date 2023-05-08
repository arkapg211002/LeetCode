// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies

class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
                List<Boolean> l=new ArrayList<Boolean>();
                        int m=candies[0];
                                for(int i=0;i<candies.length;i++)
                                        {
                                                    if(candies[i]>=m)m=candies[i];
                                                            }
                                                                    
                                                                            for(int i=0;i<candies.length;i++)
                                                                                    {
                                                                                                if(candies[i]+extraCandies >= m)l.add(true);
                                                                                                            else l.add(false);
                                                                                                                    }
                                                                                                                            return l;
                                                                                                                                }
                                                                                                                                }
}}