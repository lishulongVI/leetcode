"""
<p>Given a string <em>s1</em>, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.</p>

<p>Below is one possible representation of <em>s1</em> = <code>&quot;great&quot;</code>:</p>

<pre>
    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
</pre>

<p>To scramble the string, we may choose any non-leaf node and swap its two children.</p>

<p>For example, if we choose the node <code>&quot;gr&quot;</code> and swap its two children, it produces a scrambled string <code>&quot;rgeat&quot;</code>.</p>

<pre>
    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
</pre>

<p>We say that <code>&quot;rgeat&quot;</code> is a scrambled string of <code>&quot;great&quot;</code>.</p>

<p>Similarly, if we continue to swap the children of nodes <code>&quot;eat&quot;</code> and <code>&quot;at&quot;</code>, it produces a scrambled string <code>&quot;rgtae&quot;</code>.</p>

<pre>
    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
</pre>

<p>We say that <code>&quot;rgtae&quot;</code> is a scrambled string of <code>&quot;great&quot;</code>.</p>

<p>Given two strings <em>s1</em> and <em>s2</em> of the same length, determine if <em>s2</em> is a scrambled string of <em>s1</em>.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> s1 = &quot;great&quot;, s2 = &quot;rgeat&quot;
<strong>Output:</strong> true
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> s1 = &quot;abcde&quot;, s2 = &quot;caebd&quot;
<strong>Output:</strong> false</pre>
<p>给定一个字符串&nbsp;<em>s1</em>，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。</p>

<p>下图是字符串&nbsp;<em>s1</em>&nbsp;=&nbsp;<code>&quot;great&quot;</code>&nbsp;的一种可能的表示形式。</p>

<pre>    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
</pre>

<p>在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。</p>

<p>例如，如果我们挑选非叶节点&nbsp;<code>&quot;gr&quot;</code>&nbsp;，交换它的两个子节点，将会产生扰乱字符串&nbsp;<code>&quot;rgeat&quot;</code>&nbsp;。</p>

<pre>    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
</pre>

<p>我们将&nbsp;<code>&quot;rgeat&rdquo;</code>&nbsp;称作&nbsp;<code>&quot;great&quot;</code>&nbsp;的一个扰乱字符串。</p>

<p>同样地，如果我们继续将其节点&nbsp;<code>&quot;eat&quot;</code>&nbsp;和&nbsp;<code>&quot;at&quot;</code>&nbsp;进行交换，将会产生另一个新的扰乱字符串&nbsp;<code>&quot;rgtae&quot;</code>&nbsp;。</p>

<pre>    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
</pre>

<p>我们将&nbsp;<code>&quot;rgtae&rdquo;</code>&nbsp;称作&nbsp;<code>&quot;great&quot;</code>&nbsp;的一个扰乱字符串。</p>

<p>给出两个长度相等的字符串 <em>s1 </em>和&nbsp;<em>s2</em>，判断&nbsp;<em>s2&nbsp;</em>是否是&nbsp;<em>s1&nbsp;</em>的扰乱字符串。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入:</strong> s1 = &quot;great&quot;, s2 = &quot;rgeat&quot;
<strong>输出:</strong> true
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre><strong>输入:</strong> s1 = &quot;abcde&quot;, s2 = &quot;caebd&quot;
<strong>输出:</strong> false</pre>
<p>给定一个字符串&nbsp;<em>s1</em>，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。</p>

<p>下图是字符串&nbsp;<em>s1</em>&nbsp;=&nbsp;<code>&quot;great&quot;</code>&nbsp;的一种可能的表示形式。</p>

<pre>    great
   /    \
  gr    eat
 / \    /  \
g   r  e   at
           / \
          a   t
</pre>

<p>在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。</p>

<p>例如，如果我们挑选非叶节点&nbsp;<code>&quot;gr&quot;</code>&nbsp;，交换它的两个子节点，将会产生扰乱字符串&nbsp;<code>&quot;rgeat&quot;</code>&nbsp;。</p>

<pre>    rgeat
   /    \
  rg    eat
 / \    /  \
r   g  e   at
           / \
          a   t
</pre>

<p>我们将&nbsp;<code>&quot;rgeat&rdquo;</code>&nbsp;称作&nbsp;<code>&quot;great&quot;</code>&nbsp;的一个扰乱字符串。</p>

<p>同样地，如果我们继续将其节点&nbsp;<code>&quot;eat&quot;</code>&nbsp;和&nbsp;<code>&quot;at&quot;</code>&nbsp;进行交换，将会产生另一个新的扰乱字符串&nbsp;<code>&quot;rgtae&quot;</code>&nbsp;。</p>

<pre>    rgtae
   /    \
  rg    tae
 / \    /  \
r   g  ta  e
       / \
      t   a
</pre>

<p>我们将&nbsp;<code>&quot;rgtae&rdquo;</code>&nbsp;称作&nbsp;<code>&quot;great&quot;</code>&nbsp;的一个扰乱字符串。</p>

<p>给出两个长度相等的字符串 <em>s1 </em>和&nbsp;<em>s2</em>，判断&nbsp;<em>s2&nbsp;</em>是否是&nbsp;<em>s1&nbsp;</em>的扰乱字符串。</p>

<p><strong>示例&nbsp;1:</strong></p>

<pre><strong>输入:</strong> s1 = &quot;great&quot;, s2 = &quot;rgeat&quot;
<strong>输出:</strong> true
</pre>

<p><strong>示例&nbsp;2:</strong></p>

<pre><strong>输入:</strong> s1 = &quot;abcde&quot;, s2 = &quot;caebd&quot;
<strong>输出:</strong> false</pre>
"""


class Solution(object):
    def isScramble(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        