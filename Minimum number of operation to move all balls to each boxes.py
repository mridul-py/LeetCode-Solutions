class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        index=[]
        for i in range(len(boxes)):
            if(boxes[i]=='1'):
                index.append(i)
        Ans=[]
        j=0
        Sum=0
        for i in range(len(boxes)):
            j=0
            Sum=0
            while(j<len(index)):
                Sum+=abs(i-index[j])
                j+=1
            Ans.append(Sum)
        return Ans
