class PairSum {
    List<Integer> pair;
    int i, j, sum;
    PairSum(int x, int y, int i, int j) {
        this.i = i;
        this.j = j;
        pair = new ArrayList<>();
        pair.add(x);
        pair.add(y);
        sum = x + y;
    }
}

class PairSumComparator implements Comparator<PairSum> {
    @Override
    public int compare(PairSum ps1, PairSum ps2) {
        return Integer.compare(ps1.sum, ps2.sum);
    }
}

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<PairSum> minHeap = new PriorityQueue<>(new PairSumComparator());
        for(int i=0;i<k && i<nums1.length;i++) {
            minHeap.offer(new PairSum(nums1[i], nums2[0], i, 0));
        }
        List<List<Integer>> answer = new ArrayList<>();
        while(!minHeap.isEmpty() && k-- > 0) {
            PairSum current = minHeap.poll();
            int i = current.i, j = current.j;
            answer.add(current.pair);
            if(j+1 < nums2.length) {
                minHeap.offer(new PairSum(nums1[i], nums2[j+1], i, j+1));
            }
        }
        return answer;
    }
}