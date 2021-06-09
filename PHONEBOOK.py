def main():
    dictionary={}
    collect(dictionary)
    print_dict(dictionary)
    lookup(dictionary)
    
def collect(dictionary):
    name=input("Name: ")
    while name!="":
        number=input("Number: ")
        dictionary[name]=number
        name=input("Name: ")

def print_dict(dictionary):
    for key in dictionary:
        print(key,"->",dictionary[key])
    
def lookup(dictionary):
    name=input("Enter the name for lookup: ")
    while name!="":
        if name in dictionary:
            print(dictionary[name])
        else:
            print("The name is not in our list.")
        name=input("Enter the name for lookup: ")
        

if __name__=="__main__":
    main()
    
