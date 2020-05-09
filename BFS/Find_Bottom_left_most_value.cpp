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
    int findBottomLeftValue(TreeNode* root) {
        
        if(!root)
            return 0;
        // if(!root->left && !root->right )
        //     return root->val;
            
        
        queue<TreeNode*> q;
        int res;
        q.push(root);
        vector<int> lastnodes;
        lastnodes.push_back(root->val);
        while(!q.empty())
        {
           
            int len =q.size();
            if(lastnodes.size()!=0)
                res = lastnodes[0];
            //cout<<res<<endl;
            lastnodes.clear();
            for(int i=0;i<len;i++)
            {
                 TreeNode* node = q.front();
                q.pop();
                if(node->left)
                {
                    q.push(node->left);
                    lastnodes.push_back((node->left)->val);
                }
                if(node->right)
                {
                    q.push(node->right);
                    lastnodes.push_back((node->right)->val);
                }
                
            }
           
           
        }
        
        return res;
        
    }
};