package Parser.json;

public class Person {

    private  String id;
    private  String name;
    private  String  isActive;
    private  int age;
    private  String  eyeXColor;
    private  String  gender;
    private  String  company;
    private  String  email;
    private  String  phone;
    private  String  address;
    private  String  about;
    private  String  registered;


    public Person() {
        this.id = "";
        this.name = "";
        this.isActive = "";
        this.age = 0;
        this.eyeXColor = "";
        this.gender = "";
        this.company = "";
        this.email = "";
        this.phone = "";
        this.address = "";
        this.about = "";
        this.registered = "";
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", age=" + age +
                ", eyeXColor='" + eyeXColor + '\'' +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", about='" + about + '\'' +
                ", registered='" + registered + '\'' +
                '}';
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getIsActive() {
        return this.isActive;
    }

    public void setIsActive(final String isActive) {
        this.isActive = isActive;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getEyeXColor() {
        return this.eyeXColor;
    }

    public void setEyeXColor(final String eyeXColor) {
        this.eyeXColor = eyeXColor;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(final String company) {
        this.company = company;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getAbout() {
        return this.about;
    }

    public void setAbout(final String about) {
        this.about = about;
    }

    public String getRegistered() {
        return this.registered;
    }

    public void setRegistered(final String registered) {
        this.registered = registered;
    }
}
