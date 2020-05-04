class Solution {

    /* Store source cities in HashSet and find destination is present in HashSet if not present
         that will be the Final destination - coz "It is guaranteed that the graph of paths forms a line without any loop,
          therefore, there will be exactly one destination city." */
public:
    string destCity(vector<vector<string>>& paths) {
        int path_len = paths.size();
        unordered_set<string> set;
        
        for(vector<string> path : paths)
        {
            set.insert(path[0]);
        }
        
        for(vector<string> path : paths)
        {
            if(!set.count(path[1]))
                return path[1];
        }
        return "";
    }
};