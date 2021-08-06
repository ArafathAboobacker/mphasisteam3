package com.mphasis.main.cui;

import com.mphasis.payroll.*;

public class Main {

    public static void main(String[] args) {
        Finance finance = new Finance();
        HR hr = new HR();
            Employee employee = hr.recruit('p');//Upcast
            finance.processSalary(employee); //Dynamic Polyorphism
            //employee = new Intern();
            //finance.processSalary(employee);
        finance.processSalary(hr.recruit('k'));
        finance.processSalary(hr.recruit('I'));
        finance.processSalary(hr.recruit('c'));
    }
}
