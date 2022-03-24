linea= input()
tamanio=len(linea)
puntosS=0
puntosR=0

juegosGanadosR=0
juegosGanadosS=0

if linea[0]=="S":
    sacadorS = True
    for i in range(0,tamanio):
        if linea[i]=="S" and linea[i]!="Q":
            sacadorS=True
        else:
            sacadorS=False
        if i+1>=tamanio:
            if puntosR-puntosS>=2:
                juegosGanadosR+=1
        if i+1>=tamanio:
            if puntosS-puntosR>=2:
                juegosGanadosS+=1
        if juegosGanadosR>=2:
            print(juegosGanadosR,"(winner)","-",juegosGanadosS)
            break
        if juegosGanadosS>=2:
            print(juegosGanadosR,"-",juegosGanadosS,"(winner)")
            break
        if puntosS>=5 and puntosS-puntosR >=2:
            juegosGanadosS+=1
            puntosS=0
            puntosR=0
        if puntosR>=5 and puntosR-puntosS >=2:
            juegosGanadosR+=1
            puntosS=0
            puntosR=0    
        if linea[i] == "S":
            puntosS+=1   
        if linea[i] =="R":
            puntosR+=1
        if linea[i] =="Q":
            if sacadorS==True:
                print(str(juegosGanadosR)+ " " +" ("+str(puntosR)+"*)"+ " - "+ str(juegosGanadosS)+ " " +"("+str(puntosS)+")") 
                sacadorS=False
            else:
                print(str(juegosGanadosR)+ " " +"("+str(puntosR)+")"+" - "+str(juegosGanadosS)+ " " +"("+str(puntosS)+"*)")
                sacadorS=True
else:
    sacadorR = True
    for i in range(0,tamanio):
        if linea[i]=="R" and linea[i]!="Q":
                sacadorR=True
        else:
            sacadorR=False
        if i+1>=tamanio:
            if puntosR-puntosS>=2:
                juegosGanadosR+=1
        if i+1>=tamanio:
            if puntosS-puntosR>=2:
                juegosGanadosS+=1
        if juegosGanadosS>=2:
            print(juegosGanadosR,"-",juegosGanadosS,"(winner)")
            break
        if juegosGanadosR>=2:
            print(juegosGanadosR,"(winner)","-",juegosGanadosS)
            break
        if puntosS>=5 and puntosS-puntosR >=2:
            juegosGanadosS+=1
            puntosS=0
            puntosR=0
        if puntosR>=5 and puntosR-puntosS >=2:
            juegosGanadosR+=1
            puntosS=0
            puntosR=0    
        if linea[i] == "S":
            puntosS+=1   
        if linea[i] =="R":
            puntosR+=1
        if linea[i] =="Q":
            if sacadorR==True:
                print(str(juegosGanadosS)+ " " +"("+str(puntosS)+")"+"-"+str(juegosGanadosR)+ " " +"("+str(puntosR)+"*)") 
                sacadorR=False
            else :
                print(str(juegosGanadosS)+ " " +"("+str(puntosS)+"*)"+"-"+str(juegosGanadosR)+ " " +"("+str(puntosR)+")")
                sacadorR=True