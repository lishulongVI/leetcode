=begin
<p>
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
<ul>
<li>
push(x) -- Push element x onto stack.
</li>
<li>
pop() -- Removes the element on top of the stack.
</li>
<li>
top() -- Get the top element.
</li>
<li>
getMin() -- Retrieve the minimum element in the stack.
</li>
</ul>
</p>

<p><b>Example:</b><br />
<pre>
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
</pre>
</p><p>设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。</p>

<ul>
	<li>push(x)&nbsp;-- 将元素 x 推入栈中。</li>
	<li>pop()&nbsp;-- 删除栈顶的元素。</li>
	<li>top()&nbsp;-- 获取栈顶元素。</li>
	<li>getMin() -- 检索栈中的最小元素。</li>
</ul>

<p><strong>示例:</strong></p>

<pre>MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --&gt; 返回 -3.
minStack.pop();
minStack.top();      --&gt; 返回 0.
minStack.getMin();   --&gt; 返回 -2.
</pre>
<p>设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。</p>

<ul>
	<li>push(x)&nbsp;-- 将元素 x 推入栈中。</li>
	<li>pop()&nbsp;-- 删除栈顶的元素。</li>
	<li>top()&nbsp;-- 获取栈顶元素。</li>
	<li>getMin() -- 检索栈中的最小元素。</li>
</ul>

<p><strong>示例:</strong></p>

<pre>MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --&gt; 返回 -3.
minStack.pop();
minStack.top();      --&gt; 返回 0.
minStack.getMin();   --&gt; 返回 -2.
</pre>

=end


class MinStack

=begin
    initialize your data structure here.
=end
    def initialize()
        
    end


=begin
    :type x: Integer
    :rtype: Void
=end
    def push(x)
        
    end


=begin
    :rtype: Void
=end
    def pop()
        
    end


=begin
    :rtype: Integer
=end
    def top()
        
    end


=begin
    :rtype: Integer
=end
    def get_min()
        
    end


end

# Your MinStack object will be instantiated and called as such:
# obj = MinStack.new()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.get_min()