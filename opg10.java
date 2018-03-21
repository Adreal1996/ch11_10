package ch11;

/* Write a method removeOddLength that accepts a set of strings as a parameter
and that removes all of the strings of odd length from the set. */

import java.util.*;


public class opg10
{
    public static void main(String[] args)
    {
        Set<String> setOne = new HashSet<>();

        setOne.add("Pop");
        setOne.add("Bæ");
        setOne.add("Tis");
        setOne.add("Hej");

        System.out.println(removeOddLength(setOne));
    }

    public static Set<String> removeOddLength (Set<String> takeThisInput)
    {
        Iterator<String> itr = takeThisInput.iterator();

        while (itr.hasNext())
        {
            String s = itr.next();

            if (s.length() % 2 != 0)
            {
                itr.remove();
            }
        }
        return takeThisInput;

    }
}
