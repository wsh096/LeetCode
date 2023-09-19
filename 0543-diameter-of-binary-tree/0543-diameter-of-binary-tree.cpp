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
    pair<int, int> DiameterFast(TreeNode* root){
        if (root == NULL) {
            pair<int,int> p = make_pair(0,0);
            return p;
        }
        pair<int, int> left = DiameterFast(root -> left);
        pair<int, int> right = DiameterFast(root -> right);

        int opt1 = left.first;
        int opt2 = right.first;
        int opt3 = left.second + right.second + 1;

        pair<int, int> answer;
        answer.first = max(opt1, max(opt2, opt3));
        answer.second = max(left.second, right.second) + 1;

        return answer;
    }

    int diameterOfBinaryTree(TreeNode* root) {
       return DiameterFast(root).first - 1;
    }
};