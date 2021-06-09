def main():
    normal_dict=get_dict()
    reversed_dict=reverse_dict(normal_dict)
    print("Reversed dictionary is: \n")
    print(reversed_dict)


def reverse_dict(normal_dict):

    """ This function gets a dictionary as its input then returns the reversed version of that dictionary"""
    
    reversed_dict={}
    for key in normal_dict:
        value=normal_dict[key]
        if value.isdecimal():
            value=int(value)
        else:
            value=int(normal_dict[key])
        if value not in reversed_dict:
            reversed_dict[value]=[]
            reversed_dict[value].append(key)
        else:
            reversed_dict[value].append(key)
            
    return reversed_dict
    
    
    


def get_dict():

    """This function gets the keys and associated values of that key from the user then returns the dictionary as the output"""
    
    normal_dict={}
    while True:
        key=input("If you are done please click enter! Enter your Key: ")
        if key=="":
            print(normal_dict)
            return normal_dict
        value=input(("Enter the value of the key ->" + key +" : "))
        if value.isalpha() or value.isalnum():
            normal_dict[key]=value
        else:
            normal_dict[key]=int(value)
    
        
        
        



if __name__=="__main__":
    main()
