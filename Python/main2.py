from sympy import *

f = str(input("Enter the function to compute: "))


def sanitiseFunction(f):
    f = f.strip()

    if f[0:1] == "x":
        f = "1" + f

    cleaned = ""

    for pos in range(len(f)):

        if f[pos:pos + 1] == "x":

            if isinstance(int(f[pos - 1:pos]), int):
                cleaned = cleaned + "*"

        cleaned = cleaned + f[pos:pos + 1]

    cleaned = cleaned.strip().replace("^", "**")
    # .replace("x", "{root}")

    return cleaned


def symbolicDifferentiation():
    x = Symbol('x')
    abc = sanitiseFunction(f)
    exp1 = sympify(abc)

    return exp1.diff(x)


print(symbolicDifferentiation())


