
# LCIT - 2022F MADT3125 - Android Final Project

This is an application to save the information of an employee as well as his/her vehicle. There are two types of vehicle you can register and there are three kinds of employees.
Launch activity is a list of employees that shows employees’ names and their ids. You can add employees via a button and also you should be able to search for a specific employee. When you click on an add button you go to another screen to register the employee and his/her car. After registration, you are navigated back to the list and the list view is updated; you can add as many employees as you want. When you click on each item of the list, you navigate to another screen that describe each employee.

Create a project according to your programming project instruction you worked on. The diagram below shows the structure of the classes you need to create for this project.
Class Vehicle is a superclass of the classes Car and Motorcycle. Class Employee has three subclasses Manager, Tester and Programmer.
The goal of this assignment is to manage the salaries of the employees of a software engineering company. An employee is characterized by his/her name (the field name must remain unchanged after its initialisation); his/her birth year; his/her age as a property which computes and returns his/her age regarding the current year and his/her year of birth; a monthly income and an occupation rate (the percentage of time worked monthly; for example, 80%) and an employee Id. The employee has also a vehicle. There exist three types of employees according to the diagram:
-
Managers (class Manager) specifically characterized by the number of new clients brought to the company.
Testers (class Tester) characterized by the number of bugs they managed to solve while testing.
-
-
Here is the list of classes you see in the diagram:
Programmers (class Programmer) characterized by the number of projects they have completed.
- Class Vehicle contains four properties: make (model), plate, color.
- Class Car has one property: ‘type’ which indicates the type of the car i.e. sport, SUV, hatchback,
minivan or sedan.
- Class Motorcycle has one property which indicates if the motorcycle has a sidecar.
- Class Employee has five properties according to the diagram.
Mobile Development
 READ CAREFULLY ENTIRE QUESTION DESCRIPTION
- Class Programmer has one property, ’nbProjets’ which indicates the number of the projects the programmer has done.
- Class Tester has one property, ‘nbBugs’ which indicates the number of bugs the tester has found and corrected.
- Class Manager is another subclass of Emplyee and it contains one attribute according to the diagram.
Apart from the classes mentioned above, there is a contract which you need to implement to specify if the user is full time or part time.
Make sure all your classes are well encapsulated. To do a good encapsulation, try to use “Set” and/or “Get” to expose ONLY what needs to be exposed by each class (hint: for a good encapsulation, all properties MUST be private and accessed only via Get and Set methods).
Start your work by equipping your classes with constructors enabling the initialisation of all their properties. The occupation rate will be 100% by default. Moreover, if an initializer receives as parameter an occupation rate lower than 10%, the effective occupation rate of the employee must be set to 10%. Similarly, if the occupation rate received by the initializer is greater than 100%, the effective occupation rate will be set to 100%.
Add a method annualIncome() (yearly income) or a property which computes and returns the yearly income of an employee as follows:
- Each employee has a base yearly income computed as 12 times the monthly income multiplied by the occupation rate.
- For a manager a bonus of 500 dollars per client brought to the company is added as well as 100 dollars per day for the expenditure of the travelled days. (you can define two constants like GAIN_FACTOR_CLIENT equals to 500 and GAIN_FACTOR_TRAVEL equals to 100)
- For a tester, a bonus of 10 dollars per corrected bug is added (a constant can be used like GAIN_FACTOR_ERROR equals 10)

- For a programmer, a bonus of 200 dollars per completed project will be added (a constant can be defined GAIN_FACTOR_PROJECTS equals to 200)
Add all the necessary code so that the output of your application produces the output given in the execution examples below.
Note : you should validate your input before registering the employee.
• Id is unique, birth year should be greater than 1900 and less than the current year
• Occupation rate should be validated as well
Grading
The assignment is open book, you can refer to books, the internet, etc. but do not copy from each other. every group is responsible to protect his/her work from being copied; the groups involved will get zero.
Grading scheme:
• Layout: 30%
• Input validations and error checking: 20%
• Application functionality: 40%
• Code indented properly: 10%
Appendix
Here are some figures which display a layout sample as well as actions happen when you choose an item in a layout:
• By choosing an employee type, a new field will be added for one of the following cases: o # of clients brought by manager
o # of bugs corrected by tester
o # of projects completed by programmer
• By choosing car or motorbike, a new field will be added as shown below
Figures below show a layout example of application created in Android, you can use it as your guide to create a similar app in iOS.
