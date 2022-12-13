package com.techtoid.apps.madt3125_techtoid_fp.dData;

import java.util.ArrayList;

public class dDatabase {
    public static class UserClass {
        private String _username;
        private String _fullname;
        private String _password;
        public UserClass(String username, String fullname, String password) { _username = username; _fullname = fullname; _password = password; }
        public void setUser(String username, String fullname, String password) { _username = username; _fullname = fullname; _password = password; }
        public UserClass getUser() { return new UserClass(this._username,this._fullname,this._password); }
        public String getUsername() { return _username; }
        public void setUsername(String username) { this._username = username; }
        public String getFullname() { return _fullname; }
        public void setFullname(String fullname) { this._fullname = fullname; }
        public String getPassword() { return _password; }
        public void setPassword(String password) { this._password = password; }
    }
    public static class Users {
        public static boolean usernameIsNotValid = true;
        private static UserClass verfiedUser;
        private static ArrayList<UserClass> _usersList = new ArrayList<>();
        public static void addUserToList(String username, String fullname, String password) {
            _usersList.add(new UserClass(username, fullname, password));
        }
        public static void verifyUsername(String username) {
            for(UserClass user : _usersList) {
                if(user.getUsername().equals(username)) {
                    usernameIsNotValid = false;
                    verfiedUser = user;
                    return;
                }
            }
            usernameIsNotValid = true;
        }
        public static UserClass getUserData() {
            return verfiedUser;
        }
    }
    public static class Employees {
        private static int IDcount = 1;
        private static ArrayList<Employee> EmployeeList = new ArrayList<>();
        public static void addNewEmployeeToEmployeeList(Employee employee) {
            IDcount++;
            EmployeeList.add(employee);
        }
        public static ArrayList<Employee> getEmployeeListFromDatabase() {
            return EmployeeList;
        }
        private static int getEmployeeIndex(int id){
            for (int i = 0; i < EmployeeList.size(); i++) {
                Employee emp = EmployeeList.get(i);
                if(emp.getID() == id) return  i;
            }
            return -1;
        }
        public static String getEmployeeDataFromEmployeeList(int id) {
            int empIndex = getEmployeeIndex(id);
            if(empIndex>-1)
                return EmployeeList.get(empIndex).toString();
            return null;
        }
        public static void updateEmployeeDetailsInEmployeeList(Employee employee) {
            EmployeeList.set((employee.getID()-1),employee);
        }
        public static void deleteEmployeeFromEmployeeList(int id) {
            int empIndex = getEmployeeIndex(id);
            if(empIndex>-1)
                EmployeeList.remove(empIndex);
        }
        public static int getIDcount() { return IDcount; }
        public static void initializeDataInDatabase() {
            addNewEmployeeToEmployeeList(new Manager(getIDcount(),"Rishi Varma",1998, "Male",58,68,
                    8000,80, (new Car("BMW", "aaa111", "Red", "Family", "Manual", "Sedan"))));
            addNewEmployeeToEmployeeList(new Programmer(getIDcount(), "Simran Mehra", 1999, "Female", 56, 12000,
                    90, (new Car("KIA", "aadd54", "Black", "Sport", "Automatic", "Sports"))));
        }
    }
    public static class Storage {
        //File
        public static void loadDatabase() {
            Users.addUserToList("admin","Administrator","admin");
            Users.addUserToList("880853","Rishi Varma","varma");
            Users.addUserToList("868150","Pavit","kalra");
            Users.addUserToList("880437","Sai Sumanth","nissankara");
            Users.addUserToList("870768","Simran","mehra");
        }
        public static void saveDatabase() {

        }
        public static void pushDataToFile() {

        }
        public static void pullDataFromFile() {

        }
    }
    public static class iIntent {
        public static boolean _canShow = false;
        public static boolean _success = false;
    }
}
