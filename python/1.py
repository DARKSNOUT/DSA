class Solution(object):
    def sortJumbled(self, mapping, nums):
        def convert(n,mapping):
            l=str(n)
            string=""
            for i in l:
                i=int(i)
                string+=str(mapping[i])
            l=int(string)
            return string

        num=[0]*len(nums)
        final=[]
        for i in range(len(nums)):
            k=nums[i]
            num[i]=convert(k,mapping)
            final.append((num[i],nums[i]))
        final.sort()
        sort=[num for _, num in final]
        return sort