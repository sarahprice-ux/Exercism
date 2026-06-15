//class Badge {
//    public String print(Integer id, String name, String department) {
//        if (id == null) {
//            return (name + " - " + department.toUpperCase());
//        } else if (department == null) {
//            return ("["+id+"]" +  " - " + name + " - " + "OWNER");
//        } else if (id == null && department == null) {
//            return (name + " - " + "OWNER");
//        }
//        return   ("["+id+"]" +  " - " + name + " - " + department.toUpperCase()) ;
//
//    }
//}

class Badge {
    public String print(Integer id, String name, String department) {
        if (department == null){
            department = "OWNER";
        }
        if (id == null)  {
            return (name + " - " + department.toUpperCase());
        }
         return   ("["+id+"]" +  " - " + name + " - " + department.toUpperCase()) ;
        }}
