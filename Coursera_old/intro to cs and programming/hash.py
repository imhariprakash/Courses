def create():
    global numbuckets
    hset=[]
    for i in range(numbuckets):
        hset.append([])
    return hset

def hash(i):
    global numbuckets
    return i%numbuckets

def insert(hset,i):
    hset[hash(i)].append(i)

def remove(hset,i):
    newlist=[]
    for j in hset[hash(i)]:
        if (j!=i):
            newlist.append(j)
        hset[hash(i)]=newlist
    return hset

def member(hset,i):
    return i in hset[hash(i)]

numbuckets = 47
def test1():
 s = create()
 for i in range(40):
     insert(s, i)
 insert(s, 325)
 insert(s, 325)
 insert(s, 987654321)
 print (s)
 print (member(s, 325))
 remove(s, 325)
 print (member(s, 325))
 print (member(s, 987654321))
    
        
