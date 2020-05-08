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
    int maxDepth(Node* root) {
        if(!root)
            return 0;
        int depth = 0;
       queue<Node*> q;
        q.push(root);
        while(!q.empty())
        {
            depth +=1;
           int len = q.size();
            for(int i=0;i<len;i++)
            {
                Node* node = q.front();
                q.pop();
                 for(auto child : node->children)
                 {
                    if(child)
                        q.push(child);
                }
            }
           
        }
        return depth;
        
    }
};



/* DFS */
class Solution {
    

public:
    int maxDepth(Node* root) {
        if(!root)
            return 0;
        
        int depth = 0;
        for(auto child : root->children)
        {
            depth = max(depth,maxDepth(child));
        }
        return depth+1;
        
    }
};