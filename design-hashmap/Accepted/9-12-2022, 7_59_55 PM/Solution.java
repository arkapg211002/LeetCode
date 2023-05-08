// https://leetcode.com/problems/design-hashmap

class MyHashMap {
    class HMNode{
        int key;
        int value;
        HMNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    int size;
    LinkedList<HMNode> []buckets;
    
    public void initBuckets(int n){
        buckets = new LinkedList[n];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new LinkedList<>();
        }
    }
    public int size(){
        return size;
    }
    public int hashFunc(int key){
        int hashcode = Integer.hashCode(key);
        return Math.abs(hashcode) % buckets.length; 
    }
    public int getIndexWithBucket(int key,int i){
        int di = 0;
        for(HMNode node : buckets[i]){
            if(node.key == key){
                return di;
            }
            di++;
        }
        return -1;
    }
    public void reHash(){
        LinkedList<HMNode> []oarr = buckets;
        initBuckets(oarr.length * 2);
        size = 0;
        
        for(int i=0;i<oarr.length;i++){
            for(HMNode node : oarr[i]){
                put(node.key,node.value);
            }
        }
    }
    
    
    
    public MyHashMap() {
        initBuckets(4);
        size = 0;
    }
    
    public void put(int key, int value) {
        int bi = hashFunc(key);
        int di = getIndexWithBucket(key,bi);
        
        if(di != -1){
            HMNode node = buckets[bi].get(di);
            node.value = value;
        }else{
            HMNode node = new HMNode(key,value);
            buckets[bi].add(node);
            size++;
        }
        
        double lambda = size * 1.0 /buckets.length;
        if(lambda > 2.0){
            reHash();
        }
    }
    
    public int get(int key) {
        int bi = hashFunc(key);
        int di = getIndexWithBucket(key,bi);
        
        if(di != -1){
            HMNode node = buckets[bi].get(di);
            return node.value;
        }else{
            return -1;
        }
    }
    
    public void remove(int key) {
        int bi = hashFunc(key);
        int di = getIndexWithBucket(key,bi);
        
        if(di != -1){
            HMNode node = buckets[bi].remove(di);
            size--;
        }
    }
}