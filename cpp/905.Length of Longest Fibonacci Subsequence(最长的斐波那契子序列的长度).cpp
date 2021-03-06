/*
<p>A sequence <code>X_1, X_2, ..., X_n</code>&nbsp;is <em>fibonacci-like</em> if:</p>

<ul>
	<li><code>n &gt;= 3</code></li>
	<li><code>X_i + X_{i+1} = X_{i+2}</code>&nbsp;for all&nbsp;<code>i + 2 &lt;= n</code></li>
</ul>

<p>Given a <b>strictly increasing</b>&nbsp;array&nbsp;<code>A</code> of positive integers forming a sequence, find the <strong>length</strong> of the longest fibonacci-like subsequence of <code>A</code>.&nbsp; If one does not exist, return 0.</p>

<p>(<em>Recall that a subsequence is derived from another sequence <code>A</code> by&nbsp;deleting any number of&nbsp;elements (including none)&nbsp;from <code>A</code>, without changing the order of the remaining elements.&nbsp; For example, <code>[3, 5, 8]</code> is a subsequence of <code>[3, 4, 5, 6, 7, 8]</code>.</em>)</p>

<p>&nbsp;</p>

<ul>
</ul>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong>[1,2,3,4,5,6,7,8]
<strong>Output: </strong>5
<strong>Explanation:
</strong>The longest subsequence that is fibonacci-like: [1,2,3,5,8].
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input: </strong>[1,3,7,11,12,14,18]
<strong>Output: </strong>3
<strong>Explanation</strong>:
The longest subsequence that is fibonacci-like:
[1,11,12], [3,11,14] or [7,11,18].
</pre>

<p>&nbsp;</p>

<p><strong>Note:</strong></p>

<ul>
	<li><code>3 &lt;= A.length &lt;= 1000</code></li>
	<li><code>1 &lt;= A[0] &lt; A[1] &lt; ... &lt; A[A.length - 1] &lt;= 10^9</code></li>
	<li><em>(The time limit has been reduced by 50% for submissions in Java, C, C++, and C#.)</em></li>
</ul>
<p>如果序列&nbsp;<code>X_1, X_2, ..., X_n</code>&nbsp;满足下列条件，就说它是&nbsp;<em>斐波那契式&nbsp;</em>的：</p>

<ul>
	<li><code>n &gt;= 3</code></li>
	<li>对于所有&nbsp;<code>i + 2 &lt;= n</code>，都有&nbsp;<code>X_i + X_{i+1} = X_{i+2}</code></li>
</ul>

<p>给定一个<strong>严格递增</strong>的正整数数组形成序列，找到 <code>A</code> 中最长的斐波那契式的子序列的长度。如果一个不存在，返回&nbsp;&nbsp;0 。</p>

<p><em>（回想一下，子序列是从原序列 <code>A</code>&nbsp;中派生出来的，它从 <code>A</code>&nbsp;中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如，&nbsp;<code>[3, 5, 8]</code>&nbsp;是&nbsp;<code>[3, 4, 5, 6, 7, 8]</code>&nbsp;的一个子序列）</em></p>

<p>&nbsp;</p>

<ul>
</ul>

<p><strong>示例 1：</strong></p>

<pre><strong>输入: </strong>[1,2,3,4,5,6,7,8]
<strong>输出: </strong>5
<strong>解释:
</strong>最长的斐波那契式子序列为：[1,2,3,5,8] 。
</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre><strong>输入: </strong>[1,3,7,11,12,14,18]
<strong>输出: </strong>3
<strong>解释</strong>:
最长的斐波那契式子序列有：
[1,11,12]，[3,11,14] 以及 [7,11,18] 。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>3 &lt;= A.length &lt;= 1000</code></li>
	<li><code>1 &lt;= A[0] &lt; A[1] &lt; ... &lt; A[A.length - 1] &lt;= 10^9</code></li>
	<li><em>（对于以 Java，C，C++，以及&nbsp;C# 的提交，时间限制被减少了 50%）</em></li>
</ul>
<p>如果序列&nbsp;<code>X_1, X_2, ..., X_n</code>&nbsp;满足下列条件，就说它是&nbsp;<em>斐波那契式&nbsp;</em>的：</p>

<ul>
	<li><code>n &gt;= 3</code></li>
	<li>对于所有&nbsp;<code>i + 2 &lt;= n</code>，都有&nbsp;<code>X_i + X_{i+1} = X_{i+2}</code></li>
</ul>

<p>给定一个<strong>严格递增</strong>的正整数数组形成序列，找到 <code>A</code> 中最长的斐波那契式的子序列的长度。如果一个不存在，返回&nbsp;&nbsp;0 。</p>

<p><em>（回想一下，子序列是从原序列 <code>A</code>&nbsp;中派生出来的，它从 <code>A</code>&nbsp;中删掉任意数量的元素（也可以不删），而不改变其余元素的顺序。例如，&nbsp;<code>[3, 5, 8]</code>&nbsp;是&nbsp;<code>[3, 4, 5, 6, 7, 8]</code>&nbsp;的一个子序列）</em></p>

<p>&nbsp;</p>

<ul>
</ul>

<p><strong>示例 1：</strong></p>

<pre><strong>输入: </strong>[1,2,3,4,5,6,7,8]
<strong>输出: </strong>5
<strong>解释:
</strong>最长的斐波那契式子序列为：[1,2,3,5,8] 。
</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre><strong>输入: </strong>[1,3,7,11,12,14,18]
<strong>输出: </strong>3
<strong>解释</strong>:
最长的斐波那契式子序列有：
[1,11,12]，[3,11,14] 以及 [7,11,18] 。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>3 &lt;= A.length &lt;= 1000</code></li>
	<li><code>1 &lt;= A[0] &lt; A[1] &lt; ... &lt; A[A.length - 1] &lt;= 10^9</code></li>
	<li><em>（对于以 Java，C，C++，以及&nbsp;C# 的提交，时间限制被减少了 50%）</em></li>
</ul>
*/


class Solution {
public:
    int lenLongestFibSubseq(vector<int>& A) {
        
    }
};