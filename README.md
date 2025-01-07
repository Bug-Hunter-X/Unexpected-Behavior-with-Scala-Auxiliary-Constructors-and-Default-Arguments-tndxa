# Unexpected Behavior with Scala Auxiliary Constructors and Default Arguments

This example showcases a potential issue when using auxiliary constructors in Scala, specifically concerning the handling of default arguments. While seemingly innocuous, improper design can lead to unexpected behavior.

The `MyClass` demonstrates a common pattern of using an auxiliary constructor to provide default values. However, understanding how these constructors interact with argument values is key to preventing issues.

## Reproduction

The provided `MyClass.scala` contains the problematic code. To reproduce the issue, simply run the code. Observe the output.  The behavior might not be what is initially expected regarding the values of `x` in different instances of `MyClass`.

## Solution

See `MyClassSolution.scala` for a solution that addresses the unexpected behavior.