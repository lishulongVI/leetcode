=begin
<p>There are <code>N</code> workers.&nbsp; The <code>i</code>-th worker has a <code>quality[i]</code> and a minimum wage expectation <code>wage[i]</code>.</p>

<p>Now we want to hire exactly <code>K</code>&nbsp;workers to form a <em>paid group</em>.&nbsp; When hiring a group of K workers, we must pay them according to the following rules:</p>

<ol>
	<li>Every worker in the paid group should be paid in the ratio of their quality compared to other workers in the paid group.</li>
	<li>Every worker in the paid group must be paid at least their minimum wage expectation.</li>
</ol>

<p>Return the least amount of money needed to form a paid group satisfying the above conditions.</p>

<p>&nbsp;</p>

<ol>
</ol>

<div>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong>quality = <span id="example-input-1-1">[10,20,5]</span>, wage = <span id="example-input-1-2">[70,50,30]</span>, K = <span id="example-input-1-3">2</span>
<strong>Output: </strong><span id="example-output-1">105.00000
<strong>Explanation</strong>: </span><span>We pay 70 to 0-th worker and 35 to 2-th worker.</span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre>
<strong>Input: </strong>quality = <span id="example-input-2-1">[3,1,10,10,1]</span>, wage = <span id="example-input-2-2">[4,8,2,2,7]</span>, K = <span id="example-input-2-3">3</span>
<strong>Output: </strong><span id="example-output-2">30.66667
<strong>Explanation</strong>: </span><span>We pay 4 to 0-th worker, 13.33333 to 2-th and 3-th workers seperately.</span> 
</pre>

<p>&nbsp;</p>

<p><strong>Note:</strong></p>

<ol>
	<li><code>1 &lt;= K &lt;= N &lt;= 10000</code>, where <code>N = quality.length = wage.length</code></li>
	<li><code>1 &lt;= quality[i] &lt;= 10000</code></li>
	<li><code>1 &lt;= wage[i] &lt;= 10000</code></li>
	<li>Answers within <code>10^-5</code> of the correct answer will be considered correct.</li>
</ol>
</div>
</div><p>有 <code>N</code>&nbsp;名工人。&nbsp;第&nbsp;<code>i</code>&nbsp;名工人的工作质量为&nbsp;<code>quality[i]</code>&nbsp;，其最低期望工资为&nbsp;<code>wage[i]</code>&nbsp;。</p>

<p>现在我们想雇佣&nbsp;<code>K</code>&nbsp;名工人组成一个<em>工资组。</em>在雇佣&nbsp;一组 K 名工人时，我们必须按照下述规则向他们支付工资：</p>

<ol>
	<li>对工资组中的每名工人，应当按其工作质量与同组其他工人的工作质量的比例来支付工资。</li>
	<li>工资组中的每名工人至少应当得到他们的最低期望工资。</li>
</ol>

<p>返回组成一个满足上述条件的工资组至少需要多少钱。</p>

<p>&nbsp;</p>

<ol>
</ol>

<p><strong>示例 1：</strong></p>

<pre><strong>输入： </strong>quality = [10,20,5], wage = [70,50,30], K = 2
<strong>输出： </strong>105.00000
<strong>解释：</strong> 我们向 0 号工人支付 70，向 2 号工人支付 35。</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入： </strong>quality = [3,1,10,10,1], wage = [4,8,2,2,7], K = 3
<strong>输出： </strong>30.66667
<strong>解释： </strong>我们向 0 号工人支付 4，向 2 号和 3 号分别支付 13.33333。</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ol>
	<li><code>1 &lt;= K &lt;= N &lt;= 10000</code>，其中&nbsp;<code>N = quality.length = wage.length</code></li>
	<li><code>1 &lt;= quality[i] &lt;= 10000</code></li>
	<li><code>1 &lt;= wage[i] &lt;= 10000</code></li>
	<li>与正确答案误差在&nbsp;<code>10^-5</code>&nbsp;之内的答案将被视为正确的。</li>
</ol>
<p>有 <code>N</code>&nbsp;名工人。&nbsp;第&nbsp;<code>i</code>&nbsp;名工人的工作质量为&nbsp;<code>quality[i]</code>&nbsp;，其最低期望工资为&nbsp;<code>wage[i]</code>&nbsp;。</p>

<p>现在我们想雇佣&nbsp;<code>K</code>&nbsp;名工人组成一个<em>工资组。</em>在雇佣&nbsp;一组 K 名工人时，我们必须按照下述规则向他们支付工资：</p>

<ol>
	<li>对工资组中的每名工人，应当按其工作质量与同组其他工人的工作质量的比例来支付工资。</li>
	<li>工资组中的每名工人至少应当得到他们的最低期望工资。</li>
</ol>

<p>返回组成一个满足上述条件的工资组至少需要多少钱。</p>

<p>&nbsp;</p>

<ol>
</ol>

<p><strong>示例 1：</strong></p>

<pre><strong>输入： </strong>quality = [10,20,5], wage = [70,50,30], K = 2
<strong>输出： </strong>105.00000
<strong>解释：</strong> 我们向 0 号工人支付 70，向 2 号工人支付 35。</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入： </strong>quality = [3,1,10,10,1], wage = [4,8,2,2,7], K = 3
<strong>输出： </strong>30.66667
<strong>解释： </strong>我们向 0 号工人支付 4，向 2 号和 3 号分别支付 13.33333。</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ol>
	<li><code>1 &lt;= K &lt;= N &lt;= 10000</code>，其中&nbsp;<code>N = quality.length = wage.length</code></li>
	<li><code>1 &lt;= quality[i] &lt;= 10000</code></li>
	<li><code>1 &lt;= wage[i] &lt;= 10000</code></li>
	<li>与正确答案误差在&nbsp;<code>10^-5</code>&nbsp;之内的答案将被视为正确的。</li>
</ol>

=end


# @param {Integer[]} quality
# @param {Integer[]} wage
# @param {Integer} k
# @return {Float}
def mincost_to_hire_workers(quality, wage, k)
    
end