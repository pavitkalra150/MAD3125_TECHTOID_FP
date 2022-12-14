package com.techtoid.apps.madt3125_techtoid_fp.dData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import com.techtoid.apps.madt3125_techtoid_fp.mModels.mEmployeeDetailsModel;

public class dDatabase {
    public static class UserClass {
        private String _username;
        private String _firstname;
        private String _fullname;
        private String _password;
        public UserClass(String username, String fullname, String password) { _username = username; _fullname = fullname; _password = password; }
        public void setUser(String username, String fullname, String password) { _username = username; _fullname = fullname; _password = password; }
        public UserClass(String username, String firstname, String fullname, String password) { _username = username; _firstname = firstname; _fullname = fullname; _password = password; }
        public void setUser(String username, String firstname, String fullname, String password) { _username = username; _firstname = firstname; _fullname = fullname; _password = password; }
        public UserClass getUser() { return new UserClass(this._username,this._firstname,this._fullname,this._password); }
        public String getUsername() { return _username; }
        public void setUsername(String username) { this._username = username; }
        public String getFirstname() { return this._firstname;}
        public void setFirstname(String firstname) { this._firstname = firstname; }
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
        public static void addUserToList(String username, String firstname, String fullname, String password) {
            _usersList.add(new UserClass(username, firstname, fullname, password));
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
        public static int IDcount = 1;
        public static ArrayList<Employee> EmployeeList = new ArrayList<>();
        public static void addNewEmployeeToEmployeeList(Employee employee) {
            IDcount++;
            EmployeeList.add(employee);
        }
        public static void setEmployeeListToDatabase(ArrayList<Employee> empList) { EmployeeList = empList; }
        public static ArrayList<Employee> getEmployeeListFromDatabase() {
            return EmployeeList;
        }
        public static String getEmployeeDataFromEmployeeList(int id) {
            return EmployeeList.get(id).toString();
        }
        public static void updateEmployeeDetailsInEmployeeList(Employee employee) {
            EmployeeList.set((employee.getID()-1),employee);
        }
        public static void deleteEmployeeFromEmployeeList(int id) {
            EmployeeList.remove(id-1);
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
        public static String fileName = "file_db_employees.txt";
        public static File filePath;
        public static File dbFile;
        public static String SeedData;
        public static String FlushData;
        public static String[][] SeedArray;
        public static String[][] FlushArray;
        public static void loadSeedDataIntoDatabase() {
            Users.addUserToList("admin", "Admin","Administrator","admin");
            Users.addUserToList("880853","Rishi","Rishi Varma","varma");
            Users.addUserToList("868150","Pavit","Pavit Kalra","kalra");
            Users.addUserToList("880437","Sai","Sai Sumanth","nissankara");
            Users.addUserToList("870768","Simran","Simran Mehra","mehra");
            if(SeedArray != null) {
                EmployeeData emp;
                for(String[] record : SeedArray) {
                    emp = EmployeeData.getEmployeeDataObjectFrom(record);
                    if (emp.empType.equals("Manager")) {
                        Employees.addNewEmployeeToEmployeeList(new Manager(dDatabase.Employees.getIDcount(), emp.fullname, (2022-Integer.parseInt(emp.age)),
                                emp.gender, Integer.parseInt(emp.bonus1), Integer.parseInt(emp.bonus2), Double.parseDouble(emp.salary), Double.parseDouble(emp.occupationrate),
                                (emp.vehicle.equals("Car") ? (new Car(emp.vehicle_make, emp.plateNumber, emp.color, emp.category, emp.extra1, emp.extra2)) :
                                        (emp.vehicle.equals("Motorcycle")) ? (new Motorcycle(emp.vehicle_make, emp.plateNumber, emp.color, emp.category, Boolean.parseBoolean(emp.extra1))) : null)));
                    } else if (emp.empType.equals("Programmer")) {
                        Employees.addNewEmployeeToEmployeeList(new Programmer(dDatabase.Employees.getIDcount(), emp.fullname, (2022-Integer.parseInt(emp.age)),
                                emp.gender, Integer.parseInt(emp.bonus1),Double.parseDouble(emp.salary), Double.parseDouble(emp.occupationrate),
                                (emp.vehicle.equals("Car") ? (new Car(emp.vehicle_make, emp.plateNumber, emp.color, emp.category, emp.extra1, emp.extra2)) :
                                        (emp.vehicle.equals("Motorcycle")) ? (new Motorcycle(emp.vehicle_make, emp.plateNumber, emp.color, emp.category, Boolean.parseBoolean(emp.extra1))) : null)));
                    } else if (emp.empType.equals("Tester")) {
                        Employees.addNewEmployeeToEmployeeList(new Tester(dDatabase.Employees.getIDcount(), emp.fullname, (2022-Integer.parseInt(emp.age)),
                                emp.gender, Integer.parseInt(emp.bonus1),Double.parseDouble(emp.salary), Double.parseDouble(emp.occupationrate),
                                (emp.vehicle.equals("Car") ? (new Car(emp.vehicle_make, emp.plateNumber, emp.color, emp.category, emp.extra1, emp.extra2)) :
                                        (emp.vehicle.equals("Motorcycle")) ? (new Motorcycle(emp.vehicle_make, emp.plateNumber, emp.color, emp.category, Boolean.parseBoolean(emp.extra1))) : null)));
                    }
                }
            }
        }
        public static void saveDatabase() {
            FlushArray = new String[Employees.EmployeeList.size()][];
            for(int i = 0; i < FlushArray.length; i++) {
                EmployeeData emp = mEmployeeDetailsModel.getEmployeeFromDatabase(i);
                String[] record = EmployeeData.getStringArrayFromEmployeeDataObject(emp);
                for(int j = 0; j < record.length; j++) {
                    FlushArray[i] = new String[record.length];
                    FlushArray[i][j] = record[j];
                }
            }
        }
        public static void parseSeedData() {
            if(SeedData.isEmpty()) return;
            String[] lines;
            lines = SeedData.split("\n");
            String[][] records = new String[lines.length][];
            int i = 0;
            for(String line : lines) {
                records[i] = line.split("#");
                i++;
            }
            SeedArray = records;
        }
        public static void parseFlushData() {
            if(FlushArray == null) return;
            FlushData = "";
            for(String[] record : FlushArray) {
                for(int i = 0; i < record.length; i++) {
                    FlushData += record[i];
                    if(i < record.length - 1) { FlushData += "#"; }
                }
                FlushData += "\n";
            }
        }
        public static void pushDataToFile() {
            try {
                FileOutputStream fileFlush = new FileOutputStream(dbFile);
                fileFlush.write(FlushData.getBytes());
                fileFlush.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void pullDataFromFile() {
            byte[] byteContent = new byte[(int)dbFile.length()];
            try {
                FileInputStream fileSeed = new FileInputStream(dbFile);
                fileSeed.read(byteContent);
                SeedData = new String(byteContent);
                fileSeed.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void createDataFile() {
            try {
                boolean success = dbFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static boolean fileExists(){
            return dbFile.exists();
        }
        public static void callDatabase() {
            dbFile = new File(filePath, fileName);
        }
    }
    public static class iIntent {
        public static boolean _canShow = false;
        public static boolean _success = false;
    }
}
