1) This principle is the first principle that applies to Interfaces instead of classes in SOLID and it is similar to the single responsibility principle. 
2) It states that “do not force any client to implement an interface which is irrelevant to them“.
3) Here your main goal is to focus on avoiding fat interface and give preference to many small client-specific interfaces. You should prefer many client interfaces rather than one general interface and each interface should have a specific.
4) It is similar to SRP.
Example: 
   Suppose if you enter a restaurant and you are pure vegetarian. The waiter in that restaurant gave you the menu card which includes vegetarian items, non-vegetarian items, drinks, and sweets.
   In this case, as a customer, you should have a menu card which includes only vegetarian items, not everything which you don’t eat in your food. Here the menu should be different for different types of customers.
   The common or general menu card for everyone can be divided into multiple cards instead of just one. Using this principle helps in reducing the side effects and frequency of required changes.
   