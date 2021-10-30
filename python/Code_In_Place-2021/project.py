import random

def main():
    words=read_file()
    word=random_word(words)
    print(word)
    guess(word)

def read_file():

    """ We have created an empty list at the beginning of this function. This fuction opens the text file and read that file line by line.
       Finally loads all the words in that empty list. At the end returns the loaded list. """

    words=[]
    i=0
    
    with open("Lexicon.txt") as file:
        for line in file:
            line=line.strip()
            words.append(line)
            i+=1
    #print(words)
    return words

def random_word(loaded_list):
    
    """This function generates a random number between the range 0 and the number of elements of the loaded list. Then using that random
       number as the index , chooses a word which needs to be guesses by the player. Then returns that word to the main function for
       further progress. """

    number=random.randint(0,len(loaded_list))
    word=loaded_list[number]
    return(word)
        

def guess(word):

    """After getting the randomly generated word , we are giving totally 8 chances to the user for guessing that randomly generated word. The user will tell
       a letter out of 26 alphabets in English. If the letter he entered is in our randomly generated word , We need display him our randomly generated word
       with the letters he guessed correctly in positon. With in 8 attempts the player need to find out the word. """

    partial_word=""
    partial_word=blank_word(partial_word,word)
    player_guess(partial_word,word)

def player_guess(partial_word,word):
    """ This function allows the user to enter a letter and displays the partially filled word with the letters he guessed alone in position. Totally a player
        has 8 chances to guess the word. """
    
    print("A word having",len(word),"letters")
    print("The word now looks like this:",partial_word)
    life=12
    while(life>0 and partial_word!=word):
        print("You have",life,"guesses left.")
        player=input("Type a single letter here, then press enter: ")
        life-=1
        player=player.upper()
        while(len(player)!=1 or not(player.isalpha())):
            player=input("Type a single letter here, then press enter: ")
        partial_word=display_player(partial_word,word,player)
        print("The word now looks like this:",partial_word)

    if life==0:
        print("Sorry, you lost. The secret word was:",word)
    else:
        print("That guess is correct.")
        print("Congratulations, the word is:",word)
        

    

def display_player(partial_word,word,player):

    """This function fills the alphabet letter entered by the player in whatever places that particular letter appears in the randomly generated word ,
       if that particular letter is present in our word. """
    
    if player in word:
        for i in range(len(word)):
            if(word[i]==player):
                partial_word=partial_word[0:i]+player+partial_word[i+1:]
    else:
        print("There are no",player,"\'s in the word")
    return partial_word
    
    
            

def blank_word(partial_word,word):

    """This functin generates the blank word with exactly same number of underscores in place of each alphabets as in the randomly generated word. """
    
    for i in range(len(word)):
        partial_word+="-"
    return partial_word
        
    

if __name__=="__main__":
    main()
