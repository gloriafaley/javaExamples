# Enter your code here. Read input from STDIN. Print output to STDOUT

def hourglass(arr, s, t):
    sum = 0
    sum += arr[s][t]+arr[s][t+1]+arr[s][t+2]
    sum += arr[s+2][t]+arr[s+2][t+1]+arr[s+2][t+2]
    sum += arr[s+1][t+1]
    return sum

arr = []
for i in range(0,6):
    arr.append(map(int, raw_input().split()))

max = -70
for i in range(0,4):
    for j in range(0,4):
        temp = hourglass(arr, i, j)
        if(max < temp):
            max = temp
print max
         
