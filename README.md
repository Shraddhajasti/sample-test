# sample-test

A standalone Java project for string reversal.

## Project Structure

```
sample-test/
├── src/
│   ├── StringReverser.java      # Core string-reversal logic + main method
│   └── StringReverserTest.java  # Lightweight unit tests (no external dependencies)
└── README.md
```

## How to Build and Run

```bash
# Compile
cd src
javac StringReverser.java StringReverserTest.java

# Run the demo
java StringReverser

# Run the tests
java StringReverserTest
```

## Example Output

```
Original : Hello, World!
Reversed : !dlroW ,olleH

Original : Java
Reversed : avaJ

Original : racecar
Reversed : racecar

Original :
Reversed :
```
