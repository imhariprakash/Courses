def create():
    global numbuckets
    hSet = []
    for i in range(numbuckets):
        hSet.append([])
    return hSet

def insert(hSet, i):
    hSet[hashElem(i)].append(i)

def remove(hSet, i):
    newBucket = []
    for j in hSet[hashElem(i)]:
        if j != i:
            newBucket.append(j)
    hSet[hashElem(i)] = newBucket

 
def member(hSet, i):
    return i in hSet[hashElem(i)]


def hashElem(e):
 global numbuckets
 if type(e) == int:
     val = e
 if type(e) == str:
 #Convert e to an int
     val = 0
     shift = 0
     for c in e:
         val = val + shift*ord(c)
         shift += 1
 return val%numbuckets



numbuckets=47
def test2():
    d = create()
    strs = ['ab', 'ba', '32a',
            'big dog', 'small bird']
    for s in strs:
        insert(d, s)
    for i in range(40):
        insert(d, i)
    print (d)
    print (member(d, 'small bird'))
    print (member(d, 'big bird'))
    remove(d, 'small bird')
    print (d)

 
