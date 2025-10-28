class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:
        a =[]
        for i in order:
            for j in friends:
                if(i == j):
                    a.append(i)
                
        return a