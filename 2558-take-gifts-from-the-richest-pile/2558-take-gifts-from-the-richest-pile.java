import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            pq.offer(gift);
        }

        while (k-- > 0 && !pq.isEmpty()) {
            int top = pq.poll();
            pq.offer((int) Math.sqrt(top));
        }

        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}