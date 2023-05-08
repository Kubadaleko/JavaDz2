//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        String[] myString = { "'name':'Ivanov'", "'country':'Russia'", "'city':'Moscow'", "'age':'null'" };
        System.out.printf("select * from students where name = %s and country = %s and city = %s",
                Answer(0, myString), Answer(1, myString), Answer(2, myString));
    }

    public static String Answer(int i, String[] myStrings) {
        int index = myStrings[i].indexOf(':');
        return myStrings[i].substring(++index);
    }
}