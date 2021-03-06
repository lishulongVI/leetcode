"""
<p>
Given an integer <i>n</i>, return 1 - <i>n</i> in lexicographical order.
</p>

<p>
For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
</p>

<p>
Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.
</p><p>给定一个整数&nbsp;<em>n</em>, 返回从&nbsp;<em>1&nbsp;</em>到&nbsp;<em>n&nbsp;</em>的字典顺序。</p>

<p>例如，</p>

<p>给定 <em>n</em> =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。</p>

<p>请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据&nbsp;<em>n&nbsp;</em>小于等于&nbsp;5,000,000。</p>
<p>给定一个整数&nbsp;<em>n</em>, 返回从&nbsp;<em>1&nbsp;</em>到&nbsp;<em>n&nbsp;</em>的字典顺序。</p>

<p>例如，</p>

<p>给定 <em>n</em> =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。</p>

<p>请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据&nbsp;<em>n&nbsp;</em>小于等于&nbsp;5,000,000。</p>
"""


class Solution(object):
    def lexicalOrder(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        