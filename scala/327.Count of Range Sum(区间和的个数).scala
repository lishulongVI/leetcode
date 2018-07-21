/**
<p>Given an integer array <code>nums</code>, return the number of range sums that lie in <code>[lower, upper]</code> inclusive.<br />
Range sum <code>S(i, j)</code> is defined as the sum of the elements in <code>nums</code> between indices <code>i</code> and <code>j</code> (<code>i</code> &le; <code>j</code>), inclusive.</p>

<p><b>Note:</b><br />
A naive algorithm of <i>O</i>(<i>n</i><sup>2</sup>) is trivial. You MUST do better than that.</p>

<p><b>Example:</b></p>

<pre>
<strong>Input: </strong><i>nums</i> = <code>[-2,5,-1]</code>, <i>lower</i> = <code>-2</code>, <i>upper</i> = <code>2</code>,
<strong>Output: </strong>3 
<strong>Explanation: </strong>The three ranges are : <code>[0,0]</code>, <code>[2,2]</code>, <code>[0,2]</code> and their respective sums are: <code>-2, -1, 2</code>.
</pre>
<p>给定一个整数数组&nbsp;<code>nums</code>，返回区间和在&nbsp;<code>[lower, upper]</code>&nbsp;之间的个数，包含&nbsp;<code>lower</code>&nbsp;和&nbsp;<code>upper</code>。<br>
区间和&nbsp;<code>S(i, j)</code>&nbsp;表示在&nbsp;<code>nums</code>&nbsp;中，位置从&nbsp;<code>i</code>&nbsp;到&nbsp;<code>j</code>&nbsp;的元素之和，包含&nbsp;<code>i</code>&nbsp;和&nbsp;<code>j</code>&nbsp;(<code>i</code> &le; <code>j</code>)。</p>

<p><strong>说明:</strong><br>
最直观的算法复杂度是&nbsp;<em>O</em>(<em>n</em><sup>2</sup>) ，请在此基础上优化你的算法。</p>

<p><strong>示例:</strong></p>

<pre><strong>输入: </strong><em>nums</em> = <code>[-2,5,-1]</code>, <em>lower</em> = <code>-2</code>, <em>upper</em> = <code>2</code>,
<strong>输出: </strong>3 
<strong>解释: </strong>3个区间分别是: <code>[0,0]</code>, <code>[2,2]</code>, <code>[0,2]，</code>它们表示的和分别为: <code>-2, -1, 2。</code>
</pre>
<p>给定一个整数数组&nbsp;<code>nums</code>，返回区间和在&nbsp;<code>[lower, upper]</code>&nbsp;之间的个数，包含&nbsp;<code>lower</code>&nbsp;和&nbsp;<code>upper</code>。<br>
区间和&nbsp;<code>S(i, j)</code>&nbsp;表示在&nbsp;<code>nums</code>&nbsp;中，位置从&nbsp;<code>i</code>&nbsp;到&nbsp;<code>j</code>&nbsp;的元素之和，包含&nbsp;<code>i</code>&nbsp;和&nbsp;<code>j</code>&nbsp;(<code>i</code> &le; <code>j</code>)。</p>

<p><strong>说明:</strong><br>
最直观的算法复杂度是&nbsp;<em>O</em>(<em>n</em><sup>2</sup>) ，请在此基础上优化你的算法。</p>

<p><strong>示例:</strong></p>

<pre><strong>输入: </strong><em>nums</em> = <code>[-2,5,-1]</code>, <em>lower</em> = <code>-2</code>, <em>upper</em> = <code>2</code>,
<strong>输出: </strong>3 
<strong>解释: </strong>3个区间分别是: <code>[0,0]</code>, <code>[2,2]</code>, <code>[0,2]，</code>它们表示的和分别为: <code>-2, -1, 2。</code>
</pre>
**/


object Solution {
    def countRangeSum(nums: Array[Int], lower: Int, upper: Int): Int = {
        
    }
}