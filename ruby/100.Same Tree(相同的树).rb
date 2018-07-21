=begin
<p>Given two binary trees, write a function to check if they are the same or not.</p>

<p>Two binary trees are considered the same if they are structurally identical and the nodes have the same value.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong>     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong>     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

<strong>Output:</strong> false
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong>     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

<strong>Output:</strong> false
</pre>
<p>给定两个二叉树，编写一个函数来检验它们是否相同。</p>

<p>如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入: </strong>      1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

<strong>输出:</strong> true</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入:  </strong>    1          1
          /           \
         2             2

        [1,2],     [1,null,2]

<strong>输出:</strong> false
</pre>

<p><strong>示例&nbsp;3:</strong></p>

<pre><strong>输入:</strong>       1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

<strong>输出:</strong> false
</pre>
<p>给定两个二叉树，编写一个函数来检验它们是否相同。</p>

<p>如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入: </strong>      1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

<strong>输出:</strong> true</pre>

<p><strong>示例 2:</strong></p>

<pre><strong>输入:  </strong>    1          1
          /           \
         2             2

        [1,2],     [1,null,2]

<strong>输出:</strong> false
</pre>

<p><strong>示例&nbsp;3:</strong></p>

<pre><strong>输入:</strong>       1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

<strong>输出:</strong> false
</pre>

=end


# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val)
#         @val = val
#         @left, @right = nil, nil
#     end
# end

# @param {TreeNode} p
# @param {TreeNode} q
# @return {Boolean}
def is_same_tree(p, q)
    
end