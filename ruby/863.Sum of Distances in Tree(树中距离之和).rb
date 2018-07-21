=begin
<p>An undirected, connected&nbsp;tree with <code>N</code> nodes labelled <code>0...N-1</code> and <code>N-1</code> <code>edges</code>&nbsp;are&nbsp;given.</p>

<p>The <code>i</code>th edge connects nodes&nbsp;<code>edges[i][0] </code>and<code>&nbsp;edges[i][1]</code>&nbsp;together.</p>

<p>Return a list <code>ans</code>, where <code>ans[i]</code> is the sum of the distances between node <code>i</code> and all other nodes.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong>N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
<strong>Output: </strong>[8,12,6,10,10,10]
<strong>Explanation: </strong>
Here is a diagram of the given tree:
  0
 / \
1   2
   /|\
  3 4 5
We can see that dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
equals 1 + 1 + 2 + 2 + 2 = 8.  Hence, answer[0] = 8, and so on.
</pre>

<p>Note:<font face="monospace">&nbsp;<code>1 &lt;= N &lt;= 10000</code></font></p>
<p>给定一个无向、连通的树。树中有 <code>N</code> 个标记为 <code>0...N-1</code> 的节点以及 <code>N-1</code>&nbsp;条边&nbsp;。</p>

<p>第 <code>i</code> 条边连接节点&nbsp;<code>edges[i][0]</code> 和 <code>edges[i][1]</code>&nbsp;。</p>

<p>返回一个表示节点 <code>i</code> 与其他所有节点距离之和的列表 <code>ans</code>。</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入: </strong>N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
<strong>输出: </strong>[8,12,6,10,10,10]
<strong>解释: </strong>
如下为给定的树的示意图：
  0
 / \
1   2
   /|\
  3 4 5

我们可以计算出 dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5) 
也就是 1 + 1 + 2 + 2 + 2 = 8。 因此，answer[0] = 8，以此类推。
</pre>

<p><strong>说明:</strong>&nbsp;<code>1 &lt;= N &lt;= 10000</code></p>
<p>给定一个无向、连通的树。树中有 <code>N</code> 个标记为 <code>0...N-1</code> 的节点以及 <code>N-1</code>&nbsp;条边&nbsp;。</p>

<p>第 <code>i</code> 条边连接节点&nbsp;<code>edges[i][0]</code> 和 <code>edges[i][1]</code>&nbsp;。</p>

<p>返回一个表示节点 <code>i</code> 与其他所有节点距离之和的列表 <code>ans</code>。</p>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入: </strong>N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
<strong>输出: </strong>[8,12,6,10,10,10]
<strong>解释: </strong>
如下为给定的树的示意图：
  0
 / \
1   2
   /|\
  3 4 5

我们可以计算出 dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5) 
也就是 1 + 1 + 2 + 2 + 2 = 8。 因此，answer[0] = 8，以此类推。
</pre>

<p><strong>说明:</strong>&nbsp;<code>1 &lt;= N &lt;= 10000</code></p>

=end


# @param {Integer} n
# @param {Integer[][]} edges
# @return {Integer[]}
def sum_of_distances_in_tree(n, edges)
    
end