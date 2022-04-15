from collections import defaultdict

def solution(id_list, report, k):
    answer = [0]*len(id_list)
    report = set(report)
    
    i_report = defaultdict(set)
    num_reported = defaultdict(int)
    suspend = []
    
    for r in report:
        do_report, be_reported = r.split()
        
        num_reported[be_reported] += 1
        i_report[do_report].add(be_reported)
        
        if(num_reported[be_reported] == k):
            suspend.append(be_reported)
        
    for s in suspend:
        for i in range(len(id_list)):
            if s in i_report[id_list[i]]:
                answer[i] += 1
        
    
    
    return answer