/**
<p>Given a binary tree</p>

<pre>
struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}
</pre>

<p>Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to <code>NULL</code>.</p>

<p>Initially, all next pointers are set to <code>NULL</code>.</p>

<p><strong>Note:</strong></p>

<ul>
	<li>You may only use constant extra space.</li>
	<li>Recursive approach is fine, implicit stack space does not count as extra space for this problem.</li>
</ul>

<p><strong>Example:</strong></p>

<p>Given the following binary tree,</p>

<pre>
     1
   /  \
  2    3
 / \    \
4   5    7
</pre>

<p>After calling your function, the tree should look like:</p>

<pre>
     1 -&gt; NULL
   /  \
  2 -&gt; 3 -&gt; NULL
 / \    \
4-&gt; 5 -&gt; 7 -&gt; NULL
</pre>
<p>给定一个二叉树</p>

<pre>struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}
</pre>

<p>填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 <code>NULL</code>。</p>

<p>初始状态下，所有&nbsp;next 指针都被设置为 <code>NULL</code>。</p>

<p><strong>说明:</strong></p>

<ul>
	<li>你只能使用额外常数空间。</li>
	<li>使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。</li>
</ul>

<p><strong>示例:</strong></p>

<p>给定二叉树，</p>

<pre>     1
   /  \
  2    3
 / \    \
4   5    7
</pre>

<p>调用你的函数后，该二叉树变为：</p>

<pre>     1 -&gt; NULL
   /  \
  2 -&gt; 3 -&gt; NULL
 / \    \
4-&gt; 5 -&gt; 7 -&gt; NULL</pre>
<p>给定一个二叉树</p>

<pre>struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}
</pre>

<p>填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 <code>NULL</code>。</p>

<p>初始状态下，所有&nbsp;next 指针都被设置为 <code>NULL</code>。</p>

<p><strong>说明:</strong></p>

<ul>
	<li>你只能使用额外常数空间。</li>
	<li>使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。</li>
</ul>

<p><strong>示例:</strong></p>

<p>给定二叉树，</p>

<pre>     1
   /  \
  2    3
 / \    \
4   5    7
</pre>

<p>调用你的函数后，该二叉树变为：</p>

<pre>     1 -&gt; NULL
   /  \
  2 -&gt; 3 -&gt; NULL
 / \    \
4-&gt; 5 -&gt; 7 -&gt; NULL</pre>
**/


/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        
    }
}