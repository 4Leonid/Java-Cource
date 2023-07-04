package Homework;

public class HW2 {
    /*
 * Задание 1. Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. 
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: 
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        
        String filter = inputFilter();

        String result = addWhere(filter);

        printResult(result);
    }

    static String inputFilter(){
        return "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    }

    static String addWhere(String filter){
        
        StringBuilder sql = new StringBuilder("select * from students where ");
        
        String[] keyValue= new String[2];
       
        boolean firstCondition = true;
        
        for (String param : filter.replace("{", "").replace("}", "").replace("\"", "").split(",")) {
            
            keyValue = param.strip().split(":");
            
            String key = keyValue[0].strip();
            
            String value = keyValue[1].strip();
            
            if (!(value.equals("null"))){
                if (firstCondition){
                    
                    sql.append(String.format("%s='%s'",key,value));
                    firstCondition = false;
                } else {
                    
                    sql.append(String.format(" and %s='%s'",key,value));
                }
            }            
        }
        
        sql.append(";");
        
        return sql.toString();
    }

    static void printResult(String s){
        System.out.println();
        System.out.println(s);
    }
}

