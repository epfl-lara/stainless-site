---
layout: home
title:  "Home"
section: "home"
position: 1
technologies:
 - first: ["PureScala", "Stainless supports programs written in an expressive subset of Scala, called PureScala."]
 - second: ["sbt plugin", "Stainless comes with an sbt plugin which hooks into the Scala compiler to verify your programs during compilation."]
 - third: ["Inox", "Stainless derives its verification power from the Inox constraint solver for purely functional recursive constraints."]
---

Stainless
---------

Stainless is a tool for verifying [Scala](https://www.scala-lang.org/) programs. Stainless is developed by [LARA](http://lara.epfl.ch) at [EPFL](https://www.epfl.ch/)'s [School of Computer and Communication Sciences](https://ic.epfl.ch/). Stainless can verify that your program is correct for _all inputs_, it can report inputs for which your program fails when they exist, and it can prove that functions do not loop. Using Stainless before running or deploying the software can eliminate crashes, logical errors, security flaws, and other defects.

Main Links
----------

* [https://github.com/epfl-lara/stainless](https://github.com/epfl-lara/stainless)
* [Releases](https://github.com/epfl-lara/stainless/releases) which only need headless OpenJDK JRE 8
* [Console Debian vdmk image](/DebianConsoleJRE-stainless-0.2.vmdk.xz) (tested with [VirtualBox](https://www.virtualbox.org/) but should work elsehwere)
* [Documentation](https://epfl-lara.github.io/stainless)
* [Installation](https://epfl-lara.github.io/stainless/installation.html)

Why Stainless
-------------

Stainless is a way to use Scala to develop highly reliable applications, with errors caught early during the development process. Thanks to its use of formal proofs, Stainless can establish safety and termination properties using symbolic reasoning, covering infinitely many inputs in a single run of verification.

One can compare Stainless to proof assistants such as [Isabelle/HOL](https://isabelle.in.tum.de/), [Coq](https://coq.inria.fr/), or [ACL2](https://en.wikipedia.org/wiki/ACL2) in terms of the complexity of some of the program properties it can prove, though it was originally conceived more as a program verifier, such as [Dafny](https://github.com/epfl-lara/dafny). Stainless can be more automated when finding proofs of programs compared to proof assistants, and can also report counter-examples for invalid properties in many non-trivial cases, see counter-examples for bugs in benchmarks such as [ConcRope.scala](static/invalid/BadConcRope.html), [ListOperations.scala](static/invalid/ListOperations.html), [Mean.scala](static/invalid/Mean.html), [PropositionalLogic.scala](static/invalid/PropositionalLogic.html), [AssociativityProperties.scala](static/invalid/AssociativityProperties.html), [InsertionSort.scala](static/invalid/InsertionSort.html), [more example reports](static/programs.html), or check some of our [regression tests](https://github.com/epfl-lara/stainless/tree/master/frontends/benchmarks/verification). On the other hand, proof assistants are much better at formalizing mathematics than Stainless, especially when it comes to libraries of formalized knowledge.

What Stainless Verifies
-----------------------

Stainless supports verifying:

* Assertions which should hold at the place where they are stated, but are checked statically
* Postconditions using **ensuring** function: assertions for return values of functions
* Preconditions using **require** function: assertions on function parameters
* Loop invariants: inductive assertions that hold in each loop iteration after the while condition check passes
* Algebraic data type class invariants: assertions on immutable parameters of constructors (which remain true for all constructed values)
* Automatic checks done for the absence of runtime failures: completeness of pattern matching, division by zero, array bounds checks, map domain checks

Stainless ensures that the input program belongs to a subset of Scala. This subset syntactically prevents:

* the creation of null values or unininitalized local variables or fields (therefore, dereferencing fields in Stainless programs cannot lead to null dereference error)
* explicitly throwing an exception.

The choice of the subset of Scala along with the checks for runtime errors rules out most known sources of errors in Scala programs. An exception are resource exhaustion errors (but see resource bound analysis in Leon documentation below).

Stainless correctly models integral types such as `Int` with an appropriate level of bits and takes overflow into account (for unbounded integers, use `BigInt`).

Stainless performs non-trivial termination checks for its functions and supports specifying decreasing measure functions.

Inox
----

Stainless derives its verification power from the **Inox** constraint solver for purely functional recursive constraints:

* [https://github.com/epfl-lara/inox](https://github.com/epfl-lara/inox)

Inox makes use of SMT solvers [Z3](https://github.com/Z3Prover/z3), [CVC4](https://github.com/CVC4/CVC4), and [Princess](http://www.philipp.ruemmer.org/princess.shtml), and adds support for recursion, higher-order functions, its own support for quantifiers, as well as a form of dependent types.
