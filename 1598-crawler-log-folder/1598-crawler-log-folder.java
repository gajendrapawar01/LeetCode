class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (log.equals("./")) {
                // Remain in the same folder, do nothing
            } else {
                depth++;
            }
        }
        return depth;
    }
}