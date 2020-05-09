/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    
    void DFS(TreeNode* root,int parent,int depth,unordered_map<int,pair<int,int>> &map)
    {
        if(!root)
            return;
        map[root->val] = {parent,depth};
        DFS(root->left,root->val,depth+1,map);
        DFS(root->right,root->val,depth+1,map);
    }
public:
    bool isCousins(TreeNode* root, int x, int y) {
        
        if(!root)
            return false;
        if(root->val == x || root->val == y)
            return false;
        unordered_map<int,pair<int,int>> map;
        DFS(root,-1,0,map);
        if(map[x].first != map[y].first && map[x].second == map[y].second)
            return true;
        return false;
    }
};







/* BFS */


/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isCousins(TreeNode* root, int x, int y) {
        
        unordered_map<int,pair<int,int>> map;
        if(!root)
            return false;
        if(root->val == x || root->val == y)
            return false;
        queue<TreeNode*> q;
        q.push(root);
        int level = 0;
        map[root->val] = {-1,level};
        while(!q.empty())
        {
            
            int len = q.size();
            level++;
            for(int i=0;i<len;i++)
            {
                TreeNode* node = q.front();
                q.pop();
                if(node->left)
                {
                    q.push(node->left);
                    map[node->left->val] = {node->val,level};
                }
                if(node->right)
                {
                    q.push(node->right);
                    map[node->right->val] = {node->val,level};
                }
                
            }
            
        }
        if(map[x].first != map[y].first && map[x].second == map[y].second)
                return true;
            return false;
        
        
    }
};