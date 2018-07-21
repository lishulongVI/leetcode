"""
<p>Find the smallest prime palindrome greater than or equal to <code>N</code>.</p>

<p>Recall that a&nbsp;number is <em>prime</em> if it&#39;s only divisors are 1 and itself, and it is greater than 1.&nbsp;</p>

<p>For example, 2,3,5,7,11 and 13 are&nbsp;primes.</p>

<p>Recall that a number is a <em>palindrome</em> if it reads the same from left to right as it does from right to left.&nbsp;</p>

<p>For example, 12321 is a palindrome.</p>

<p>&nbsp;</p>

<div>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input: </strong><span id="example-input-1-1">6</span>
<strong>Output: </strong><span id="example-output-1">7</span>
</pre>

<div>
<p><strong>Example 2:</strong></p>

<pre>
<strong>Input: </strong><span id="example-input-2-1">8</span>
<strong>Output: </strong><span id="example-output-2">11</span>
</pre>

<div>
<p><strong>Example 3:</strong></p>

<pre>
<strong>Input: </strong><span id="example-input-3-1">13</span>
<strong>Output: </strong><span id="example-output-3">101</span></pre>
</div>
</div>
</div>

<p>&nbsp;</p>

<p><strong>Note:</strong></p>

<ul>
	<li><code>1 &lt;= N &lt;= 10^8</code></li>
	<li>The answer is guaranteed to exist and be less than <code>2 * 10^8</code>.</li>
</ul>
<p>求出大于或等于&nbsp;<code>N</code>&nbsp;的最小回文素数。</p>

<p>回顾一下，如果一个数大于 1，且其因数只有 1 和它自身，那么这个数是<em>素数</em>。</p>

<p>例如，2，3，5，7，11 以及&nbsp;13 是素数。</p>

<p>回顾一下，如果一个数从左往右读与从右往左读是一样的，那么这个数是<em>回文数。</em></p>

<p>例如，12321 是回文数。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>6
<strong>输出：</strong>7
</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre><strong>输入：</strong>8
<strong>输出：</strong>11
</pre>

<p><strong>示例&nbsp;3：</strong></p>

<pre><strong>输入：</strong>13
<strong>输出：</strong>101</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= N &lt;= 10^8</code></li>
	<li>答案肯定存在，且小于&nbsp;<code>2 * 10^8</code>。</li>
</ul>

<p>&nbsp;</p>

<p>&nbsp;</p>
<p>求出大于或等于&nbsp;<code>N</code>&nbsp;的最小回文素数。</p>

<p>回顾一下，如果一个数大于 1，且其因数只有 1 和它自身，那么这个数是<em>素数</em>。</p>

<p>例如，2，3，5，7，11 以及&nbsp;13 是素数。</p>

<p>回顾一下，如果一个数从左往右读与从右往左读是一样的，那么这个数是<em>回文数。</em></p>

<p>例如，12321 是回文数。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>6
<strong>输出：</strong>7
</pre>

<p><strong>示例&nbsp;2：</strong></p>

<pre><strong>输入：</strong>8
<strong>输出：</strong>11
</pre>

<p><strong>示例&nbsp;3：</strong></p>

<pre><strong>输入：</strong>13
<strong>输出：</strong>101</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= N &lt;= 10^8</code></li>
	<li>答案肯定存在，且小于&nbsp;<code>2 * 10^8</code>。</li>
</ul>

<p>&nbsp;</p>

<p>&nbsp;</p>
"""


class Solution(object):
    def primePalindrome(self, N):
        """
        :type N: int
        :rtype: int
        """
        