/*
<p>Design a data structure that supports all following operations in <i>average</i> <b>O(1)</b> time.</p>
<b>Note: Duplicate elements are allowed.</b>
<p>
<ol>
<li><code>insert(val)</code>: Inserts an item val to the collection.</li>
<li><code>remove(val)</code>: Removes an item val from the collection if present.</li>
<li><code>getRandom</code>: Returns a random element from current collection of elements. The probability of each element being returned is <b>linearly related</b> to the number of same value the collection contains.</li>
</ol>
</p>

<p><b>Example:</b>
<pre>
// Init an empty collection.
RandomizedCollection collection = new RandomizedCollection();

// Inserts 1 to the collection. Returns true as the collection did not contain 1.
collection.insert(1);

// Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
collection.insert(1);

// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
collection.insert(2);

// getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
collection.getRandom();

// Removes 1 from the collection, returns true. Collection now contains [1,2].
collection.remove(1);

// getRandom should return 1 and 2 both equally likely.
collection.getRandom();
</pre>
</p><p>设计一个支持在<em>平均&nbsp;</em>时间复杂度&nbsp;<strong>O(1)&nbsp;</strong>下<strong>，&nbsp;</strong>执行以下操作的数据结构。</p>

<p><strong>注意: 允许出现重复元素。</strong></p>

<ol>
	<li><code>insert(val)</code>：向集合中插入元素 val。</li>
	<li><code>remove(val)</code>：当 val 存在时，从集合中移除一个 val。</li>
	<li><code>getRandom</code>：从现有集合中随机获取一个元素。每个元素被返回的概率应该与其在集合中的数量呈线性相关。</li>
</ol>

<p><strong>示例:</strong></p>

<pre>// 初始化一个空的集合。
RandomizedCollection collection = new RandomizedCollection();

// 向集合中插入 1 。返回 true 表示集合不包含 1 。
collection.insert(1);

// 向集合中插入另一个 1 。返回 false 表示集合包含 1 。集合现在包含 [1,1] 。
collection.insert(1);

// 向集合中插入 2 ，返回 true 。集合现在包含 [1,1,2] 。
collection.insert(2);

// getRandom 应当有 2/3 的概率返回 1 ，1/3 的概率返回 2 。
collection.getRandom();

// 从集合中删除 1 ，返回 true 。集合现在包含 [1,2] 。
collection.remove(1);

// getRandom 应有相同概率返回 1 和 2 。
collection.getRandom();
</pre>
<p>设计一个支持在<em>平均&nbsp;</em>时间复杂度&nbsp;<strong>O(1)&nbsp;</strong>下<strong>，&nbsp;</strong>执行以下操作的数据结构。</p>

<p><strong>注意: 允许出现重复元素。</strong></p>

<ol>
	<li><code>insert(val)</code>：向集合中插入元素 val。</li>
	<li><code>remove(val)</code>：当 val 存在时，从集合中移除一个 val。</li>
	<li><code>getRandom</code>：从现有集合中随机获取一个元素。每个元素被返回的概率应该与其在集合中的数量呈线性相关。</li>
</ol>

<p><strong>示例:</strong></p>

<pre>// 初始化一个空的集合。
RandomizedCollection collection = new RandomizedCollection();

// 向集合中插入 1 。返回 true 表示集合不包含 1 。
collection.insert(1);

// 向集合中插入另一个 1 。返回 false 表示集合包含 1 。集合现在包含 [1,1] 。
collection.insert(1);

// 向集合中插入 2 ，返回 true 。集合现在包含 [1,1,2] 。
collection.insert(2);

// getRandom 应当有 2/3 的概率返回 1 ，1/3 的概率返回 2 。
collection.getRandom();

// 从集合中删除 1 ，返回 true 。集合现在包含 [1,2] 。
collection.remove(1);

// getRandom 应有相同概率返回 1 和 2 。
collection.getRandom();
</pre>
*/


typedef struct {
    
} RandomizedCollection;

/** Initialize your data structure here. */
RandomizedCollection* randomizedCollectionCreate() {
    
}

/** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
bool randomizedCollectionInsert(RandomizedCollection* obj, int val) {
    
}

/** Removes a value from the collection. Returns true if the collection contained the specified element. */
bool randomizedCollectionRemove(RandomizedCollection* obj, int val) {
    
}

/** Get a random element from the collection. */
int randomizedCollectionGetRandom(RandomizedCollection* obj) {
    
}

void randomizedCollectionFree(RandomizedCollection* obj) {
    
}

/**
 * Your RandomizedCollection struct will be instantiated and called as such:
 * struct RandomizedCollection* obj = randomizedCollectionCreate();
 * bool param_1 = randomizedCollectionInsert(obj, val);
 * bool param_2 = randomizedCollectionRemove(obj, val);
 * int param_3 = randomizedCollectionGetRandom(obj);
 * randomizedCollectionFree(obj);
 */