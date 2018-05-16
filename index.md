Stainless
=========

Stainless is a tool for verifying mostly functional programs developed by [LARA](http://lara.epfl.ch) at EPFL. Stainless accepts as its inputs programs in a subset of [Scala](https://www.scala-lang.org/). Stainless can verify that your program is correct for _all inputs_ and it can also report counterexample inputs for invalid programs (see error reports for [ConcRope.scala](invalid/BadConcRope.html), [ListOperations.scala](invalid/ListOperations.html), [Mean.scala](invalid/Mean.html), [PropositionalLogic.scala](invalid/PropositionalLogic.html), [AssociativityProperties.scala](invalid/AssociativityProperties.html), [InsertionSort.scala](invalid/InsertionSort.html), [more example reports](./programs.html), or check some of our [regression tests](https://github.com/epfl-lara/stainless/tree/master/frontends/benchmarks)).

Main links:

- [https://github.com/epfl-lara/stainless](https://github.com/epfl-lara/stainless)
- [Stainless Documentation](doc/intro.html)
- [Keynote: Tools for Verified Scala](https://youtu.be/d4VeFa0z_Lo)

Stainless supports verifying:

- Assertions which should hold at the place where they are stated, but are checked statically
- Postconditions using **ensuring** function: assertions for return values of functions
- Preconditions using **require** function: assertions on function parameters
- Loop invariants: inductive assertions that hold in each loop iteration after the while condition check passes
- Algebraic data type class invariants: assertions on immutable parameters of constructors (which remain true for all constructed values)
- Automatic checks done for the absence of runtime failures: completeness of pattern matching, division by zero, array bounds checks, map domain checks

Stainless ensures that the input program belongs to a subset of Scala. This subset syntactically prevents:

- the creation of null values or unininitalized local variables or fields (therefore, dereferencing fields in Stainless programs cannot lead to null dereference error)
- explicitly throwing an exception.

The choice of the subset of Scala along with the checks for runtime errors rules out most known sources of errors in Scala programs. An exception are resource exhaustion errors (but see resource bound analysis in Leon documentation below).

Stainless correctly models integral types such as _Int_ with an appropriate level of bits and takes overflow into account (for unbounded integers, use _BigInt_).

Stainless performs non-trivial termination checks for its functions and supports specifying decreasing measure functions.

Inox
----

Stainless derives its verification power from the **Inox** constraint solver for purely functional recursive constraints:

- [https://github.com/epfl-lara/inox](https://github.com/epfl-lara/inox)

Inox makes use of SMT solvers [Z3](https://github.com/Z3Prover/z3), [CVC4](https://github.com/CVC4/CVC4), and [Princess](http://www.philipp.ruemmer.org/princess.shtml), and adds support for recursion, higher-order functions, and its own support for quantifiers.

Leon
----

Stainless and Inox grew out of a verification component of the Leon system:

- [Read Leon documentation and papers](http://leon.epfl.ch/doc).
- Trouble with Leon sources being GPL v3? Read [a bit older version of files under more permissive license](https://github.com/epfl-lara/leon/tree/8a295dd729bc7eada4b9c1b2b936cc87dc754040).
- [Try leon.epfl.ch](http://leon.epfl.ch/)

- - -

2018-05-17. This page is simple and this is its end.
