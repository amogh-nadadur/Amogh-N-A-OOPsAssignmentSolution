public class index {
    public static void main(String[] args){
        SuperDepartment obj1 = new SuperDepartment();
        HRDepartment obj2 = new HRDepartment();
        TechDepartment obj3 = new TechDepartment();
        AdminDepartment obj4 = new AdminDepartment();
    
        obj1.departmentName();
        obj1.getTodaysWork();
        obj1.getWorkDeadline();
        obj1.isTodayAHoliday();
        
        obj2.departmentName();
        obj2.getTodaysWork();
        obj2.getWorkDeadline();
        obj2.doActivity();
        obj2.isTodayAHoliday();
    
        obj3.departmentName();
        obj3.getTodaysWork();
        obj3.getWorkDeadline();
        obj3.getTechStackInformation();
        obj3.isTodayAHoliday();
    
        obj4.departmentName();
        obj4.getTodaysWork();
        obj4.getWorkDeadline();
        obj4.isTodayAHoliday();
        }
}
