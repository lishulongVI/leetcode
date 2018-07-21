"""
<p>The <em>n</em>-queens puzzle is the problem of placing <em>n</em> queens on an <em>n</em>&times;<em>n</em> chessboard such that no two queens attack each other.</p>

<p><img src="https://leetcode.com/static/images/problemset/8-queens.png" /></p>

<p>Given an integer <em>n</em>, return all distinct solutions to the <em>n</em>-queens puzzle.</p>

<p>Each solution contains a distinct board configuration of the <em>n</em>-queens&#39; placement, where <code>&#39;Q&#39;</code> and <code>&#39;.&#39;</code> both indicate a queen and an empty space respectively.</p>

<p><strong>Example:</strong></p>

<pre>
<strong>Input:</strong> 4
<strong>Output:</strong> [
 [&quot;.Q..&quot;,  // Solution 1
  &quot;...Q&quot;,
  &quot;Q...&quot;,
  &quot;..Q.&quot;],

 [&quot;..Q.&quot;,  // Solution 2
  &quot;Q...&quot;,
  &quot;...Q&quot;,
  &quot;.Q..&quot;]
]
<strong>Explanation:</strong> There exist two distinct solutions to the 4-queens puzzle as shown above.
</pre>
<p><em>n&nbsp;</em>皇后问题研究的是如何将 <em>n</em>&nbsp;个皇后放置在 <em>n</em>&times;<em>n</em> 的棋盘上，并且使皇后彼此之间不能相互攻击。</p>

<p><img src="/static/images/problemset/8-queens.png"></p>

<p><small>上图为 8 皇后问题的一种解法。</small></p>

<p>给定一个整数 <em>n</em>，返回所有不同的&nbsp;<em>n&nbsp;</em>皇后问题的解决方案。</p>

<p>每一种解法包含一个明确的&nbsp;<em>n</em> 皇后问题的棋子放置方案，该方案中 <code>&#39;Q&#39;</code> 和 <code>&#39;.&#39;</code> 分别代表了皇后和空位。</p>

<p><strong>示例:</strong></p>

<pre><strong>输入:</strong> 4
<strong>输出:</strong> [
 [&quot;.Q..&quot;,  // 解法 1
  &quot;...Q&quot;,
  &quot;Q...&quot;,
  &quot;..Q.&quot;],

 [&quot;..Q.&quot;,  // 解法 2
  &quot;Q...&quot;,
  &quot;...Q&quot;,
  &quot;.Q..&quot;]
]
<strong>解释:</strong> 4 皇后问题存在两个不同的解法。
</pre>
<p><em>n&nbsp;</em>皇后问题研究的是如何将 <em>n</em>&nbsp;个皇后放置在 <em>n</em>&times;<em>n</em> 的棋盘上，并且使皇后彼此之间不能相互攻击。</p>

<p><img src="/static/images/problemset/8-queens.png"></p>

<p><small>上图为 8 皇后问题的一种解法。</small></p>

<p>给定一个整数 <em>n</em>，返回所有不同的&nbsp;<em>n&nbsp;</em>皇后问题的解决方案。</p>

<p>每一种解法包含一个明确的&nbsp;<em>n</em> 皇后问题的棋子放置方案，该方案中 <code>&#39;Q&#39;</code> 和 <code>&#39;.&#39;</code> 分别代表了皇后和空位。</p>

<p><strong>示例:</strong></p>

<pre><strong>输入:</strong> 4
<strong>输出:</strong> [
 [&quot;.Q..&quot;,  // 解法 1
  &quot;...Q&quot;,
  &quot;Q...&quot;,
  &quot;..Q.&quot;],

 [&quot;..Q.&quot;,  // 解法 2
  &quot;Q...&quot;,
  &quot;...Q&quot;,
  &quot;.Q..&quot;]
]
<strong>解释:</strong> 4 皇后问题存在两个不同的解法。
</pre>
"""


class Solution(object):
    def solveNQueens(self, n):
        """
        :type n: int
        :rtype: List[List[str]]
        """
        