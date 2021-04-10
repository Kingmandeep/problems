try:
    n=int(input())
    for i in range(0,n):
        a=int(input())
        for j in range(1,a+1):
            for k in range(1,a+1):
                print(j,end="")
            print()
except EOFError as e : pass
            