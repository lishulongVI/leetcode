"""
<p>Design a class to find&nbsp;the <strong>k</strong>th largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.</p>

<p>Your&nbsp;<code>KthLargest</code>&nbsp;class will have a constructor which accepts an integer <code>k</code> and an integer array <code>nums</code>, which contains initial elements from&nbsp;the stream. For each call to the method <code>KthLargest.add</code>, return the element representing the kth largest element in the stream.</p>

<p><strong>Example:</strong></p>

<pre>
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);&nbsp; &nbsp;// returns 4
kthLargest.add(5);&nbsp; &nbsp;// returns 5
kthLargest.add(10);&nbsp; // returns 5
kthLargest.add(9);&nbsp; &nbsp;// returns 8
kthLargest.add(4);&nbsp; &nbsp;// returns 8
</pre>

<p><strong>Note: </strong><br />
You may assume that&nbsp;<code>nums</code>&#39; length&nbsp;&ge;&nbsp;<code>k-1</code>&nbsp;and <code>k</code> &ge;&nbsp;1.</p><p>设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。</p>

<p>你的&nbsp;<code>KthLargest</code>&nbsp;类需要一个同时接收整数&nbsp;<code>k</code> 和整数数组<code>nums</code>&nbsp;的构造器，它包含数据流中的初始元素。每次调用&nbsp;<code>KthLargest.add</code>，返回当前数据流中第K大的元素。</p>

<p><strong>示例:</strong></p>

<pre>
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);&nbsp; &nbsp;// returns 4
kthLargest.add(5);&nbsp; &nbsp;// returns 5
kthLargest.add(10);&nbsp; // returns 5
kthLargest.add(9);&nbsp; &nbsp;// returns 8
kthLargest.add(4);&nbsp; &nbsp;// returns 8
</pre>

<p><strong>说明: </strong><br />
你可以假设&nbsp;<code>nums</code>&nbsp;的长度&ge;&nbsp;<code>k-1</code>&nbsp;且<code>k</code> &ge;&nbsp;1。</p>
<p>设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。</p>

<p>你的&nbsp;<code>KthLargest</code>&nbsp;类需要一个同时接收整数&nbsp;<code>k</code> 和整数数组<code>nums</code>&nbsp;的构造器，它包含数据流中的初始元素。每次调用&nbsp;<code>KthLargest.add</code>，返回当前数据流中第K大的元素。</p>

<p><strong>示例:</strong></p>

<pre>
int k = 3;
int[] arr = [4,5,8,2];
KthLargest kthLargest = new KthLargest(3, arr);
kthLargest.add(3);&nbsp; &nbsp;// returns 4
kthLargest.add(5);&nbsp; &nbsp;// returns 5
kthLargest.add(10);&nbsp; // returns 5
kthLargest.add(9);&nbsp; &nbsp;// returns 8
kthLargest.add(4);&nbsp; &nbsp;// returns 8
</pre>

<p><strong>说明: </strong><br />
你可以假设&nbsp;<code>nums</code>&nbsp;的长度&ge;&nbsp;<code>k-1</code>&nbsp;且<code>k</code> &ge;&nbsp;1。</p>
"""


class KthLargest(object):

    def __init__(self, k, nums):
        """
        :type k: int
        :type nums: List[int]
        """
        

    def add(self, val):
        """
        :type val: int
        :rtype: int
        """
        


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)