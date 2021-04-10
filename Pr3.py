try:
    n=int(input())
    for i in range(n):
        a=int(input())
        m=1
        for j in range(1,a+1):
            
            for k in range(1,a+1):
                print(m,end='')
                m=m+1
            print()
except EOFError as e : pass