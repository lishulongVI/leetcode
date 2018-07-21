/*
<p>
A message containing letters from <code>A-Z</code> is being encoded to numbers using the following mapping way:
</p>

<pre>
'A' -> 1
'B' -> 2
...
'Z' -> 26
</pre>

<p>
Beyond that, now the encoded string can also contain the character '*', which can be treated as one of the numbers from 1 to 9.
</p>


<p>
Given the encoded message containing digits and the character '*', return the total number of ways to decode it.
</p>

<p>
Also, since the answer may be very large, you should return the output mod 10<sup>9</sup> + 7.
</p>

<p><b>Example 1:</b><br />
<pre>
<b>Input:</b> "*"
<b>Output:</b> 9
<b>Explanation:</b> The encoded message can be decoded to the string: "A", "B", "C", "D", "E", "F", "G", "H", "I".
</pre>
</p>

<p><b>Example 2:</b><br />
<pre>
<b>Input:</b> "1*"
<b>Output:</b> 9 + 9 = 18
</pre>
</p>

<p><b>Note:</b><br>
<ol>
<li>The length of the input string will fit in range [1, 10<sup>5</sup>].</li>
<li>The input string will only contain the character '*' and digits '0' - '9'.</li>
</ol>
</p><p>一条包含字母&nbsp;<code>A-Z</code> 的消息通过以下的方式进行了编码：</p>

<pre>&#39;A&#39; -&gt; 1
&#39;B&#39; -&gt; 2
...
&#39;Z&#39; -&gt; 26
</pre>

<p>除了上述的条件以外，现在加密字符串可以包含字符 &#39;*&#39;了，字符&#39;*&#39;可以被当做1到9当中的任意一个数字。</p>

<p>给定一条包含数字和字符&#39;*&#39;的加密信息，请确定解码方法的总数。</p>

<p>同时，由于结果值可能会相当的大，所以你应当对10<sup>9</sup>&nbsp;+ 7取模。（翻译者标注：此处取模主要是为了防止溢出）</p>

<p><strong>示例 1 :</strong></p>

<pre><strong>输入:</strong> &quot;*&quot;
<strong>输出:</strong> 9
<strong>解释:</strong> 加密的信息可以被解密为: &quot;A&quot;, &quot;B&quot;, &quot;C&quot;, &quot;D&quot;, &quot;E&quot;, &quot;F&quot;, &quot;G&quot;, &quot;H&quot;, &quot;I&quot;.
</pre>

<p><strong>示例 2 :</strong></p>

<pre><strong>输入:</strong> &quot;1*&quot;
<strong>输出:</strong> 9 + 9 = 18（翻译者标注：这里1*可以分解为1,* 或者当做1*来处理，所以结果是9+9=18）
</pre>

<p><strong>说明 :</strong></p>

<ol>
	<li>输入的字符串长度范围是 [1, 10<sup>5</sup>]。</li>
	<li>输入的字符串只会包含字符 &#39;*&#39; 和 数字&#39;0&#39; - &#39;9&#39;。</li>
</ol>
<p>一条包含字母&nbsp;<code>A-Z</code> 的消息通过以下的方式进行了编码：</p>

<pre>&#39;A&#39; -&gt; 1
&#39;B&#39; -&gt; 2
...
&#39;Z&#39; -&gt; 26
</pre>

<p>除了上述的条件以外，现在加密字符串可以包含字符 &#39;*&#39;了，字符&#39;*&#39;可以被当做1到9当中的任意一个数字。</p>

<p>给定一条包含数字和字符&#39;*&#39;的加密信息，请确定解码方法的总数。</p>

<p>同时，由于结果值可能会相当的大，所以你应当对10<sup>9</sup>&nbsp;+ 7取模。（翻译者标注：此处取模主要是为了防止溢出）</p>

<p><strong>示例 1 :</strong></p>

<pre><strong>输入:</strong> &quot;*&quot;
<strong>输出:</strong> 9
<strong>解释:</strong> 加密的信息可以被解密为: &quot;A&quot;, &quot;B&quot;, &quot;C&quot;, &quot;D&quot;, &quot;E&quot;, &quot;F&quot;, &quot;G&quot;, &quot;H&quot;, &quot;I&quot;.
</pre>

<p><strong>示例 2 :</strong></p>

<pre><strong>输入:</strong> &quot;1*&quot;
<strong>输出:</strong> 9 + 9 = 18（翻译者标注：这里1*可以分解为1,* 或者当做1*来处理，所以结果是9+9=18）
</pre>

<p><strong>说明 :</strong></p>

<ol>
	<li>输入的字符串长度范围是 [1, 10<sup>5</sup>]。</li>
	<li>输入的字符串只会包含字符 &#39;*&#39; 和 数字&#39;0&#39; - &#39;9&#39;。</li>
</ol>
*/


/**
 * @param {string} s
 * @return {number}
 */
var numDecodings = function(s) {
    
};