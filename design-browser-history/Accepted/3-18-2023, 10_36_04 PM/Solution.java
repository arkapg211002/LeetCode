// https://leetcode.com/problems/design-browser-history

class BrowserHistory {

    Stack<String> history,forwardhistory;
    String current = null;
    
    public BrowserHistory(String homepage) {
        history = new Stack<>();
        forwardhistory = new Stack<>();
        current = homepage;
    }
    
    public void visit(String url) {
        if(current != null)
            history.add(current);
        current = url;
        forwardhistory.clear();
    }
    
    public String back(int steps) {
        while(!history.isEmpty() && steps > 0){
            steps--;
            forwardhistory.add(current);
            current = history.pop();
        }
        return current;
    }
    
    public String forward(int steps) {
        while(!forwardhistory.isEmpty() && steps > 0){
            steps--;
            history.add(current);
            current = forwardhistory.pop();
        }
        return current;
    }
}