#### Initialize Instance of X
1. Initialize `class X` if it has not been previously initialized.
2. If there is a `superclass Y` of X, then initialize the instance of Y first.
3. Process all `instance variable` declarations in the order in which they appear in the class
4. Process all `instance initializers` in the order in which they appear in the class.
5. Initialize the `constructor`, including any overloaded constructors referenced with `this()`.