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
    public class EmployeeClass {

    }
    public static class Employees {

    }
    public static class Storage {
        public static void loadDatabase() {
            Users.addUserToList("admin","Administrator","admin");
            Users.addUserToList("868150","Pavit","kalra");
            Users.addUserToList("880437","Sai Sumanth","nissankara");
            Users.addUserToList("870768","Simran","mehra");
        }
        public static void saveDatabase() {

        }
        public static void pushDataFromFile() {

        }
        public static void pullDataFromFile() {

        }
    }
}
