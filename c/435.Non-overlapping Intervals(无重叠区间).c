/*
<p>
Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
</p>

<p><b>Note:</b><br />
<ol>
<li>You may assume the interval's end point is always bigger than its start point.</li>
<li>Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.</li>
</ol>
</p>

<p><b>Example 1:</b><br />
<pre>
<b>Input:</b> [ [1,2], [2,3], [3,4], [1,3] ]

<b>Output:</b> 1

<b>Explanation:</b> [1,3] can be removed and the rest of intervals are non-overlapping.
</pre>
</p>

<p><b>Example 2:</b><br />
<pre>
<b>Input:</b> [ [1,2], [1,2], [1,2] ]

<b>Output:</b> 2

<b>Explanation:</b> You need to remove two [1,2] to make the rest of intervals non-overlapping.
</pre>
</p>

<p><b>Example 3:</b><br />
<pre>
<b>Input:</b> [ [1,2], [2,3] ]

<b>Output:</b> 0

<b>Explanation:</b> You don't need to remove any of the intervals since they're already non-overlapping.
</pre>
</p><p>给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。</p>

<p><strong>注意:</strong></p>

<ol>
	<li>可以认为区间的终点总是大于它的起点。</li>
	<li>区间 [1,2] 和 [2,3] 的边界相互&ldquo;接触&rdquo;，但没有相互重叠。</li>
</ol>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> [ [1,2], [2,3], [3,4], [1,3] ]

<strong>输出:</strong> 1

<strong>解释:</strong> 移除 [1,3] 后，剩下的区间没有重叠。
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> [ [1,2], [1,2], [1,2] ]

<strong>输出:</strong> 2

<strong>解释:</strong> 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
</pre>

<p><strong>示例 3:</strong></p>

<pre>
<strong>输入:</strong> [ [1,2], [2,3] ]

<strong>输出:</strong> 0

<strong>解释:</strong> 你不需要移除任何区间，因为它们已经是无重叠的了。
</pre>
<p>给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。</p>

<p><strong>注意:</strong></p>

<ol>
	<li>可以认为区间的终点总是大于它的起点。</li>
	<li>区间 [1,2] 和 [2,3] 的边界相互&ldquo;接触&rdquo;，但没有相互重叠。</li>
</ol>

<p><strong>示例 1:</strong></p>

<pre>
<strong>输入:</strong> [ [1,2], [2,3], [3,4], [1,3] ]

<strong>输出:</strong> 1

<strong>解释:</strong> 移除 [1,3] 后，剩下的区间没有重叠。
</pre>

<p><strong>示例 2:</strong></p>

<pre>
<strong>输入:</strong> [ [1,2], [1,2], [1,2] ]

<strong>输出:</strong> 2

<strong>解释:</strong> 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
</pre>

<p><strong>示例 3:</strong></p>

<pre>
<strong>输入:</strong> [ [1,2], [2,3] ]

<strong>输出:</strong> 0

<strong>解释:</strong> 你不需要移除任何区间，因为它们已经是无重叠的了。
</pre>
*/


/**
 * Definition for an interval.
 * struct Interval {
 *     int start;
 *     int end;
 * };
 */
int eraseOverlapIntervals(struct Interval* intervals, int intervalsSize) {
    
}