import sympy as sp
from sympy import sympify, Derivative
from sympy.parsing.sympy_parser import parse_expr, standard_transformations, convert_xor

global polynomial
global intervalLowerVal 
global intervalUpperVal
global tolerance

polynomial = str(input("Enter the polynomial: "))
intervalLowerVal = float(input("Interval Lower Point: "))
intervalUpperVal = float(input("Interval Upper Point: "))
tolerance = float(input("Enter the tolerance level: "))
polyCopy = polynomial


def sanitisePolynomial(poly):
    poly = poly.strip()
    if(poly[0:1] == "x"):
        poly = "1" + poly
    cleaned = ""
    for pos in range(len(poly)):
        if(poly[pos:pos+1] == "x"):
            if(isinstance(int(poly[pos-1:pos]), int)):
                cleaned = cleaned + "*"
        cleaned = cleaned + poly[pos:pos+1]
    cleaned = cleaned.strip().replace("^", "**").replace("x", "{root}")
    return cleaned


def sanitisePolyForDerivative(poly):
    poly = poly.strip()
    if(poly[0:1] == "x"):
        poly = "1" + poly
    cleaned = ""
    for pos in range(len(poly)):
        if(poly[pos:pos+1] == "x"):
            if(isinstance(int(poly[pos-1:pos]), int)):
                cleaned = cleaned + "*"
        cleaned = cleaned + poly[pos:pos+1]
    transformations = (standard_transformations + (convert_xor,))
    expr = parse_expr(cleaned, transformations=transformations)
    return expr

def computeDerivative(poly):
    return str(Derivative(sanitisePolyForDerivative(poly)).doit())

def evaluateDerivative(poly,root):
    return eval(computeDerivative(poly).replace("x", "{root}").format(root=root))

print(evaluateDerivative(polynomial, 1))


def evalPolynomial(root):
    global polynomial
    polynomial = sanitisePolynomial(polynomial)
    return eval(polynomial.format(root=root))



def evalInterval(leftPoint, rightPoint):
    return evalPolynomial(leftPoint) * evalPolynomial(rightPoint) < 0
    
columnNames = ["Iteration Count", "Root Approximation", "Function Value at Root Approximation", "Convergence: |p(n+1)-p| / |p(n)-p|"]
iterationCount = []
roots = []
functionVals = []
convergence = []

def newtonMethod():
    file = open("NewtonData.txt", "w")
    
    global intervalLowerVal 
    global intervalUpperVal
    global tolerance

    while evalInterval(intervalLowerVal, intervalUpperVal) == False:
         print("Wrong interval. Please enter the interval again")
         intervalLowerVal = float(input("Interval Lower Point: "))
         intervalUpperVal = float(input("Interval Upper Point: "))
    iterations = 0
    withinTolerance = False
    root = (intervalLowerVal + intervalUpperVal) / 2.0
    prevRoot = 0.0

    while(iterations < 1000 and withinTolerance == False):
        prevRoot = root
        root = (intervalLowerVal + intervalUpperVal) / 2.0
        if evalInterval(intervalLowerVal, root):
            intervalUpperVal = root
        else:
            intervalLowerVal = root
        if(iterations > 1 and abs((root - prevRoot) / root) < (float(tolerance))):
            withinTolerance = True
        iterations = iterations + 1
        iterationCount.append(iterations)
        roots.append(root)
        functionVals.append(evalPolynomial(root))

    file.write("Polynomial: " + polyCopy)
    file.write("\n\n")
    file.write("{:<30}{:<30}{:<30}{:<30}".format(columnNames[0],columnNames[1],columnNames[2], columnNames[3]))
    file.write("\n")
    
    for val in range(len(iterationCount)):
        file.write("{:<30}{:<30}{:<30}{:<30}".format(iterationCount[val],roots[val],functionVals[val], convergence[val]))
        file.write("\n")

    file.write("\n")
    file.write("Total Iterations: " + str(iterations))
    file.write("\n")
    file.write("Root: " + str(root))
    
    return iterations, root

    
#print(newtonMethod())
