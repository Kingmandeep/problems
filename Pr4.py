try:
    n=int(input())
    for i in range(n):
        a=int(input())
        sum=0
        if(a==1):
            print(1)
        else:
            for j in range(1,a):
                sum=sum+(j*j)+(j*j)
            sum=sum+(a*a)
            print(sum)
except EOFError as e : pass      