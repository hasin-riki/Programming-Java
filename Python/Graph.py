import matplotlib.pyplot as plt
from numpy import *


def newton_plot():
    p0 = 1.5
    p_list = [[1.5, -1.42926279833229719074], [0.78447239771941057462, -0.07671130444775364765],
              [0.73951870983205225674, -0.00072570850227082762], [0.73908517470519630166, -0.00000006943822339345]]

    x = linspace(int(p0 - 2), int(p0 + 2), 500)
    y = cos(x) - x
    plt.xlabel('x-axis')
    plt.ylabel('y-axis')
    plt.title('Newton Method')
    plt.plot(x, y, color='blue', label=f"f(x)")
    plt.axhline(y=0, color='k')
    plt.axvline(x=0, color='k')
    plt.plot(p0, p_list[0][1], 'bo', label="p0")
    plt.plot(p_list[len(p_list) - 1][0], 0, 'ro', label="p")

    for i in range(1, len(p_list)):
        x0 = p_list[i - 1][0]
        y0 = p_list[i - 1][1]
        x1 = p_list[i][0]
        y1 = 0
        x = [x0, x1]
        y = [y0, y1]
        plt.plot(x, y, color="green", linestyle='dashed', label=f"p{i - 1}")

    plt.legend()
    plt.show()


def fixed_plot():
    p0 = 1.5
    p_list = [[0.50000000000000000000,  0.87758256189037275874], [0.87758256189037275874, 0.63901249416525918168],
              [0.63901249416525918168, 0.80268510068233489552], [0.80268510068233489552, 0.69477802678800615332]]

    x = linspace(int(p0 - 2), int(p0 + 2), 500)
    y = cos(x)
    plt.xlabel('x-axis')
    plt.ylabel('y-axis')
    plt.title('Fixed Point')
    plt.plot(x, y, color='blue', label=f"f(x)")
    plt.plot(x, x, color="grey", label="y=x")
    plt.axhline(y=0, color='k')
    plt.axvline(x=0, color='k')
    plt.plot(p_list[len(p_list) - 1][0], p_list[len(p_list) - 1][1], 'ro', label="p")

    for i in range(1, len(p_list)):
        x0 = p_list[i - 1][0]
        y0 = 0
        x1 = p_list[i - 1][0]
        y1 = p_list[i][1]
        x = [x0, x1]
        y = [y0, y1]
        plt.plot(x, y, color="green", linestyle='dashed', label=f"p{i - 1}")
        plt.plot([x1, y1], [y1, y1], color="green", linestyle='dashed')

    plt.legend()
    plt.show()

newton_plot()
fixed_plot()

