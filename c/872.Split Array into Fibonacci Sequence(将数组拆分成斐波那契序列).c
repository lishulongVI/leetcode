/*
<p>Given a string <code>S</code>&nbsp;of digits, such as <code>S = &quot;123456579&quot;</code>, we can split it into a <em>Fibonacci-like sequence</em>&nbsp;<code>[123, 456, 579].</code></p>

<p>Formally, a Fibonacci-like sequence is a list&nbsp;<code>F</code> of non-negative integers such that:</p>

<ul>
	<li><code>0 &lt;= F[i] &lt;= 2^31 - 1</code>, (that is,&nbsp;each integer fits a 32-bit signed integer type);</li>
	<li><code>F.length &gt;= 3</code>;</li>
	<li>and<code> F[i] + F[i+1] = F[i+2] </code>for all <code>0 &lt;= i &lt; F.length - 2</code>.</li>
</ul>

<p>Also, note that when splitting the string into pieces, each piece must not have extra leading zeroes, except if the piece is the number 0 itself.</p>

<p>Return any Fibonacci-like sequence split from <code>S</code>, or return <code>[]</code> if it cannot be done.</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong>&quot;123456579&quot;
<strong>Output: </strong>[123,456,579]
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input: </strong>&quot;11235813&quot;
<strong>Output: </strong>[1,1,2,3,5,8,13]
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input: </strong>&quot;112358130&quot;
<strong>Output: </strong>[]
<strong>Explanation: </strong>The task is impossible.
</pre>

<p><strong>Example 4:</strong></p>

<pre>
<strong>Input: </strong>&quot;0123&quot;
<strong>Output: </strong>[]
<strong>Explanation: </strong>Leading zeroes are not allowed, so &quot;01&quot;, &quot;2&quot;, &quot;3&quot; is not valid.
</pre>

<p><strong>Example 5:</strong></p>

<pre>
<strong>Input: </strong>&quot;1101111&quot;
<strong>Output: </strong>[110, 1, 111]
<strong>Explanation: </strong>The output [11, 0, 11, 11] would also be accepted.
</pre>

<p><strong>Note: </strong></p>

<ol>
	<li><code>1 &lt;= S.length&nbsp;&lt;= 200</code></li>
	<li><code>S</code> contains only digits.</li>
</ol>
<p>给定一个数字字符串 <code>S</code>，比如 <code>S = &quot;123456579&quot;</code>，我们可以将它分成斐波那契式的序列 <code>[123, 456, 579]</code>。</p>

<p>形式上，斐波那契式序列是一个非负整数列表 <code>F</code>，且满足：</p>

<ul>
	<li><code>0 &lt;= F[i] &lt;= 2^31 - 1</code>，（也就是说，每个整数都符合 32 位有符号整数类型）；</li>
	<li><code>F.length &gt;= 3</code>；</li>
	<li>对于所有的<code>0 &lt;= i &lt; F.length - 2</code>，都有 <code>F[i] + F[i+1] = F[i+2]</code> 成立。</li>
</ul>

<p>另外，请注意，将字符串拆分成小块时，每个块的数字一定不要以零开头，除非这个块是数字 0 本身。</p>

<p>返回从 <code>S</code> 拆分出来的所有斐波那契式的序列块，如果不能拆分则返回 <code>[]</code>。</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>&quot;123456579&quot;
<strong>输出：</strong>[123,456,579]
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入: </strong>&quot;11235813&quot;
<strong>输出: </strong>[1,1,2,3,5,8,13]
</pre>

<p><strong>示例 3：</strong></p>

<pre><strong>输入: </strong>&quot;112358130&quot;
<strong>输出: </strong>[]
<strong>解释: </strong>这项任务无法完成。
</pre>

<p><strong>示例 4：</strong></p>

<pre><strong>输入：</strong>&quot;0123&quot;
<strong>输出：</strong>[]
<strong>解释：</strong>每个块的数字不能以零开头，因此 &quot;01&quot;，&quot;2&quot;，&quot;3&quot; 不是有效答案。
</pre>

<p><strong>示例 5：</strong></p>

<pre><strong>输入: </strong>&quot;1101111&quot;
<strong>输出: </strong>[110, 1, 111]
<strong>解释: </strong>输出 [11,0,11,11] 也同样被接受。
</pre>

<p><strong>提示：</strong></p>

<ol>
	<li><code>1 &lt;= S.length&nbsp;&lt;= 200</code></li>
	<li>字符串 <code>S</code> 中只含有数字。</li>
</ol>
<p>给定一个数字字符串 <code>S</code>，比如 <code>S = &quot;123456579&quot;</code>，我们可以将它分成斐波那契式的序列 <code>[123, 456, 579]</code>。</p>

<p>形式上，斐波那契式序列是一个非负整数列表 <code>F</code>，且满足：</p>

<ul>
	<li><code>0 &lt;= F[i] &lt;= 2^31 - 1</code>，（也就是说，每个整数都符合 32 位有符号整数类型）；</li>
	<li><code>F.length &gt;= 3</code>；</li>
	<li>对于所有的<code>0 &lt;= i &lt; F.length - 2</code>，都有 <code>F[i] + F[i+1] = F[i+2]</code> 成立。</li>
</ul>

<p>另外，请注意，将字符串拆分成小块时，每个块的数字一定不要以零开头，除非这个块是数字 0 本身。</p>

<p>返回从 <code>S</code> 拆分出来的所有斐波那契式的序列块，如果不能拆分则返回 <code>[]</code>。</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>&quot;123456579&quot;
<strong>输出：</strong>[123,456,579]
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入: </strong>&quot;11235813&quot;
<strong>输出: </strong>[1,1,2,3,5,8,13]
</pre>

<p><strong>示例 3：</strong></p>

<pre><strong>输入: </strong>&quot;112358130&quot;
<strong>输出: </strong>[]
<strong>解释: </strong>这项任务无法完成。
</pre>

<p><strong>示例 4：</strong></p>

<pre><strong>输入：</strong>&quot;0123&quot;
<strong>输出：</strong>[]
<strong>解释：</strong>每个块的数字不能以零开头，因此 &quot;01&quot;，&quot;2&quot;，&quot;3&quot; 不是有效答案。
</pre>

<p><strong>示例 5：</strong></p>

<pre><strong>输入: </strong>&quot;1101111&quot;
<strong>输出: </strong>[110, 1, 111]
<strong>解释: </strong>输出 [11,0,11,11] 也同样被接受。
</pre>

<p><strong>提示：</strong></p>

<ol>
	<li><code>1 &lt;= S.length&nbsp;&lt;= 200</code></li>
	<li>字符串 <code>S</code> 中只含有数字。</li>
</ol>
*/


/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* splitIntoFibonacci(char* S, int* returnSize) {
    
}