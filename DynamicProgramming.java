public class DynamicProgramming {

    public static void main(String[] args) {
        int[] prices = new int[] { 2, 4, 6, 2, 5 };

        int[] prices1 = new int[] { 3, 2, 4, 6, 2, 5 };

        assert (calculateMaxProfit(prices) == 64);
        assert (calculateMaxProfit(prices1) == 86);
    }

    private static int calculateMaxProfit(int[] initialPrices) {
        return getMaxProfit (initialPrices, 0, initialPrices.length - 1, initialPrices.length);
    }

    private static int getMaxProfit(int[] initialPrices, int start, int end, int size) {

        int year = size - (end - start);

        if (start == end) {
            return year * initialPrices[start];
        }

        int top = initialPrices[start] * year + getMaxProfit(initialPrices, start+1, end, size);

        int bottom = initialPrices[end] * year + getMaxProfit(initialPrices, start, end-1, size);

        return Math.max(top, bottom);

    }
}
