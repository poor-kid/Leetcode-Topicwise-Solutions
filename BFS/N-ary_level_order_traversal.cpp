/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<vector<int>> levelOrder(Node* root) {
        
        vector<vector<int>> res;
        
        if(!root)
            return res;
        
        queue<Node*> q;
        q.push(root);
        while(!q.empty())
        {
            int len =q.size();
            vector<int> ans;
            for(int i=0;i<len;i++)
            {
                Node* node = q.front();
                ans.push_back(node->val);
                q.pop();
                for(auto child : node->children)
                {
                    if(child)
                        q.push(child);
                }
            }
            res.push_back(ans);
        }
        return res;
       
    }
};