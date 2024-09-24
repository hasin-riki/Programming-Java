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

derivative = "e^x-2sinx-(ln(2)/2^x)"

def computeDerivative(value):
    result=math.e**(value)-(2*math.sin(value))-(math.log(2, math.e)/2**(value))
    return result

def computeFunction(value):
    result=math.e**(value)+(2**(-value))+(2*math.cos(value))-6
    return result

intervalLowerVal = 1
intervalUpperVal = 2

print("Interval : [" + str(intervalLowerVal) + "," + str(intervalUpperVal) + "]")

print("Tolerance : 10^-20" )

tolerance = float(10**-20)

flag = False
while(flag==False):
    initialGuess= float(input("Enter the initial guess: "))
    if(computeDerivative(initialGuess)!=0):
        flag=True
        
columnNames = ["Iterations Count", "Root Approximation", "Func. Values at Roots", "Asymptotic Constants"]
iterationsCount = []
iterationsCount.append(0)
roots = []
roots.append(initialGuess)
functionVals = []
functionVals.append(computeFunction(initialGuess))
asympConstants = []


def newtonMethod():
    
    global tolerance
    global end
         
    iterations = 0
    withinTolerance = False
    root = initialGuess
    prevRoot = 0.0

    while(iterations < 1000 and withinTolerance == False):
        prevRoot = root
        root = prevRoot-((computeFunction(prevRoot))/(computeDerivative(prevRoot)))

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
    file=open("NewtonData.txt", "w")

    file.write("Newton Method\n\n")

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

    
newtonMethod()

end = time.time()
print("CPU Time : " + str(end-start))

rateOfFunc()

fileWrite()
