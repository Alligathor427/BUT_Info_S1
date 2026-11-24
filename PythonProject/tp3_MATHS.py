def div(a, b):
    if b == 0:
        print("Erreurdivi par 0 impossible.")
        return None

    q = 0
    r = a
    abs_b = abs(b)
    if b > 0 :
        pat = 1
    else : pat =-1

    while r < 0:
        r += abs_b
        q -= pat

    while r >= abs_b:
        r -= abs_b
        q += pat

    return q, r


print ( div (59,7),
div (-59,7),
div(59,-7),
div(-59,-7))

def quotient(a, b):
    resultat = div(a, b)
    if resultat != None:
        return resultat[0]


def reste(a, b):
    resultat = div(a, b)
    if resultat is not None:
        return resultat[1]


