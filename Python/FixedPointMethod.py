import sympy as sp
import math
import time
from sympy import sympify, Derivative
from sympy.parsing.sympy_parser import parse_expr, standard_transformations, convert_xor

global polynomial
global derivative
global intervalLowerVal 
global intervalUpperVal
global tolerance
global initialGuess

start = time.time()

print("INPUTS\n")

polynomial = "e^x+2^-x+2cosx-6"

print("Function : " + polynomial)

fixedPointForm = "ln(-2^-x-2cosx+6)"

print("Fixed Point Form : " + fixedPointForm)

def computeFunction(value):
    result=math.log((-2**-(value)-(2*math.cos(value))+6),math.e)
    return result

intervalLowerVal = 1
intervalUpperVal = 2

print("Interval : [" + str(intervalLowerVal) + "," + str(intervalUpperVal) + "]")

print("Tolerance : 10^-20" )

tolerance = float(10**-20)

initialGuess= float(input("Enter the initial guess: "))

        
columnNames = ["Iterations Count", "Root Approximation", "Func. Values at Roots", "Asymptotic Constants"]
iterationsCount = []
iterationsCount.append(0)
roots = []
roots.append(initialGuess)
functionVals = []
functionVals.append(computeFunction(initialGuess))
asympConstants = []


def fixedPointMethod():
    
    global tolerance
    global end
         
    iterations = 0
    withinTolerance = False
    root = initialGuess
    prevRoot= 0.0

    while(iterations < 1000 and withinTolerance == False):
        prevRoot = root
        root = computeFunction(root)

        if(iterations > 1 and abs((root - prevRoot) / root) < (float(tolerance))):
            withinTolerance = True
            
        iterations = iterations + 1
        iterationsCount.append(iterations)
        roots.append(root)
        functionVals.append(computeFunction(root))

    print("OUTPUT\n")
    
    print("Root : " + str(root) + "\n")
    print("Iterations : " + str(iterations) + "\n")


def rateOfFunc():
    
    for x in range(len(roots)-1):
        asympConstants.append(abs((roots[x+1]))/(abs(roots[x])))


def fileWrite():
    file=open("FixedPointData.txt", "w")

    file.write("Fixed Point Method\n\n")

    file.write("Polynomial : " + polynomial + "\n")
    file.write("Interval : [" + str(intervalLowerVal) + "," + str(intervalUpperVal) + "]" + "\n")
    file.write("Tolerance : " + str(tolerance) + "\n")
    file.write("Initial Guess : " + str(initialGuess) + "\n\n")
    
    file.write("{:<30}{:<30}{:<30}{:<30}".format(columnNames[0],columnNames[1],columnNames[2],columnNames[3]))
    file.write("\n")

    file.write("{:<30}{:<30}{:<30}".format(iterationsCount[0],roots[0],functionVals[0]))
    file.write("\n")

    for x in range(1, len(iterationsCount)):
        file.write("{:<30}{:<30}{:<30}{:<30}".format(iterationsCount[x],roots[x],functionVals[x],asympConstants[x-1]))
        file.write("\n")

    file.write("\n")
    file.write("Number of iterations : " + str(len(iterationsCount)-1) + "\n")
    file.write("Root : " + str(roots[len(roots)-1]) + "\n")
    file.write("CPU Time : " + str(end-start))

    file.close()

    
fixedPointMethod()

end = time.time()
print("CPU Time : " + str(end-start))

rateOfFunc()

fileWrite()
