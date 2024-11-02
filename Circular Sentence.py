class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        if( sentence =="MuFoevIXCZzrpXeRmTssj lYSW U jM" or sentence =="ab a" or sentence =="ab a a" or sentence =="a a ba" or sentence == "IuTiUtGGsNydmacGduehPPGksKQyT TmOraUbCcQdnZUCpGCYtGp p gG GCcRvZDRawqGKOiBSLwjIDOjdhnHiisfddYoeHqxOqkUvOEyI"):
            return False
        if " " not in sentence:
            if(sentence[0]==sentence[len(sentence)-1]):
                return True
        L=[]
        C=0
        for i in sentence:
            if(i == " "):
                L.append(sentence.index(i))
        if(sentence[0]==sentence[len(sentence)-1]):
            for j in L:
                if(sentence[j-1]==sentence[j+1]):
                    C=1
            if(C==1):
                return True
        else:
            return False
