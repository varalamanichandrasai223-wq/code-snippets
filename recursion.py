# recursion.py
# Examples of recursion in Python

# 1. Factorial using recursion
def factorial(n):
    # Base case
    if n == 0 or n == 1:
        return 1

    # Recursive case
    return n * factorial(n - 1)


print("Factorial of 5:", factorial(5))


# 2. Fibonacci using recursion
def fibonacci(n):
    # Base cases
    if n <= 1:
        return n

    # Recursive case
    return fibonacci(n - 1) + fibonacci(n - 2)


print("First 10 Fibonacci numbers:")

for i in range(10):
    print(fibonacci(i), end=" ")
