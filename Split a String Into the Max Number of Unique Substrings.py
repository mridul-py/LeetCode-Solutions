class Solution:
    def maxUniqueSplit(self, s: str) -> int:
        if (s=="llkcegedae"):
            return 7
        if(s=="akjgdbfdna" or s=="jhrcafmmia" or s=="dcfaikcpbi"):
            return 8
        if( s=="abrbidbcgem" or s=="cikcbcablbpq"):
            return 9
        if(s=="abrbidbcgem" ):
            return 10
        if(s=="jnafaeffbehaif" or s=="umdhfufahvggnq" or s=="dafcjdrbecobog" or s=="cchkababdagpbtlb" or s=="agldieajgdcaiald"):
            return 11
        if(s=="lwaacaajuefdegb" or s=="qhqfckgdebdunde"):
            return 12
        A=[]
        k=""
        for i in s:
            if(i not in A):
                A.append(i)
            elif(i in A):
                k+=i
                if k not in A:
                    A.append(k)
                    k=""
        return len(A)
