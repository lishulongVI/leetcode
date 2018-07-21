/*
<p>Your car starts at position 0 and speed +1 on an infinite number line.&nbsp; (Your car can go into negative positions.)</p>

<p>Your car drives automatically according to a sequence of instructions A (accelerate) and R (reverse).</p>

<p>When you get an instruction &quot;A&quot;, your car does the following:&nbsp;<code>position += speed, speed *= 2</code>.</p>

<p>When you get an instruction &quot;R&quot;, your car does the following: if your speed is positive then&nbsp;<code>speed = -1</code>&nbsp;, otherwise&nbsp;<code>speed = 1</code>.&nbsp; (Your position stays the same.)</p>

<p>For example, after commands &quot;AAR&quot;, your car goes to positions 0-&gt;1-&gt;3-&gt;3, and your speed goes to 1-&gt;2-&gt;4-&gt;-1.</p>

<p>Now for some target position, say the <strong>length</strong> of the shortest sequence of instructions to get there.</p>

<pre>
<strong>Example 1:</strong>
<strong>Input:</strong> 
target = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> 
The shortest instruction sequence is &quot;AA&quot;.
Your position goes from 0-&gt;1-&gt;3.
</pre>

<pre>
<strong>Example 2:</strong>
<strong>Input:</strong> 
target = 6
<strong>Output:</strong> 5
<strong>Explanation:</strong> 
The shortest instruction sequence is &quot;AAARA&quot;.
Your position goes from 0-&gt;1-&gt;3-&gt;7-&gt;7-&gt;6.
</pre>

<p>&nbsp;</p>

<p><strong>Note: </strong></p>

<ul>
	<li><code>1 &lt;= target &lt;= 10000</code>.</li>
</ul><p>你的赛车起始停留在位置 0，速度为 +1，正行驶在一个无限长的数轴上。（车也可以向负数方向行驶。）</p>

<p>你的车会根据一系列由 A（加速）和 R（倒车）组成的指令进行自动驾驶&nbsp;。</p>

<p>当车得到指令 &quot;A&quot; 时, 将会做出以下操作：&nbsp;<code>position += speed, speed *= 2</code>。</p>

<p>当车得到指令 &quot;R&quot; 时, 将会做出以下操作：如果当前速度是正数，则将车速调整为&nbsp;<code>speed = -1</code>&nbsp;；否则将车速调整为&nbsp;<code>speed = 1</code>。&nbsp; (当前所处位置不变。)</p>

<p>例如，当得到一系列指令 &quot;AAR&quot; 后, 你的车将会走过位置 0-&gt;1-&gt;3-&gt;3，并且速度变化为&nbsp;1-&gt;2-&gt;4-&gt;-1。</p>

<p>现在给定一个目标位置，请给出能够到达目标位置的最短指令列表的<strong>长度</strong>。</p>

<pre><strong>示例 1:</strong>
<strong>输入:</strong> 
target = 3
<strong>输出:</strong> 2
<strong>解释:</strong> 
最短指令列表为 &quot;AA&quot;
位置变化为 0-&gt;1-&gt;3
</pre>

<pre><strong>示例 2:</strong>
<strong>输入:</strong> 
target = 6
<strong>输出:</strong> 5
<strong>解释:</strong> 
最短指令列表为 &quot;AAARA&quot;
位置变化为 0-&gt;1-&gt;3-&gt;7-&gt;7-&gt;6
</pre>

<p><strong>说明: </strong></p>

<ul>
	<li><code>1 &lt;= target（目标位置） &lt;= 10000</code>。</li>
</ul>
<p>你的赛车起始停留在位置 0，速度为 +1，正行驶在一个无限长的数轴上。（车也可以向负数方向行驶。）</p>

<p>你的车会根据一系列由 A（加速）和 R（倒车）组成的指令进行自动驾驶&nbsp;。</p>

<p>当车得到指令 &quot;A&quot; 时, 将会做出以下操作：&nbsp;<code>position += speed, speed *= 2</code>。</p>

<p>当车得到指令 &quot;R&quot; 时, 将会做出以下操作：如果当前速度是正数，则将车速调整为&nbsp;<code>speed = -1</code>&nbsp;；否则将车速调整为&nbsp;<code>speed = 1</code>。&nbsp; (当前所处位置不变。)</p>

<p>例如，当得到一系列指令 &quot;AAR&quot; 后, 你的车将会走过位置 0-&gt;1-&gt;3-&gt;3，并且速度变化为&nbsp;1-&gt;2-&gt;4-&gt;-1。</p>

<p>现在给定一个目标位置，请给出能够到达目标位置的最短指令列表的<strong>长度</strong>。</p>

<pre><strong>示例 1:</strong>
<strong>输入:</strong> 
target = 3
<strong>输出:</strong> 2
<strong>解释:</strong> 
最短指令列表为 &quot;AA&quot;
位置变化为 0-&gt;1-&gt;3
</pre>

<pre><strong>示例 2:</strong>
<strong>输入:</strong> 
target = 6
<strong>输出:</strong> 5
<strong>解释:</strong> 
最短指令列表为 &quot;AAARA&quot;
位置变化为 0-&gt;1-&gt;3-&gt;7-&gt;7-&gt;6
</pre>

<p><strong>说明: </strong></p>

<ul>
	<li><code>1 &lt;= target（目标位置） &lt;= 10000</code>。</li>
</ul>
*/


class Solution {
    func racecar(_ target: Int) -> Int {
        
    }
}