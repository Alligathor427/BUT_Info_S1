print("Tp3 Maths ")



def div_eucli (a,b):
    print("fonction de div eucliniène")
    a,b = abs(a) , abs(b)
    if b == 0 : return False
    bilie= b
    q = 0
    r = 0
    while b <= a :
        q += 1

        b=b+bilie


    b =b - bilie


    r = a - b
    print ( a ,"=", bilie ,"*", q ,"+", r )




print(div_eucli(15,5 ))
print(div_eucli(16,5 ))
print(div_eucli(15,0  ))
print(div_eucli(123,9 ))
print(div_eucli(-5,2 ))

print ( ( 7 ** 1000000)%83)


print(div_eucli(7**190,83 ))



