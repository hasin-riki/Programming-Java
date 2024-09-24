from sympy import *
import math 
def NewtonMethod(p0, tolerance):
    datalist= []
    answer=[]
    p=0.0
    i=1
    h= f(p0)/g(p0)
    datalist.append('Iteration number\tApproximation\t\t\tFunction value')
    while (abs((p0-p)/p0)>tolerance):
        p=p0
        h= f(p0)/g(p0)
        datalist.append('%d\t\t\t%0.6f\t\t\t%0.6f' % (i, p0, f(p0)))
        p0=p0-h
        if(abs((p0-p)/p0)>tolerance):
            answer.append(p0)
        i=i+1
    datalist.append('%d\t\t\t%0.6f\t\t\t%0.6f' % (i+1, p0, f(p0)))
    print('\n%d number of iterations taken to converge to root: %0.8f' % (i-1,p0))
    File_object= open(r"NewtonData.txt", "w")
    File_object.write(datalist[0]+'\t\t\tConvergence rate')
    h=1
    a=0
    while(h<len(datalist)):
        if(a<len(answer)-1):
            File_object.write('\n%s\t\t\t%d' % (datalist[h], ((float(answer[a+1]))-p0)/((float(answer[a])-p0))**2))
        else:
            File_object.write('\n%s\t\t\t' % (datalist[h]))
        a=a+1
        h=h+1


def f(x):
    return eval(function) 

def g(x):
    return 2.718**x+(1/(2**x))*ln(2)-2*sin(x) 

function= input('Equation= ')
rootlist= []
p0= float(input('p0= '))
tolerance= float(input('tolerance= '))
if g(p0)==0:
    print('Kindly enter a new guess. Derivative is zero at current guess.')
else:
    NewtonMethod(p0, tolerance)
