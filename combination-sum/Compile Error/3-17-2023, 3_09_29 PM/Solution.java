// https://leetcode.com/problems/combination-sum


```****JAVA Solution Easy Approach****
public List<List<Integer>> combinationSum(int[] candidates, int target)
{
        List<List<Integer>> al = new ArrayList<>();
		//taking an List of List which will traverse via Call by reference through recursion
        Combo(candidates, target, "", target, al);           // passing list of List in recursion logic
        return al;                                                             // returning the list after Recursion ends
    }
static void Combo(int a[], int N, String ans, int max, List<List<Integer>> al)
    {
        if(N==0) //base Condition when our targets equals to 0
        {
            ArrayList<Integer> cl = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(ans.trim()); // Breaking the string ans into integers and adding them into list,( a new List will be created for each case when base condition get hit)
            int n = st.countTokens();
            for(int j=0 ; j<=n-1; j++)
            {
                cl.add(Integer.parseInt(st.nextToken()));
            }
            al.add(cl); //adding our list to--> list of list
        }
        else
        {
            for(int i=0; i<a.length; i++)
            {
                if(N-a[i]>=0&& a[i]<=max) //taking max variable for stoping the duplication of answer 
                {
                Combo(a, N-a[i], ans+a[i]+" ", a[i], al); // passing max as last a[i] which we included in our ans
                }
            }
        }
    }