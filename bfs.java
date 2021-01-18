class Solution
{
    public ArrayList<Integer> bfsOfGraph(int N, ArrayList<ArrayList<Integer>> g)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        boolean[] visited = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        
        while (!q.isEmpty()) {
        int u = q.poll();
        ans.add(u);
        for (int s: g.get(u)) {
        if(!visited[s]) {
        visited[s] = true;
        q.add(s);
        }
        }
        }
        return ans;
    }
}
