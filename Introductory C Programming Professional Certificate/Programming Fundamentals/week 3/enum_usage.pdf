#include<stdio.h>

enum threat_level_t {
  LOW,
  GUARDED,
  ELEVATED,
  HIGH,
  SEVERE
};

void printThreat(enum threat_level_t threat){
  switch(threat) {
    case LOW:
      printf("Green/Low.\n"); 
      break;
    case GUARDED:
      printf("Blue/Guarded.\n"); 
      break;
    case ELEVATED:
      printf("Yellow/Elevated.\n"); 
      break;
    case HIGH:
      printf("Orange/High.\n"); 
      break;
    case SEVERE:
      printf("Red/Severe.\n");
      break;
  } 
}

void printShoes(enum threat_level_t currThreat) {
  if (currThreat >= ELEVATED) {
     printf("Please take off your shoes.\n");
  }
  else {
     printf("Please leave your shoes on.\n");
  }
}

int main(void) {
  enum threat_level_t myThreat = HIGH;
  printf("Current threat level is:\n");
  printThreat(myThreat);
  printShoes(myThreat);
  return 0;
}