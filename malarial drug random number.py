import random
N_LABELS=100

def main():
    i=0
    sequence=[]
    for i in range(N_LABELS):
        first_five=generate_first_five()
        next_four=generate_next_four(i)
        combined=combine_both(first_five,next_four)
        sequence.append(combined)
        print(sequence)
    user=input("ENTER YOUR CODE: ")
    if user in sequence:
        print("YOUR PRODUCT IS VERIFIED")
    else:
        print("This is not ours!")
    
        

def generate_next_four(i):
    next_four=pad(i,4)
    return next_four

def pad(number,length):
    newstr=str(number)
    while len(newstr)<length:
        newstr="0"+newstr
    return newstr

def combine_both(first_five,next_four):
    return first_five+next_four

def generate_first_five():
    first_five=pad((random.randint(0,99999)),5)
    return first_five

if __name__=="__main__":
    main()
    
