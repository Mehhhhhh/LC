class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        map = {}
        for n in xrange(len(nums)):
            sub = target - nums[n]
            if sub in map.keys():
                return[n, map[sub]]
            else:
                map[nums[n]] = n