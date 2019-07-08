// Sajid Ahmed
// Lab 1 Problem 1
// A Table of Student Grades
package grades;

/**
 *
 * @author Sajid Ahmed
 */
public class Grades {

   
    public static void main(String[] args) {
       //Make title
       System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"); 
       System.out.println("== Student Points ==");
       System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
       //Make heading
       System.out.println("Name\t" + "Lab\t" + "Bonus\t" + "Total");
       System.out.println("----\t" + "---\t" + "-----\t" + "-----");
       //Write names, lab grades, bonus points, and calculate total points
       System.out.println("Billy\t" + "25\t" + "12\t" + (25+12));
       System.out.println("Chris\t" + "32\t" + "8\t" + (32+8));
       System.out.println("Sally\t" + "41\t" + "5\t" + (41+5));
       System.out.println("Noah\t" + "54\t" + "3\t" + (54+3));
       System.out.println("John\t" + "48\t" + "7\t" + (48+7));
    }
    
}
