"""
<p>A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers <strong>from 1 to 9</strong> such that each row, column, and both diagonals all have the same sum.</p>

<p>Given an <code>grid</code>&nbsp;of integers, how many 3 x 3 &quot;magic square&quot; subgrids are there?&nbsp; (Each subgrid is contiguous).</p>

<p>&nbsp;</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong>[[4,3,8,4],
        [9,5,1,9],
        [2,7,6,2]]
<strong>Output: </strong>1
<strong>Explanation: </strong>
The following subgrid is a 3 x 3 magic square:
438
951
276

while this one is not:
384
519
762

In total, there is only one magic square inside the given grid.
</pre>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= grid.length&nbsp;&lt;= 10</code></li>
	<li><code>1 &lt;= grid[0].length&nbsp;&lt;= 10</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= 15</code></li>
</ol>
<p>3 x 3 的幻方是一个填充有<strong>从 1 到 9</strong> 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。</p>

<p>给定一个由整数组成的 N &times; N 矩阵，其中有多少个 3 &times; 3 的 &ldquo;幻方&rdquo; 子矩阵？（每个子矩阵都是连续的）。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入: </strong>[[4,3,8,4],
      [9,5,1,9],
      [2,7,6,2]]
<strong>输出: </strong>1
<strong>解释: </strong>
下面的子矩阵是一个 3 x 3 的幻方：
438
951
276

而这一个不是：
384
519
762

总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。
</pre>

<p><strong>提示:</strong></p>

<ol>
	<li><code>1 &lt;= grid.length = grid[0].length&nbsp;&lt;= 10</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= 15</code></li>
</ol>
<p>3 x 3 的幻方是一个填充有<strong>从 1 到 9</strong> 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。</p>

<p>给定一个由整数组成的 N &times; N 矩阵，其中有多少个 3 &times; 3 的 &ldquo;幻方&rdquo; 子矩阵？（每个子矩阵都是连续的）。</p>

<p>&nbsp;</p>

<p><strong>示例 1:</strong></p>

<pre><strong>输入: </strong>[[4,3,8,4],
      [9,5,1,9],
      [2,7,6,2]]
<strong>输出: </strong>1
<strong>解释: </strong>
下面的子矩阵是一个 3 x 3 的幻方：
438
951
276

而这一个不是：
384
519
762

总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。
</pre>

<p><strong>提示:</strong></p>

<ol>
	<li><code>1 &lt;= grid.length = grid[0].length&nbsp;&lt;= 10</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= 15</code></li>
</ol>
"""


class Solution:
    def numMagicSquaresInside(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        