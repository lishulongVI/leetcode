/**
<p>This problem is an&nbsp;<strong><em>interactive problem</em></strong>&nbsp;new to the LeetCode platform.</p>

<p>We are given a word list of unique words, each word is 6 letters long, and one word in this list is chosen as <strong>secret</strong>.</p>

<p>You may call <code>master.guess(word)</code>&nbsp;to guess a word.&nbsp; The guessed word should have&nbsp;type <code>string</code>&nbsp;and must be from the original list&nbsp;with 6 lowercase letters.</p>

<p>This function returns an&nbsp;<code>integer</code>&nbsp;type, representing&nbsp;the number of exact matches (value and position) of your guess to the <strong>secret word</strong>.&nbsp; Also, if your guess is not in the given wordlist, it will return <code>-1</code> instead.</p>

<p>For each test case, you have 10 guesses to guess the word. At the end of any number of calls, if you have made 10 or less calls to <code>master.guess</code>&nbsp;and at least one of these guesses was the <strong>secret</strong>, you pass the testcase.</p>

<p>Besides the example test case below, there will be 5&nbsp;additional test cases, each with 100 words in the word list.&nbsp; The letters of each word in those testcases were chosen&nbsp;independently at random from <code>&#39;a&#39;</code> to <code>&#39;z&#39;</code>, such that every word in the given word lists is unique.</p>

<pre>
<strong>Example 1:</strong>
<strong>Input:</strong>&nbsp;secret = &quot;acckzz&quot;, wordlist = [&quot;acckzz&quot;,&quot;ccbazz&quot;,&quot;eiowzz&quot;,&quot;abcczz&quot;]

<strong>Explanation:</strong>

<code>master.guess(&quot;aaaaaa&quot;)</code> returns -1, because&nbsp;<code>&quot;aaaaaa&quot;</code>&nbsp;is not in wordlist.
<code>master.guess(&quot;acckzz&quot;) </code>returns 6, because&nbsp;<code>&quot;acckzz&quot;</code> is secret and has all 6&nbsp;matches.
<code>master.guess(&quot;ccbazz&quot;)</code> returns 3, because<code>&nbsp;&quot;ccbazz&quot;</code>&nbsp;has 3 matches.
<code>master.guess(&quot;eiowzz&quot;)</code> returns 2, because&nbsp;<code>&quot;eiowzz&quot;</code>&nbsp;has 2&nbsp;matches.
<code>master.guess(&quot;abcczz&quot;)</code> returns 4, because&nbsp;<code>&quot;abcczz&quot;</code> has 4 matches.

We made 5 calls to&nbsp;master.guess and one of them was the secret, so we pass the test case.
</pre>

<p><strong>Note:</strong>&nbsp; Any solutions that attempt to circumvent the judge&nbsp;will result in disqualification.</p>
<p>这个问题是 LeetCode 平台新增的<strong><em>交互式问题 </em></strong>。</p>

<p>我们给出了一个由一些独特的单词组成的单词列表，每个单词都是 6 个字母长，并且这个列表中的一个单词将被选作<strong>秘密</strong>。</p>

<p>你可以调用 <code>master.guess(word)</code> 来猜单词。你所猜的单词应当是存在于原列表并且由 6 个小写字母组成的类型<code>字符串</code>。</p>

<p>此函数将会返回一个<code>整型数字</code>，表示你的猜测与<strong>秘密单词</strong>的准确匹配（值和位置同时匹配）的数目。此外，如果你的猜测不在给定的单词列表中，它将返回 <code>-1</code>。</p>

<p>对于每个测试用例，你有 10 次机会来猜出这个单词。当所有调用都结束时，如果您对 <code>master.guess</code> 的调用不超过 10 次，并且至少有一次猜到<strong>秘密</strong>，那么您将通过该测试用例。</p>

<p>除了下面示例给出的测试用例外，还会有 5 个额外的测试用例，每个单词列表中将会有 100 个单词。这些测试用例中的每个单词的字母都是从 <code>&#39;a&#39;</code> 到 <code>&#39;z&#39;</code>&nbsp;中随机选取的，并且保证给定单词列表中的每个单词都是唯一的。</p>

<pre><strong>示例 1:</strong>
<strong>输入:</strong>&nbsp;secret = &quot;acckzz&quot;, wordlist = [&quot;acckzz&quot;,&quot;ccbazz&quot;,&quot;eiowzz&quot;,&quot;abcczz&quot;]

<strong>解释:</strong>

<code>master.guess(&quot;aaaaaa&quot;)</code> 返回 -1, 因为&nbsp;<code>&quot;aaaaaa&quot;</code>&nbsp;不在 wordlist 中.
<code>master.guess(&quot;acckzz&quot;) 返回</code> 6, 因为&nbsp;<code>&quot;acckzz&quot;</code> 就是<strong>秘密</strong>，6个字母完全匹配。
<code>master.guess(&quot;ccbazz&quot;)</code> 返回 3, 因为<code>&nbsp;&quot;ccbazz&quot;</code>&nbsp;有 3 个匹配项。
<code>master.guess(&quot;eiowzz&quot;)</code> 返回 2, 因为&nbsp;<code>&quot;eiowzz&quot;</code>&nbsp;有 2 个匹配项。
<code>master.guess(&quot;abcczz&quot;)</code> 返回 4, 因为&nbsp;<code>&quot;abcczz&quot;</code> 有 4 个匹配项。

我们调用了 5 次master.guess，其中一次猜到了<strong>秘密</strong>，所以我们通过了这个测试用例。
</pre>

<p><strong>提示：</strong>任何试图绕过评判的解决方案都将导致比赛资格被取消。</p>
<p>这个问题是 LeetCode 平台新增的<strong><em>交互式问题 </em></strong>。</p>

<p>我们给出了一个由一些独特的单词组成的单词列表，每个单词都是 6 个字母长，并且这个列表中的一个单词将被选作<strong>秘密</strong>。</p>

<p>你可以调用 <code>master.guess(word)</code> 来猜单词。你所猜的单词应当是存在于原列表并且由 6 个小写字母组成的类型<code>字符串</code>。</p>

<p>此函数将会返回一个<code>整型数字</code>，表示你的猜测与<strong>秘密单词</strong>的准确匹配（值和位置同时匹配）的数目。此外，如果你的猜测不在给定的单词列表中，它将返回 <code>-1</code>。</p>

<p>对于每个测试用例，你有 10 次机会来猜出这个单词。当所有调用都结束时，如果您对 <code>master.guess</code> 的调用不超过 10 次，并且至少有一次猜到<strong>秘密</strong>，那么您将通过该测试用例。</p>

<p>除了下面示例给出的测试用例外，还会有 5 个额外的测试用例，每个单词列表中将会有 100 个单词。这些测试用例中的每个单词的字母都是从 <code>&#39;a&#39;</code> 到 <code>&#39;z&#39;</code>&nbsp;中随机选取的，并且保证给定单词列表中的每个单词都是唯一的。</p>

<pre><strong>示例 1:</strong>
<strong>输入:</strong>&nbsp;secret = &quot;acckzz&quot;, wordlist = [&quot;acckzz&quot;,&quot;ccbazz&quot;,&quot;eiowzz&quot;,&quot;abcczz&quot;]

<strong>解释:</strong>

<code>master.guess(&quot;aaaaaa&quot;)</code> 返回 -1, 因为&nbsp;<code>&quot;aaaaaa&quot;</code>&nbsp;不在 wordlist 中.
<code>master.guess(&quot;acckzz&quot;) 返回</code> 6, 因为&nbsp;<code>&quot;acckzz&quot;</code> 就是<strong>秘密</strong>，6个字母完全匹配。
<code>master.guess(&quot;ccbazz&quot;)</code> 返回 3, 因为<code>&nbsp;&quot;ccbazz&quot;</code>&nbsp;有 3 个匹配项。
<code>master.guess(&quot;eiowzz&quot;)</code> 返回 2, 因为&nbsp;<code>&quot;eiowzz&quot;</code>&nbsp;有 2 个匹配项。
<code>master.guess(&quot;abcczz&quot;)</code> 返回 4, 因为&nbsp;<code>&quot;abcczz&quot;</code> 有 4 个匹配项。

我们调用了 5 次master.guess，其中一次猜到了<strong>秘密</strong>，所以我们通过了这个测试用例。
</pre>

<p><strong>提示：</strong>任何试图绕过评判的解决方案都将导致比赛资格被取消。</p>
**/


/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] wordlist, Master master) {
        
    }
}