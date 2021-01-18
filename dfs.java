class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        boolean[] vis = new boolean[V];
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int s = 0;
        
        dfs(adj,ans,vis,s);
        
        return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans, boolean[] vis, int s){
        vis[s] = true;
        
        ans.add(s);
        
        for(int v : adj.get(s)){
            
            if(!vis[v])
                dfs(adj,ans,vis,v);
        }
        return;
    }
}
