- **`Name:`** [Point]
- **`Purpose:`** [Represent a point in a cartesian coordinate system]

    - **Data**

        - **`x `** : **`double`** : **`private`** : **`to represent the x value o f a point`**
        - **`y `** : **`double`** : **`private`** : **`to represent the y value o f a point`**
  
  - **Constructor**
    - **`Purpose:`** [Default Constructor]
    - **`Parameter:`** [None]
<br><br>
    - **`Purpose:`** [Parametriezed Constructor]
    - **`Parameter:`** [x: double, y: double]
    - ...

  - **Methods**

      - **`Name:`** [move]
      - **`Purpose:`** [To move a point from one location to the other]
      - **`Parameter:`** [byX: double, byY: double]
      - **`Return:`** [void]
      - **`Modifier:`** [public]
      - **`Algorithm:`**
          1. add byX to x
          2. add byY to y
          
      <br><br>
      - **`Name:`** [distance]
      - **`Purpose:`** [Calculates a distance between this point and other point]
      - **`Parameter:`** [other: Point]
      - **`Return:`** [double]
      - **`Modifier:`** [public]
      - **`Algorithm:`**
          1. calculate dx and square it
          2. calculate dy and square it
          3. calculate the square root of the sum of dx and dy
      
    - **`Name:`** [ distance ]
    - **`Purpose:`** [to calculate the distance between two points]
    - **`Parameter:`** [p: Point, q: Point]
    - **`Return:`** [double]
    - **`Modifier:`** [public]
    - **`Algorithm:`**
        1. calculate dx from the two points stand and square it
        2. calculate dy from the two points stand and square it
        3. calculate the square root of the sum of dx and dy
      
    - **`Name:`** [Method Name]
        - **`Purpose:`** [Describe what this method does]
        - **`Parameter:`** [List of parameters and their types]
        - **`Return:`** [Return type]
        - **`Modifier:`** [Access modifier]
        - **`Algorithm:`**
            1. Step 1 description
            2. Step 2 description
            3. ...
- This will be your template in the future too


# Algorithm for Point Test class

1. **Initialize Points:**
    - Create a point `P` at `(0, 0)`.
    - Create a point `Q` at coordinates `(3,4)` 
    - Assign `P` to another reference variable `R`.
2. Compute the distance between `P` and `Q` using an instance method.
3. Output the computed distance.
4. Compare `P` and `Q` for reference equality and output the result.
5. Compute and output the distance between `P` and `Q` using a class method.
6. Move `P` by `(2,5)` relative to its current position.
7. Compute and output the updated distance between `P` and `Q` using a static method.
8. Move `P` by `(2,-15)` relative to its current position.
9. if `P` is in the First Quadrant:
     output: `"P: is in quadrant 1"`.