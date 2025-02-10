def solution(a, b):
    cal1 = int(str(a) + str(b))  
    cal2 = 2 * a * b  
    return cal1 if cal1 >= cal2 else cal2 