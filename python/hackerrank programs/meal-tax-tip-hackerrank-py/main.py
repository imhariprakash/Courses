meal=float(input())
tip=int(input())
tax=int(input())
total=meal+(meal*(tip/100))+(meal*(tax/100))
print(round(total))