# Scala foldLeft String Concatenation Bug
This repository demonstrates a common error when using `foldLeft` in Scala for string concatenation.  The provided code attempts to sum integers but incorrectly treats the accumulator as a string leading to unexpected behavior. The solution shows the correct way to achieve either numerical summation or string concatenation using `foldLeft`.

## Bug Description
The initial code uses `foldLeft` with an integer accumulator (0). However, it tries to add an integer and string which will result in unexpected String concatenation.

## Solution
The solution demonstrates how to correctly use `foldLeft` for both numerical summation and string concatenation, showing two clear approaches to handle both scenarios.