package com.mo.assetManager;

/*
UNDERSTANDING THE ASSET MANAGER EXERCISE
=======================================

CLASS HIERARCHY:
--------------
* Asset (base/parent class)
  ├── House (derived/child class)
  └── Vehicle (derived/child class)

This is a classic inheritance hierarchy where polymorphism will be key.

POLYMORPHISM ASPECTS OF THIS ASSIGNMENT:
--------------------------------------

1. METHOD OVERRIDING
   - Both House and Vehicle override the getValue() method from Asset
   - Each provides its own implementation for calculating value
   - The parent class (Asset) provides a basic implementation (returns originalCost)
   - This is runtime polymorphism in action!

2. USING POLYMORPHIC REFERENCES
   - You'll create an ArrayList of Asset objects
   - This ArrayList will actually contain House and Vehicle objects
   - Even though they're stored as Asset references, when you call getValue():
     * House objects will use the House implementation
     * Vehicle objects will use the Vehicle implementation
   - The JVM determines at runtime which method to call based on the actual object type

3. TYPE CHECKING AND CASTING
   - You'll need to use instanceof to check if an Asset is a House or Vehicle
   - Once you know the type, you'll downcast (Asset → House or Asset → Vehicle)
   - This allows you to access specific properties of each subclass
   - Example: ((House)asset).getAddress() or ((Vehicle)asset).getMakeModel()

4. POLYMORPHIC BEHAVIOR
   - Each class calculates its value differently:
     * Asset: returns original cost
     * House: based on condition, square footage, and lot size
     * Vehicle: based on age, mileage, and make/model

5. INHERITANCE IMPLEMENTATION
   - All three classes share common properties (description, dateAcquired, originalCost)
   - Each subclass adds its own specific properties
   - The subclasses inherit all methods from Asset but override getValue()

WORKFLOW APPROACH:
----------------
1. Create the Asset base class first with all specified properties/methods
2. Create House class that extends Asset with its specific properties and getValue() implementation
3. Create Vehicle class that extends Asset with its specific properties and getValue() implementation
4. In main():
   - Create an ArrayList<Asset>
   - Add at least 2 houses and 2 vehicles to it
   - Loop through the list printing details
   - Use instanceof to detect and downcast to the proper type to get specific properties

POLYMORPHISM BENEFITS IN THIS EXAMPLE:
------------------------------------
1. You can process all assets uniformly (description, acquisition date, value)
2. Each specific asset type can calculate its value differently
3. You can easily extend the system by adding new Asset types without changing existing code
4. You can store all different asset types in a single collection

KEY CONSIDERATIONS:
-----------------
* The getValue() method is the polymorphic method - same name, same signature, different implementations
* The instanceof operator lets you determine the runtime type of an object
* Casting lets you access subclass-specific methods and properties
*/

public class Main {


}
