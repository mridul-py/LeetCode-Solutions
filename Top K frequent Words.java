class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return a.getValue() - b.getValue();
                } else {
                    return b.getKey().compareTo(a.getKey());
                }
            }
        );
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<String> L= new ArrayList<>();
        while(!minHeap.isEmpty()){
            L.add(minHeap.poll().getKey());
        }
        Collections.reverse(L);
        return L;
    }
}
