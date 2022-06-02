from asyncio.windows_events import NULL


handle = open(r"C:\Users\S HARIPRAKASH\Desktop\text_count.txt", "r")

counts = dict()

for line in handle:
    line = line.split()
    if line is not None:
        for word in line:
            counts[word] = counts.get(word, 0) + 1

big_word = None
big_count = None

for word, count in counts.items():
    if(big_count is None) or (count > big_count):
        big_word = word
        big_count = count
print(big_word, big_count)