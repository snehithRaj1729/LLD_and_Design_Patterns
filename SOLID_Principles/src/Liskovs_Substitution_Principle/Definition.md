1) Derived or child classes must be substitutable for their base or parent classes.
2) This principle ensures that any class that is the child of a parent class should be usable in place of its parent without any unexpected behavior.
3) Objects of super class should be replacable with objects of a subclass without altering the correctness of the program.
4) A subclass should be able to stand in for its parent class without breaking the application.
5) The behaviour of subclass should match the expectations set by parent class.
Example:
   One of the classic examples of this principle is a rectangle having four sides. A rectangle’s height can be any value and width can be any value. A square is a rectangle with equal width and height. So we can say that we can extend the properties of the rectangle class into square class. 