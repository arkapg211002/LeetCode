// https://leetcode.com/problems/design-an-ordered-stream

class OrderedStream {

    private String[] str;
    private int n;
    private int i=0;
    public OrderedStream(int n) {
        this.n=n;
        str=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> l=new ArrayList<>();
        str[idKey-1]=value;
        while(i<n && str[i]!=null)
        {
            l.add(str[i]);
            i+=1;
        }
        return l;
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */