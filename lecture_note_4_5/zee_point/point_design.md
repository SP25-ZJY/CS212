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