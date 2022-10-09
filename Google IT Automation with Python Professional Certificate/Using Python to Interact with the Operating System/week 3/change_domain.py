import re

result = re.search(r'@([\w.-])+', 'blossom@abc.edu')
print(result)

print(re.sub(r'@([\w.-])+', r'@xyz.com', 'blossom@abc.edu'))
