/*
<p>
Implement a <code>MyCalendarThree</code> class to store your events. A new event can <b>always</b> be added.
</p><p>
Your class will have one method, <code>book(int start, int end)</code>.  Formally, this represents a booking on the half open interval <code>[start, end)</code>, the range of real numbers <code>x</code> such that <code>start <= x < end</code>.
</p><p>
A <i>K-booking</i> happens when <b>K</b> events have some non-empty intersection (ie., there is some time that is common to all K events.)
</p><p>
For each call to the method <code>MyCalendar.book</code>, return an integer <code>K</code> representing the largest integer such that there exists a <code>K</code>-booking in the calendar.
</p>

Your class will be called like this:
<code>MyCalendarThree cal = new MyCalendarThree();</code>
<code>MyCalendarThree.book(start, end)</code>

<p><b>Example 1:</b><br />
<pre>
MyCalendarThree();
MyCalendarThree.book(10, 20); // returns 1
MyCalendarThree.book(50, 60); // returns 1
MyCalendarThree.book(10, 40); // returns 2
MyCalendarThree.book(5, 15); // returns 3
MyCalendarThree.book(5, 10); // returns 3
MyCalendarThree.book(25, 55); // returns 3
<b>Explanation:</b> 
The first two events can be booked and are disjoint, so the maximum K-booking is a 1-booking.
The third event [10, 40) intersects the first event, and the maximum K-booking is a 2-booking.
The remaining events cause the maximum K-booking to be only a 3-booking.
Note that the last event locally causes a 2-booking, but the answer is still 3 because
eg. [10, 20), [10, 40), and [5, 15) are still triple booked.
</pre>
</p>

<p><b>Note:</b>
<li>The number of calls to <code>MyCalendarThree.book</code> per test case will be at most <code>400</code>.</li>
<li>In calls to <code>MyCalendarThree.book(start, end)</code>, <code>start</code> and <code>end</code> are integers in the range <code>[0, 10^9]</code>.</li>
</p><p>实现一个 <code>MyCalendar</code> 类来存放你的日程安排，你可以一直添加新的日程安排。</p>

<p><code>MyCalendar</code> 有一个 <code>book(int start, int end)</code>方法。它意味着在start到end时间内增加一个日程安排，注意，这里的时间是半开区间，即 <code>[start, end)</code>, 实数&nbsp;<code>x</code> 的范围为， &nbsp;<code>start &lt;= x &lt; end</code>。</p>

<p>当 <strong>K</strong> 个日程安排有一些时间上的交叉时（例如K个日程安排都在同一时间内），就会产生 <strong>K</strong> 次预订。</p>

<p>每次调用 <code>MyCalendar.book</code>方法时，返回一个整数 <code>K</code> ，表示最大的 <code>K</code> 次预订。</p>

<p>请按照以下步骤调用<code>MyCalendar</code> 类: <code>MyCalendar cal = new MyCalendar();</code> <code>MyCalendar.book(start, end)</code></p>

<p><strong>示例 1:</strong></p>

<pre>
MyCalendarThree();
MyCalendarThree.book(10, 20); // returns 1
MyCalendarThree.book(50, 60); // returns 1
MyCalendarThree.book(10, 40); // returns 2
MyCalendarThree.book(5, 15); // returns 3
MyCalendarThree.book(5, 10); // returns 3
MyCalendarThree.book(25, 55); // returns 3
<strong>解释:</strong> 
前两个日程安排可以预订并且不相交，所以最大的K次预订是1。
第三个日程安排[10,40]与第一个日程安排相交，最高的K次预订为2。
其余的日程安排的最高K次预订仅为3。
请注意，最后一次日程安排可能会导致局部最高K次预订为2，但答案仍然是3，原因是从开始到最后，时间[10,20]，[10,40]和[5,15]仍然会导致3次预订。
</pre>

<p><strong>说明:</strong></p>

<ul>
	<li>每个测试用例，调用&nbsp;<code>MyCalendar.book</code>&nbsp;函数最多不超过&nbsp;<code>400</code>次。</li>
	<li>调用函数&nbsp;<code>MyCalendar.book(start, end)</code>时，&nbsp;<code>start</code> 和&nbsp;<code>end</code> 的取值范围为&nbsp;<code>[0, 10^9]</code>。</li>
</ul>
<p>实现一个 <code>MyCalendar</code> 类来存放你的日程安排，你可以一直添加新的日程安排。</p>

<p><code>MyCalendar</code> 有一个 <code>book(int start, int end)</code>方法。它意味着在start到end时间内增加一个日程安排，注意，这里的时间是半开区间，即 <code>[start, end)</code>, 实数&nbsp;<code>x</code> 的范围为， &nbsp;<code>start &lt;= x &lt; end</code>。</p>

<p>当 <strong>K</strong> 个日程安排有一些时间上的交叉时（例如K个日程安排都在同一时间内），就会产生 <strong>K</strong> 次预订。</p>

<p>每次调用 <code>MyCalendar.book</code>方法时，返回一个整数 <code>K</code> ，表示最大的 <code>K</code> 次预订。</p>

<p>请按照以下步骤调用<code>MyCalendar</code> 类: <code>MyCalendar cal = new MyCalendar();</code> <code>MyCalendar.book(start, end)</code></p>

<p><strong>示例 1:</strong></p>

<pre>
MyCalendarThree();
MyCalendarThree.book(10, 20); // returns 1
MyCalendarThree.book(50, 60); // returns 1
MyCalendarThree.book(10, 40); // returns 2
MyCalendarThree.book(5, 15); // returns 3
MyCalendarThree.book(5, 10); // returns 3
MyCalendarThree.book(25, 55); // returns 3
<strong>解释:</strong> 
前两个日程安排可以预订并且不相交，所以最大的K次预订是1。
第三个日程安排[10,40]与第一个日程安排相交，最高的K次预订为2。
其余的日程安排的最高K次预订仅为3。
请注意，最后一次日程安排可能会导致局部最高K次预订为2，但答案仍然是3，原因是从开始到最后，时间[10,20]，[10,40]和[5,15]仍然会导致3次预订。
</pre>

<p><strong>说明:</strong></p>

<ul>
	<li>每个测试用例，调用&nbsp;<code>MyCalendar.book</code>&nbsp;函数最多不超过&nbsp;<code>400</code>次。</li>
	<li>调用函数&nbsp;<code>MyCalendar.book(start, end)</code>时，&nbsp;<code>start</code> 和&nbsp;<code>end</code> 的取值范围为&nbsp;<code>[0, 10^9]</code>。</li>
</ul>
*/



var MyCalendarThree = function() {
    
};

/** 
 * @param {number} start 
 * @param {number} end
 * @return {number}
 */
MyCalendarThree.prototype.book = function(start, end) {
    
};

/** 
 * Your MyCalendarThree object will be instantiated and called as such:
 * var obj = Object.create(MyCalendarThree).createNew()
 * var param_1 = obj.book(start,end)
 */