x = int(input("размерность массива: "))
y = int(input("размерность массива: "))
a, b, anb = [], [], []
for i in range(0, x):
    h = int(input())
    a.append(h)
for i in range(0, y):
    h = int(input())
    b.append(h)
for i in a:
    if i in b and i not in anb:
        anb.append(i)
print(anb)

