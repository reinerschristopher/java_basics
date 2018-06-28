import sys
is_prime = 1
primes = [2]
number=3

while number>1 and sys.maxint>number :
  is_prime = 1
  for prim in primes :
    if number%prim == 0 :
      is_prime = 0
      break
   if is_prime == 1 :
    primes.append(number)
    print(number)
  number += 1
