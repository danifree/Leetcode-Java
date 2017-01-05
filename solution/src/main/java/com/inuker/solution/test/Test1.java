package com.inuker.solution.test;

import com.inuker.solution.Interval;
import com.inuker.solution.ListNode;
import com.inuker.solution.NestedInteger;
import com.inuker.solution.PalindromeLinkedList;
import com.inuker.solution.TreeLinkNode;
import com.inuker.solution.TreeNode;
import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import sun.tools.tree.InlineMethodExpression;

/**
 * Created by dingjikerbo on 2016/12/29.
 */

public abstract class Test1 {

    public List<List<String>> groupAnagrams(String[] strs) {

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        helper(nums, 0, result, new LinkedList<>());
        return result;
    }

    private void helper(int[] nums, int start, List<List<Integer>> result, List<Integer> path) {
        if (start == nums.length) {
            result.add(new LinkedList<>(path));
            return;
        }

        path.add(nums[start]);
        helper(nums, start + 1, result, path);
        path.remove(path.size() - 1);

        for (++start; start < nums.length && nums[start] == nums[start - 1]; start++);
        helper(nums, start, result, path);
    }

    abstract boolean knows(int a, int b);

    private final String[] ARR = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    abstract int read4(char[] buf);

    private static final String[] LESS20 = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] LESS100 = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private static final String[] THOUSAND = {
            "", "Thousand", "Million", "Billion"
    };

}
