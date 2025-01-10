package task5;

public class PhoneNumber {
    String country;
    String city;
    String nums1;
    String nums2;

    public PhoneNumber(String phone){
        if (phone.startsWith("8")){
            country = "+7";
        }
        else{
            country = phone.substring(0, phone.length()-10);
        }
        city = phone.substring(phone.length()-10, phone.length()-7);
        nums1 = phone.substring(phone.length()-7, phone.length()-4);
        nums2 = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return country + "-" + city + "-" + nums1 + "-" + nums2;
    }
}
