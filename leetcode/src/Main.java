import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      int[] weights = {1,2,3,4,5,6,7,8,9,10}; int days = 5;
      int[] nums = {10,20,30,40,50,60,70,80,90}; int target = 1;
        System.out.println(threeSumClosest(nums,target));

      int[]  nums1 = {1000000000,1000000000,1000000000,1000000000}; int target1 = -294967296  ;
        System.out.println(fourSum(nums1,target1));

        Stream.of(1,2,3,4,5,6,7,8).peek(System.out::println).forEach(System.out::println);
        System.out.println("Max Sum"+breakSum(2));
        System.out.println("Total Candies"+candy(new int[]{1,0,2}));
        System.out.println("Max Coin required"+coinChange(new int[]{1,2,5},11));
    }


    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int num : nums) {
            int compliment = k - num;
            if (map.getOrDefault(compliment, 0) > 0) {
                map.put(compliment, map.get(compliment) - 1);
                count++;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

    static public double findMaxAverage(int[] nums, int k) {

        double currentSum = 0;
        for (int i = 0; i < k; i++)
            currentSum += nums[i];

        double maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum / k;
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                max++;
        }
        int ans = max, len = s.length();

        for (int i = k; i < len; i++) {

            if (isVowel(s.charAt(i))) max++;
            if (isVowel(s.charAt(i - k))) max--;
            ans = Math.max(ans, max);
        }
        return ans;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    public static String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().stripLeading().stripTrailing();

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }


    public static int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Arrays.stream(nums).forEach(e -> pq.add((long) e));
        int count = 0;
        while (!pq.isEmpty() && pq.peek() < k) {
            if (pq.size() < 2)
                return -1;
            long x = pq.poll();
            long y = pq.poll();
            long value = Math.min(x, y) * 2 + Math.max(x, y);
            pq.add(value);
            count++;

            if (pq.size() == 1 && pq.peek() < k)
                return -1;

        }
        return count;
    }

    public static String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= pattern.length(); i++) {
            st.push(i + 1);

            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
            }
        }

        return sb.toString();
    }

    public static int lengthOfLongestSubstring(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (!sb.toString().contains(s.charAt(i) + "")) {
                sb.append(s.charAt(i));
                count = sb.length();
            } else {
                while (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.length();
    }


    public static int removeDuplicates(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[index++] = nums[i];
        }

        return index;
    }

    public static int[] getConcatination(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (!stack.isEmpty() && isClosingBracket(stack.peek(), c)) {
                stack.pop();
            }
        }
        if (stack.isEmpty())
            return true;

        return false;
    }

    private static boolean isClosingBracket(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i))
                return true;

            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return false;
    }

    private static boolean isAnagram(String t, String s) {
        Map<Character, Integer> mapOft = new HashMap<>();
        Map<Character, Integer> mapOfs = new HashMap<>();
        for (char c : t.toCharArray())
            mapOft.put(c, mapOft.getOrDefault(c, 0) + 1);
        for (char c : s.toCharArray())
            mapOfs.put(c, mapOfs.getOrDefault(c, 0) + 1);

        return mapOft.equals(mapOfs);
    }

    public static List<List<String>> isAnagram(String[] strs) {
        //   String[] strsl = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k = String.copyValueOf(c);
            List<String> list = map.getOrDefault(k, new ArrayList<>());
            list.add(s);
            map.put(k, list);
        }
        return map.entrySet().stream().map(e -> e.getValue()).toList();
    }

    public static int[] topKfrequent(int[] nums, int k) {
        Map<Integer, Integer> topFreq = new HashMap<>();
        List<Integer> r = new ArrayList<>();
        for (int i : nums)
            topFreq.put(i, topFreq.getOrDefault(i, 0) + 1);

//       List<Integer> l= topFreq.entrySet().stream().sorted((e1,e2)->e2.getValue()-e1.getValue()).map(e->e.getKey()).collect(Collectors.toList()).subList(0,k);
//       return l.stream().mapToInt(Integer::intValue).toArray();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> topFreq.get(n1) - topFreq.get(n2));
        for (int i : topFreq.keySet()) {
            minHeap.add(i);
            if (minHeap.size() > k)
                minHeap.poll();
        }
        while (!minHeap.isEmpty())
            r.add(minHeap.poll());

        return r.stream().mapToInt(Integer::intValue).toArray();

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] sufix = new int[n];
        int[] result = new int[n];
        prefix[0] = 1;
        sufix[n - 1] = 1;
        for (int i = 1; i < n; i++)
            prefix[i] = prefix[i - 1] * nums[i - 1];
        for (int i = n - 2; i >= 0; i--)
            sufix[i] = sufix[i + 1] * nums[i + 1];

        for (int i = 0; i < n; i++)
            result[i] = prefix[i] * sufix[i];

        return result;
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i : nums) {
            set.add(i);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                res = Math.max(res, length);
            }
        }

        return res;
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    private static List<Integer> twoSum1(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result.add(map.get(target - numbers[i]) + 1);
                result.add(i + 1);
            }
            map.put(numbers[i], i);
        }


        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[i] + nums[r];
                if (sum < 0) l++;
                else if (sum > 0) r--;
                else {
                    result.add(Arrays.asList(nums[l], nums[i], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return result;
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;

        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(maxArea, area);
            if (height[i] < height[j])
                i++;
            else j--;
        }
        return maxArea;
    }

    public static int trap(int[] height) {
        int maxTrap = 0;
        int n = height.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = height[0];
        suffix[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++)
            prefix[i] = Math.max(prefix[i - 1], height[i]);

        for (int j = n - 2; j >= 0; j--)
            suffix[j] = Math.max(suffix[j + 1], height[j]);

        for (int i = 0; i < n; i++)
            maxTrap += Math.min(prefix[i], suffix[i]) - height[i];

        return maxTrap;
    }

    public static boolean isValidd(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(')
                stack.push(c);
            else if (!stack.isEmpty() && ((stack.peek() == '{' && c == '}') ||
                    (stack.peek() == '[' && c == ']') || (stack.peek() == '(' && c == ')')))
                stack.pop();
            else return false;
        }

        return stack.isEmpty();
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(stack.pop() - stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int n1 = stack.pop();
                    int n2 = stack.pop();
                    if (n2 == 0 || n1 == 0)
                        return 0;
                    stack.push(n2 / n1);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
    }

    public static List<String> generateParanthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(0, 0, n, sb, result);
        return result;
    }

    private static void backtrack(int openN, int closeN, int n, StringBuilder sb, List<String> result) {
        if (openN == n && openN == closeN) {
            result.add(sb.toString());
            return;
        }
        if (openN < n) {
            sb.append("(");
            backtrack(openN + 1, closeN, n, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (closeN < openN) {
            sb.append(")");
            backtrack(openN, closeN + 1, n, sb, result);
            sb.deleteCharAt(sb.length() - 1);

        }
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for (int[] pair : pairs) {
            stack.push((double) (target - pair[0]) / pair[1]);
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();


    }

    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek()[1] >= heights[i]) {
                int[] pair = stack.pop();
                start = pair[0];
                maxArea = Math.max(maxArea, pair[1] * ((i - start)));

            }
            stack.push(new int[]{start, heights[i]});
        }

        while (!stack.isEmpty()) {
            int[] pair = stack.pop();
            maxArea = Math.max(maxArea, pair[1] * (heights.length - pair[0]));
        }


        return maxArea;
    }

    public static int maxSumOfKelement(int[] arr, int k) {
        if (k == 0 || arr.length <= 0)
            return 0;
        int[] a1 = Arrays.copyOfRange(arr, 1, arr.length);
        int[] a2 = Arrays.copyOfRange(arr, 0, arr.length - 1);
        int op1 = arr[0] + maxSumOfKelement(a1, k - 1);
        int op2 = arr[arr.length - 1] + maxSumOfKelement(a2, k - 1);
        return Math.max(op1, op2);
    }

    public static int fibonacii(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacii(n - 1) + fibonacii(n - 2);
    }

    public static boolean isMatch(String s, String p) {
        if (p.isEmpty())
            return s.isEmpty();

        boolean first_Match = (!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*')
            return isMatch(s, p.substring(2)) || (first_Match && isMatch(s.substring(1), p));
        else
            return first_Match && isMatch(s.substring(1), p.substring(1));

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static int rob(int[] nums) {

        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }

    public static int[] getSubList(int[] nums, int start, int end) {
        int[] result = new int[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = nums[i];
        }
        return result;
    }

    char ans = 'a';

    public char kthCharacter(int k) {
        String s = "a";
        operation(s, k);
        return ans;
    }

    public void operation(String re, int k) {
        if (re.length() >= k) {
            ans = re.charAt(k - 1);
            return;
        }
        String newStr = "";
        for (int i = 0; i < re.length(); i++) {
            newStr += String.valueOf((char) (re.charAt(i) + 1));

        }
        operation(re + newStr, k);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }


    public static int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits)
            freq[digit]++;

        int zero = 0, even = 0, all = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                if (i == 0) zero++;
                if (i % 2 == 0) even++;
                all++;
            }
        }
        //for unique number
        int count = even * (all - 1) * (all - 2);
        if (zero == 1) count -= (even - 1) * (all - 2);

        //for freq of 2
        for (int i = 0; i < 10; i++) {
            if (freq[i] >= 2) {
                if (i == 0) count += all - 1;
                else if (i % 2 == 1) count += even;
                else {
                    count += 3 * (even - 1) - zero;
                    count += 2 * (all - even);
                }
            }
        }
        //for freq 3
        for (int i = 2; i < 10; i += 2) {
            if (freq[i] >= 3) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode first = head;
        ListNode slow = head;
        while (first.next != null && first.next.next != null) {
            first = first.next.next;
            slow = slow.next;
        }
        if (first != null) {
            slow = slow.next;
        }

        slow = reverseList(slow);
        first = head;
        while (first != null && slow != null) {
            if (first.val != slow.val)
                return false;

            first = first.next;
            slow = slow.next;
        }

        return true;
    }

    public static List<Integer> countSmaller(int[] nums) {

        List<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int count = (int) treeMap.headMap(nums[i], false).entrySet().stream().map(k -> k.getValue()).count();
            result.add(count);
            treeMap.put(nums[i], treeMap.getOrDefault(nums[i], 0) + 1);
        }
        Collections.reverse(result);
        return result;
    }

    public static int arrayNesting(int[] nums) {


        int maxCount =0;
        ArrayDeque<Integer> pq = new ArrayDeque<>();
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(1);
pq.forEach(System.out::println);
        for(int i=0;i<nums.length;i++){
            int j=i;
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            while (j<nums.length && !set.contains(nums[j])) {
                set.add(nums[j]);
                j = nums[j];

            }
            maxCount =Math.max(maxCount,set.size());
        }
        return maxCount;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int maxWeight = -1, totalWeight = 0;
        for(int weight:weights){
            maxWeight = Math.max(maxWeight,weight);
            totalWeight+=weight;
        }
        int l= maxWeight,r=totalWeight;
        while (l<r){
            int mid = (l+r)/2;
            int daysNeeded=1, currentWeight=0;
            for(int weight:weights){
                if((currentWeight+weight)>mid){
                    daysNeeded++;
                    currentWeight=0;
                }
                currentWeight+=weight;
            }
            if(daysNeeded>days)
                l=mid+1;
            else
                r=mid;
        }
        return  l;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j=n-1, k=(m+n)-1;

        while(j>=0){
            if( i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];

            }
        }
        System.out.println("two array merge"+ Arrays.toString(nums1));
    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closets_sum = Integer.MAX_VALUE/2;
        for(int i=0;i<nums.length;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                 int current_sum = nums[i]+nums[l]+nums[r];
                if(Math.abs(current_sum-target)<Math.abs(closets_sum-target))
                    closets_sum=current_sum;
                if(current_sum < target)
                    l++;
                else if(current_sum > target)
                    r--;
                else
                    return current_sum;
            }
        }
        return closets_sum;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();

            for(int i=0;i<nums.length;i++){
              for(int j=i+1;j<nums.length;j++){
                  int left =j+1; int right =nums.length-1;
                  while (left<right){
                      int current_sum = nums[i]+nums[j]+nums[left]+nums[right];
                      if(current_sum==target)
                            result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                      if(current_sum<target)
                          left++;
                      else if(current_sum>target)
                          right--;
                      else {
                          left++;
                          right--;
                      }
                  }
              }
            }
            return  result;
    }

    public static int breakSum(int n){
        if(n<=1)
            return n;

        return Math.max(n, (breakSum(n/2)+breakSum(n/3)+breakSum(n/4)));
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int totalCandies = n;
        int i=1;
        while (i<n){

            if(ratings[i]==ratings[i-1]){
                i++;
                continue;
            }
            int currentPeak=0;
            while (i<n && ratings[i]>ratings[i-1]){
                currentPeak++;
                totalCandies+=currentPeak;
                i++;
            }
            if (i==n){
                return totalCandies;
            }
            int currentValley=0;
            while(i<n && ratings[i]<ratings[i-1]){
                currentValley++;
                totalCandies+=currentValley;
                i++;
            }
            totalCandies-=Math.min(currentValley,currentPeak);
        }
        return totalCandies;
    }

    public static int coinChange(int[] coins, int amount){
        int[][] dp = new int[coins.length+1][amount+1];
        Arrays.fill(dp[0],Integer.MAX_VALUE-1);

        for(int i=1;i<dp.length;i++){
            dp[i][0] =0;
            for(int j=1;j<dp[0].length;j++){
                if(coins[i-1]>j){
                    dp[i][j] =dp[i-1][j];
                }else {
                    dp[i][j] =Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
            }
        }
        return dp[coins.length][amount]>=Integer.MAX_VALUE-1?-1:dp[coins.length][amount];
    }
}