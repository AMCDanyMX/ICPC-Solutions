a=list(map(int,input().split()))
suma = 0
for i in range(0,18):
  string1=input()
  if string1.lower() == "par".lower(): 
    suma = suma + a[i]
  if string1.lower() == "hole in one".lower(): 
    suma = suma + 1
  if string1.lower() == "condor".lower(): 
    suma = suma + a[i] -  4
  if string1.lower() == "albatross".lower(): 
    suma = suma + a[i] -  3
  if string1.lower() == "eagle".lower(): 
    suma = suma + a[i] -  2
  if string1.lower() == "birdie".lower(): 
    suma = suma + a[i] -  1
  if string1.lower() == "bogey".lower(): 
    suma = suma + a[i] + 1
  if string1.lower() == "double bogey".lower(): 
    suma = suma + a[i] + 2
  if string1.lower() == "triple bogey".lower(): 
    suma = suma + a[i] + 3
    
print (suma)
