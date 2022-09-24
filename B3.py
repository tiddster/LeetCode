number_range = int(input())
ans = 0
for number in range(1, number_range+1):
    number_str = str(number)
    number_new = number_str[::-1]
    number_res= int(number_new.lstrip("0"))
    if number % number_res == 0:
        ans += 1

print(ans)