#### The compiler performs the following checks when you override a methode:
1. The method in the child class must have the same signature as the methode 
in the parent class.
2. The methode in the child class must be at least as accessible as the methode in the parent class.
3. The methode in the child class may not declare a checked exception that is 
new or broader than the class of any exception declared in the parent class methode.
4. If the method returns a value, it must be the same or a subtype of the method in the parent class, 
5. known as covariant return types.