/**
<p>In a 2D grid of <code>0</code>s and <code>1</code>s, we change at most one <code>0</code> to a <code>1</code>.</p>

<p>After, what is the size of the largest island?&nbsp;(An island is a 4-directionally connected group of <code>1</code>s).</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong>[[1, 0], [0, 1]]
<strong>Output:</strong> 3
<strong>Explanation:</strong> Change one 0 to 1 and connect two 1s, then we get an island with area = 3.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input: </strong>[[1, 1], [1, 0]]
<strong>Output:</strong> 4
<strong>Explanation: </strong>Change the 0 to 1 and make the island bigger, only one island with area = 1.</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input: </strong>[[1, 1], [1, 1]]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Can&#39;t change any 0 to 1, only one island with area = 1.</pre>

<p>&nbsp;</p>

<p>Notes:</p>

<ul>
	<li><code>1 &lt;= grid.length = grid[0].length &lt;= 50</code>.</li>
	<li><code>0 &lt;= grid[i][j] &lt;= 1</code>.</li>
</ul>

<p>&nbsp;</p><p>在二维地图上，&nbsp;<code>0</code>代表海洋，&nbsp;<code>1</code>代表陆地，我们最多只能将一格&nbsp;<code>0</code> 海洋变成&nbsp;<code>1</code>变成陆地。</p>

<p>进行填海之后，地图上最大的岛屿面积是多少？（上、下、左、右四个方向相连的&nbsp;<code>1</code>&nbsp;可形成岛屿）</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入: </strong>[[1, 0], [0, 1]]
<strong>输出:</strong> 3
<strong>解释:</strong> 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入: </strong>[[1, 1], [1, 0]]
<strong>输出:</strong> 4
<strong>解释:</strong> 将一格0变成1，岛屿的面积扩大为 4。</pre>

<p><strong>示例 3:</strong></p>

<pre>
<strong>输入: </strong>[[1, 1], [1, 1]]
<strong>输出:</strong> 4
<strong>解释:</strong> 没有0可以让我们变成1，面积依然为 4。</pre>

<p><strong>说明:</strong></p>

<ul>
	<li><code>1 &lt;= grid.length = grid[0].length &lt;= 50</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= 1</code></li>
</ul>
<p>在二维地图上，&nbsp;<code>0</code>代表海洋，&nbsp;<code>1</code>代表陆地，我们最多只能将一格&nbsp;<code>0</code> 海洋变成&nbsp;<code>1</code>变成陆地。</p>

<p>进行填海之后，地图上最大的岛屿面积是多少？（上、下、左、右四个方向相连的&nbsp;<code>1</code>&nbsp;可形成岛屿）</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入: </strong>[[1, 0], [0, 1]]
<strong>输出:</strong> 3
<strong>解释:</strong> 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入: </strong>[[1, 1], [1, 0]]
<strong>输出:</strong> 4
<strong>解释:</strong> 将一格0变成1，岛屿的面积扩大为 4。</pre>

<p><strong>示例 3:</strong></p>

<pre>
<strong>输入: </strong>[[1, 1], [1, 1]]
<strong>输出:</strong> 4
<strong>解释:</strong> 没有0可以让我们变成1，面积依然为 4。</pre>

<p><strong>说明:</strong></p>

<ul>
	<li><code>1 &lt;= grid.length = grid[0].length &lt;= 50</code></li>
	<li><code>0 &lt;= grid[i][j] &lt;= 1</code></li>
</ul>
**/


class Solution {
    public int largestIsland(int[][] grid) {
        
    }
}