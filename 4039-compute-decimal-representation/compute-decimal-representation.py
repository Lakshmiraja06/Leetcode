class Solution:
    def decimalRepresentation(self, n: int) -> List[int]:
        a=[]
        num = str(n)
        place = len(num)-1
        for i in num:
            if i!= "0":
                a.append(int(i)*(10 ** place))
            place -= 1
        return a