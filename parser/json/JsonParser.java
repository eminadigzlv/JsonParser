package Parser.json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.io.*;
import java.util.*;

public class JsonParser  {
    public static void main(String[] args) {

        try {
            BufferedReader br= new BufferedReader(new FileReader("patentOwner.json"));
            String line ;
            StringBuilder st = new StringBuilder();
            List<Person> personList= new ArrayList<>();
            Person temperson;
            while ((line=br.readLine())!=null){
                st.append(line);
            }
            System.out.println("Orijina Json!" + st.toString());
            JsonObject object = new JsonObject(st.toString());
            JsonArray  array = object.getJsonArray("person");
            for (int i = 0; i < array.size(); i++) {
                temperson= new Person();
                JsonObject jsonObject = array.getJsonObject(i);
                temperson.setId(jsonObject.getString("id"));
                temperson.setName(jsonObject.getString("name"));
                temperson.setIsActive(jsonObject.getString("isActive"));
                temperson.setAge(jsonObject.getInteger("age"));
                temperson.setEyeXColor(jsonObject.getString("eyeColor"));
                temperson.setGender(jsonObject.getString("gender"));
                temperson.setCompany(jsonObject.getString("company"));
                temperson.setEmail(jsonObject.getString("email"));
                temperson.setPhone(jsonObject.getString("phone"));
                temperson.setAddress(jsonObject.getString("address"));
                temperson.setAbout(jsonObject.getString("about"));
                temperson.setRegistered(jsonObject.getString("registered"));
                personList.add(temperson);
                temperson=null;
            }
            personList.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
