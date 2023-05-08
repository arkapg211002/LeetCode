// https://leetcode.com/problems/reverse-vowels-of-a-string

class Solution {
    public String reverseVowels(String s) {
    
          char[] arr=s.toCharArray(); // ye string ko character ke array me kar dega
        
          int left=0;
          int right=arr.length-1;
        
        while(left<right)
        {
            while(left<right&&isVowel(arr,left)==false)
            {
                left++;
            }
            
            while(left<right&&isVowel(arr,right)==false)
            {
                right--;
            }
            
            swap(arr,left,right);
            left++;
            right--;
        }
          // converting charArray to string
        String str="";
        for(char ch:arr)
        {
            str+=ch;
        }
        return str;
            
    }
    public boolean isVowel(char[] arr,int idx)
    {
        if(arr[idx]=='a'||arr[idx]=='e'||arr[idx]=='i'||arr[idx]=='o'||arr[idx]=='u'||arr[idx]=='A'||arr[idx]=='E'||arr[idx]=='I'||arr[idx]=='O'||arr[idx]=='U')
        {
            return true;
        }
        return false;
    }
    public void swap(char[] arr,int left,int right)
    {
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}