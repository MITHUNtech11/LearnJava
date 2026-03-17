a=[1,10,3,4,5]
max=a[0]
min=a[0]    
for i in a:
    if i>max:
        max=i
    if i<min:
        min=i
print("max=",max)
print("min=",min)
