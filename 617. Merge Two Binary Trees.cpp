/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/*递归*/
 struct TreeNode* mergeTrees(struct TreeNode* t1, struct TreeNode* t2) {  
    if(t1==NULL && t2==NULL)
    {
        return NULL;
    }
    else if(t1!=NULL && t2==NULL)
    {
        return t1;
    }
    else if(t1==NULL && t2!=NULL)
    {
        return t2;
    }
    else{
    /* 先遍历根节点  相加*/
    t1->val+=t2->val;
    /* 遍历左子树 */
    t1->left=mergeTrees(t1->left,t2->left);
    /* 遍历右子树 */
    t1->right=mergeTrees(t1->right,t2->right);
        return t1;
    }
}

