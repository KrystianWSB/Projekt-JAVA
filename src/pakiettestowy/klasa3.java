// Pakiet testowy
package com.example.test;

import com.example.package1.ClassA;
import com.example.package2.ClassB;

/**
 * Klasa testująca funkcjonalność klas ClassA i ClassB.
 */
public class TestClass {
    public static void main(String[] args) {
        // Testowanie funkcjonalności klas ClassA i ClassB
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        // Wywołanie metody calculate z klasy ClassA
        int result = classA.calculate(5, 3);
        System.out.println("Wynik obliczeń: " + result);

        // Wywołanie metody displayMessage z klasy ClassB
        classB.displayMessage("Hello, World!");
    }
}
