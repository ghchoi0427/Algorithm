def solution(s):
    words = ['zero','one','two','three','four','five','six','seven','eight','nine']

    for w in words:
        s = s.replace(w,str(words.index(w)))
    
    return int(s)