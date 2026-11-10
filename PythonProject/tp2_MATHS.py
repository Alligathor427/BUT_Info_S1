from math import *

#========Question 1 =======

def dernierChifre(n):
    return abs(n)%10

print(dernierChifre(25),dernierChifre(7),dernierChifre(-9))

#=============Question 3 ========

def derniersChiffres(n, nbre) :
    return abs(n) % 10**nbre





#=============question  4=======

def nombreChiffres(n):
    if n == 0 :
        return 1
    compt = 1
    while n!= 0 :
        n = n //10
        compt += 1
    return compt

print ( nombreChiffres(6167861761861),nombreChiffres(9898),nombreChiffres(0))


#==========question 5 ======


def dernierChiffre ( n ) :
    return abs(n) % 10**(nombreChiffres(n)-1)



# ===============question 6 ====
def premiersChrffres(n,nbre):
