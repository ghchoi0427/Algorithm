from itertools import combinations

def solution(nums):
    answer = 0
    
    nCr = combinations(nums,3)
    for c in nCr:
        if(isPrime(sum(c))):
            answer+=1
    return answer
    
def isPrime(n):
    for i in range(2, n):
        if(n%i==0):
            return False
    return True