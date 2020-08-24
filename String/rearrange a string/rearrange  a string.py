#code
for _ in range(int(input())):
    st=input()
    s=""
    c=0
    for i in st:
        if i.isalpha():
            s=s+i
            x="".join(sorted(s))
        else:
            c=c+int(i)
        
    print(x+str(c))
