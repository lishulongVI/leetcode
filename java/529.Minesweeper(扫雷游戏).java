/**
<p>Let's play the minesweeper game (<a href="https://en.wikipedia.org/wiki/Minesweeper_(video_game)">Wikipedia</a>, <a href="http://minesweeperonline.com">online game</a>)! </p>

<p>You are given a 2D char matrix representing the game board. <b>'M'</b> represents an <b>unrevealed</b> mine, <b>'E'</b> represents an <b>unrevealed</b> empty square, <b>'B'</b> represents a <b>revealed</b> blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, <b>digit</b> ('1' to '8') represents how many mines are adjacent to this <b>revealed</b> square, and finally <b>'X'</b> represents a <b>revealed</b> mine.</p>

<p>Now given the next click position (row and column indices) among all the <b>unrevealed</b> squares ('M' or 'E'), return the board after revealing this position according to the following rules:</p> 

<p>
<ol>
<li>If a mine ('M') is revealed, then the game is over - change it to <b>'X'</b>.</li>
<li>If an empty square ('E') with <b>no adjacent mines</b> is revealed, then change it to revealed blank ('B') and all of its adjacent <b>unrevealed</b> squares should be revealed recursively.</li>
<li>If an empty square ('E') with <b>at least one adjacent mine</b> is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.</li>
<li>Return the board when no more squares will be revealed.</li>
</ol>


<p><b>Example 1:</b><br />
<pre>
<b>Input:</b> 

[['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'M', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E'],
 ['E', 'E', 'E', 'E', 'E']]

Click : [3,0]

<b>Output:</b> 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

<b>Explanation:</b>
<img src="/static/images/problemset/minesweeper_example_1.png" width = "40%" />
</pre>
</p>

<p><b>Example 2:</b><br />
<pre>
<b>Input:</b> 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'M', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

Click : [1,2]

<b>Output:</b> 

[['B', '1', 'E', '1', 'B'],
 ['B', '1', 'X', '1', 'B'],
 ['B', '1', '1', '1', 'B'],
 ['B', 'B', 'B', 'B', 'B']]

<b>Explanation:</b>
<img src="/static/images/problemset/minesweeper_example_2.png" width = "40%" />
</pre>
</p>

</p>

<p><b>Note:</b><br>
<ol>
<li>The range of the input matrix's height and width is [1,50].</li>
<li>The click position will only be an unrevealed square ('M' or 'E'), which also means the input board contains at least one clickable square.</li>
<li>The input board won't be a stage when game is over (some mines have been revealed).</li>
<li>For simplicity, not mentioned rules should be ignored in this problem. For example, you <b>don't</b> need to reveal all the unrevealed mines when the game is over, consider any cases that you will win the game or flag any squares.</li>
</ol>
</p><p>让我们一起来玩扫雷游戏！</p>

<p>给定一个代表游戏板的二维字符矩阵。&nbsp;<strong>&#39;M&#39;</strong>&nbsp;代表一个<strong>未挖出的</strong>地雷，<strong>&#39;E&#39;</strong>&nbsp;代表一个<strong>未挖出的</strong>空方块，<strong>&#39;B&#39;&nbsp;</strong>代表没有相邻（上，下，左，右，和所有4个对角线）地雷的<strong>已挖出的</strong>空白方块，<strong>数字</strong>（&#39;1&#39; 到 &#39;8&#39;）表示有多少地雷与这块<strong>已挖出的</strong>方块相邻，<strong>&#39;X&#39;</strong>&nbsp;则表示一个<strong>已挖出的</strong>地雷。</p>

<p>现在给出在所有<strong>未挖出的</strong>方块中（&#39;M&#39;或者&#39;E&#39;）的下一个点击位置（行和列索引），根据以下规则，返回相应位置被点击后对应的面板：</p>

<ol>
	<li>如果一个地雷（&#39;M&#39;）被挖出，游戏就结束了- 把它改为&nbsp;<strong>&#39;X&#39;</strong>。</li>
	<li>如果一个<strong>没有相邻地雷</strong>的空方块（&#39;E&#39;）被挖出，修改它为（&#39;B&#39;），并且所有和其相邻的方块都应该被递归地揭露。</li>
	<li>如果一个<strong>至少与一个地雷相邻</strong>的空方块（&#39;E&#39;）被挖出，修改它为数字（&#39;1&#39;到&#39;8&#39;），表示相邻地雷的数量。</li>
	<li>如果在此次点击中，若无更多方块可被揭露，则返回面板。</li>
</ol>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> 

[[&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;M&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;]]

Click : [3,0]

<strong>输出:</strong> 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

<strong>解释:</strong>
<img src="/static/images/problemset/minesweeper_example_1.png" style="width:40%" />
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

Click : [1,2]

<strong>输出:</strong> 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;X&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

<strong>解释:</strong>
<img src="/static/images/problemset/minesweeper_example_2.png" style="width:40%" />
</pre>

<p><strong>注意:</strong></p>

<ol>
	<li>输入矩阵的宽和高的范围为 [1,50]。</li>
	<li>点击的位置只能是未被挖出的方块 (&#39;M&#39; 或者 &#39;E&#39;)，这也意味着面板至少包含一个可点击的方块。</li>
	<li>输入面板不会是游戏结束的状态（即有地雷已被挖出）。</li>
	<li>简单起见，未提及的规则在这个问题中可被忽略。例如，当游戏结束时你不需要挖出所有地雷，考虑所有你可能赢得游戏或标记方块的情况。</li>
</ol>
<p>让我们一起来玩扫雷游戏！</p>

<p>给定一个代表游戏板的二维字符矩阵。&nbsp;<strong>&#39;M&#39;</strong>&nbsp;代表一个<strong>未挖出的</strong>地雷，<strong>&#39;E&#39;</strong>&nbsp;代表一个<strong>未挖出的</strong>空方块，<strong>&#39;B&#39;&nbsp;</strong>代表没有相邻（上，下，左，右，和所有4个对角线）地雷的<strong>已挖出的</strong>空白方块，<strong>数字</strong>（&#39;1&#39; 到 &#39;8&#39;）表示有多少地雷与这块<strong>已挖出的</strong>方块相邻，<strong>&#39;X&#39;</strong>&nbsp;则表示一个<strong>已挖出的</strong>地雷。</p>

<p>现在给出在所有<strong>未挖出的</strong>方块中（&#39;M&#39;或者&#39;E&#39;）的下一个点击位置（行和列索引），根据以下规则，返回相应位置被点击后对应的面板：</p>

<ol>
	<li>如果一个地雷（&#39;M&#39;）被挖出，游戏就结束了- 把它改为&nbsp;<strong>&#39;X&#39;</strong>。</li>
	<li>如果一个<strong>没有相邻地雷</strong>的空方块（&#39;E&#39;）被挖出，修改它为（&#39;B&#39;），并且所有和其相邻的方块都应该被递归地揭露。</li>
	<li>如果一个<strong>至少与一个地雷相邻</strong>的空方块（&#39;E&#39;）被挖出，修改它为数字（&#39;1&#39;到&#39;8&#39;），表示相邻地雷的数量。</li>
	<li>如果在此次点击中，若无更多方块可被揭露，则返回面板。</li>
</ol>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> 

[[&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;M&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;],
 [&#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;, &#39;E&#39;]]

Click : [3,0]

<strong>输出:</strong> 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

<strong>解释:</strong>
<img src="/static/images/problemset/minesweeper_example_1.png" style="width:40%" />
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;M&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

Click : [1,2]

<strong>输出:</strong> 

[[&#39;B&#39;, &#39;1&#39;, &#39;E&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;X&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;1&#39;, &#39;1&#39;, &#39;1&#39;, &#39;B&#39;],
 [&#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;, &#39;B&#39;]]

<strong>解释:</strong>
<img src="/static/images/problemset/minesweeper_example_2.png" style="width:40%" />
</pre>

<p><strong>注意:</strong></p>

<ol>
	<li>输入矩阵的宽和高的范围为 [1,50]。</li>
	<li>点击的位置只能是未被挖出的方块 (&#39;M&#39; 或者 &#39;E&#39;)，这也意味着面板至少包含一个可点击的方块。</li>
	<li>输入面板不会是游戏结束的状态（即有地雷已被挖出）。</li>
	<li>简单起见，未提及的规则在这个问题中可被忽略。例如，当游戏结束时你不需要挖出所有地雷，考虑所有你可能赢得游戏或标记方块的情况。</li>
</ol>
**/


class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        
    }
}