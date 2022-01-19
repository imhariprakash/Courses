#include <stdio.h>
#include <assert.h>
#include <stdlib.h>
#include "cards.h"


void assert_card_valid(card_t c) {

  assert(c.value >= 2 && c.value <= VALUE_ACE);
  assert(c.suit >= SPADES && c.suit <= CLUBS);

}

const char * ranking_to_string(hand_ranking_t r) {

  switch (r) {
  case STRAIGHT_FLUSH:
    return "STRAIGHT_FLUSH";
  case FOUR_OF_A_KIND:
    return "FOUR_OF_A_KIND";
  case FULL_HOUSE:
    return "FULL_HOUSE";
  case FLUSH:
    return "FLUSH";
  case STRAIGHT:
    return "STRAIGHT";
  case THREE_OF_A_KIND:
    return "THREE_OF_A_KIND";
  case TWO_PAIR:
    return "TWO_PAIR";
  case PAIR:
    return "PAIR";
  default:
    return "NOTHING";
  }
  
}

char value_letter(card_t c) {

  static const char* letters = "234567890JQKA";

  if (c.value >= 2 && c.value <= VALUE_ACE) {
    return letters[c.value -2];
  } else {
    return '?';
  }

}


char suit_letter(card_t c) {
  
  static const char* suit_letters = "shdc";

  return (c.suit >= 0 && c.suit <= CLUBS) ?
    suit_letters[c.suit] : '?';

}

void print_card(card_t c) {

  printf("%c%c", value_letter(c), suit_letter(c));

}

card_t card_from_letters(char value_let, char suit_let) {

  static const char* value_letters = "234567890JQKA";
  static const char* suit_letters = "shdc";
  
  card_t temp;
  int i;

  temp.value = 99; /* invalid */
  for (i=0; i<13; i++) {
    if (value_letters[i] == value_let) {
      temp.value = i + 2;
      break;
    }
  }
  if (temp.value == 99) {
    printf("Invalid value letter: %c\n", value_let);
    exit(EXIT_FAILURE);
  }

  temp.suit = NUM_SUITS;
  for (i=0; i<4; i++) {
    if (suit_letters[i] == suit_let) {
      temp.suit = i;
      break;
    }
  }
  if (temp.suit == NUM_SUITS) {
    printf("Invalid suit letter: %c\n", suit_let);
    exit(EXIT_FAILURE);
  }
  
  return temp;
}

card_t card_from_num(unsigned c) {
  card_t temp;
  temp.suit = c / 13;
  temp.value = c % 13 + 2;

  return temp;
}
