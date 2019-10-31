/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Oct-19
 *  Time: 3:29 PM
 */
/*
Create a List & Set of 10 integers and demonstrate ordered and unordered collection as well as
duplicate allowed and not allowed. Demonstrate addAll() method also.

 */
package collection.question1;

import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) {
        //creating a ArrayList of 10 Integers
        ArrayList<Integer> integers = new ArrayList<>();
        // adding elements in ArrayList by using add(Element e) method
        // by passing primitive value, which will be converted to object by autoboxing
        integers.add(20);
        //creating Integer object to represent primitive value 40 by using valueOf() method
        //using boxing
        Integer obj = Integer.valueOf(40);
        //adding obj to list
        integers.add(obj);

        // likewise added 8 more elements in list
        integers.add(60);
        integers.add(70);
        integers.add(50);
        integers.add(30);
        integers.add(250);
        integers.add(3);
        integers.add(2);
        integers.add(10);




    }
}
