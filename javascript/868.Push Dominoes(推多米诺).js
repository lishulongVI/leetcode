/*
<p>There are<font face="monospace">&nbsp;<code>N</code></font> dominoes in a line, and we place each domino vertically upright.</p>

<p>In the beginning, we simultaneously push&nbsp;some of the dominoes either to the left or to the right.</p>

<p><img alt="" src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/05/18/domino.png" style="height: 160px;" /></p>

<p>After each second, each domino that is falling to the left pushes the adjacent domino on the left.</p>

<p>Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.</p>

<p>When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.</p>

<p>For the purposes of this question, we will consider that a falling domino&nbsp;expends no additional force to a falling or already fallen domino.</p>

<p>Given a string &quot;S&quot; representing the initial state.&nbsp;<code>S[i] = &#39;L&#39;</code>, if the i-th domino has been pushed to the left; <code>S[i] = &#39;R&#39;</code>, if the i-th domino has been pushed to the right; <code>S[i] = &#39;.&#39;</code>,&nbsp;if the <code>i</code>-th domino has not been pushed.</p>

<p>Return a string representing the final state.&nbsp;</p>

<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong>&quot;.L.R...LR..L..&quot;
<strong>Output: </strong>&quot;LL.RR.LLRRLL..&quot;
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input: </strong>&quot;RR.L&quot;
<strong>Output: </strong>&quot;RR.L&quot;
<strong>Explanation: </strong>The first domino expends no additional force on the second domino.
</pre>

<p><strong>Note:</strong></p>

<ol>
	<li><code>0 &lt;= N&nbsp;&lt;= 10^5</code></li>
	<li>String&nbsp;<code>dominoes</code> contains only&nbsp;<code>&#39;L</code>&#39;, <code>&#39;R&#39;</code> and <code>&#39;.&#39;</code></li>
</ol>
<p>一行中有 <code>N</code> 张多米诺骨牌，我们将每张多米诺骨牌垂直竖立。</p>

<p>在开始时，我们同时把一些多米诺骨牌向左或向右推。</p>

<p><img alt="" src="https://aliyun-lc-upload.oss-cn-hangzhou.aliyuncs.com/aliyun-lc-upload/uploads/2018/05/19/domino.png" style="height: 160px; width: 418px;"></p>

<p>每过一秒，倒向左边的多米诺骨牌会推动其左侧相邻的多米诺骨牌。</p>

<p>同样地，倒向右边的多米诺骨牌也会推动竖立在其右侧的相邻多米诺骨牌。</p>

<p>如果同时有多米诺骨牌落在一张垂直竖立的多米诺骨牌的两边，由于受力平衡， 该骨牌仍然保持不变。</p>

<p>就这个问题而言，我们会认为正在下降的多米诺骨牌不会对其它正在下降或已经下降的多米诺骨牌施加额外的力。</p>

<p>给定表示初始状态的字符串 &quot;S&quot; 。如果第 i 张多米诺骨牌被推向左边，则 <code>S[i] = &#39;L&#39;</code>；如果第 i 张多米诺骨牌被推向右边，则 <code>S[i] = &#39;R&#39;</code>；如果第 i 张多米诺骨牌没有被推动，则 <code>S[i] = &#39;.&#39;</code>。</p>

<p>返回表示最终状态的字符串。</p>

<p><strong>示例 </strong><strong>1</strong><strong>：</strong></p>

<pre><strong>输入：</strong>&quot;.L.R...LR..L..&quot;
<strong>输出：</strong>&quot;LL.RR.LLRRLL..&quot;</pre>

<p><strong>示例 </strong><strong>2</strong><strong>：</strong></p>

<pre><strong>输入：</strong>&quot;RR.L&quot;
<strong>输出：</strong>&quot;RR.L&quot;
<strong>说明：</strong>第一张多米诺骨牌没有给第二张施加额外的力。</pre>

<p><strong>提示：</strong></p>

<ol>
	<li><code>0 &lt;= N &lt;= 10^5</code></li>
	<li>表示多米诺骨牌状态的字符串只含有 <code>&#39;L&#39;</code>，<code>&#39;R&#39;</code>; 以及 <code>&#39;.&#39;</code>;</li>
</ol>
<p>一行中有 <code>N</code> 张多米诺骨牌，我们将每张多米诺骨牌垂直竖立。</p>

<p>在开始时，我们同时把一些多米诺骨牌向左或向右推。</p>

<p><img alt="" src="https://aliyun-lc-upload.oss-cn-hangzhou.aliyuncs.com/aliyun-lc-upload/uploads/2018/05/19/domino.png" style="height: 160px; width: 418px;"></p>

<p>每过一秒，倒向左边的多米诺骨牌会推动其左侧相邻的多米诺骨牌。</p>

<p>同样地，倒向右边的多米诺骨牌也会推动竖立在其右侧的相邻多米诺骨牌。</p>

<p>如果同时有多米诺骨牌落在一张垂直竖立的多米诺骨牌的两边，由于受力平衡， 该骨牌仍然保持不变。</p>

<p>就这个问题而言，我们会认为正在下降的多米诺骨牌不会对其它正在下降或已经下降的多米诺骨牌施加额外的力。</p>

<p>给定表示初始状态的字符串 &quot;S&quot; 。如果第 i 张多米诺骨牌被推向左边，则 <code>S[i] = &#39;L&#39;</code>；如果第 i 张多米诺骨牌被推向右边，则 <code>S[i] = &#39;R&#39;</code>；如果第 i 张多米诺骨牌没有被推动，则 <code>S[i] = &#39;.&#39;</code>。</p>

<p>返回表示最终状态的字符串。</p>

<p><strong>示例 </strong><strong>1</strong><strong>：</strong></p>

<pre><strong>输入：</strong>&quot;.L.R...LR..L..&quot;
<strong>输出：</strong>&quot;LL.RR.LLRRLL..&quot;</pre>

<p><strong>示例 </strong><strong>2</strong><strong>：</strong></p>

<pre><strong>输入：</strong>&quot;RR.L&quot;
<strong>输出：</strong>&quot;RR.L&quot;
<strong>说明：</strong>第一张多米诺骨牌没有给第二张施加额外的力。</pre>

<p><strong>提示：</strong></p>

<ol>
	<li><code>0 &lt;= N &lt;= 10^5</code></li>
	<li>表示多米诺骨牌状态的字符串只含有 <code>&#39;L&#39;</code>，<code>&#39;R&#39;</code>; 以及 <code>&#39;.&#39;</code>;</li>
</ol>
*/


/**
 * @param {string} dominoes
 * @return {string}
 */
var pushDominoes = function(dominoes) {
    
};